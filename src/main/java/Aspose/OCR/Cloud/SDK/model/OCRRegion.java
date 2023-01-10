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
import Aspose.OCR.Cloud.SDK.model.OCRRect;
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
 * Represents information about strict regions to recognize text
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-28T12:50:34.493887Z[Etc/UTC]")
public class OCRRegion {
  public static final String SERIALIZED_NAME_RECT = "rect";
  @SerializedName(SERIALIZED_NAME_RECT)
  private OCRRect rect;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public OCRRegion() {
  }

  public OCRRegion rect(OCRRect rect) {
    
    this.rect = rect;
    return this;
  }

   /**
   * Get rect
   * @return rect
  **/
  @javax.annotation.Nullable

  public OCRRect getRect() {
    return rect;
  }


  public void setRect(OCRRect rect) {
    this.rect = rect;
  }


  public OCRRegion order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * The serial number of the region for the formation of the text
   * @return order
  **/
  @javax.annotation.Nullable

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCRRegion ocRRegion = (OCRRegion) o;
    return Objects.equals(this.rect, ocRRegion.rect) &&
        Objects.equals(this.order, ocRRegion.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rect, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCRRegion {\n");
    sb.append("    rect: ").append(toIndentedString(rect)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("rect");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OCRRegion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OCRRegion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OCRRegion is not found in the empty JSON string", OCRRegion.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OCRRegion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OCRRegion` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `rect`
      if (jsonObj.get("rect") != null && !jsonObj.get("rect").isJsonNull()) {
        OCRRect.validateJsonObject(jsonObj.getAsJsonObject("rect"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OCRRegion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OCRRegion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OCRRegion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OCRRegion.class));

       return (TypeAdapter<T>) new TypeAdapter<OCRRegion>() {
           @Override
           public void write(JsonWriter out, OCRRegion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OCRRegion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OCRRegion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OCRRegion
  * @throws IOException if the JSON string is invalid with respect to OCRRegion
  */
  public static OCRRegion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OCRRegion.class);
  }

 /**
  * Convert an instance of OCRRegion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

