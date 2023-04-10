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
import org.openapitools.client.model.EDIFACTID6345;
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
 * C674
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C674 {
  public static final String SERIALIZED_NAME_CURRENCY01 = "Currency_01";
  @SerializedName(SERIALIZED_NAME_CURRENCY01)
  private EDIFACTID6345 currency01;

  public static final String SERIALIZED_NAME_MONETARY_AMOUNT02 = "MonetaryAmount_02";
  @SerializedName(SERIALIZED_NAME_MONETARY_AMOUNT02)
  private String monetaryAmount02;

  public static final String SERIALIZED_NAME_PROCESSING_INDICATOR03 = "ProcessingIndicator_03";
  @SerializedName(SERIALIZED_NAME_PROCESSING_INDICATOR03)
  private EDIFACTID7365 processingIndicator03;

  public C674() {
  }

  public C674 currency01(EDIFACTID6345 currency01) {
    
    this.currency01 = currency01;
    return this;
  }

   /**
   * Get currency01
   * @return currency01
  **/
  @javax.annotation.Nullable

  public EDIFACTID6345 getCurrency01() {
    return currency01;
  }


  public void setCurrency01(EDIFACTID6345 currency01) {
    this.currency01 = currency01;
  }


  public C674 monetaryAmount02(String monetaryAmount02) {
    
    this.monetaryAmount02 = monetaryAmount02;
    return this;
  }

   /**
   * Get monetaryAmount02
   * @return monetaryAmount02
  **/
  @javax.annotation.Nullable

  public String getMonetaryAmount02() {
    return monetaryAmount02;
  }


  public void setMonetaryAmount02(String monetaryAmount02) {
    this.monetaryAmount02 = monetaryAmount02;
  }


  public C674 processingIndicator03(EDIFACTID7365 processingIndicator03) {
    
    this.processingIndicator03 = processingIndicator03;
    return this;
  }

   /**
   * Get processingIndicator03
   * @return processingIndicator03
  **/
  @javax.annotation.Nullable

  public EDIFACTID7365 getProcessingIndicator03() {
    return processingIndicator03;
  }


  public void setProcessingIndicator03(EDIFACTID7365 processingIndicator03) {
    this.processingIndicator03 = processingIndicator03;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C674 C674 = (C674) o;
    return Objects.equals(this.currency01, C674.currency01) &&
        Objects.equals(this.monetaryAmount02, C674.monetaryAmount02) &&
        Objects.equals(this.processingIndicator03, C674.processingIndicator03);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency01, monetaryAmount02, processingIndicator03);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C674 {\n");
    sb.append("    currency01: ").append(toIndentedString(currency01)).append("\n");
    sb.append("    monetaryAmount02: ").append(toIndentedString(monetaryAmount02)).append("\n");
    sb.append("    processingIndicator03: ").append(toIndentedString(processingIndicator03)).append("\n");
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
    openapiFields.add("Currency_01");
    openapiFields.add("MonetaryAmount_02");
    openapiFields.add("ProcessingIndicator_03");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C674
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C674.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C674 is not found in the empty JSON string", C674.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C674.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C674` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("MonetaryAmount_02") != null && !jsonObj.get("MonetaryAmount_02").isJsonNull()) && !jsonObj.get("MonetaryAmount_02").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MonetaryAmount_02` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MonetaryAmount_02").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C674.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C674' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C674> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C674.class));

       return (TypeAdapter<T>) new TypeAdapter<C674>() {
           @Override
           public void write(JsonWriter out, C674 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C674 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C674 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C674
  * @throws IOException if the JSON string is invalid with respect to C674
  */
  public static C674 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C674.class);
  }

 /**
  * Convert an instance of C674 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

