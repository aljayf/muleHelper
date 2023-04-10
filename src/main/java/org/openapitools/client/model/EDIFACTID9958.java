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
 * Gets or Sets EDIFACT_ID_9958
 */
@JsonAdapter(EDIFACTID9958.Adapter.class)
public enum EDIFACTID9958 {
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _7("7"),
  
  _8("8"),
  
  _9("9"),
  
  A("A"),
  
  B("B"),
  
  D("D"),
  
  Q("Q"),
  
  R("R");

  private String value;

  EDIFACTID9958(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID9958 fromValue(String value) {
    for (EDIFACTID9958 b : EDIFACTID9958.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID9958> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID9958 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID9958 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID9958.fromValue(value);
    }
  }
}

