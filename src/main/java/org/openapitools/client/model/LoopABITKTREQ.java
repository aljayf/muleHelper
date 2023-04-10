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
import org.openapitools.client.model.ABI;
import org.openapitools.client.model.DID;

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
 * LoopABITKTREQ
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class LoopABITKTREQ {
  public static final String SERIALIZED_NAME_A_B_I = "ABI";
  @SerializedName(SERIALIZED_NAME_A_B_I)
  private ABI abi;

  public static final String SERIALIZED_NAME_D_I_D = "DID";
  @SerializedName(SERIALIZED_NAME_D_I_D)
  private DID did;

  public LoopABITKTREQ() {
  }

  public LoopABITKTREQ abi(ABI abi) {
    
    this.abi = abi;
    return this;
  }

   /**
   * Get abi
   * @return abi
  **/
  @javax.annotation.Nonnull

  public ABI getABI() {
    return abi;
  }


  public void setABI(ABI abi) {
    this.abi = abi;
  }


  public LoopABITKTREQ did(DID did) {
    
    this.did = did;
    return this;
  }

   /**
   * Get did
   * @return did
  **/
  @javax.annotation.Nullable

  public DID getDID() {
    return did;
  }


  public void setDID(DID did) {
    this.did = did;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoopABITKTREQ loopABITKTREQ = (LoopABITKTREQ) o;
    return Objects.equals(this.abi, loopABITKTREQ.abi) &&
        Objects.equals(this.did, loopABITKTREQ.did);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abi, did);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoopABITKTREQ {\n");
    sb.append("    abi: ").append(toIndentedString(abi)).append("\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
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
    openapiFields.add("ABI");
    openapiFields.add("DID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ABI");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LoopABITKTREQ
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LoopABITKTREQ.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoopABITKTREQ is not found in the empty JSON string", LoopABITKTREQ.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LoopABITKTREQ.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoopABITKTREQ` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoopABITKTREQ.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `ABI`
      ABI.validateJsonObject(jsonObj.getAsJsonObject("ABI"));
      // validate the optional field `DID`
      if (jsonObj.get("DID") != null && !jsonObj.get("DID").isJsonNull()) {
        DID.validateJsonObject(jsonObj.getAsJsonObject("DID"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoopABITKTREQ.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoopABITKTREQ' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoopABITKTREQ> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoopABITKTREQ.class));

       return (TypeAdapter<T>) new TypeAdapter<LoopABITKTREQ>() {
           @Override
           public void write(JsonWriter out, LoopABITKTREQ value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoopABITKTREQ read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoopABITKTREQ given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoopABITKTREQ
  * @throws IOException if the JSON string is invalid with respect to LoopABITKTREQ
  */
  public static LoopABITKTREQ fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoopABITKTREQ.class);
  }

 /**
  * Convert an instance of LoopABITKTREQ to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

