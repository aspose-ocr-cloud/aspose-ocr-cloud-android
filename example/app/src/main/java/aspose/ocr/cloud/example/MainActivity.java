package aspose.ocr.cloud.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

import aspose.ocr.cloud.example.apiExamples.RecognizeImageApiTask;
import aspose.ocr.cloud.example.apiExamples.RecognizeImageApiTaskParams;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       String clientId = "Your client_id";
       String clientSecret = "Your client_secret";

        TextView outputTextView= (TextView)findViewById(R.id.tw1);
        try {
            outputTextView.setText( new RecognizeImageApiTask().execute(
                    new RecognizeImageApiTaskParams(clientId, clientSecret, this)).get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}