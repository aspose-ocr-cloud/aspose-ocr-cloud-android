package aspose.ocr.cloud.example.apiExamples;

import android.os.AsyncTask;

public class RecognizeImageApiTask extends AsyncTask<RecognizeImageApiTaskParams, Integer, String> {
    protected String doInBackground(RecognizeImageApiTaskParams... params) {
        return RecognizeImageApiExample.run(params[0].clientId,
                params[0].clientSecret,
                params[0].context);
    }

    protected void onProgressUpdate(Integer... progress) {
    }

    protected void onPostExecute(String result) {
        System.out.println("?");
    }
}

