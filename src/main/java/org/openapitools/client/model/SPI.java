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
import org.openapitools.client.model.C658;
import org.openapitools.client.model.C659;

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
 * SPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class SPI {
  public static final String SERIALIZED_NAME_C65801 = "C658_01";
  @SerializedName(SERIALIZED_NAME_C65801)
  private C658 C658_01;

  public static final String SERIALIZED_NAME_C65902 = "C659_02";
  @SerializedName(SERIALIZED_NAME_C65902)
  private List<C659> C659_02;

  public SPI() {
  }

  public SPI C658_01(C658 C658_01) {
    
    this.C658_01 = C658_01;
    return this;
  }

   /**
   * Get C658_01
   * @return C658_01
  **/
  @javax.annotation.Nonnull

  public C658 getC65801() {
    return C658_01;
  }


  public void setC65801(C658 C658_01) {
    this.C658_01 = C658_01;
  }


  public SPI C659_02(List<C659> C659_02) {
    
    this.C659_02 = C659_02;
    return this;
  }

  public SPI addC65902Item(C659 C659_02Item) {
    if (this.C659_02 == null) {
      this.C659_02 = new ArrayList<>();
    }
    this.C659_02.add(C659_02Item);
    return this;
  }

   /**
   * Get C659_02
   * @return C659_02
  **/
  @javax.annotation.Nullable

  public List<C659> getC65902() {
    return C659_02;
  }


  public void setC65902(List<C659> C659_02) {
    this.C659_02 = C659_02;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SPI SPI = (SPI) o;
    return Objects.equals(this.C658_01, SPI.C658_01) &&
        Objects.equals(this.C659_02, SPI.C659_02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C658_01, C659_02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SPI {\n");
    sb.append("    C658_01: ").append(toIndentedString(C658_01)).append("\n");
    sb.append("    C659_02: ").append(toIndentedString(C659_02)).append("\n");
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
    openapiFields.add("C658_01");
    openapiFields.add("C659_02");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("C658_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SPI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SPI.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SPI is not found in the empty JSON string", SPI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SPI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SPI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SPI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `C658_01`
      C658.validateJsonObject(jsonObj.getAsJsonObject("C658_01"));
      if (jsonObj.get("C659_02") != null && !jsonObj.get("C659_02").isJsonNull()) {
        JsonArray jsonArrayC659_02 = jsonObj.getAsJsonArray("C659_02");
        if (jsonArrayC659_02 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C659_02").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C659_02` to be an array in the JSON string but got `%s`", jsonObj.get("C659_02").toString()));
          }

          // validate the optional field `C659_02` (array)
          for (int i = 0; i < jsonArrayC659_02.size(); i++) {
            C659.validateJsonObject(jsonArrayC659_02.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SPI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SPI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SPI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SPI.class));

       return (TypeAdapter<T>) new TypeAdapter<SPI>() {
           @Override
           public void write(JsonWriter out, SPI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SPI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SPI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SPI
  * @throws IOException if the JSON string is invalid with respect to SPI
  */
  public static SPI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SPI.class);
  }

 /**
  * Convert an instance of SPI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

