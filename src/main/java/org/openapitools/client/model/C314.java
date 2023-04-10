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
import org.openapitools.client.model.EDIFACTID3225;
import org.openapitools.client.model.EDIFACTID9950;

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
 * C314
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C314 {
  public static final String SERIALIZED_NAME_TYPE_OF_MEANS_OF_TRANSPORT_IDENTIFICATION01 = "TypeOfMeansOfTransportIdentification_01";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_MEANS_OF_TRANSPORT_IDENTIFICATION01)
  private String typeOfMeansOfTransportIdentification01;

  public static final String SERIALIZED_NAME_NUMBER_OF_STOPS02 = "NumberOfStops_02";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_STOPS02)
  private String numberOfStops02;

  public static final String SERIALIZED_NAME_LEG_DURATION03 = "LegDuration_03";
  @SerializedName(SERIALIZED_NAME_LEG_DURATION03)
  private String legDuration03;

  public static final String SERIALIZED_NAME_PERCENTAGE04 = "Percentage_04";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE04)
  private String percentage04;

  public static final String SERIALIZED_NAME_DAYS_OF_OPERATION05 = "DaysOfOperation_05";
  @SerializedName(SERIALIZED_NAME_DAYS_OF_OPERATION05)
  private String daysOfOperation05;

  public static final String SERIALIZED_NAME_DATE_TIME_PERIOD06 = "DateTimePeriod_06";
  @SerializedName(SERIALIZED_NAME_DATE_TIME_PERIOD06)
  private String dateTimePeriod06;

  public static final String SERIALIZED_NAME_COMPLEXING_FLIGHT_INDICATOR07 = "ComplexingFlightIndicator_07";
  @SerializedName(SERIALIZED_NAME_COMPLEXING_FLIGHT_INDICATOR07)
  private EDIFACTID9950 complexingFlightIndicator07;

  public static final String SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION08 = "PlacelocationIdentification_08";
  @SerializedName(SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION08)
  private EDIFACTID3225 placelocationIdentification08;

  public static final String SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION09 = "PlacelocationIdentification_09";
  @SerializedName(SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION09)
  private EDIFACTID3225 placelocationIdentification09;

  public static final String SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION10 = "PlacelocationIdentification_10";
  @SerializedName(SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION10)
  private EDIFACTID3225 placelocationIdentification10;

  public C314() {
  }

  public C314 typeOfMeansOfTransportIdentification01(String typeOfMeansOfTransportIdentification01) {
    
    this.typeOfMeansOfTransportIdentification01 = typeOfMeansOfTransportIdentification01;
    return this;
  }

   /**
   * Get typeOfMeansOfTransportIdentification01
   * @return typeOfMeansOfTransportIdentification01
  **/
  @javax.annotation.Nullable

  public String getTypeOfMeansOfTransportIdentification01() {
    return typeOfMeansOfTransportIdentification01;
  }


  public void setTypeOfMeansOfTransportIdentification01(String typeOfMeansOfTransportIdentification01) {
    this.typeOfMeansOfTransportIdentification01 = typeOfMeansOfTransportIdentification01;
  }


  public C314 numberOfStops02(String numberOfStops02) {
    
    this.numberOfStops02 = numberOfStops02;
    return this;
  }

   /**
   * Get numberOfStops02
   * @return numberOfStops02
  **/
  @javax.annotation.Nullable

  public String getNumberOfStops02() {
    return numberOfStops02;
  }


  public void setNumberOfStops02(String numberOfStops02) {
    this.numberOfStops02 = numberOfStops02;
  }


  public C314 legDuration03(String legDuration03) {
    
    this.legDuration03 = legDuration03;
    return this;
  }

   /**
   * Get legDuration03
   * @return legDuration03
  **/
  @javax.annotation.Nullable

  public String getLegDuration03() {
    return legDuration03;
  }


  public void setLegDuration03(String legDuration03) {
    this.legDuration03 = legDuration03;
  }


  public C314 percentage04(String percentage04) {
    
    this.percentage04 = percentage04;
    return this;
  }

   /**
   * Get percentage04
   * @return percentage04
  **/
  @javax.annotation.Nullable

  public String getPercentage04() {
    return percentage04;
  }


  public void setPercentage04(String percentage04) {
    this.percentage04 = percentage04;
  }


  public C314 daysOfOperation05(String daysOfOperation05) {
    
    this.daysOfOperation05 = daysOfOperation05;
    return this;
  }

   /**
   * Get daysOfOperation05
   * @return daysOfOperation05
  **/
  @javax.annotation.Nullable

  public String getDaysOfOperation05() {
    return daysOfOperation05;
  }


  public void setDaysOfOperation05(String daysOfOperation05) {
    this.daysOfOperation05 = daysOfOperation05;
  }


  public C314 dateTimePeriod06(String dateTimePeriod06) {
    
    this.dateTimePeriod06 = dateTimePeriod06;
    return this;
  }

   /**
   * Get dateTimePeriod06
   * @return dateTimePeriod06
  **/
  @javax.annotation.Nullable

  public String getDateTimePeriod06() {
    return dateTimePeriod06;
  }


  public void setDateTimePeriod06(String dateTimePeriod06) {
    this.dateTimePeriod06 = dateTimePeriod06;
  }


  public C314 complexingFlightIndicator07(EDIFACTID9950 complexingFlightIndicator07) {
    
    this.complexingFlightIndicator07 = complexingFlightIndicator07;
    return this;
  }

   /**
   * Get complexingFlightIndicator07
   * @return complexingFlightIndicator07
  **/
  @javax.annotation.Nullable

  public EDIFACTID9950 getComplexingFlightIndicator07() {
    return complexingFlightIndicator07;
  }


  public void setComplexingFlightIndicator07(EDIFACTID9950 complexingFlightIndicator07) {
    this.complexingFlightIndicator07 = complexingFlightIndicator07;
  }


  public C314 placelocationIdentification08(EDIFACTID3225 placelocationIdentification08) {
    
    this.placelocationIdentification08 = placelocationIdentification08;
    return this;
  }

   /**
   * Get placelocationIdentification08
   * @return placelocationIdentification08
  **/
  @javax.annotation.Nullable

  public EDIFACTID3225 getPlacelocationIdentification08() {
    return placelocationIdentification08;
  }


  public void setPlacelocationIdentification08(EDIFACTID3225 placelocationIdentification08) {
    this.placelocationIdentification08 = placelocationIdentification08;
  }


  public C314 placelocationIdentification09(EDIFACTID3225 placelocationIdentification09) {
    
    this.placelocationIdentification09 = placelocationIdentification09;
    return this;
  }

   /**
   * Get placelocationIdentification09
   * @return placelocationIdentification09
  **/
  @javax.annotation.Nullable

  public EDIFACTID3225 getPlacelocationIdentification09() {
    return placelocationIdentification09;
  }


  public void setPlacelocationIdentification09(EDIFACTID3225 placelocationIdentification09) {
    this.placelocationIdentification09 = placelocationIdentification09;
  }


  public C314 placelocationIdentification10(EDIFACTID3225 placelocationIdentification10) {
    
    this.placelocationIdentification10 = placelocationIdentification10;
    return this;
  }

   /**
   * Get placelocationIdentification10
   * @return placelocationIdentification10
  **/
  @javax.annotation.Nullable

  public EDIFACTID3225 getPlacelocationIdentification10() {
    return placelocationIdentification10;
  }


  public void setPlacelocationIdentification10(EDIFACTID3225 placelocationIdentification10) {
    this.placelocationIdentification10 = placelocationIdentification10;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C314 C314 = (C314) o;
    return Objects.equals(this.typeOfMeansOfTransportIdentification01, C314.typeOfMeansOfTransportIdentification01) &&
        Objects.equals(this.numberOfStops02, C314.numberOfStops02) &&
        Objects.equals(this.legDuration03, C314.legDuration03) &&
        Objects.equals(this.percentage04, C314.percentage04) &&
        Objects.equals(this.daysOfOperation05, C314.daysOfOperation05) &&
        Objects.equals(this.dateTimePeriod06, C314.dateTimePeriod06) &&
        Objects.equals(this.complexingFlightIndicator07, C314.complexingFlightIndicator07) &&
        Objects.equals(this.placelocationIdentification08, C314.placelocationIdentification08) &&
        Objects.equals(this.placelocationIdentification09, C314.placelocationIdentification09) &&
        Objects.equals(this.placelocationIdentification10, C314.placelocationIdentification10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeOfMeansOfTransportIdentification01, numberOfStops02, legDuration03, percentage04, daysOfOperation05, dateTimePeriod06, complexingFlightIndicator07, placelocationIdentification08, placelocationIdentification09, placelocationIdentification10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C314 {\n");
    sb.append("    typeOfMeansOfTransportIdentification01: ").append(toIndentedString(typeOfMeansOfTransportIdentification01)).append("\n");
    sb.append("    numberOfStops02: ").append(toIndentedString(numberOfStops02)).append("\n");
    sb.append("    legDuration03: ").append(toIndentedString(legDuration03)).append("\n");
    sb.append("    percentage04: ").append(toIndentedString(percentage04)).append("\n");
    sb.append("    daysOfOperation05: ").append(toIndentedString(daysOfOperation05)).append("\n");
    sb.append("    dateTimePeriod06: ").append(toIndentedString(dateTimePeriod06)).append("\n");
    sb.append("    complexingFlightIndicator07: ").append(toIndentedString(complexingFlightIndicator07)).append("\n");
    sb.append("    placelocationIdentification08: ").append(toIndentedString(placelocationIdentification08)).append("\n");
    sb.append("    placelocationIdentification09: ").append(toIndentedString(placelocationIdentification09)).append("\n");
    sb.append("    placelocationIdentification10: ").append(toIndentedString(placelocationIdentification10)).append("\n");
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
    openapiFields.add("TypeOfMeansOfTransportIdentification_01");
    openapiFields.add("NumberOfStops_02");
    openapiFields.add("LegDuration_03");
    openapiFields.add("Percentage_04");
    openapiFields.add("DaysOfOperation_05");
    openapiFields.add("DateTimePeriod_06");
    openapiFields.add("ComplexingFlightIndicator_07");
    openapiFields.add("PlacelocationIdentification_08");
    openapiFields.add("PlacelocationIdentification_09");
    openapiFields.add("PlacelocationIdentification_10");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C314
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C314.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C314 is not found in the empty JSON string", C314.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C314.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C314` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("TypeOfMeansOfTransportIdentification_01") != null && !jsonObj.get("TypeOfMeansOfTransportIdentification_01").isJsonNull()) && !jsonObj.get("TypeOfMeansOfTransportIdentification_01").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TypeOfMeansOfTransportIdentification_01` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TypeOfMeansOfTransportIdentification_01").toString()));
      }
      if ((jsonObj.get("NumberOfStops_02") != null && !jsonObj.get("NumberOfStops_02").isJsonNull()) && !jsonObj.get("NumberOfStops_02").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NumberOfStops_02` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NumberOfStops_02").toString()));
      }
      if ((jsonObj.get("LegDuration_03") != null && !jsonObj.get("LegDuration_03").isJsonNull()) && !jsonObj.get("LegDuration_03").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LegDuration_03` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LegDuration_03").toString()));
      }
      if ((jsonObj.get("Percentage_04") != null && !jsonObj.get("Percentage_04").isJsonNull()) && !jsonObj.get("Percentage_04").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Percentage_04` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Percentage_04").toString()));
      }
      if ((jsonObj.get("DaysOfOperation_05") != null && !jsonObj.get("DaysOfOperation_05").isJsonNull()) && !jsonObj.get("DaysOfOperation_05").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DaysOfOperation_05` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DaysOfOperation_05").toString()));
      }
      if ((jsonObj.get("DateTimePeriod_06") != null && !jsonObj.get("DateTimePeriod_06").isJsonNull()) && !jsonObj.get("DateTimePeriod_06").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DateTimePeriod_06` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DateTimePeriod_06").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C314.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C314' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C314> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C314.class));

       return (TypeAdapter<T>) new TypeAdapter<C314>() {
           @Override
           public void write(JsonWriter out, C314 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C314 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C314 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C314
  * @throws IOException if the JSON string is invalid with respect to C314
  */
  public static C314 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C314.class);
  }

 /**
  * Convert an instance of C314 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

