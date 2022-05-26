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
 * SelectablesIndexResponseDefaultTaxTaxRate5
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SelectablesIndexResponseDefaultTaxTaxRate5 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public SelectablesIndexResponseDefaultTaxTaxRate5() { 
  }

  public SelectablesIndexResponseDefaultTaxTaxRate5 id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 税区分ID
   * minimum: 0
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "税区分ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public SelectablesIndexResponseDefaultTaxTaxRate5 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 税区分
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "課対仕入", value = "税区分")

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
    SelectablesIndexResponseDefaultTaxTaxRate5 selectablesIndexResponseDefaultTaxTaxRate5 = (SelectablesIndexResponseDefaultTaxTaxRate5) o;
    return Objects.equals(this.id, selectablesIndexResponseDefaultTaxTaxRate5.id) &&
        Objects.equals(this.name, selectablesIndexResponseDefaultTaxTaxRate5.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectablesIndexResponseDefaultTaxTaxRate5 {\n");
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

