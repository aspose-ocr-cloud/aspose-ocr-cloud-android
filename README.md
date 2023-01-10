<img src="./resources/heading.png">

# Android Cloud REST API for OCR
![](https://img.shields.io/badge/api-v3.0-lightgrey)  [![GitHub license](https://img.shields.io/github/license/aspose-ocr-cloud/aspose-ocr-cloud-android)](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-android)


Aspose OCR Cloud Android SDK is a simple OCR technology, which you can use in your application to convert image to text.
[Aspose.OCR Cloud](https://products.aspose.cloud/ocr/cloud) is a simple SDK used to add text recognition to your app with merely a few lines of code.
In detail, it's a set of SDKs for optical character recognition and document scanning in our Cloud. It supports reading and recognizing text from most commonly used raster image formats. Just pass a specific image to the Aspose.OCR Cloud API, and it will return a response with recognized text.

It is easy to get started with Aspose.OCR Cloud, and there is nothing to install. Create an account at Aspose Cloud and get your application information, then you are ready to use [SDKs](#asposeocr-cloud-sdks)


## Try Online
[Image to Text](https://products.aspose.app/ocr/scan-image) | [Image to Searchable PDF](https://products.aspose.app/ocr/ocr-to-pdf) | [PDF OCR](https://products.aspose.app/ocr/pdf-ocr)| [Receipt Scanner](https://products.aspose.app/ocr/scan-receipt)
:---: | :---: | :---:| :---:
[![Scan Image](https://products.aspose.app/ocr/scan-image/img/ocr-recognize-48.png)](https://products.aspose.app/ocr/scan-image) | [![Image to Searchable PDF](https://products.aspose.app/ocr/scan-image/img/ocr-to-pdf-4-48.png)](https://products.aspose.app/ocr/ocr-to-pdf) | [![PDF OCR](https://products.aspose.app/ocr/scan-image/img/ocr-to-pdf-2-48.png)](https://products.aspose.app/ocr/pdf-ocr) | [![Receipt Scanner](https://products.aspose.app/ocr/scan-image/img/aspose-scan-receipt-48.png)](https://products.aspose.app/ocr/scan-receipt) 



## Release 22.12.0

What was changed

This is the major release of Aspose.OCR Cloud which delivers significant new features, enhancements to existing features, performance improvements, and fixes. The list below contains the most important features that are supported in this release:

- Image to speech conversion
  Convert almost any picture or photo with readable characters into a natural human voice that can be played in the background or downloaded.
- Advanced image binarization 
  A specialized neural network for converting images to black and white for better text recognition.
- Automatic skew correction
  Detect image skew angle and automatically correct the tilt.
- Dewrapping 
  Detect perspective distortions and automatically straighten the image.
- Upscaling 
  Intelligently enhance image resolution without losing the content and quality.

Public API changes and backwards compatibility

BACKWARD INCOMPATIBILITY!

This release is based on a completely new architecture (version 5.0) that is not backward compatible with previous (version 3.0) principles and workflows. Version 3.0 is also available at Deprecated directory.

To maintain compatibility, please continue to use the previous version of the Aspose.OCR Cloud API.
Added public APIs:

See Aspose OCR Cloud 5.0 API Reference for the full list of new endpoints and request parameters.
Updated public APIs:

This is the first release based on the new (version 5.0) architecture. When updates, renames and improvements are introduced, they will be described in future Release Notes. Keep for updates.
Removed public APIs:

This is the first release based on the new (version 5.0) architecture. When some of the methods become deprecated, this will be announced in future Release Notes.


## Features
- Automated skew correction
- Automated and manual document layout detection
- Recognize documents with complex layouts in fully automatic mode or with manual corrections.
- Extract and recognize text from images via OCR
- Supports multiple international languages
- High speed with no hardware resources
- Receipt recognition
- Table image recognition
- Supports PDF Recognition
- Text correction using spell checking algorithms
- Various output formats: Text, Searchable PDF, hOCR, Excel for tables.
- Handwritten text recognition

## Recognize text of different languages
Aspose.OCR Cloud supports 45 languages including English, German, French, Italian, Spanish, Portuguese, Polish, Slovene, Slovak, Netherlands, Lithuanian, Latvian, Danish, Norwegian, Finnish, Serbian, Croatian, Czech, Swedish, Estonian, Romanian, Chinese, Arabic, Hindi, Russian, Ukrainian, Bengali, Tibetan, Thai, Urdu, Turkish, Korean, Indonesian, Hebrew, Javanese, Greek, Japanese, Persian, Albanian, Latin, Vietnamese, Uzbek, Georgian, Bulgarian, Azerbaijani  and a lot of other works too.

## How to use the SDK?

Our API is completely independent of your operating system, database system, or development language. You can use any language and platform that supports HTTP to interact with our API. However, manually writing client code can be difficult, error-prone, and time-consuming. Therefore, we have provided and support [SDKs](#asposeocr-cloud-sdks) in several development languages to make it easier to integrate with us.

____

## Quickstart

Make your solution using [SDK](#asposeocr-cloud-sdks), follow these steps:

#### 1. Get API keys if you haven't

Make a personal account on [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/) and click _Get Keys_. These keys are useful for all Aspose Cloud products. If you have any trouble, look at this [detailed manual](https://docs.aspose.cloud/total/create-new-app-and-get-app-key-and-sid/).

#### 2. Run Demo
  
  * Open [Android example](example) project with Android Studio 
  * Set Your Client Id & Client Secret
  * Run on Android API level 26 compatible device or emulator

#### 3. Add rpository and dependencies to your build system
  
##### Gradle users

Add this dependency to your project's gradle scripts:

<p class="codeblock-label">settings.gradle</p>
```groovy     
    
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url 'https://releases.aspose.cloud/java/repo'
        }
    }
}
```

<p class="codeblock-label">build.gradle</p>
```groovy     
    implementation ('com.aspose:aspose-ocr-cloud-android:22.12.0') {
        exclude group:'org.apache.oltu.oauth2' , module: 'org.apache.oltu.oauth2.common'
        exclude group: 'javax.ws.rs'
    }
```
#### 4. Import dependencies and add sample code where you need

```java
    
            String clientId = "PUT YOUR CLIENT ID HERE";
            String clientSecret = "PUT YOUR CLIENT SECRET HERE";
            System.out.println("Warning: the following action will reduce the number of API calls available " +
                    "to your account in the current period. \n ");

            RecognizeImageApi api = new RecognizeImageApi(clientId, clientSecret);
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
            String taskId = api.postRecognizeImage(requestBody);

            System.out.println("File successfully sent. Your credentials accepted. " +
                    "Your task ID is " + taskId + "\nGetting task results...");
            OCRResponse apiResponse = api.getRecognizeImage(taskId);

            System.out.println(new String(apiResponse.getResults().get(0).getData(), StandardCharsets.UTF_8) + "\n\n");
            System.out.println("Respose received with status " + apiResponse.getTaskStatus().getValue() +"\n\n");
            String result = new String(apiResponse.getResults().get(0).getData(), StandardCharsets.UTF_8);
            System.out.println(result);
```

#### 5. Follow [API documentation](.\target\apidocs) for detailed usage information


<p align="center">
  <a title="Download ZIP" href="https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-android/archive/master.zip">
     <img src="./resources/download.png" />
  </a>
</p>


## SDK Detailes:   

### Structure

This project includes:   
- Android demo application - "/example"
- Java SDK sources located in root of repository. You can integrate build it from sources with your target JDK and itegrate it in your application.



### Dependencies
[See build.gradle](./build.gradle) or [pom.xml](./pom.xml)
_________________________

## Aspose.OCR Cloud SDKs in Popular Languages

| .NET                                                                  | Java                                                                                                             | Python                                                                | Android                                                                                                          | NodeJS                                                                |
|-----------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|
| [GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-dotnet) | [GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-java)                                              | [GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-python) | [GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-android)                                           | [GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-nodejs) |
| [NuGet](https://www.nuget.org/packages/Aspose.ocr-Cloud/)             | [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-ocr-cloud) | [PIP](https://pypi.org/project/aspose-ocr-cloud/)                     | [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-ocr-cloud) | [NPM](https://www.npmjs.com/package/@asposecloud/aspose-ocr-cloud)    |

[Product Page](https://products.aspose.cloud/ocr/) | [Documentation](https://docs.aspose.cloud/display/ocrcloud/Home) | [API Reference](https://apireference.aspose.cloud/ocr/) | [Code Samples](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-nodejs) | [Blog](https://blog.aspose.cloud/category/ocr/) | [Free Support](https://forum.aspose.cloud/c/ocr) | [Free Trial](https://dashboard.aspose.cloud/#/apps)