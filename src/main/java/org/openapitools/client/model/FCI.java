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
import org.openapitools.client.model.C980;

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
 * FCI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class FCI {
  public static final String SERIALIZED_NAME_C98001 = "C980_01";
  @SerializedName(SERIALIZED_NAME_C98001)
  private C980 C980_01;

  public static final String SERIALIZED_NAME_DOCUMENTMESSAGE_NUMBER02 = "DocumentmessageNumber_02";
  @SerializedName(SERIALIZED_NAME_DOCUMENTMESSAGE_NUMBER02)
  private String documentmessageNumber02;

  public FCI() {
  }

  public FCI C980_01(C980 C980_01) {
    
    this.C980_01 = C980_01;
    return this;
  }

   /**
   * Get C980_01
   * @return C980_01
  **/
  @javax.annotation.Nullable

  public C980 getC98001() {
    return C980_01;
  }


  public void setC98001(C980 C980_01) {
    this.C980_01 = C980_01;
  }


  public FCI documentmessageNumber02(String documentmessageNumber02) {
    
    this.documentmessageNumber02 = documentmessageNumber02;
    return this;
  }

   /**
   * Get documentmessageNumber02
   * @return documentmessageNumber02
  **/
  @javax.annotation.Nullable

  public String getDocumentmessageNumber02() {
    return documentmessageNumber02;
  }


  public void setDocumentmessageNumber02(String documentmessageNumber02) {
    this.documentmessageNumber02 = documentmessageNumber02;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FCI FCI = (FCI) o;
    return Objects.equals(this.C980_01, FCI.C980_01) &&
        Objects.equals(this.documentmessageNumber02, FCI.documentmessageNumber02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C980_01, documentmessageNumber02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FCI {\n");
    sb.append("    C980_01: ").append(toIndentedString(C980_01)).append("\n");
    sb.append("    documentmessageNumber02: ").append(toIndentedString(documentmessageNumber02)).append("\n");
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
    openapiFields.add("C980_01");
    openapiFields.add("DocumentmessageNumber_02");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FCI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FCI.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FCI is not found in the empty JSON string", FCI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FCI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FCI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `C980_01`
      if (jsonObj.get("C980_01") != null && !jsonObj.get("C980_01").isJsonNull()) {
        C980.validateJsonObject(jsonObj.getAsJsonObject("C980_01"));
      }
      if ((jsonObj.get("DocumentmessageNumber_02") != null && !jsonObj.get("DocumentmessageNumber_02").isJsonNull()) && !jsonObj.get("DocumentmessageNumber_02").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentmessageNumber_02` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentmessageNumber_02").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FCI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FCI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FCI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FCI.class));

       return (TypeAdapter<T>) new TypeAdapter<FCI>() {
           @Override
           public void write(JsonWriter out, FCI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FCI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FCI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FCI
  * @throws IOException if the JSON string is invalid with respect to FCI
  */
  public static FCI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FCI.class);
  }

 /**
  * Convert an instance of FCI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

