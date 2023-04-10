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
import org.openapitools.client.model.C322;
import org.openapitools.client.model.C324;

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
 * TIF
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class TIF {
  public static final String SERIALIZED_NAME_C32201 = "C322_01";
  @SerializedName(SERIALIZED_NAME_C32201)
  private C322 C322_01;

  public static final String SERIALIZED_NAME_C32402 = "C324_02";
  @SerializedName(SERIALIZED_NAME_C32402)
  private List<C324> C324_02;

  public TIF() {
  }

  public TIF C322_01(C322 C322_01) {
    
    this.C322_01 = C322_01;
    return this;
  }

   /**
   * Get C322_01
   * @return C322_01
  **/
  @javax.annotation.Nonnull

  public C322 getC32201() {
    return C322_01;
  }


  public void setC32201(C322 C322_01) {
    this.C322_01 = C322_01;
  }


  public TIF C324_02(List<C324> C324_02) {
    
    this.C324_02 = C324_02;
    return this;
  }

  public TIF addC32402Item(C324 C324_02Item) {
    if (this.C324_02 == null) {
      this.C324_02 = new ArrayList<>();
    }
    this.C324_02.add(C324_02Item);
    return this;
  }

   /**
   * Get C324_02
   * @return C324_02
  **/
  @javax.annotation.Nullable

  public List<C324> getC32402() {
    return C324_02;
  }


  public void setC32402(List<C324> C324_02) {
    this.C324_02 = C324_02;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TIF TIF = (TIF) o;
    return Objects.equals(this.C322_01, TIF.C322_01) &&
        Objects.equals(this.C324_02, TIF.C324_02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C322_01, C324_02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TIF {\n");
    sb.append("    C322_01: ").append(toIndentedString(C322_01)).append("\n");
    sb.append("    C324_02: ").append(toIndentedString(C324_02)).append("\n");
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
    openapiFields.add("C322_01");
    openapiFields.add("C324_02");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("C322_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIF
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TIF.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TIF is not found in the empty JSON string", TIF.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TIF.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TIF` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TIF.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `C322_01`
      C322.validateJsonObject(jsonObj.getAsJsonObject("C322_01"));
      if (jsonObj.get("C324_02") != null && !jsonObj.get("C324_02").isJsonNull()) {
        JsonArray jsonArrayC324_02 = jsonObj.getAsJsonArray("C324_02");
        if (jsonArrayC324_02 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C324_02").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C324_02` to be an array in the JSON string but got `%s`", jsonObj.get("C324_02").toString()));
          }

          // validate the optional field `C324_02` (array)
          for (int i = 0; i < jsonArrayC324_02.size(); i++) {
            C324.validateJsonObject(jsonArrayC324_02.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TIF.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TIF' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TIF> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TIF.class));

       return (TypeAdapter<T>) new TypeAdapter<TIF>() {
           @Override
           public void write(JsonWriter out, TIF value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TIF read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TIF given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIF
  * @throws IOException if the JSON string is invalid with respect to TIF
  */
  public static TIF fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIF.class);
  }

 /**
  * Convert an instance of TIF to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

