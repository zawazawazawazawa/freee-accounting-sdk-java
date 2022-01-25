/*
 * freee API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.freee.accounting.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tax
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Tax {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_JA = "name_ja";
  @SerializedName(SERIALIZED_NAME_NAME_JA)
  private String nameJa;

  public Tax() { 
  }

  public Tax code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 税区分コード
   * minimum: 1
   * maximum: 2147483647
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21", required = true, value = "税区分コード")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public Tax name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 税区分名
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "sales_with_tax", required = true, value = "税区分名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Tax nameJa(String nameJa) {
    
    this.nameJa = nameJa;
    return this;
  }

   /**
   * 税区分名（日本語表示用）
   * @return nameJa
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "課税売上", required = true, value = "税区分名（日本語表示用）")

  public String getNameJa() {
    return nameJa;
  }


  public void setNameJa(String nameJa) {
    this.nameJa = nameJa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax tax = (Tax) o;
    return Objects.equals(this.code, tax.code) &&
        Objects.equals(this.name, tax.name) &&
        Objects.equals(this.nameJa, tax.nameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, nameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameJa: ").append(toIndentedString(nameJa)).append("\n");
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

}

