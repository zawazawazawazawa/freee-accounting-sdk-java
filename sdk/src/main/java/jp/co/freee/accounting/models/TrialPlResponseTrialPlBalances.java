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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jp.co.freee.accounting.models.TrialBsResponseTrialBsItems;
import jp.co.freee.accounting.models.TrialBsResponseTrialBsPartners;
import jp.co.freee.accounting.models.TrialBsResponseTrialBsSegment1Tags;
import jp.co.freee.accounting.models.TrialBsResponseTrialBsSegment2Tags;
import jp.co.freee.accounting.models.TrialBsResponseTrialBsSegment3Tags;
import jp.co.freee.accounting.models.TrialPlResponseTrialPlSections;

/**
 * TrialPlResponseTrialPlBalances
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialPlResponseTrialPlBalances {
  public static final String SERIALIZED_NAME_ACCOUNT_CATEGORY_NAME = "account_category_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CATEGORY_NAME)
  private String accountCategoryName;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUP_NAME = "account_group_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUP_NAME)
  private String accountGroupName;

  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_ID = "account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_ID)
  private Integer accountItemId;

  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_NAME = "account_item_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_NAME)
  private String accountItemName;

  public static final String SERIALIZED_NAME_CLOSING_BALANCE = "closing_balance";
  @SerializedName(SERIALIZED_NAME_CLOSING_BALANCE)
  private Integer closingBalance;

  public static final String SERIALIZED_NAME_COMPOSITION_RATIO = "composition_ratio";
  @SerializedName(SERIALIZED_NAME_COMPOSITION_RATIO)
  private BigDecimal compositionRatio;

  public static final String SERIALIZED_NAME_CREDIT_AMOUNT = "credit_amount";
  @SerializedName(SERIALIZED_NAME_CREDIT_AMOUNT)
  private Integer creditAmount;

  public static final String SERIALIZED_NAME_DEBIT_AMOUNT = "debit_amount";
  @SerializedName(SERIALIZED_NAME_DEBIT_AMOUNT)
  private Integer debitAmount;

  public static final String SERIALIZED_NAME_HIERARCHY_LEVEL = "hierarchy_level";
  @SerializedName(SERIALIZED_NAME_HIERARCHY_LEVEL)
  private Integer hierarchyLevel;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<TrialBsResponseTrialBsItems> items = null;

  public static final String SERIALIZED_NAME_OPENING_BALANCE = "opening_balance";
  @SerializedName(SERIALIZED_NAME_OPENING_BALANCE)
  private Integer openingBalance;

  public static final String SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_NAME = "parent_account_category_name";
  @SerializedName(SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_NAME)
  private String parentAccountCategoryName;

  public static final String SERIALIZED_NAME_PARTNERS = "partners";
  @SerializedName(SERIALIZED_NAME_PARTNERS)
  private List<TrialBsResponseTrialBsPartners> partners = null;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<TrialPlResponseTrialPlSections> sections = null;

  public static final String SERIALIZED_NAME_SEGMENT1_TAGS = "segment_1_tags";
  @SerializedName(SERIALIZED_NAME_SEGMENT1_TAGS)
  private List<TrialBsResponseTrialBsSegment1Tags> segment1Tags = null;

  public static final String SERIALIZED_NAME_SEGMENT2_TAGS = "segment_2_tags";
  @SerializedName(SERIALIZED_NAME_SEGMENT2_TAGS)
  private List<TrialBsResponseTrialBsSegment2Tags> segment2Tags = null;

  public static final String SERIALIZED_NAME_SEGMENT3_TAGS = "segment_3_tags";
  @SerializedName(SERIALIZED_NAME_SEGMENT3_TAGS)
  private List<TrialBsResponseTrialBsSegment3Tags> segment3Tags = null;

  public static final String SERIALIZED_NAME_TOTAL_LINE = "total_line";
  @SerializedName(SERIALIZED_NAME_TOTAL_LINE)
  private Boolean totalLine;

  public TrialPlResponseTrialPlBalances() { 
  }

  public TrialPlResponseTrialPlBalances accountCategoryName(String accountCategoryName) {
    
    this.accountCategoryName = accountCategoryName;
    return this;
  }

   /**
   * 勘定科目カテゴリー名
   * @return accountCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "販売管理費", value = "勘定科目カテゴリー名")

  public String getAccountCategoryName() {
    return accountCategoryName;
  }


  public void setAccountCategoryName(String accountCategoryName) {
    this.accountCategoryName = accountCategoryName;
  }


  public TrialPlResponseTrialPlBalances accountGroupName(String accountGroupName) {
    
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * 決算書表示名(account_item_display_type:group指定時に決算書表示名の時のみ含まれる)
   * @return accountGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "現金及び預金", value = "決算書表示名(account_item_display_type:group指定時に決算書表示名の時のみ含まれる)")

  public String getAccountGroupName() {
    return accountGroupName;
  }


  public void setAccountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public TrialPlResponseTrialPlBalances accountItemId(Integer accountItemId) {
    
    this.accountItemId = accountItemId;
    return this;
  }

   /**
   * 勘定科目ID(勘定科目の時のみ含まれる)
   * minimum: 1
   * maximum: 2147483647
   * @return accountItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192", value = "勘定科目ID(勘定科目の時のみ含まれる)")

  public Integer getAccountItemId() {
    return accountItemId;
  }


  public void setAccountItemId(Integer accountItemId) {
    this.accountItemId = accountItemId;
  }


  public TrialPlResponseTrialPlBalances accountItemName(String accountItemName) {
    
    this.accountItemName = accountItemName;
    return this;
  }

   /**
   * 勘定科目名(勘定科目の時のみ含まれる)
   * @return accountItemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "現金", value = "勘定科目名(勘定科目の時のみ含まれる)")

  public String getAccountItemName() {
    return accountItemName;
  }


  public void setAccountItemName(String accountItemName) {
    this.accountItemName = accountItemName;
  }


  public TrialPlResponseTrialPlBalances closingBalance(Integer closingBalance) {
    
    this.closingBalance = closingBalance;
    return this;
  }

   /**
   * 期末残高
   * @return closingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-25920", value = "期末残高")

  public Integer getClosingBalance() {
    return closingBalance;
  }


  public void setClosingBalance(Integer closingBalance) {
    this.closingBalance = closingBalance;
  }


  public TrialPlResponseTrialPlBalances compositionRatio(BigDecimal compositionRatio) {
    
    this.compositionRatio = compositionRatio;
    return this;
  }

   /**
   * 構成比
   * @return compositionRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.85", value = "構成比")

  public BigDecimal getCompositionRatio() {
    return compositionRatio;
  }


  public void setCompositionRatio(BigDecimal compositionRatio) {
    this.compositionRatio = compositionRatio;
  }


  public TrialPlResponseTrialPlBalances creditAmount(Integer creditAmount) {
    
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * 貸方金額
   * @return creditAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2592", value = "貸方金額")

  public Integer getCreditAmount() {
    return creditAmount;
  }


  public void setCreditAmount(Integer creditAmount) {
    this.creditAmount = creditAmount;
  }


  public TrialPlResponseTrialPlBalances debitAmount(Integer debitAmount) {
    
    this.debitAmount = debitAmount;
    return this;
  }

   /**
   * 借方金額
   * @return debitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "借方金額")

  public Integer getDebitAmount() {
    return debitAmount;
  }


  public void setDebitAmount(Integer debitAmount) {
    this.debitAmount = debitAmount;
  }


  public TrialPlResponseTrialPlBalances hierarchyLevel(Integer hierarchyLevel) {
    
    this.hierarchyLevel = hierarchyLevel;
    return this;
  }

   /**
   * 階層レベル
   * @return hierarchyLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "階層レベル")

  public Integer getHierarchyLevel() {
    return hierarchyLevel;
  }


  public void setHierarchyLevel(Integer hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }


  public TrialPlResponseTrialPlBalances items(List<TrialBsResponseTrialBsItems> items) {
    
    this.items = items;
    return this;
  }

  public TrialPlResponseTrialPlBalances addItemsItem(TrialBsResponseTrialBsItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * breakdown_display_type:item, account_item_display_type:account_item指定時のみ含まれる
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "breakdown_display_type:item, account_item_display_type:account_item指定時のみ含まれる")

  public List<TrialBsResponseTrialBsItems> getItems() {
    return items;
  }


  public void setItems(List<TrialBsResponseTrialBsItems> items) {
    this.items = items;
  }


  public TrialPlResponseTrialPlBalances openingBalance(Integer openingBalance) {
    
    this.openingBalance = openingBalance;
    return this;
  }

   /**
   * 期首残高
   * @return openingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "期首残高")

  public Integer getOpeningBalance() {
    return openingBalance;
  }


  public void setOpeningBalance(Integer openingBalance) {
    this.openingBalance = openingBalance;
  }


  public TrialPlResponseTrialPlBalances parentAccountCategoryName(String parentAccountCategoryName) {
    
    this.parentAccountCategoryName = parentAccountCategoryName;
    return this;
  }

   /**
   * 上位勘定科目カテゴリー名(勘定科目カテゴリーの時のみ、上層が存在する場合含まれる)
   * @return parentAccountCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "他流動資産", value = "上位勘定科目カテゴリー名(勘定科目カテゴリーの時のみ、上層が存在する場合含まれる)")

  public String getParentAccountCategoryName() {
    return parentAccountCategoryName;
  }


  public void setParentAccountCategoryName(String parentAccountCategoryName) {
    this.parentAccountCategoryName = parentAccountCategoryName;
  }


  public TrialPlResponseTrialPlBalances partners(List<TrialBsResponseTrialBsPartners> partners) {
    
    this.partners = partners;
    return this;
  }

  public TrialPlResponseTrialPlBalances addPartnersItem(TrialBsResponseTrialBsPartners partnersItem) {
    if (this.partners == null) {
      this.partners = new ArrayList<>();
    }
    this.partners.add(partnersItem);
    return this;
  }

   /**
   * breakdown_display_type:partner, account_item_display_type:account_item指定時のみ含まれる
   * @return partners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "breakdown_display_type:partner, account_item_display_type:account_item指定時のみ含まれる")

  public List<TrialBsResponseTrialBsPartners> getPartners() {
    return partners;
  }


  public void setPartners(List<TrialBsResponseTrialBsPartners> partners) {
    this.partners = partners;
  }


  public TrialPlResponseTrialPlBalances sections(List<TrialPlResponseTrialPlSections> sections) {
    
    this.sections = sections;
    return this;
  }

  public TrialPlResponseTrialPlBalances addSectionsItem(TrialPlResponseTrialPlSections sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * breakdown_display_type:section, account_item_display_type:account_item指定時のみ含まれる
   * @return sections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "breakdown_display_type:section, account_item_display_type:account_item指定時のみ含まれる")

  public List<TrialPlResponseTrialPlSections> getSections() {
    return sections;
  }


  public void setSections(List<TrialPlResponseTrialPlSections> sections) {
    this.sections = sections;
  }


  public TrialPlResponseTrialPlBalances segment1Tags(List<TrialBsResponseTrialBsSegment1Tags> segment1Tags) {
    
    this.segment1Tags = segment1Tags;
    return this;
  }

  public TrialPlResponseTrialPlBalances addSegment1TagsItem(TrialBsResponseTrialBsSegment1Tags segment1TagsItem) {
    if (this.segment1Tags == null) {
      this.segment1Tags = new ArrayList<>();
    }
    this.segment1Tags.add(segment1TagsItem);
    return this;
  }

   /**
   * breakdown_display_type:segment_1_tag, account_item_display_type:account_item指定時のみ含まれる
   * @return segment1Tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "breakdown_display_type:segment_1_tag, account_item_display_type:account_item指定時のみ含まれる")

  public List<TrialBsResponseTrialBsSegment1Tags> getSegment1Tags() {
    return segment1Tags;
  }


  public void setSegment1Tags(List<TrialBsResponseTrialBsSegment1Tags> segment1Tags) {
    this.segment1Tags = segment1Tags;
  }


  public TrialPlResponseTrialPlBalances segment2Tags(List<TrialBsResponseTrialBsSegment2Tags> segment2Tags) {
    
    this.segment2Tags = segment2Tags;
    return this;
  }

  public TrialPlResponseTrialPlBalances addSegment2TagsItem(TrialBsResponseTrialBsSegment2Tags segment2TagsItem) {
    if (this.segment2Tags == null) {
      this.segment2Tags = new ArrayList<>();
    }
    this.segment2Tags.add(segment2TagsItem);
    return this;
  }

   /**
   * breakdown_display_type:segment_2_tag, account_item_display_type:account_item指定時のみ含まれる
   * @return segment2Tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "breakdown_display_type:segment_2_tag, account_item_display_type:account_item指定時のみ含まれる")

  public List<TrialBsResponseTrialBsSegment2Tags> getSegment2Tags() {
    return segment2Tags;
  }


  public void setSegment2Tags(List<TrialBsResponseTrialBsSegment2Tags> segment2Tags) {
    this.segment2Tags = segment2Tags;
  }


  public TrialPlResponseTrialPlBalances segment3Tags(List<TrialBsResponseTrialBsSegment3Tags> segment3Tags) {
    
    this.segment3Tags = segment3Tags;
    return this;
  }

  public TrialPlResponseTrialPlBalances addSegment3TagsItem(TrialBsResponseTrialBsSegment3Tags segment3TagsItem) {
    if (this.segment3Tags == null) {
      this.segment3Tags = new ArrayList<>();
    }
    this.segment3Tags.add(segment3TagsItem);
    return this;
  }

   /**
   * breakdown_display_type:segment_3_tag, account_item_display_type:account_item指定時のみ含まれる
   * @return segment3Tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "breakdown_display_type:segment_3_tag, account_item_display_type:account_item指定時のみ含まれる")

  public List<TrialBsResponseTrialBsSegment3Tags> getSegment3Tags() {
    return segment3Tags;
  }


  public void setSegment3Tags(List<TrialBsResponseTrialBsSegment3Tags> segment3Tags) {
    this.segment3Tags = segment3Tags;
  }


  public TrialPlResponseTrialPlBalances totalLine(Boolean totalLine) {
    
    this.totalLine = totalLine;
    return this;
  }

   /**
   * 合計行(勘定科目カテゴリーの時のみ含まれる)
   * @return totalLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "合計行(勘定科目カテゴリーの時のみ含まれる)")

  public Boolean getTotalLine() {
    return totalLine;
  }


  public void setTotalLine(Boolean totalLine) {
    this.totalLine = totalLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialPlResponseTrialPlBalances trialPlResponseTrialPlBalances = (TrialPlResponseTrialPlBalances) o;
    return Objects.equals(this.accountCategoryName, trialPlResponseTrialPlBalances.accountCategoryName) &&
        Objects.equals(this.accountGroupName, trialPlResponseTrialPlBalances.accountGroupName) &&
        Objects.equals(this.accountItemId, trialPlResponseTrialPlBalances.accountItemId) &&
        Objects.equals(this.accountItemName, trialPlResponseTrialPlBalances.accountItemName) &&
        Objects.equals(this.closingBalance, trialPlResponseTrialPlBalances.closingBalance) &&
        Objects.equals(this.compositionRatio, trialPlResponseTrialPlBalances.compositionRatio) &&
        Objects.equals(this.creditAmount, trialPlResponseTrialPlBalances.creditAmount) &&
        Objects.equals(this.debitAmount, trialPlResponseTrialPlBalances.debitAmount) &&
        Objects.equals(this.hierarchyLevel, trialPlResponseTrialPlBalances.hierarchyLevel) &&
        Objects.equals(this.items, trialPlResponseTrialPlBalances.items) &&
        Objects.equals(this.openingBalance, trialPlResponseTrialPlBalances.openingBalance) &&
        Objects.equals(this.parentAccountCategoryName, trialPlResponseTrialPlBalances.parentAccountCategoryName) &&
        Objects.equals(this.partners, trialPlResponseTrialPlBalances.partners) &&
        Objects.equals(this.sections, trialPlResponseTrialPlBalances.sections) &&
        Objects.equals(this.segment1Tags, trialPlResponseTrialPlBalances.segment1Tags) &&
        Objects.equals(this.segment2Tags, trialPlResponseTrialPlBalances.segment2Tags) &&
        Objects.equals(this.segment3Tags, trialPlResponseTrialPlBalances.segment3Tags) &&
        Objects.equals(this.totalLine, trialPlResponseTrialPlBalances.totalLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategoryName, accountGroupName, accountItemId, accountItemName, closingBalance, compositionRatio, creditAmount, debitAmount, hierarchyLevel, items, openingBalance, parentAccountCategoryName, partners, sections, segment1Tags, segment2Tags, segment3Tags, totalLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialPlResponseTrialPlBalances {\n");
    sb.append("    accountCategoryName: ").append(toIndentedString(accountCategoryName)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    accountItemName: ").append(toIndentedString(accountItemName)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    compositionRatio: ").append(toIndentedString(compositionRatio)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    debitAmount: ").append(toIndentedString(debitAmount)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    parentAccountCategoryName: ").append(toIndentedString(parentAccountCategoryName)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    segment1Tags: ").append(toIndentedString(segment1Tags)).append("\n");
    sb.append("    segment2Tags: ").append(toIndentedString(segment2Tags)).append("\n");
    sb.append("    segment3Tags: ").append(toIndentedString(segment3Tags)).append("\n");
    sb.append("    totalLine: ").append(toIndentedString(totalLine)).append("\n");
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

