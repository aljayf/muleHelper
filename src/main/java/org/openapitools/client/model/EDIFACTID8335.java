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
 * Gets or Sets EDIFACT_ID_8335
 */
@JsonAdapter(EDIFACTID8335.Adapter.class)
public enum EDIFACTID8335 {
  
  _7AP("7AP"),
  
  _7AT("7AT"),
  
  _7CA("7CA"),
  
  _7CT("7CT"),
  
  _7EH("7EH"),
  
  _7FE("7FE"),
  
  _7PA("7PA"),
  
  _7PE("7PE"),
  
  _7PN("7PN"),
  
  _7PO("7PO"),
  
  _7RW("7RW"),
  
  _7SA("7SA"),
  
  _7SP("7SP"),
  
  _7TB("7TB"),
  
  _7TS("7TS"),
  
  _7US("7US"),
  
  _7WH("7WH"),
  
  WX("WX");

  private String value;

  EDIFACTID8335(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID8335 fromValue(String value) {
    for (EDIFACTID8335 b : EDIFACTID8335.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID8335> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID8335 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID8335 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID8335.fromValue(value);
    }
  }
}

