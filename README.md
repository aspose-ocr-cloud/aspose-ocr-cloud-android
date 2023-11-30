<img src="./resources/heading.png">

# Aspose.OCR Cloud for Android SDK 23.11.0

[![License](https://img.shields.io/github/license/aspose-ocr-cloud/aspose-ocr-cloud-dotnet)](LICENSE)
[![Nuget](https://img.shields.io/nuget/v/Aspose.OCR-Cloud)](https://www.nuget.org/packages/Aspose.OCR-Cloud/)

[Aspose.OCR Cloud](https://products.aspose.cloud/ocr/) is an optical character recognition as a service. With it, you can easily add OCR functionality to almost any device or platform, including netbooks, mini PCs, or even entry-level smartphones.

Our engine can read text from images, photos, screenshots and scanned PDFs in a wide variety of European, Cyrillic and Oriental fonts, returning results in the most popular document formats. Powerful built-in image processing filters based on neural networks automatically correct skewed and distorted images, automatically remove dirt, smudges, scratches, glare and other image defects that can affect recognition accuracy. To further improve the results, Aspose.OCR Cloud has a built-in spell checker that automatically replaces misspelled words and saves you the trouble of manually correcting the recognition results.

Even the complex recognition tasks can be done with a couple of API calls. To make interacting with Aspose.OCR Cloud services from Android applications even easier, we provide the software development kit (SDK) for Android. It handles all the routine operations such as establishing connections, sending API requests, and parsing responses, wrapping all these tasks into a few simple classes.

Aspose.OCR Cloud SDK for Android is open source under the MIT license. You can freely use it for any projects, including commercial and proprietary applications, as well as modify any part of its code.

## Try Online
[Image to Text](https://products.aspose.app/ocr/scan-image) | [Image to Searchable PDF](https://products.aspose.app/ocr/ocr-to-pdf) | [PDF OCR](https://products.aspose.app/ocr/pdf-ocr)| [Receipt Scanner](https://products.aspose.app/ocr/scan-receipt)
:---: | :---: | :---:| :---:
[![Scan Image](https://products.aspose.app/ocr/scan-image/img/ocr-recognize-48.png)](https://products.aspose.app/ocr/scan-image) | [![Image to Searchable PDF](https://products.aspose.app/ocr/scan-image/img/ocr-to-pdf-4-48.png)](https://products.aspose.app/ocr/ocr-to-pdf) | [![PDF OCR](https://products.aspose.app/ocr/scan-image/img/ocr-to-pdf-2-48.png)](https://products.aspose.app/ocr/pdf-ocr) | [![Receipt Scanner](https://products.aspose.app/ocr/scan-image/img/aspose-scan-receipt-48.png)](https://products.aspose.app/ocr/scan-receipt) 

## What was changed in version 23.11.0

A summary of recent changes, enhancements and bug fixes in **Aspose.OCR Cloud SDK for Android 23.11.0** release:

Key | Summary | Category
--- | ------- | --------
OCR&#8209;3560 | Added an API for extracting structured information from scanned invoices. | New feature
OCR&#8209;3722 | Added a free API for evaluating text-to-speech conversion that works without [authorization](/ocr/authorization/).<br />Some restrictions apply. See below for details. | New feature
OCR&#8209;3171 | Added an API for getting [task status](/ocr/recognition-workflow/#3-fetch-the-recognition-result) without downloading a full recognition result. | Enhancement

REST API changes: https://releases.aspose.cloud/ocr/release-notes/2023/aspose-ocr-cloud-23-11-0-release-notes/

### Public API changes and backwards compatibility

This section lists all public API changes introduced in **Aspose.OCR Cloud SDK for Android 23.11.0** that may affect the code of existing applications.

#### Added public APIs:

The following public APIs have been introduced in this release:

##### Extracting structured information from invoice

The following new classes have been added for extracting structured information in JSON format from scanned or photographed invoices:

Class | Description
----- | -----------
`RecognizeAndParseInvoiceApi` | Invoice processing API.
`OCRSettingsRecognizeAndParseInvoice` | Invoice processing settings.
`OCRRecognizeAndParseInvoiceBody` | Invoice processing request body.

[Learn more...](https://docs.aspose.cloud/ocr/recognize-parse-invoice/)

##### Text-to-speech evaluation

The following new classes have been added:

Class | Description
----- | -----------
`ConvertTextToSpeechTrialApi` | Evaluation text-to-speech conversion API (without authorization).

The evaluation mode has some limitations:

- **10** requests per day from a single IP address.
- The text size must not exceed **500** characters, including spaces and punctuation.
- The phrase _"Please authenticate to the API to remove this message"_ is inserted at a random position within the generated audio.

[Learn more...](https://docs.aspose.cloud/ocr/text-to-speech/)

##### Quickly fetch processing status

The following new classes have been added:

Class | Description
----- | -----------
`UtilitiesApi` | Universal API for various management and monitoring purposes.

[Learn more...](https://docs.aspose.cloud/ocr/subscription/)

#### Updated public APIs:

_No changes_

#### Removed public APIs:

_No changes._


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

    implementation ('com.aspose:aspose-ocr-cloud-android:23.11.0') {
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

#### 5. Follow [API documentation](.\target\apidocs\index.html) for detailed usage information


<p align="center">
  <a title="Download ZIP" href="https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-android/archive/master.zip">
     <img src="./resources/download.png" />
  </a>
</p>


## SDK Details:   

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