package aspose.ocr.cloud.example.apiExamples;

import android.app.Activity;

import aspose.ocr.cloud.example.MainActivity;

public class RecognizeImageApiTaskParams {
    String clientId = "";
    String clientSecret = "";
    MainActivity context = null;

    public RecognizeImageApiTaskParams(String _clientId,
                                       String _clientSecret,
                                       MainActivity _context){
        this.clientId = _clientId;
        this.clientSecret =_clientSecret;
        this.context = _context;
    }
}
