package aspose.ocr.cloud.example.apiExamples;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import Aspose.OCR.Cloud.SDK.RecognizeImageTrialApi;
import Aspose.OCR.Cloud.SDK.model.DsrConfidence;
import Aspose.OCR.Cloud.SDK.model.DsrMode;
import Aspose.OCR.Cloud.SDK.model.Language;
import Aspose.OCR.Cloud.SDK.model.OCRRecognizeImageBody;
import Aspose.OCR.Cloud.SDK.model.OCRResponse;
import Aspose.OCR.Cloud.SDK.model.OCRSettingsRecognizeImage;
import Aspose.OCR.Cloud.SDK.model.ResultType;
import aspose.ocr.cloud.example.MainActivity;

public class RecognizeImageTrialApiExample {

    public static String run(MainActivity context) {

        try {
            System.out.println("Warning: the following action will reduce the number of API calls available " +
                    "to your account in the current period. \n ");

            RecognizeImageTrialApi api = new RecognizeImageTrialApi();
            OCRSettingsRecognizeImage settings = new OCRSettingsRecognizeImage();
            settings.setLanguage(Language.ENGLISH);
            settings.setDsrConfidence(DsrConfidence.DEFAULT);
            settings.setDsrMode(DsrMode.NODSRNOFILTER);
            settings.setMakeBinarization(false);
            settings.setMakeSkewCorrect(false);
            settings.setMakeContrastCorrection(false);
            settings.setMakeUpsampling(false);
            settings.setResultType(ResultType.TEXT);

            String imageFileName = "samples/latin.png";
            InputStream inputStream = context.getAssets().open(imageFileName);
            int size = inputStream.available();
            byte[] imageData = new byte[size];
            inputStream.read(imageData);
            inputStream.close();

            OCRRecognizeImageBody requestBody = new OCRRecognizeImageBody();
            requestBody.setImage(imageData);
            requestBody.setSettings(settings);

            System.out.println("Sending sample image (" + imageFileName +") to RecognizeImageApi...");
            String taskId = api.postRecognizeImageTrial(requestBody);

            System.out.println("File successfully sent. Your credentials accepted. " +
                    "Your task ID is " + taskId + "\nGetting task results...");
            OCRResponse apiResponse = api.getRecognizeImageTrial(taskId);

            System.out.println(new String(apiResponse.getResults().get(0).getData(), StandardCharsets.UTF_8) + "\n\n");
            System.out.println("Respose received with status " + apiResponse.getTaskStatus().getValue() +"\n\n");
            return new String(apiResponse.getResults().get(0).getData(), StandardCharsets.UTF_8);

        } catch (Exception ex) {
            System.out.println(ex.toString());
            return "Undefined error";
        }
    }
}

