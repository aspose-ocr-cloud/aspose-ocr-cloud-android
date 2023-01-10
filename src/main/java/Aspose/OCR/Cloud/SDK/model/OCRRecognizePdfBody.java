/*
 * Aspose OCR Cloud 5.0 API
 * Aspose OCR Cloud 5.0 API
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Aspose.OCR.Cloud.SDK.model;

import java.util.Objects;
import java.util.Arrays;
import Aspose.OCR.Cloud.SDK.model.OCRSettingsRecognizePdf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Aspose.OCR.Cloud.SDK.JSON;

/**
 * Combines Image data and OCR Recognition settings for PDF
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-28T12:50:34.493887Z[Etc/UTC]")
public class OCRRecognizePdfBody {
  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private byte[] image;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private OCRSettingsRecognizePdf settings;

  public OCRRecognizePdfBody() {
  }

  public OCRRecognizePdfBody image(byte[] image) {
    
    this.image = image;
    return this;
  }

   /**
   * Gets or Sets Image
   * @return image
  **/
  @javax.annotation.Nonnull

  public byte[] getImage() {
    return image;
  }


  public void setImage(byte[] image) {
    this.image = image;
  }


  public OCRRecognizePdfBody settings(OCRSettingsRecognizePdf settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nonnull

  public OCRSettingsRecognizePdf getSettings() {
    return settings;
  }


  public void setSettings(OCRSettingsRecognizePdf settings) {
    this.settings = settings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCRRecognizePdfBody ocRRecognizePdfBody = (OCRRecognizePdfBody) o;
    return Arrays.equals(this.image, ocRRecognizePdfBody.image) &&
        Objects.equals(this.settings, ocRRecognizePdfBody.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(image), settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCRRecognizePdfBody {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("image");
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("settings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OCRRecognizePdfBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OCRRecognizePdfBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OCRRecognizePdfBody is not found in the empty JSON string", OCRRecognizePdfBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OCRRecognizePdfBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OCRRecognizePdfBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OCRRecognizePdfBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `settings`
      OCRSettingsRecognizePdf.validateJsonObject(jsonObj.getAsJsonObject("settings"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OCRRecognizePdfBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OCRRecognizePdfBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OCRRecognizePdfBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OCRRecognizePdfBody.class));

       return (TypeAdapter<T>) new TypeAdapter<OCRRecognizePdfBody>() {
           @Override
           public void write(JsonWriter out, OCRRecognizePdfBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OCRRecognizePdfBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OCRRecognizePdfBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OCRRecognizePdfBody
  * @throws IOException if the JSON string is invalid with respect to OCRRecognizePdfBody
  */
  public static OCRRecognizePdfBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OCRRecognizePdfBody.class);
  }

 /**
  * Convert an instance of OCRRecognizePdfBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

