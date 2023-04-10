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
 * Gets or Sets EDIFACT_ID_1229
 */
@JsonAdapter(EDIFACTID1229.Adapter.class)
public enum EDIFACTID1229 {
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _700("700"),
  
  _701("701"),
  
  _702("702"),
  
  _703("703"),
  
  A("A"),
  
  AO("AO"),
  
  B("B"),
  
  BH("BH"),
  
  C("C"),
  
  CH("CH"),
  
  CS("CS"),
  
  D("D"),
  
  DC("DC"),
  
  DS("DS"),
  
  E("E"),
  
  ES("ES"),
  
  F("F"),
  
  FS("FS"),
  
  G("G"),
  
  H("H"),
  
  HH("HH"),
  
  I("I"),
  
  IC("IC"),
  
  IM("IM"),
  
  J("J"),
  
  K("K"),
  
  KK("KK"),
  
  L("L"),
  
  LS("LS"),
  
  M("M"),
  
  MS("MS"),
  
  N("N"),
  
  NA("NA"),
  
  NE("NE"),
  
  NS("NS"),
  
  O("O"),
  
  OO("OO"),
  
  P("P"),
  
  PP("PP"),
  
  Q("Q"),
  
  QA("QA"),
  
  QD("QD"),
  
  QS("QS"),
  
  R("R"),
  
  RS("RS"),
  
  S("S"),
  
  SR("SR"),
  
  SS("SS"),
  
  T("T"),
  
  TO("TO"),
  
  TS("TS"),
  
  U("U"),
  
  UU("UU"),
  
  V("V"),
  
  W("W"),
  
  WW("WW"),
  
  X("X"),
  
  XX("XX"),
  
  Y("Y"),
  
  YY("YY"),
  
  Z("Z"),
  
  ZZ("ZZ");

  private String value;

  EDIFACTID1229(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID1229 fromValue(String value) {
    for (EDIFACTID1229 b : EDIFACTID1229.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID1229> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID1229 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID1229 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID1229.fromValue(value);
    }
  }
}

