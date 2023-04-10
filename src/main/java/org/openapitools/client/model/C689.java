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
import org.openapitools.client.model.EDIFACTID1245;

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
 * C689
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C689 {
  public static final String SERIALIZED_NAME_STATUS_INDICATOR01 = "StatusIndicator_01";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR01)
  private EDIFACTID1245 statusIndicator01;

  public static final String SERIALIZED_NAME_STATUS_INDICATOR02 = "StatusIndicator_02";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR02)
  private EDIFACTID1245 statusIndicator02;

  public static final String SERIALIZED_NAME_STATUS_INDICATOR03 = "StatusIndicator_03";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR03)
  private EDIFACTID1245 statusIndicator03;

  public static final String SERIALIZED_NAME_STATUS_INDICATOR04 = "StatusIndicator_04";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR04)
  private EDIFACTID1245 statusIndicator04;

  public static final String SERIALIZED_NAME_STATUS_INDICATOR05 = "StatusIndicator_05";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR05)
  private EDIFACTID1245 statusIndicator05;

  public static final String SERIALIZED_NAME_STATUS_INDICATOR06 = "StatusIndicator_06";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR06)
  private EDIFACTID1245 statusIndicator06;

  public static final String SERIALIZED_NAME_STATUS_INDICATOR07 = "StatusIndicator_07";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR07)
  private EDIFACTID1245 statusIndicator07;

  public static final String SERIALIZED_NAME_STATUS_INDICATOR08 = "StatusIndicator_08";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR08)
  private EDIFACTID1245 statusIndicator08;

  public static final String SERIALIZED_NAME_STATUS_INDICATOR09 = "StatusIndicator_09";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR09)
  private EDIFACTID1245 statusIndicator09;

  public C689() {
  }

  public C689 statusIndicator01(EDIFACTID1245 statusIndicator01) {
    
    this.statusIndicator01 = statusIndicator01;
    return this;
  }

   /**
   * Get statusIndicator01
   * @return statusIndicator01
  **/
  @javax.annotation.Nonnull

  public EDIFACTID1245 getStatusIndicator01() {
    return statusIndicator01;
  }


  public void setStatusIndicator01(EDIFACTID1245 statusIndicator01) {
    this.statusIndicator01 = statusIndicator01;
  }


  public C689 statusIndicator02(EDIFACTID1245 statusIndicator02) {
    
    this.statusIndicator02 = statusIndicator02;
    return this;
  }

   /**
   * Get statusIndicator02
   * @return statusIndicator02
  **/
  @javax.annotation.Nullable

  public EDIFACTID1245 getStatusIndicator02() {
    return statusIndicator02;
  }


  public void setStatusIndicator02(EDIFACTID1245 statusIndicator02) {
    this.statusIndicator02 = statusIndicator02;
  }


  public C689 statusIndicator03(EDIFACTID1245 statusIndicator03) {
    
    this.statusIndicator03 = statusIndicator03;
    return this;
  }

   /**
   * Get statusIndicator03
   * @return statusIndicator03
  **/
  @javax.annotation.Nullable

  public EDIFACTID1245 getStatusIndicator03() {
    return statusIndicator03;
  }


  public void setStatusIndicator03(EDIFACTID1245 statusIndicator03) {
    this.statusIndicator03 = statusIndicator03;
  }


  public C689 statusIndicator04(EDIFACTID1245 statusIndicator04) {
    
    this.statusIndicator04 = statusIndicator04;
    return this;
  }

   /**
   * Get statusIndicator04
   * @return statusIndicator04
  **/
  @javax.annotation.Nullable

  public EDIFACTID1245 getStatusIndicator04() {
    return statusIndicator04;
  }


  public void setStatusIndicator04(EDIFACTID1245 statusIndicator04) {
    this.statusIndicator04 = statusIndicator04;
  }


  public C689 statusIndicator05(EDIFACTID1245 statusIndicator05) {
    
    this.statusIndicator05 = statusIndicator05;
    return this;
  }

   /**
   * Get statusIndicator05
   * @return statusIndicator05
  **/
  @javax.annotation.Nullable

  public EDIFACTID1245 getStatusIndicator05() {
    return statusIndicator05;
  }


  public void setStatusIndicator05(EDIFACTID1245 statusIndicator05) {
    this.statusIndicator05 = statusIndicator05;
  }


  public C689 statusIndicator06(EDIFACTID1245 statusIndicator06) {
    
    this.statusIndicator06 = statusIndicator06;
    return this;
  }

   /**
   * Get statusIndicator06
   * @return statusIndicator06
  **/
  @javax.annotation.Nullable

  public EDIFACTID1245 getStatusIndicator06() {
    return statusIndicator06;
  }


  public void setStatusIndicator06(EDIFACTID1245 statusIndicator06) {
    this.statusIndicator06 = statusIndicator06;
  }


  public C689 statusIndicator07(EDIFACTID1245 statusIndicator07) {
    
    this.statusIndicator07 = statusIndicator07;
    return this;
  }

   /**
   * Get statusIndicator07
   * @return statusIndicator07
  **/
  @javax.annotation.Nullable

  public EDIFACTID1245 getStatusIndicator07() {
    return statusIndicator07;
  }


  public void setStatusIndicator07(EDIFACTID1245 statusIndicator07) {
    this.statusIndicator07 = statusIndicator07;
  }


  public C689 statusIndicator08(EDIFACTID1245 statusIndicator08) {
    
    this.statusIndicator08 = statusIndicator08;
    return this;
  }

   /**
   * Get statusIndicator08
   * @return statusIndicator08
  **/
  @javax.annotation.Nullable

  public EDIFACTID1245 getStatusIndicator08() {
    return statusIndicator08;
  }


  public void setStatusIndicator08(EDIFACTID1245 statusIndicator08) {
    this.statusIndicator08 = statusIndicator08;
  }


  public C689 statusIndicator09(EDIFACTID1245 statusIndicator09) {
    
    this.statusIndicator09 = statusIndicator09;
    return this;
  }

   /**
   * Get statusIndicator09
   * @return statusIndicator09
  **/
  @javax.annotation.Nullable

  public EDIFACTID1245 getStatusIndicator09() {
    return statusIndicator09;
  }


  public void setStatusIndicator09(EDIFACTID1245 statusIndicator09) {
    this.statusIndicator09 = statusIndicator09;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C689 C689 = (C689) o;
    return Objects.equals(this.statusIndicator01, C689.statusIndicator01) &&
        Objects.equals(this.statusIndicator02, C689.statusIndicator02) &&
        Objects.equals(this.statusIndicator03, C689.statusIndicator03) &&
        Objects.equals(this.statusIndicator04, C689.statusIndicator04) &&
        Objects.equals(this.statusIndicator05, C689.statusIndicator05) &&
        Objects.equals(this.statusIndicator06, C689.statusIndicator06) &&
        Objects.equals(this.statusIndicator07, C689.statusIndicator07) &&
        Objects.equals(this.statusIndicator08, C689.statusIndicator08) &&
        Objects.equals(this.statusIndicator09, C689.statusIndicator09);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusIndicator01, statusIndicator02, statusIndicator03, statusIndicator04, statusIndicator05, statusIndicator06, statusIndicator07, statusIndicator08, statusIndicator09);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C689 {\n");
    sb.append("    statusIndicator01: ").append(toIndentedString(statusIndicator01)).append("\n");
    sb.append("    statusIndicator02: ").append(toIndentedString(statusIndicator02)).append("\n");
    sb.append("    statusIndicator03: ").append(toIndentedString(statusIndicator03)).append("\n");
    sb.append("    statusIndicator04: ").append(toIndentedString(statusIndicator04)).append("\n");
    sb.append("    statusIndicator05: ").append(toIndentedString(statusIndicator05)).append("\n");
    sb.append("    statusIndicator06: ").append(toIndentedString(statusIndicator06)).append("\n");
    sb.append("    statusIndicator07: ").append(toIndentedString(statusIndicator07)).append("\n");
    sb.append("    statusIndicator08: ").append(toIndentedString(statusIndicator08)).append("\n");
    sb.append("    statusIndicator09: ").append(toIndentedString(statusIndicator09)).append("\n");
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
    openapiFields.add("StatusIndicator_01");
    openapiFields.add("StatusIndicator_02");
    openapiFields.add("StatusIndicator_03");
    openapiFields.add("StatusIndicator_04");
    openapiFields.add("StatusIndicator_05");
    openapiFields.add("StatusIndicator_06");
    openapiFields.add("StatusIndicator_07");
    openapiFields.add("StatusIndicator_08");
    openapiFields.add("StatusIndicator_09");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("StatusIndicator_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C689
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C689.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C689 is not found in the empty JSON string", C689.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C689.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C689` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : C689.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C689.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C689' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C689> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C689.class));

       return (TypeAdapter<T>) new TypeAdapter<C689>() {
           @Override
           public void write(JsonWriter out, C689 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C689 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C689 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C689
  * @throws IOException if the JSON string is invalid with respect to C689
  */
  public static C689 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C689.class);
  }

 /**
  * Convert an instance of C689 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

