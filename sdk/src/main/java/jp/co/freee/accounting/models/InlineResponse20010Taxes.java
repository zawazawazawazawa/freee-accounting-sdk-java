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
 * InlineResponse20010Taxes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20010Taxes {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Boolean available;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  /**
   * 税区分の表示カテゴリ（tax_5: 5%表示の税区分、tax_8: 8%表示の税区分、tax_r8: 軽減税率8%表示の税区分、tax_10: 10%表示の税区分、null: 税率未設定税区分）
   */
  @JsonAdapter(DisplayCategoryEnum.Adapter.class)
  public enum DisplayCategoryEnum {
    _5("tax_5"),
    
    _8("tax_8"),
    
    R8("tax_r8"),
    
    _10("tax_10");

    private String value;

    DisplayCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayCategoryEnum fromValue(String value) {
      for (DisplayCategoryEnum b : DisplayCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisplayCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisplayCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISPLAY_CATEGORY = "display_category";
  @SerializedName(SERIALIZED_NAME_DISPLAY_CATEGORY)
  private DisplayCategoryEnum displayCategory;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_JA = "name_ja";
  @SerializedName(SERIALIZED_NAME_NAME_JA)
  private String nameJa;

  public InlineResponse20010Taxes() { 
  }

  public InlineResponse20010Taxes available(Boolean available) {
    
    this.available = available;
    return this;
  }

   /**
   * true: 使用する、false: 使用しない
   * @return available
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "true: 使用する、false: 使用しない")

  public Boolean getAvailable() {
    return available;
  }


  public void setAvailable(Boolean available) {
    this.available = available;
  }


  public InlineResponse20010Taxes code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 税区分コード
   * minimum: 0
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


  public InlineResponse20010Taxes displayCategory(DisplayCategoryEnum displayCategory) {
    
    this.displayCategory = displayCategory;
    return this;
  }

   /**
   * 税区分の表示カテゴリ（tax_5: 5%表示の税区分、tax_8: 8%表示の税区分、tax_r8: 軽減税率8%表示の税区分、tax_10: 10%表示の税区分、null: 税率未設定税区分）
   * @return displayCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tax_8", required = true, value = "税区分の表示カテゴリ（tax_5: 5%表示の税区分、tax_8: 8%表示の税区分、tax_r8: 軽減税率8%表示の税区分、tax_10: 10%表示の税区分、null: 税率未設定税区分）")

  public DisplayCategoryEnum getDisplayCategory() {
    return displayCategory;
  }


  public void setDisplayCategory(DisplayCategoryEnum displayCategory) {
    this.displayCategory = displayCategory;
  }


  public InlineResponse20010Taxes name(String name) {
    
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


  public InlineResponse20010Taxes nameJa(String nameJa) {
    
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
    InlineResponse20010Taxes inlineResponse20010Taxes = (InlineResponse20010Taxes) o;
    return Objects.equals(this.available, inlineResponse20010Taxes.available) &&
        Objects.equals(this.code, inlineResponse20010Taxes.code) &&
        Objects.equals(this.displayCategory, inlineResponse20010Taxes.displayCategory) &&
        Objects.equals(this.name, inlineResponse20010Taxes.name) &&
        Objects.equals(this.nameJa, inlineResponse20010Taxes.nameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, code, displayCategory, name, nameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010Taxes {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    displayCategory: ").append(toIndentedString(displayCategory)).append("\n");
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
