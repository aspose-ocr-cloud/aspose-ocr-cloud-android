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
import Aspose.OCR.Cloud.SDK.model.DsrConfidence;
import Aspose.OCR.Cloud.SDK.model.DsrMode;
import Aspose.OCR.Cloud.SDK.model.Language;
import Aspose.OCR.Cloud.SDK.model.OCRRegion;
import Aspose.OCR.Cloud.SDK.model.ResultType;
import Aspose.OCR.Cloud.SDK.model.ResultTypeTable;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * OCRSettingsDetectRegions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-03T00:33:58.451+03:00[GMT+03:00]")
public class OCRSettingsDetectRegions {
  public static final String SERIALIZED_NAME_MAKE_SKEW_CORRECT = "makeSkewCorrect";
  @SerializedName(SERIALIZED_NAME_MAKE_SKEW_CORRECT)
  private Boolean makeSkewCorrect = true;

  public static final String SERIALIZED_NAME_MAKE_CONTRAST_CORRECTION = "makeContrastCorrection";
  @SerializedName(SERIALIZED_NAME_MAKE_CONTRAST_CORRECTION)
  private Boolean makeContrastCorrection = true;

  public static final String SERIALIZED_NAME_MAKE_UPSAMPLING = "makeUpsampling";
  @SerializedName(SERIALIZED_NAME_MAKE_UPSAMPLING)
  private Boolean makeUpsampling = false;

  public static final String SERIALIZED_NAME_DSR_CONFIDENCE = "dsrConfidence";
  @SerializedName(SERIALIZED_NAME_DSR_CONFIDENCE)
  private DsrConfidence dsrConfidence;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Language language;

  public static final String SERIALIZED_NAME_ROTATE = "Rotate";
  @SerializedName(SERIALIZED_NAME_ROTATE)
  private Integer rotate;

  public static final String SERIALIZED_NAME_MAKE_SPELL_CHECK = "makeSpellCheck";
  @SerializedName(SERIALIZED_NAME_MAKE_SPELL_CHECK)
  private Boolean makeSpellCheck = false;

  public static final String SERIALIZED_NAME_MAKE_BINARIZATION = "makeBinarization";
  @SerializedName(SERIALIZED_NAME_MAKE_BINARIZATION)
  private Boolean makeBinarization = true;

  public static final String SERIALIZED_NAME_DSR_MODE = "dsrMode";
  @SerializedName(SERIALIZED_NAME_DSR_MODE)
  private DsrMode dsrMode;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "resultType";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  private ResultType resultType;

  public static final String SERIALIZED_NAME_RESULT_TYPE_TABLE = "resultTypeTable";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE_TABLE)
  private ResultTypeTable resultTypeTable;

  public static final String SERIALIZED_NAME_REGIONS = "regions";
  @SerializedName(SERIALIZED_NAME_REGIONS)
  private List<OCRRegion> regions = null;

  public OCRSettingsDetectRegions() {
  }

  public OCRSettingsDetectRegions makeSkewCorrect(Boolean makeSkewCorrect) {
    
    this.makeSkewCorrect = makeSkewCorrect;
    return this;
  }

   /**
   * Get makeSkewCorrect
   * @return makeSkewCorrect
  **/
  @javax.annotation.Nullable

  public Boolean getMakeSkewCorrect() {
    return makeSkewCorrect;
  }


  public void setMakeSkewCorrect(Boolean makeSkewCorrect) {
    this.makeSkewCorrect = makeSkewCorrect;
  }


  public OCRSettingsDetectRegions makeContrastCorrection(Boolean makeContrastCorrection) {
    
    this.makeContrastCorrection = makeContrastCorrection;
    return this;
  }

   /**
   * Get makeContrastCorrection
   * @return makeContrastCorrection
  **/
  @javax.annotation.Nullable

  public Boolean getMakeContrastCorrection() {
    return makeContrastCorrection;
  }


  public void setMakeContrastCorrection(Boolean makeContrastCorrection) {
    this.makeContrastCorrection = makeContrastCorrection;
  }


  public OCRSettingsDetectRegions makeUpsampling(Boolean makeUpsampling) {
    
    this.makeUpsampling = makeUpsampling;
    return this;
  }

   /**
   * Get makeUpsampling
   * @return makeUpsampling
  **/
  @javax.annotation.Nullable

  public Boolean getMakeUpsampling() {
    return makeUpsampling;
  }


  public void setMakeUpsampling(Boolean makeUpsampling) {
    this.makeUpsampling = makeUpsampling;
  }


  public OCRSettingsDetectRegions dsrConfidence(DsrConfidence dsrConfidence) {
    
    this.dsrConfidence = dsrConfidence;
    return this;
  }

   /**
   * Get dsrConfidence
   * @return dsrConfidence
  **/
  @javax.annotation.Nullable

  public DsrConfidence getDsrConfidence() {
    return dsrConfidence;
  }


  public void setDsrConfidence(DsrConfidence dsrConfidence) {
    this.dsrConfidence = dsrConfidence;
  }


  public OCRSettingsDetectRegions language(Language language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable

  public Language getLanguage() {
    return language;
  }


  public void setLanguage(Language language) {
    this.language = language;
  }


  public OCRSettingsDetectRegions rotate(Integer rotate) {
    
    this.rotate = rotate;
    return this;
  }

   /**
   * Get rotate
   * @return rotate
  **/
  @javax.annotation.Nullable

  public Integer getRotate() {
    return rotate;
  }


  public void setRotate(Integer rotate) {
    this.rotate = rotate;
  }


  public OCRSettingsDetectRegions makeSpellCheck(Boolean makeSpellCheck) {
    
    this.makeSpellCheck = makeSpellCheck;
    return this;
  }

   /**
   * Option to enable spell checking and correction algorithm. False by default
   * @return makeSpellCheck
  **/
  @javax.annotation.Nullable

  public Boolean getMakeSpellCheck() {
    return makeSpellCheck;
  }


  public void setMakeSpellCheck(Boolean makeSpellCheck) {
    this.makeSpellCheck = makeSpellCheck;
  }


  public OCRSettingsDetectRegions makeBinarization(Boolean makeBinarization) {
    
    this.makeBinarization = makeBinarization;
    return this;
  }

   /**
   * Get makeBinarization
   * @return makeBinarization
  **/
  @javax.annotation.Nullable

  public Boolean getMakeBinarization() {
    return makeBinarization;
  }


  public void setMakeBinarization(Boolean makeBinarization) {
    this.makeBinarization = makeBinarization;
  }


  public OCRSettingsDetectRegions dsrMode(DsrMode dsrMode) {
    
    this.dsrMode = dsrMode;
    return this;
  }

   /**
   * Get dsrMode
   * @return dsrMode
  **/
  @javax.annotation.Nullable

  public DsrMode getDsrMode() {
    return dsrMode;
  }


  public void setDsrMode(DsrMode dsrMode) {
    this.dsrMode = dsrMode;
  }


  public OCRSettingsDetectRegions resultType(ResultType resultType) {
    
    this.resultType = resultType;
    return this;
  }

   /**
   * Get resultType
   * @return resultType
  **/
  @javax.annotation.Nullable

  public ResultType getResultType() {
    return resultType;
  }


  public void setResultType(ResultType resultType) {
    this.resultType = resultType;
  }


  public OCRSettingsDetectRegions resultTypeTable(ResultTypeTable resultTypeTable) {
    
    this.resultTypeTable = resultTypeTable;
    return this;
  }

   /**
   * Get resultTypeTable
   * @return resultTypeTable
  **/
  @javax.annotation.Nullable

  public ResultTypeTable getResultTypeTable() {
    return resultTypeTable;
  }


  public void setResultTypeTable(ResultTypeTable resultTypeTable) {
    this.resultTypeTable = resultTypeTable;
  }


  public OCRSettingsDetectRegions regions(List<OCRRegion> regions) {
    
    this.regions = regions;
    return this;
  }

  public OCRSettingsDetectRegions addRegionsItem(OCRRegion regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable

  public List<OCRRegion> getRegions() {
    return regions;
  }


  public void setRegions(List<OCRRegion> regions) {
    this.regions = regions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCRSettingsDetectRegions ocRSettingsDetectRegions = (OCRSettingsDetectRegions) o;
    return Objects.equals(this.makeSkewCorrect, ocRSettingsDetectRegions.makeSkewCorrect) &&
        Objects.equals(this.makeContrastCorrection, ocRSettingsDetectRegions.makeContrastCorrection) &&
        Objects.equals(this.makeUpsampling, ocRSettingsDetectRegions.makeUpsampling) &&
        Objects.equals(this.dsrConfidence, ocRSettingsDetectRegions.dsrConfidence) &&
        Objects.equals(this.language, ocRSettingsDetectRegions.language) &&
        Objects.equals(this.rotate, ocRSettingsDetectRegions.rotate) &&
        Objects.equals(this.makeSpellCheck, ocRSettingsDetectRegions.makeSpellCheck) &&
        Objects.equals(this.makeBinarization, ocRSettingsDetectRegions.makeBinarization) &&
        Objects.equals(this.dsrMode, ocRSettingsDetectRegions.dsrMode) &&
        Objects.equals(this.resultType, ocRSettingsDetectRegions.resultType) &&
        Objects.equals(this.resultTypeTable, ocRSettingsDetectRegions.resultTypeTable) &&
        Objects.equals(this.regions, ocRSettingsDetectRegions.regions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(makeSkewCorrect, makeContrastCorrection, makeUpsampling, dsrConfidence, language, rotate, makeSpellCheck, makeBinarization, dsrMode, resultType, resultTypeTable, regions);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCRSettingsDetectRegions {\n");
    sb.append("    makeSkewCorrect: ").append(toIndentedString(makeSkewCorrect)).append("\n");
    sb.append("    makeContrastCorrection: ").append(toIndentedString(makeContrastCorrection)).append("\n");
    sb.append("    makeUpsampling: ").append(toIndentedString(makeUpsampling)).append("\n");
    sb.append("    dsrConfidence: ").append(toIndentedString(dsrConfidence)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
    sb.append("    makeSpellCheck: ").append(toIndentedString(makeSpellCheck)).append("\n");
    sb.append("    makeBinarization: ").append(toIndentedString(makeBinarization)).append("\n");
    sb.append("    dsrMode: ").append(toIndentedString(dsrMode)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    resultTypeTable: ").append(toIndentedString(resultTypeTable)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
    openapiFields.add("makeSkewCorrect");
    openapiFields.add("makeContrastCorrection");
    openapiFields.add("makeUpsampling");
    openapiFields.add("dsrConfidence");
    openapiFields.add("language");
    openapiFields.add("Rotate");
    openapiFields.add("makeSpellCheck");
    openapiFields.add("makeBinarization");
    openapiFields.add("dsrMode");
    openapiFields.add("resultType");
    openapiFields.add("resultTypeTable");
    openapiFields.add("regions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OCRSettingsDetectRegions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OCRSettingsDetectRegions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OCRSettingsDetectRegions is not found in the empty JSON string", OCRSettingsDetectRegions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OCRSettingsDetectRegions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OCRSettingsDetectRegions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("regions") != null && !jsonObj.get("regions").isJsonNull()) {
        JsonArray jsonArrayregions = jsonObj.getAsJsonArray("regions");
        if (jsonArrayregions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("regions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regions` to be an array in the JSON string but got `%s`", jsonObj.get("regions").toString()));
          }

          // validate the optional field `regions` (array)
          for (int i = 0; i < jsonArrayregions.size(); i++) {
            OCRRegion.validateJsonObject(jsonArrayregions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OCRSettingsDetectRegions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OCRSettingsDetectRegions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OCRSettingsDetectRegions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OCRSettingsDetectRegions.class));

       return (TypeAdapter<T>) new TypeAdapter<OCRSettingsDetectRegions>() {
           @Override
           public void write(JsonWriter out, OCRSettingsDetectRegions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OCRSettingsDetectRegions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OCRSettingsDetectRegions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OCRSettingsDetectRegions
  * @throws IOException if the JSON string is invalid with respect to OCRSettingsDetectRegions
  */
  public static OCRSettingsDetectRegions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OCRSettingsDetectRegions.class);
  }

 /**
  * Convert an instance of OCRSettingsDetectRegions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

