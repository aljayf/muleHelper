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
 * Gets or Sets EDIFACT_ID_5387
 */
@JsonAdapter(EDIFACTID5387.Adapter.class)
public enum EDIFACTID5387 {
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _7("7"),
  
  _700("700"),
  
  _701("701"),
  
  _702("702"),
  
  _703("703"),
  
  _704("704"),
  
  _705("705"),
  
  _706("706"),
  
  _707("707"),
  
  _708("708"),
  
  _709("709"),
  
  _710("710"),
  
  _711("711"),
  
  _712("712"),
  
  _713("713"),
  
  _714("714"),
  
  _715("715"),
  
  _716("716"),
  
  _717("717"),
  
  _718("718"),
  
  _719("719"),
  
  _720("720"),
  
  _721("721"),
  
  _722("722"),
  
  _723("723"),
  
  _724("724"),
  
  _725("725"),
  
  _726("726"),
  
  _727("727"),
  
  _728("728"),
  
  _729("729"),
  
  _730("730"),
  
  _731("731"),
  
  _732("732"),
  
  D("D"),
  
  DF("DF"),
  
  G("G"),
  
  HF("HF"),
  
  I("I"),
  
  II("II"),
  
  IO("IO"),
  
  LF("LF"),
  
  N("N"),
  
  NE("NE"),
  
  NF("NF"),
  
  NR("NR"),
  
  OI("OI"),
  
  OO("OO"),
  
  PA("PA"),
  
  R("R"),
  
  RD("RD"),
  
  RI("RI"),
  
  RN("RN"),
  
  S("S"),
  
  SC("SC"),
  
  T("T"),
  
  TA("TA"),
  
  TF("TF"),
  
  TN("TN"),
  
  TW("TW"),
  
  VF("VF"),
  
  X("X");

  private String value;

  EDIFACTID5387(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID5387 fromValue(String value) {
    for (EDIFACTID5387 b : EDIFACTID5387.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID5387> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID5387 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID5387 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID5387.fromValue(value);
    }
  }
}

