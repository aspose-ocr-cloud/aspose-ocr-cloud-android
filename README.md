<img src="sourceTest/heading.png">

# Aspose OCR Cloud SDK for Android

Aspose OCR Cloud Android SDK is a simple OCR technology, which you can use in your application to convert image to text.

[Aspose.OCR Cloud](https://products.aspose.cloud/ocr/cloud) is a simple SDK used to add text recognition to your app with merely a few lines of code.

In detail, it's a set of SDKs for optical character recognition and document scanning in our Cloud. It supports reading and recognizing text from most commonly used raster image formats. Just pass a specific image to the Aspose.OCR Cloud API, and it will return a response with recognized text.

It is easy to get started with Aspose.OCR Cloud, and there is nothing to install. Create an account at Aspose Cloud and get your application information, then you are ready to use [SDKs](#asposeocr-cloud-sdks)

## Release 20.7:

We released a feature of recognition regions selection.

## Features:

- Automatic skew correction
- Automatic and manual document layout detection
- Advanced automated image pre-processing
- Extract and recognize text from images via OCR
- Supports multiple international languages
- High speed with no hardware resources

## How to use the SDK?

Our API is completely independent of your operating system, database system, or development language. You can use any language and platform that supports HTTP to interact with our API. However, manually writing client code can be difficult, error-prone, and time-consuming. Therefore, we have provided and support [SDKs](#asposeocr-cloud-sdks) in many development languages to make it easier to integrate with us.

## Example

```java
import com.aspose.ocr.api.*;

private static void setUpConfig() throws Exception {
        Configuration.setAPP_SID("XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX");
        Configuration.setAPI_KEY("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

public String RecognizeFromUrl(String url) {
    String urlToFile = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";
    OCRResponse ocrResponse = RecognizeFromUrl(urlToFile, Language.English);
    return ocrResponse.text;
}

static String RecognizeFromContent(File f) {
    File f = new File(Configuration.getTestSrcDir(), "de_1.jpg");
    OCRResponse ocrResponse = RecognizeFromContent(f, Language.German);
    return ocrResp.text;
}
```
_________________________



## Quickstart

Make your solution using [SDK](#asposeocr-cloud-sdks), follow these steps:

#### 1. Get API keys if you haven't

Make a personal account on [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/) and click _Get Keys_. These keys are useful for all Aspose Cloud products. If you have any trouble, look at this [detailed manual](https://docs.aspose.cloud/total/create-new-app-and-get-app-key-and-sid/).

#### 2. Run Demo

  * Checkout the SDK or get from [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-ocr-cloud-android)
  * Open root folder in Android Studio or integrate [SDK library](/aspose-ocr-cloud-android) in your own porject
  * Run [Adnroud Demo](Android SDK GitHub Repo/app) project or [UnitTests](aspose-ocr-cloud-android/src/test/java/com/aspose/ocr/cloud/android)
  * Set Your AppSid & AppKey
  * Run

<p align="center">
  <a title="Download ZIP" href="https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-android/archive/master.zip">
     <img src="sourceTest/download.png" />
  </a>
</p>


## SDK Detailes:   

### Structure

This project includes:   
- Android demo application - "/app"
- Module "ocr" - this is SDK located in "[/aspose-ocr-cloud-android](./aspose-ocr-cloud-android)". You can integrate it in your application.
- Module "storage" - "[/aspose-storage-cloud-android](.aspose-storage-cloud-android)" is optional dependency, required if you plan to use [Aspose.Storage](https://github.com/aspose-storage-cloud/) features

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-ocr-cloud-android</artifactId>
    <version>20.7.0</version>
    <type>aar</type>
</dependency>
```

### Dependencies
[See build.gradle](./aspose-ocr-cloud-android/build.gradle#L75)
_________________________

## Aspose.OCR Cloud SDKs

||||||||||
|--------------|----------|-------|-------|-------|---------|---------|----------|-------|
|[.NET & Core](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-dotnet)|[Java](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-java)|PHP|Ruby|Python|Node.js|[Android](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-android)|Objective-C|Perl|

## Resources

- **Website:** [https://www.aspose.cloud](https://www.aspose.cloud)
- **Product Home:** [Aspose.OCR Cloud](https://products.aspose.cloud/ocr/family)
- **Documentation:** [Aspose.OCR Cloud Documentation](https://docs.aspose.cloud/ocr/)
- **Forum:** [Aspose.OCR Cloud Forum](https://forum.aspose.cloud/c/ocr)
- **Blog:** [Aspose.OCR Cloud Blog](https://blog.aspose.cloud/category/ocr/)
- **Pricing:** [Aspose Cloud Pricing](https://purchase.aspose.cloud/pricing)
- **Try out Aspose OCR online for free** [Aspose Image to Text](https://products.aspose.app/ocr/scan-image).
