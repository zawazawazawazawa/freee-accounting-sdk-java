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
import jp.co.freee.accounting.models.SelectablesIndexResponseAccountItems;

/**
 * SelectablesIndexResponseAccountCategories
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SelectablesIndexResponseAccountCategories {
  public static final String SERIALIZED_NAME_ACCOUNT_ITEMS = "account_items";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEMS)
  private List<SelectablesIndexResponseAccountItems> accountItems = new ArrayList<>();

  /**
   * 収支
   */
  @JsonAdapter(BalanceEnum.Adapter.class)
  public enum BalanceEnum {
    EXPENSE("expense"),
    
    INCOME("income");

    private String value;

    BalanceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BalanceEnum fromValue(String value) {
      for (BalanceEnum b : BalanceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BalanceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BalanceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BalanceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BalanceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BalanceEnum balance;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  /**
   * 事業形態（個人事業主: personal、法人: corporate）
   */
  @JsonAdapter(OrgCodeEnum.Adapter.class)
  public enum OrgCodeEnum {
    PERSONAL("personal"),
    
    CORPORATE("corporate");

    private String value;

    OrgCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrgCodeEnum fromValue(String value) {
      for (OrgCodeEnum b : OrgCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OrgCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrgCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrgCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrgCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORG_CODE = "org_code";
  @SerializedName(SERIALIZED_NAME_ORG_CODE)
  private OrgCodeEnum orgCode;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public SelectablesIndexResponseAccountCategories() { 
  }

  public SelectablesIndexResponseAccountCategories accountItems(List<SelectablesIndexResponseAccountItems> accountItems) {
    
    this.accountItems = accountItems;
    return this;
  }

  public SelectablesIndexResponseAccountCategories addAccountItemsItem(SelectablesIndexResponseAccountItems accountItemsItem) {
    this.accountItems.add(accountItemsItem);
    return this;
  }

   /**
   * 勘定科目の一覧
   * @return accountItems
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "勘定科目の一覧")

  public List<SelectablesIndexResponseAccountItems> getAccountItems() {
    return accountItems;
  }


  public void setAccountItems(List<SelectablesIndexResponseAccountItems> accountItems) {
    this.accountItems = accountItems;
  }


  public SelectablesIndexResponseAccountCategories balance(BalanceEnum balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 収支
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "expense", required = true, value = "収支")

  public BalanceEnum getBalance() {
    return balance;
  }


  public void setBalance(BalanceEnum balance) {
    this.balance = balance;
  }


  public SelectablesIndexResponseAccountCategories desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * カテゴリーの説明
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "飲食に使用した経費", value = "カテゴリーの説明")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public SelectablesIndexResponseAccountCategories orgCode(OrgCodeEnum orgCode) {
    
    this.orgCode = orgCode;
    return this;
  }

   /**
   * 事業形態（個人事業主: personal、法人: corporate）
   * @return orgCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "personal", required = true, value = "事業形態（個人事業主: personal、法人: corporate）")

  public OrgCodeEnum getOrgCode() {
    return orgCode;
  }


  public void setOrgCode(OrgCodeEnum orgCode) {
    this.orgCode = orgCode;
  }


  public SelectablesIndexResponseAccountCategories role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * カテゴリーコード
   * @return role
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ex_food", required = true, value = "カテゴリーコード")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public SelectablesIndexResponseAccountCategories title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * カテゴリー名
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "飲食費", required = true, value = "カテゴリー名")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectablesIndexResponseAccountCategories selectablesIndexResponseAccountCategories = (SelectablesIndexResponseAccountCategories) o;
    return Objects.equals(this.accountItems, selectablesIndexResponseAccountCategories.accountItems) &&
        Objects.equals(this.balance, selectablesIndexResponseAccountCategories.balance) &&
        Objects.equals(this.desc, selectablesIndexResponseAccountCategories.desc) &&
        Objects.equals(this.orgCode, selectablesIndexResponseAccountCategories.orgCode) &&
        Objects.equals(this.role, selectablesIndexResponseAccountCategories.role) &&
        Objects.equals(this.title, selectablesIndexResponseAccountCategories.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItems, balance, desc, orgCode, role, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectablesIndexResponseAccountCategories {\n");
    sb.append("    accountItems: ").append(toIndentedString(accountItems)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    orgCode: ").append(toIndentedString(orgCode)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

