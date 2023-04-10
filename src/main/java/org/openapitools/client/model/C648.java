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
import org.openapitools.client.model.EDIFACTID9910;

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
 * C648
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C648 {
  public static final String SERIALIZED_NAME_FARE_QUALIFIER01 = "FareQualifier_01";
  @SerializedName(SERIALIZED_NAME_FARE_QUALIFIER01)
  private EDIFACTID9910 fareQualifier01;

  public static final String SERIALIZED_NAME_MONETARY_AMOUNT02 = "MonetaryAmount_02";
  @SerializedName(SERIALIZED_NAME_MONETARY_AMOUNT02)
  private String monetaryAmount02;

  public static final String SERIALIZED_NAME_PERCENTAGE03 = "Percentage_03";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE03)
  private String percentage03;

  public C648() {
  }

  public C648 fareQualifier01(EDIFACTID9910 fareQualifier01) {
    
    this.fareQualifier01 = fareQualifier01;
    return this;
  }

   /**
   * Get fareQualifier01
   * @return fareQualifier01
  **/
  @javax.annotation.Nonnull

  public EDIFACTID9910 getFareQualifier01() {
    return fareQualifier01;
  }


  public void setFareQualifier01(EDIFACTID9910 fareQualifier01) {
    this.fareQualifier01 = fareQualifier01;
  }


  public C648 monetaryAmount02(String monetaryAmount02) {
    
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


  public C648 percentage03(String percentage03) {
    
    this.percentage03 = percentage03;
    return this;
  }

   /**
   * Get percentage03
   * @return percentage03
  **/
  @javax.annotation.Nullable

  public String getPercentage03() {
    return percentage03;
  }


  public void setPercentage03(String percentage03) {
    this.percentage03 = percentage03;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C648 C648 = (C648) o;
    return Objects.equals(this.fareQualifier01, C648.fareQualifier01) &&
        Objects.equals(this.monetaryAmount02, C648.monetaryAmount02) &&
        Objects.equals(this.percentage03, C648.percentage03);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareQualifier01, monetaryAmount02, percentage03);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C648 {\n");
    sb.append("    fareQualifier01: ").append(toIndentedString(fareQualifier01)).append("\n");
    sb.append("    monetaryAmount02: ").append(toIndentedString(monetaryAmount02)).append("\n");
    sb.append("    percentage03: ").append(toIndentedString(percentage03)).append("\n");
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
    openapiFields.add("FareQualifier_01");
    openapiFields.add("MonetaryAmount_02");
    openapiFields.add("Percentage_03");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FareQualifier_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C648
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C648.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C648 is not found in the empty JSON string", C648.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C648.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C648` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : C648.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("MonetaryAmount_02") != null && !jsonObj.get("MonetaryAmount_02").isJsonNull()) && !jsonObj.get("MonetaryAmount_02").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MonetaryAmount_02` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MonetaryAmount_02").toString()));
      }
      if ((jsonObj.get("Percentage_03") != null && !jsonObj.get("Percentage_03").isJsonNull()) && !jsonObj.get("Percentage_03").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Percentage_03` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Percentage_03").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C648.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C648' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C648> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C648.class));

       return (TypeAdapter<T>) new TypeAdapter<C648>() {
           @Override
           public void write(JsonWriter out, C648 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C648 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C648 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C648
  * @throws IOException if the JSON string is invalid with respect to C648
  */
  public static C648 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C648.class);
  }

 /**
  * Convert an instance of C648 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

