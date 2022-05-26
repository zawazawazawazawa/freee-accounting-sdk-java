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
 * CompanyResponseCompanyTaxes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompanyResponseCompanyTaxes {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CompanyResponseCompanyTaxes() { 
  }

  public CompanyResponseCompanyTaxes id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 税区分ID（廃止予定。tax_codeを使用してください。）
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21", required = true, value = "税区分ID（廃止予定。tax_codeを使用してください。）")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CompanyResponseCompanyTaxes name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyResponseCompanyTaxes companyResponseCompanyTaxes = (CompanyResponseCompanyTaxes) o;
    return Objects.equals(this.id, companyResponseCompanyTaxes.id) &&
        Objects.equals(this.name, companyResponseCompanyTaxes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyResponseCompanyTaxes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

