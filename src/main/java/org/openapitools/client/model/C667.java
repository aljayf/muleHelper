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
import org.openapitools.client.model.EDIFACTID1001;
import org.openapitools.client.model.EDIFACTID1229;
import org.openapitools.client.model.EDIFACTID9988;

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
 * C667
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C667 {
  public static final String SERIALIZED_NAME_DOCUMENTMESSAGE_NUMBER01 = "DocumentmessageNumber_01";
  @SerializedName(SERIALIZED_NAME_DOCUMENTMESSAGE_NUMBER01)
  private String documentmessageNumber01;

  public static final String SERIALIZED_NAME_DOCUMENTMESSAGE_NAME02 = "DocumentmessageName_02";
  @SerializedName(SERIALIZED_NAME_DOCUMENTMESSAGE_NAME02)
  private EDIFACTID1001 documentmessageName02;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER_OF_ITEMS03 = "TotalNumberOfItems_03";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER_OF_ITEMS03)
  private String totalNumberOfItems03;

  public static final String SERIALIZED_NAME_DATA_INDICATOR04 = "DataIndicator_04";
  @SerializedName(SERIALIZED_NAME_DATA_INDICATOR04)
  private EDIFACTID9988 dataIndicator04;

  public static final String SERIALIZED_NAME_ACTION_REQUEST_NOTIFICATION05 = "ActionRequestNotification_05";
  @SerializedName(SERIALIZED_NAME_ACTION_REQUEST_NOTIFICATION05)
  private EDIFACTID1229 actionRequestNotification05;

  public static final String SERIALIZED_NAME_DOCUMENTMESSAGE_NUMBER06 = "DocumentmessageNumber_06";
  @SerializedName(SERIALIZED_NAME_DOCUMENTMESSAGE_NUMBER06)
  private String documentmessageNumber06;

  public C667() {
  }

  public C667 documentmessageNumber01(String documentmessageNumber01) {
    
    this.documentmessageNumber01 = documentmessageNumber01;
    return this;
  }

   /**
   * Get documentmessageNumber01
   * @return documentmessageNumber01
  **/
  @javax.annotation.Nullable

  public String getDocumentmessageNumber01() {
    return documentmessageNumber01;
  }


  public void setDocumentmessageNumber01(String documentmessageNumber01) {
    this.documentmessageNumber01 = documentmessageNumber01;
  }


  public C667 documentmessageName02(EDIFACTID1001 documentmessageName02) {
    
    this.documentmessageName02 = documentmessageName02;
    return this;
  }

   /**
   * Get documentmessageName02
   * @return documentmessageName02
  **/
  @javax.annotation.Nullable

  public EDIFACTID1001 getDocumentmessageName02() {
    return documentmessageName02;
  }


  public void setDocumentmessageName02(EDIFACTID1001 documentmessageName02) {
    this.documentmessageName02 = documentmessageName02;
  }


  public C667 totalNumberOfItems03(String totalNumberOfItems03) {
    
    this.totalNumberOfItems03 = totalNumberOfItems03;
    return this;
  }

   /**
   * Get totalNumberOfItems03
   * @return totalNumberOfItems03
  **/
  @javax.annotation.Nullable

  public String getTotalNumberOfItems03() {
    return totalNumberOfItems03;
  }


  public void setTotalNumberOfItems03(String totalNumberOfItems03) {
    this.totalNumberOfItems03 = totalNumberOfItems03;
  }


  public C667 dataIndicator04(EDIFACTID9988 dataIndicator04) {
    
    this.dataIndicator04 = dataIndicator04;
    return this;
  }

   /**
   * Get dataIndicator04
   * @return dataIndicator04
  **/
  @javax.annotation.Nullable

  public EDIFACTID9988 getDataIndicator04() {
    return dataIndicator04;
  }


  public void setDataIndicator04(EDIFACTID9988 dataIndicator04) {
    this.dataIndicator04 = dataIndicator04;
  }


  public C667 actionRequestNotification05(EDIFACTID1229 actionRequestNotification05) {
    
    this.actionRequestNotification05 = actionRequestNotification05;
    return this;
  }

   /**
   * Get actionRequestNotification05
   * @return actionRequestNotification05
  **/
  @javax.annotation.Nullable

  public EDIFACTID1229 getActionRequestNotification05() {
    return actionRequestNotification05;
  }


  public void setActionRequestNotification05(EDIFACTID1229 actionRequestNotification05) {
    this.actionRequestNotification05 = actionRequestNotification05;
  }


  public C667 documentmessageNumber06(String documentmessageNumber06) {
    
    this.documentmessageNumber06 = documentmessageNumber06;
    return this;
  }

   /**
   * Get documentmessageNumber06
   * @return documentmessageNumber06
  **/
  @javax.annotation.Nullable

  public String getDocumentmessageNumber06() {
    return documentmessageNumber06;
  }


  public void setDocumentmessageNumber06(String documentmessageNumber06) {
    this.documentmessageNumber06 = documentmessageNumber06;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C667 C667 = (C667) o;
    return Objects.equals(this.documentmessageNumber01, C667.documentmessageNumber01) &&
        Objects.equals(this.documentmessageName02, C667.documentmessageName02) &&
        Objects.equals(this.totalNumberOfItems03, C667.totalNumberOfItems03) &&
        Objects.equals(this.dataIndicator04, C667.dataIndicator04) &&
        Objects.equals(this.actionRequestNotification05, C667.actionRequestNotification05) &&
        Objects.equals(this.documentmessageNumber06, C667.documentmessageNumber06);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentmessageNumber01, documentmessageName02, totalNumberOfItems03, dataIndicator04, actionRequestNotification05, documentmessageNumber06);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C667 {\n");
    sb.append("    documentmessageNumber01: ").append(toIndentedString(documentmessageNumber01)).append("\n");
    sb.append("    documentmessageName02: ").append(toIndentedString(documentmessageName02)).append("\n");
    sb.append("    totalNumberOfItems03: ").append(toIndentedString(totalNumberOfItems03)).append("\n");
    sb.append("    dataIndicator04: ").append(toIndentedString(dataIndicator04)).append("\n");
    sb.append("    actionRequestNotification05: ").append(toIndentedString(actionRequestNotification05)).append("\n");
    sb.append("    documentmessageNumber06: ").append(toIndentedString(documentmessageNumber06)).append("\n");
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
    openapiFields.add("DocumentmessageNumber_01");
    openapiFields.add("DocumentmessageName_02");
    openapiFields.add("TotalNumberOfItems_03");
    openapiFields.add("DataIndicator_04");
    openapiFields.add("ActionRequestNotification_05");
    openapiFields.add("DocumentmessageNumber_06");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C667
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C667.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C667 is not found in the empty JSON string", C667.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C667.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C667` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("DocumentmessageNumber_01") != null && !jsonObj.get("DocumentmessageNumber_01").isJsonNull()) && !jsonObj.get("DocumentmessageNumber_01").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentmessageNumber_01` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentmessageNumber_01").toString()));
      }
      if ((jsonObj.get("TotalNumberOfItems_03") != null && !jsonObj.get("TotalNumberOfItems_03").isJsonNull()) && !jsonObj.get("TotalNumberOfItems_03").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TotalNumberOfItems_03` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TotalNumberOfItems_03").toString()));
      }
      if ((jsonObj.get("DocumentmessageNumber_06") != null && !jsonObj.get("DocumentmessageNumber_06").isJsonNull()) && !jsonObj.get("DocumentmessageNumber_06").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentmessageNumber_06` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentmessageNumber_06").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C667.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C667' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C667> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C667.class));

       return (TypeAdapter<T>) new TypeAdapter<C667>() {
           @Override
           public void write(JsonWriter out, C667 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C667 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C667 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C667
  * @throws IOException if the JSON string is invalid with respect to C667
  */
  public static C667 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C667.class);
  }

 /**
  * Convert an instance of C667 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

