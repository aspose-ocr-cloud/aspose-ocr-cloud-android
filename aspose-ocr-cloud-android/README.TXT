EXAMPLE # 1
File f = new File("FILE/PATH/FILE.NAME");
RequestBody requestBody = RequestBody.create( MediaType.parse("application/octet-stream"), f);
Call<ResponseBody> call = api.RecognizeFromContent(requestBody);
Response<ResponseBody> res = call.execute();
ResponseBody answer = res.body();
OCRResponse ocrResp = OCRResponse.Deserialize(answer);
out.println("OCR result - Text: " + ocrResp.text);