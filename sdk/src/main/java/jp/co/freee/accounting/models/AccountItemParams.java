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
import jp.co.freee.accounting.models.AccountItemParamsAccountItem;

/**
 * AccountItemParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountItemParams {
  public static final String SERIALIZED_NAME_ACCOUNT_ITEM = "account_item";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM)
  private AccountItemParamsAccountItem accountItem;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public AccountItemParams() { 
  }

  public AccountItemParams accountItem(AccountItemParamsAccountItem accountItem) {
    
    this.accountItem = accountItem;
    return this;
  }

   /**
   * Get accountItem
   * @return accountItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AccountItemParamsAccountItem getAccountItem() {
    return accountItem;
  }


  public void setAccountItem(AccountItemParamsAccountItem accountItem) {
    this.accountItem = accountItem;
  }


  public AccountItemParams companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 事業所ID
   * minimum: 1
   * maximum: 2147483647
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountItemParams accountItemParams = (AccountItemParams) o;
    return Objects.equals(this.accountItem, accountItemParams.accountItem) &&
        Objects.equals(this.companyId, accountItemParams.companyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItem, companyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountItemParams {\n");
    sb.append("    accountItem: ").append(toIndentedString(accountItem)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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

