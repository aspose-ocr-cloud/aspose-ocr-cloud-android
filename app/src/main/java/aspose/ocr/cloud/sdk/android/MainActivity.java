package aspose.ocr.cloud.sdk.android;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.aspose.ocr.cloud.android.ApiClient;
import com.aspose.ocr.cloud.android.Configuration;
import com.aspose.ocr.cloud.android.api.OCRResponse;
import com.aspose.ocr.cloud.android.api.OcrApi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {


    private void setUpConfig() throws Exception {
        //Todo: Setup App_SID & App_Key; You can get them in your Aspose Dashboard https://dashboard.aspose.cloud
        Configuration.setAPP_SID("");
        Configuration.setAPI_KEY("");

        if (Configuration.getAPI_KEY().isEmpty() || Configuration.getAPP_SID().isEmpty())
            throw new Exception("Setup App_SID & App_Key in BaseTest Configuration");
    }

    ImageView mImageView;
    Button mChooseBtn;
    TextView mTextView;

    private static final int IMAGE_PICK_CODE = 1000;
    private static final int PERMISSION_CODE = 1001;

    private static OcrApi api;
    String url = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());

        saveSampleToSD();
        setContentView(R.layout.activity_main);
        try {
            setUpConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }

        api = new ApiClient().createService(OcrApi.class);


        mImageView = findViewById(R.id.image_view);
        mChooseBtn = findViewById(R.id.choose_image_btn);
        mTextView = findViewById(R.id.text_view);

        mChooseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) ==
                            PackageManager.PERMISSION_DENIED) {
                        // permission not granted
                        String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                        requestPermissions(permissions, PERMISSION_CODE);
                    } else {
                        //perm already given
                        pickImageFromGallery();
                    }
                } else {
                    //sys less tha
                    pickImageFromGallery();
                }
            }
        });
    }

    private void pickImageFromGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 0);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    pickImageFromGallery();
                } else {
                    Toast.makeText(this, "permission not granted", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private static String getGalleryPath() {
        return Environment.getExternalStorageDirectory() + "/" + Environment.DIRECTORY_DCIM + "/Camera/";
    }

    private void saveSampleToSD() {


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        try {

            InputStream inputStream = getContentResolver().openInputStream(data.getData());

            byte[] targetArray = new byte[inputStream.available()];
            inputStream.read(targetArray);

            RequestBody requestBody = RequestBody.create(MediaType.parse("application/octet-stream"), targetArray);
            Call<ResponseBody> call = api.RecognizeFromContent(requestBody);

            try {
                Response<ResponseBody> res = call.execute();
                ResponseBody answer = res.body();

                OCRResponse ocrResponse = OCRResponse.Deserialize(answer);
                String text = ocrResponse.text;

                mChooseBtn.setVisibility(View.INVISIBLE);
                mTextView.setText(text);
                mImageView.setVisibility(View.INVISIBLE);
                mTextView.setVisibility(View.VISIBLE);

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
