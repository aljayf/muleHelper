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
 * Gets or Sets EDIFACT_ID_5479
 */
@JsonAdapter(EDIFACTID5479.Adapter.class)
public enum EDIFACTID5479 {
  
  A("A"),
  
  B("B"),
  
  C("C"),
  
  F("F"),
  
  I("I"),
  
  L("L"),
  
  M("M");

  private String value;

  EDIFACTID5479(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID5479 fromValue(String value) {
    for (EDIFACTID5479 b : EDIFACTID5479.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID5479> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID5479 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID5479 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID5479.fromValue(value);
    }
  }
}

