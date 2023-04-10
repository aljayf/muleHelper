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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EDIFACT_ID_0051
 */
@JsonAdapter(EDIFACTID0051.Adapter.class)
public enum EDIFACTID0051 {
  
  AA("AA"),
  
  AB("AB"),
  
  AC("AC"),
  
  AD("AD"),
  
  AE("AE"),
  
  AF("AF"),
  
  AG("AG"),
  
  AH("AH"),
  
  AI("AI"),
  
  CC("CC"),
  
  CE("CE"),
  
  EC("EC"),
  
  ED("ED"),
  
  EE("EE"),
  
  EN("EN"),
  
  ER("ER"),
  
  EU("EU"),
  
  EW("EW"),
  
  EX("EX"),
  
  IA("IA"),
  
  KE("KE"),
  
  LI("LI"),
  
  OD("OD"),
  
  RI("RI"),
  
  RT("RT"),
  
  UN("UN");

  private String value;

  EDIFACTID0051(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID0051 fromValue(String value) {
    for (EDIFACTID0051 b : EDIFACTID0051.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID0051> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID0051 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID0051 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID0051.fromValue(value);
    }
  }
}

