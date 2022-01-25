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
import java.util.ArrayList;
import java.util.List;
import jp.co.freee.accounting.models.ExpenseApplicationLineTemplate;

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2002 {
  public static final String SERIALIZED_NAME_EXPENSE_APPLICATION_LINE_TEMPLATES = "expense_application_line_templates";
  @SerializedName(SERIALIZED_NAME_EXPENSE_APPLICATION_LINE_TEMPLATES)
  private List<ExpenseApplicationLineTemplate> expenseApplicationLineTemplates = new ArrayList<>();

  public InlineResponse2002() { 
  }

  public InlineResponse2002 expenseApplicationLineTemplates(List<ExpenseApplicationLineTemplate> expenseApplicationLineTemplates) {
    
    this.expenseApplicationLineTemplates = expenseApplicationLineTemplates;
    return this;
  }

  public InlineResponse2002 addExpenseApplicationLineTemplatesItem(ExpenseApplicationLineTemplate expenseApplicationLineTemplatesItem) {
    this.expenseApplicationLineTemplates.add(expenseApplicationLineTemplatesItem);
    return this;
  }

   /**
   * Get expenseApplicationLineTemplates
   * @return expenseApplicationLineTemplates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ExpenseApplicationLineTemplate> getExpenseApplicationLineTemplates() {
    return expenseApplicationLineTemplates;
  }


  public void setExpenseApplicationLineTemplates(List<ExpenseApplicationLineTemplate> expenseApplicationLineTemplates) {
    this.expenseApplicationLineTemplates = expenseApplicationLineTemplates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.expenseApplicationLineTemplates, inlineResponse2002.expenseApplicationLineTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseApplicationLineTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    sb.append("    expenseApplicationLineTemplates: ").append(toIndentedString(expenseApplicationLineTemplates)).append("\n");
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

