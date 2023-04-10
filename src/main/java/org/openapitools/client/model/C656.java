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
import org.openapitools.client.model.EDIFACTID1229;
import org.openapitools.client.model.EDIFACTID1245;
import org.openapitools.client.model.EDIFACTID9015;

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
 * C656
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C656 {
  public static final String SERIALIZED_NAME_STATUS_INDICATOR01 = "StatusIndicator_01";
  @SerializedName(SERIALIZED_NAME_STATUS_INDICATOR01)
  private EDIFACTID1245 statusIndicator01;

  public static final String SERIALIZED_NAME_ACTION_REQUEST_NOTIFICATION02 = "ActionRequestNotification_02";
  @SerializedName(SERIALIZED_NAME_ACTION_REQUEST_NOTIFICATION02)
  private EDIFACTID1229 actionRequestNotification02;

  public static final String SERIALIZED_NAME_STATUS_TYPE03 = "StatusType_03";
  @SerializedName(SERIALIZED_NAME_STATUS_TYPE03)
  private EDIFACTID9015 statusType03;

  public static final String SERIALIZED_NAME_FREE_TEXT04 = "FreeText_04";
  @SerializedName(SERIALIZED_NAME_FREE_TEXT04)
  private String freeText04;

  public C656() {
  }

  public C656 statusIndicator01(EDIFACTID1245 statusIndicator01) {
    
    this.statusIndicator01 = statusIndicator01;
    return this;
  }

   /**
   * Get statusIndicator01
   * @return statusIndicator01
  **/
  @javax.annotation.Nullable

  public EDIFACTID1245 getStatusIndicator01() {
    return statusIndicator01;
  }


  public void setStatusIndicator01(EDIFACTID1245 statusIndicator01) {
    this.statusIndicator01 = statusIndicator01;
  }


  public C656 actionRequestNotification02(EDIFACTID1229 actionRequestNotification02) {
    
    this.actionRequestNotification02 = actionRequestNotification02;
    return this;
  }

   /**
   * Get actionRequestNotification02
   * @return actionRequestNotification02
  **/
  @javax.annotation.Nullable

  public EDIFACTID1229 getActionRequestNotification02() {
    return actionRequestNotification02;
  }


  public void setActionRequestNotification02(EDIFACTID1229 actionRequestNotification02) {
    this.actionRequestNotification02 = actionRequestNotification02;
  }


  public C656 statusType03(EDIFACTID9015 statusType03) {
    
    this.statusType03 = statusType03;
    return this;
  }

   /**
   * Get statusType03
   * @return statusType03
  **/
  @javax.annotation.Nullable

  public EDIFACTID9015 getStatusType03() {
    return statusType03;
  }


  public void setStatusType03(EDIFACTID9015 statusType03) {
    this.statusType03 = statusType03;
  }


  public C656 freeText04(String freeText04) {
    
    this.freeText04 = freeText04;
    return this;
  }

   /**
   * Get freeText04
   * @return freeText04
  **/
  @javax.annotation.Nullable

  public String getFreeText04() {
    return freeText04;
  }


  public void setFreeText04(String freeText04) {
    this.freeText04 = freeText04;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C656 C656 = (C656) o;
    return Objects.equals(this.statusIndicator01, C656.statusIndicator01) &&
        Objects.equals(this.actionRequestNotification02, C656.actionRequestNotification02) &&
        Objects.equals(this.statusType03, C656.statusType03) &&
        Objects.equals(this.freeText04, C656.freeText04);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusIndicator01, actionRequestNotification02, statusType03, freeText04);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C656 {\n");
    sb.append("    statusIndicator01: ").append(toIndentedString(statusIndicator01)).append("\n");
    sb.append("    actionRequestNotification02: ").append(toIndentedString(actionRequestNotification02)).append("\n");
    sb.append("    statusType03: ").append(toIndentedString(statusType03)).append("\n");
    sb.append("    freeText04: ").append(toIndentedString(freeText04)).append("\n");
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
    openapiFields.add("ActionRequestNotification_02");
    openapiFields.add("StatusType_03");
    openapiFields.add("FreeText_04");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C656
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C656.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C656 is not found in the empty JSON string", C656.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C656.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C656` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FreeText_04") != null && !jsonObj.get("FreeText_04").isJsonNull()) && !jsonObj.get("FreeText_04").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FreeText_04` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FreeText_04").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C656.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C656' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C656> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C656.class));

       return (TypeAdapter<T>) new TypeAdapter<C656>() {
           @Override
           public void write(JsonWriter out, C656 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C656 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C656 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C656
  * @throws IOException if the JSON string is invalid with respect to C656
  */
  public static C656 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C656.class);
  }

 /**
  * Convert an instance of C656 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

