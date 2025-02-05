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
import jp.co.freee.accounting.models.JournalsResponseJournalsUpToDateReasons;
import jp.co.freee.accounting.models.TrialPlSegment3TagsResponseTrialPlSegment3Tags;

/**
 * TrialPlSegment3TagsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialPlSegment3TagsResponse {
  public static final String SERIALIZED_NAME_TRIAL_PL_SEGMENT3_TAGS = "trial_pl_segment_3_tags";
  @SerializedName(SERIALIZED_NAME_TRIAL_PL_SEGMENT3_TAGS)
  private TrialPlSegment3TagsResponseTrialPlSegment3Tags trialPlSegment3Tags;

  public static final String SERIALIZED_NAME_UP_TO_DATE = "up_to_date";
  @SerializedName(SERIALIZED_NAME_UP_TO_DATE)
  private Boolean upToDate;

  public static final String SERIALIZED_NAME_UP_TO_DATE_REASONS = "up_to_date_reasons";
  @SerializedName(SERIALIZED_NAME_UP_TO_DATE_REASONS)
  private List<JournalsResponseJournalsUpToDateReasons> upToDateReasons = null;

  public TrialPlSegment3TagsResponse() { 
  }

  public TrialPlSegment3TagsResponse trialPlSegment3Tags(TrialPlSegment3TagsResponseTrialPlSegment3Tags trialPlSegment3Tags) {
    
    this.trialPlSegment3Tags = trialPlSegment3Tags;
    return this;
  }

   /**
   * Get trialPlSegment3Tags
   * @return trialPlSegment3Tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TrialPlSegment3TagsResponseTrialPlSegment3Tags getTrialPlSegment3Tags() {
    return trialPlSegment3Tags;
  }


  public void setTrialPlSegment3Tags(TrialPlSegment3TagsResponseTrialPlSegment3Tags trialPlSegment3Tags) {
    this.trialPlSegment3Tags = trialPlSegment3Tags;
  }


  public TrialPlSegment3TagsResponse upToDate(Boolean upToDate) {
    
    this.upToDate = upToDate;
    return this;
  }

   /**
   * 集計結果が最新かどうか
   * @return upToDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "集計結果が最新かどうか")

  public Boolean getUpToDate() {
    return upToDate;
  }


  public void setUpToDate(Boolean upToDate) {
    this.upToDate = upToDate;
  }


  public TrialPlSegment3TagsResponse upToDateReasons(List<JournalsResponseJournalsUpToDateReasons> upToDateReasons) {
    
    this.upToDateReasons = upToDateReasons;
    return this;
  }

  public TrialPlSegment3TagsResponse addUpToDateReasonsItem(JournalsResponseJournalsUpToDateReasons upToDateReasonsItem) {
    if (this.upToDateReasons == null) {
      this.upToDateReasons = new ArrayList<>();
    }
    this.upToDateReasons.add(upToDateReasonsItem);
    return this;
  }

   /**
   * 集計が最新でない場合の要因情報
   * @return upToDateReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "集計が最新でない場合の要因情報")

  public List<JournalsResponseJournalsUpToDateReasons> getUpToDateReasons() {
    return upToDateReasons;
  }


  public void setUpToDateReasons(List<JournalsResponseJournalsUpToDateReasons> upToDateReasons) {
    this.upToDateReasons = upToDateReasons;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialPlSegment3TagsResponse trialPlSegment3TagsResponse = (TrialPlSegment3TagsResponse) o;
    return Objects.equals(this.trialPlSegment3Tags, trialPlSegment3TagsResponse.trialPlSegment3Tags) &&
        Objects.equals(this.upToDate, trialPlSegment3TagsResponse.upToDate) &&
        Objects.equals(this.upToDateReasons, trialPlSegment3TagsResponse.upToDateReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trialPlSegment3Tags, upToDate, upToDateReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialPlSegment3TagsResponse {\n");
    sb.append("    trialPlSegment3Tags: ").append(toIndentedString(trialPlSegment3Tags)).append("\n");
    sb.append("    upToDate: ").append(toIndentedString(upToDate)).append("\n");
    sb.append("    upToDateReasons: ").append(toIndentedString(upToDateReasons)).append("\n");
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

