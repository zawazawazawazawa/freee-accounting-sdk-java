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
import jp.co.freee.accounting.models.TrialCrSectionsResponseTrialCrSectionsItems;
import jp.co.freee.accounting.models.TrialCrSectionsResponseTrialCrSectionsPartners;
import jp.co.freee.accounting.models.TrialCrSegment1TagsResponseTrialCrSegment1TagsSections;

/**
 * TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags {
  public static final String SERIALIZED_NAME_CLOSING_BALANCE = "closing_balance";
  @SerializedName(SERIALIZED_NAME_CLOSING_BALANCE)
  private Integer closingBalance;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<TrialCrSectionsResponseTrialCrSectionsItems> items = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARTNERS = "partners";
  @SerializedName(SERIALIZED_NAME_PARTNERS)
  private List<TrialCrSectionsResponseTrialCrSectionsPartners> partners = null;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<TrialCrSegment1TagsResponseTrialCrSegment1TagsSections> sections = null;

  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags() { 
  }

  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags closingBalance(Integer closingBalance) {
    
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


  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * セグメント3タグID
   * minimum: 0
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "セグメント3タグID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags items(List<TrialCrSectionsResponseTrialCrSectionsItems> items) {
    
    this.items = items;
    return this;
  }

  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags addItemsItem(TrialCrSectionsResponseTrialCrSectionsItems itemsItem) {
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

  public List<TrialCrSectionsResponseTrialCrSectionsItems> getItems() {
    return items;
  }


  public void setItems(List<TrialCrSectionsResponseTrialCrSectionsItems> items) {
    this.items = items;
  }


  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * セグメント3タグ名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "プロジェクトA", value = "セグメント3タグ名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags partners(List<TrialCrSectionsResponseTrialCrSectionsPartners> partners) {
    
    this.partners = partners;
    return this;
  }

  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags addPartnersItem(TrialCrSectionsResponseTrialCrSectionsPartners partnersItem) {
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

  public List<TrialCrSectionsResponseTrialCrSectionsPartners> getPartners() {
    return partners;
  }


  public void setPartners(List<TrialCrSectionsResponseTrialCrSectionsPartners> partners) {
    this.partners = partners;
  }


  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags sections(List<TrialCrSegment1TagsResponseTrialCrSegment1TagsSections> sections) {
    
    this.sections = sections;
    return this;
  }

  public TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags addSectionsItem(TrialCrSegment1TagsResponseTrialCrSegment1TagsSections sectionsItem) {
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

  public List<TrialCrSegment1TagsResponseTrialCrSegment1TagsSections> getSections() {
    return sections;
  }


  public void setSections(List<TrialCrSegment1TagsResponseTrialCrSegment1TagsSections> sections) {
    this.sections = sections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags trialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags = (TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags) o;
    return Objects.equals(this.closingBalance, trialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags.closingBalance) &&
        Objects.equals(this.id, trialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags.id) &&
        Objects.equals(this.items, trialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags.items) &&
        Objects.equals(this.name, trialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags.name) &&
        Objects.equals(this.partners, trialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags.partners) &&
        Objects.equals(this.sections, trialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closingBalance, id, items, name, partners, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialCrSegment3TagsResponseTrialCrSegment3TagsSegment3Tags {\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

