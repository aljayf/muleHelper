/*
 * EdiNation API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.C306;
import org.openapitools.client.model.C308;
import org.openapitools.client.model.C309;
import org.openapitools.client.model.C310;
import org.openapitools.client.model.C311;
import org.openapitools.client.model.C328;
import org.openapitools.client.model.EDIFACTID7365;

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

import org.openapitools.client.JSON;

/**
 * TVL
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class TVL {
  public static final String SERIALIZED_NAME_C31001 = "C310_01";
  @SerializedName(SERIALIZED_NAME_C31001)
  private C310 C310_01;

  public static final String SERIALIZED_NAME_C32802 = "C328_02";
  @SerializedName(SERIALIZED_NAME_C32802)
  private C328 C328_02;

  public static final String SERIALIZED_NAME_C32803 = "C328_03";
  @SerializedName(SERIALIZED_NAME_C32803)
  private C328 C328_03;

  public static final String SERIALIZED_NAME_C30604 = "C306_04";
  @SerializedName(SERIALIZED_NAME_C30604)
  private C306 C306_04;

  public static final String SERIALIZED_NAME_C30805 = "C308_05";
  @SerializedName(SERIALIZED_NAME_C30805)
  private C308 C308_05;

  public static final String SERIALIZED_NAME_C30906 = "C309_06";
  @SerializedName(SERIALIZED_NAME_C30906)
  private C309 C309_06;

  public static final String SERIALIZED_NAME_LINE_ITEM_NUMBER07 = "LineItemNumber_07";
  @SerializedName(SERIALIZED_NAME_LINE_ITEM_NUMBER07)
  private String lineItemNumber07;

  public static final String SERIALIZED_NAME_PROCESSING_INDICATOR08 = "ProcessingIndicator_08";
  @SerializedName(SERIALIZED_NAME_PROCESSING_INDICATOR08)
  private EDIFACTID7365 processingIndicator08;

  public static final String SERIALIZED_NAME_C31109 = "C311_09";
  @SerializedName(SERIALIZED_NAME_C31109)
  private List<C311> C311_09;

  public TVL() {
  }

  public TVL C310_01(C310 C310_01) {
    
    this.C310_01 = C310_01;
    return this;
  }

   /**
   * Get C310_01
   * @return C310_01
  **/
  @javax.annotation.Nullable

  public C310 getC31001() {
    return C310_01;
  }


  public void setC31001(C310 C310_01) {
    this.C310_01 = C310_01;
  }


  public TVL C328_02(C328 C328_02) {
    
    this.C328_02 = C328_02;
    return this;
  }

   /**
   * Get C328_02
   * @return C328_02
  **/
  @javax.annotation.Nullable

  public C328 getC32802() {
    return C328_02;
  }


  public void setC32802(C328 C328_02) {
    this.C328_02 = C328_02;
  }


  public TVL C328_03(C328 C328_03) {
    
    this.C328_03 = C328_03;
    return this;
  }

   /**
   * Get C328_03
   * @return C328_03
  **/
  @javax.annotation.Nullable

  public C328 getC32803() {
    return C328_03;
  }


  public void setC32803(C328 C328_03) {
    this.C328_03 = C328_03;
  }


  public TVL C306_04(C306 C306_04) {
    
    this.C306_04 = C306_04;
    return this;
  }

   /**
   * Get C306_04
   * @return C306_04
  **/
  @javax.annotation.Nullable

  public C306 getC30604() {
    return C306_04;
  }


  public void setC30604(C306 C306_04) {
    this.C306_04 = C306_04;
  }


  public TVL C308_05(C308 C308_05) {
    
    this.C308_05 = C308_05;
    return this;
  }

   /**
   * Get C308_05
   * @return C308_05
  **/
  @javax.annotation.Nullable

  public C308 getC30805() {
    return C308_05;
  }


  public void setC30805(C308 C308_05) {
    this.C308_05 = C308_05;
  }


  public TVL C309_06(C309 C309_06) {
    
    this.C309_06 = C309_06;
    return this;
  }

   /**
   * Get C309_06
   * @return C309_06
  **/
  @javax.annotation.Nullable

  public C309 getC30906() {
    return C309_06;
  }


  public void setC30906(C309 C309_06) {
    this.C309_06 = C309_06;
  }


  public TVL lineItemNumber07(String lineItemNumber07) {
    
    this.lineItemNumber07 = lineItemNumber07;
    return this;
  }

   /**
   * Get lineItemNumber07
   * @return lineItemNumber07
  **/
  @javax.annotation.Nullable

  public String getLineItemNumber07() {
    return lineItemNumber07;
  }


  public void setLineItemNumber07(String lineItemNumber07) {
    this.lineItemNumber07 = lineItemNumber07;
  }


  public TVL processingIndicator08(EDIFACTID7365 processingIndicator08) {
    
    this.processingIndicator08 = processingIndicator08;
    return this;
  }

   /**
   * Get processingIndicator08
   * @return processingIndicator08
  **/
  @javax.annotation.Nullable

  public EDIFACTID7365 getProcessingIndicator08() {
    return processingIndicator08;
  }


  public void setProcessingIndicator08(EDIFACTID7365 processingIndicator08) {
    this.processingIndicator08 = processingIndicator08;
  }


  public TVL C311_09(List<C311> C311_09) {
    
    this.C311_09 = C311_09;
    return this;
  }

  public TVL addC31109Item(C311 C311_09Item) {
    if (this.C311_09 == null) {
      this.C311_09 = new ArrayList<>();
    }
    this.C311_09.add(C311_09Item);
    return this;
  }

   /**
   * Get C311_09
   * @return C311_09
  **/
  @javax.annotation.Nullable

  public List<C311> getC31109() {
    return C311_09;
  }


  public void setC31109(List<C311> C311_09) {
    this.C311_09 = C311_09;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TVL TVL = (TVL) o;
    return Objects.equals(this.C310_01, TVL.C310_01) &&
        Objects.equals(this.C328_02, TVL.C328_02) &&
        Objects.equals(this.C328_03, TVL.C328_03) &&
        Objects.equals(this.C306_04, TVL.C306_04) &&
        Objects.equals(this.C308_05, TVL.C308_05) &&
        Objects.equals(this.C309_06, TVL.C309_06) &&
        Objects.equals(this.lineItemNumber07, TVL.lineItemNumber07) &&
        Objects.equals(this.processingIndicator08, TVL.processingIndicator08) &&
        Objects.equals(this.C311_09, TVL.C311_09);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C310_01, C328_02, C328_03, C306_04, C308_05, C309_06, lineItemNumber07, processingIndicator08, C311_09);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TVL {\n");
    sb.append("    C310_01: ").append(toIndentedString(C310_01)).append("\n");
    sb.append("    C328_02: ").append(toIndentedString(C328_02)).append("\n");
    sb.append("    C328_03: ").append(toIndentedString(C328_03)).append("\n");
    sb.append("    C306_04: ").append(toIndentedString(C306_04)).append("\n");
    sb.append("    C308_05: ").append(toIndentedString(C308_05)).append("\n");
    sb.append("    C309_06: ").append(toIndentedString(C309_06)).append("\n");
    sb.append("    lineItemNumber07: ").append(toIndentedString(lineItemNumber07)).append("\n");
    sb.append("    processingIndicator08: ").append(toIndentedString(processingIndicator08)).append("\n");
    sb.append("    C311_09: ").append(toIndentedString(C311_09)).append("\n");
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
    openapiFields.add("C310_01");
    openapiFields.add("C328_02");
    openapiFields.add("C328_03");
    openapiFields.add("C306_04");
    openapiFields.add("C308_05");
    openapiFields.add("C309_06");
    openapiFields.add("LineItemNumber_07");
    openapiFields.add("ProcessingIndicator_08");
    openapiFields.add("C311_09");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TVL
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TVL.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TVL is not found in the empty JSON string", TVL.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TVL.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TVL` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `C310_01`
      if (jsonObj.get("C310_01") != null && !jsonObj.get("C310_01").isJsonNull()) {
        C310.validateJsonObject(jsonObj.getAsJsonObject("C310_01"));
      }
      // validate the optional field `C328_02`
      if (jsonObj.get("C328_02") != null && !jsonObj.get("C328_02").isJsonNull()) {
        C328.validateJsonObject(jsonObj.getAsJsonObject("C328_02"));
      }
      // validate the optional field `C328_03`
      if (jsonObj.get("C328_03") != null && !jsonObj.get("C328_03").isJsonNull()) {
        C328.validateJsonObject(jsonObj.getAsJsonObject("C328_03"));
      }
      // validate the optional field `C306_04`
      if (jsonObj.get("C306_04") != null && !jsonObj.get("C306_04").isJsonNull()) {
        C306.validateJsonObject(jsonObj.getAsJsonObject("C306_04"));
      }
      // validate the optional field `C308_05`
      if (jsonObj.get("C308_05") != null && !jsonObj.get("C308_05").isJsonNull()) {
        C308.validateJsonObject(jsonObj.getAsJsonObject("C308_05"));
      }
      // validate the optional field `C309_06`
      if (jsonObj.get("C309_06") != null && !jsonObj.get("C309_06").isJsonNull()) {
        C309.validateJsonObject(jsonObj.getAsJsonObject("C309_06"));
      }
      if ((jsonObj.get("LineItemNumber_07") != null && !jsonObj.get("LineItemNumber_07").isJsonNull()) && !jsonObj.get("LineItemNumber_07").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LineItemNumber_07` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LineItemNumber_07").toString()));
      }
      if (jsonObj.get("C311_09") != null && !jsonObj.get("C311_09").isJsonNull()) {
        JsonArray jsonArrayC311_09 = jsonObj.getAsJsonArray("C311_09");
        if (jsonArrayC311_09 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C311_09").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C311_09` to be an array in the JSON string but got `%s`", jsonObj.get("C311_09").toString()));
          }

          // validate the optional field `C311_09` (array)
          for (int i = 0; i < jsonArrayC311_09.size(); i++) {
            C311.validateJsonObject(jsonArrayC311_09.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TVL.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TVL' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TVL> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TVL.class));

       return (TypeAdapter<T>) new TypeAdapter<TVL>() {
           @Override
           public void write(JsonWriter out, TVL value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TVL read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TVL given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TVL
  * @throws IOException if the JSON string is invalid with respect to TVL
  */
  public static TVL fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TVL.class);
  }

 /**
  * Convert an instance of TVL to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

