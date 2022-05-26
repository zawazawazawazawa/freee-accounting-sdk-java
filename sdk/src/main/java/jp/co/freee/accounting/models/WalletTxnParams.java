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
 * WalletTxnParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WalletTxnParams {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Long balance;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * 入金／出金 (入金: income, 出金: expense)
   */
  @JsonAdapter(EntrySideEnum.Adapter.class)
  public enum EntrySideEnum {
    INCOME("income"),
    
    EXPENSE("expense");

    private String value;

    EntrySideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntrySideEnum fromValue(String value) {
      for (EntrySideEnum b : EntrySideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntrySideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntrySideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntrySideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntrySideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTRY_SIDE = "entry_side";
  @SerializedName(SERIALIZED_NAME_ENTRY_SIDE)
  private EntrySideEnum entrySide;

  public static final String SERIALIZED_NAME_WALLETABLE_ID = "walletable_id";
  @SerializedName(SERIALIZED_NAME_WALLETABLE_ID)
  private Integer walletableId;

  /**
   * 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet)
   */
  @JsonAdapter(WalletableTypeEnum.Adapter.class)
  public enum WalletableTypeEnum {
    BANK_ACCOUNT("bank_account"),
    
    CREDIT_CARD("credit_card"),
    
    WALLET("wallet");

    private String value;

    WalletableTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WalletableTypeEnum fromValue(String value) {
      for (WalletableTypeEnum b : WalletableTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WalletableTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WalletableTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WalletableTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WalletableTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WALLETABLE_TYPE = "walletable_type";
  @SerializedName(SERIALIZED_NAME_WALLETABLE_TYPE)
  private WalletableTypeEnum walletableType;

  public WalletTxnParams() { 
  }

  public WalletTxnParams amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 取引金額
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5000", required = true, value = "取引金額")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public WalletTxnParams balance(Long balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 残高 (銀行口座等)
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "残高 (銀行口座等)")

  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public WalletTxnParams companyId(Integer companyId) {
    
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


  public WalletTxnParams date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 取引日 (yyyy-mm-dd)
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-17", required = true, value = "取引日 (yyyy-mm-dd)")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public WalletTxnParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 取引内容
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "取引内容", value = "取引内容")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WalletTxnParams entrySide(EntrySideEnum entrySide) {
    
    this.entrySide = entrySide;
    return this;
  }

   /**
   * 入金／出金 (入金: income, 出金: expense)
   * @return entrySide
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "income", required = true, value = "入金／出金 (入金: income, 出金: expense)")

  public EntrySideEnum getEntrySide() {
    return entrySide;
  }


  public void setEntrySide(EntrySideEnum entrySide) {
    this.entrySide = entrySide;
  }


  public WalletTxnParams walletableId(Integer walletableId) {
    
    this.walletableId = walletableId;
    return this;
  }

   /**
   * 口座ID
   * minimum: 1
   * maximum: 2147483647
   * @return walletableId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "口座ID")

  public Integer getWalletableId() {
    return walletableId;
  }


  public void setWalletableId(Integer walletableId) {
    this.walletableId = walletableId;
  }


  public WalletTxnParams walletableType(WalletableTypeEnum walletableType) {
    
    this.walletableType = walletableType;
    return this;
  }

   /**
   * 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet)
   * @return walletableType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "bank_account", required = true, value = "口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet)")

  public WalletableTypeEnum getWalletableType() {
    return walletableType;
  }


  public void setWalletableType(WalletableTypeEnum walletableType) {
    this.walletableType = walletableType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTxnParams walletTxnParams = (WalletTxnParams) o;
    return Objects.equals(this.amount, walletTxnParams.amount) &&
        Objects.equals(this.balance, walletTxnParams.balance) &&
        Objects.equals(this.companyId, walletTxnParams.companyId) &&
        Objects.equals(this.date, walletTxnParams.date) &&
        Objects.equals(this.description, walletTxnParams.description) &&
        Objects.equals(this.entrySide, walletTxnParams.entrySide) &&
        Objects.equals(this.walletableId, walletTxnParams.walletableId) &&
        Objects.equals(this.walletableType, walletTxnParams.walletableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, balance, companyId, date, description, entrySide, walletableId, walletableType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTxnParams {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entrySide: ").append(toIndentedString(entrySide)).append("\n");
    sb.append("    walletableId: ").append(toIndentedString(walletableId)).append("\n");
    sb.append("    walletableType: ").append(toIndentedString(walletableType)).append("\n");
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

