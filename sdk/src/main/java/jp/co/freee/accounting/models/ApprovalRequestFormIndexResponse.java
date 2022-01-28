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
import jp.co.freee.accounting.models.ApprovalRequestFormIndexResponseApprovalRequestForms;

/**
 * ApprovalRequestFormIndexResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApprovalRequestFormIndexResponse {
  public static final String SERIALIZED_NAME_APPROVAL_REQUEST_FORMS = "approval_request_forms";
  @SerializedName(SERIALIZED_NAME_APPROVAL_REQUEST_FORMS)
  private List<ApprovalRequestFormIndexResponseApprovalRequestForms> approvalRequestForms = new ArrayList<>();

  public ApprovalRequestFormIndexResponse() { 
  }

  public ApprovalRequestFormIndexResponse approvalRequestForms(List<ApprovalRequestFormIndexResponseApprovalRequestForms> approvalRequestForms) {
    
    this.approvalRequestForms = approvalRequestForms;
    return this;
  }

  public ApprovalRequestFormIndexResponse addApprovalRequestFormsItem(ApprovalRequestFormIndexResponseApprovalRequestForms approvalRequestFormsItem) {
    this.approvalRequestForms.add(approvalRequestFormsItem);
    return this;
  }

   /**
   * Get approvalRequestForms
   * @return approvalRequestForms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ApprovalRequestFormIndexResponseApprovalRequestForms> getApprovalRequestForms() {
    return approvalRequestForms;
  }


  public void setApprovalRequestForms(List<ApprovalRequestFormIndexResponseApprovalRequestForms> approvalRequestForms) {
    this.approvalRequestForms = approvalRequestForms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalRequestFormIndexResponse approvalRequestFormIndexResponse = (ApprovalRequestFormIndexResponse) o;
    return Objects.equals(this.approvalRequestForms, approvalRequestFormIndexResponse.approvalRequestForms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalRequestForms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalRequestFormIndexResponse {\n");
    sb.append("    approvalRequestForms: ").append(toIndentedString(approvalRequestForms)).append("\n");
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
