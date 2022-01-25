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
 * ExpenseApplicationCreateParamsExpenseApplicationLines
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseApplicationCreateParamsExpenseApplicationLines {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXPENSE_APPLICATION_LINE_TEMPLATE_ID = "expense_application_line_template_id";
  @SerializedName(SERIALIZED_NAME_EXPENSE_APPLICATION_LINE_TEMPLATE_ID)
  private Integer expenseApplicationLineTemplateId;

  public static final String SERIALIZED_NAME_RECEIPT_ID = "receipt_id";
  @SerializedName(SERIALIZED_NAME_RECEIPT_ID)
  private Integer receiptId;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transaction_date";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private String transactionDate;

  public ExpenseApplicationCreateParamsExpenseApplicationLines() { 
  }

  public ExpenseApplicationCreateParamsExpenseApplicationLines amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 金額
   * minimum: 0
   * maximum: 2147483647
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30000", value = "金額")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ExpenseApplicationCreateParamsExpenseApplicationLines description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 内容 (250文字以内)
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "交通費：新幹線往復（東京〜大阪）", value = "内容 (250文字以内)")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ExpenseApplicationCreateParamsExpenseApplicationLines expenseApplicationLineTemplateId(Integer expenseApplicationLineTemplateId) {
    
    this.expenseApplicationLineTemplateId = expenseApplicationLineTemplateId;
    return this;
  }

   /**
   * 経費科目ID
   * minimum: 1
   * maximum: 2147483647
   * @return expenseApplicationLineTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "505", value = "経費科目ID")

  public Integer getExpenseApplicationLineTemplateId() {
    return expenseApplicationLineTemplateId;
  }


  public void setExpenseApplicationLineTemplateId(Integer expenseApplicationLineTemplateId) {
    this.expenseApplicationLineTemplateId = expenseApplicationLineTemplateId;
  }


  public ExpenseApplicationCreateParamsExpenseApplicationLines receiptId(Integer receiptId) {
    
    this.receiptId = receiptId;
    return this;
  }

   /**
   * 証憑ファイルID（ファイルボックスのファイルID）
   * minimum: 1
   * maximum: 2147483647
   * @return receiptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "606", value = "証憑ファイルID（ファイルボックスのファイルID）")

  public Integer getReceiptId() {
    return receiptId;
  }


  public void setReceiptId(Integer receiptId) {
    this.receiptId = receiptId;
  }


  public ExpenseApplicationCreateParamsExpenseApplicationLines transactionDate(String transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * 日付 (yyyy-mm-dd)
   * @return transactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17", value = "日付 (yyyy-mm-dd)")

  public String getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseApplicationCreateParamsExpenseApplicationLines expenseApplicationCreateParamsExpenseApplicationLines = (ExpenseApplicationCreateParamsExpenseApplicationLines) o;
    return Objects.equals(this.amount, expenseApplicationCreateParamsExpenseApplicationLines.amount) &&
        Objects.equals(this.description, expenseApplicationCreateParamsExpenseApplicationLines.description) &&
        Objects.equals(this.expenseApplicationLineTemplateId, expenseApplicationCreateParamsExpenseApplicationLines.expenseApplicationLineTemplateId) &&
        Objects.equals(this.receiptId, expenseApplicationCreateParamsExpenseApplicationLines.receiptId) &&
        Objects.equals(this.transactionDate, expenseApplicationCreateParamsExpenseApplicationLines.transactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, expenseApplicationLineTemplateId, receiptId, transactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseApplicationCreateParamsExpenseApplicationLines {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expenseApplicationLineTemplateId: ").append(toIndentedString(expenseApplicationLineTemplateId)).append("\n");
    sb.append("    receiptId: ").append(toIndentedString(receiptId)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
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

