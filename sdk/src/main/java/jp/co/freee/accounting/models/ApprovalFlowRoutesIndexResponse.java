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
import jp.co.freee.accounting.models.ApprovalFlowRoutesIndexResponseApprovalFlowRoutes;

/**
 * ApprovalFlowRoutesIndexResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApprovalFlowRoutesIndexResponse {
  public static final String SERIALIZED_NAME_APPROVAL_FLOW_ROUTES = "approval_flow_routes";
  @SerializedName(SERIALIZED_NAME_APPROVAL_FLOW_ROUTES)
  private List<ApprovalFlowRoutesIndexResponseApprovalFlowRoutes> approvalFlowRoutes = new ArrayList<>();

  public ApprovalFlowRoutesIndexResponse() { 
  }

  public ApprovalFlowRoutesIndexResponse approvalFlowRoutes(List<ApprovalFlowRoutesIndexResponseApprovalFlowRoutes> approvalFlowRoutes) {
    
    this.approvalFlowRoutes = approvalFlowRoutes;
    return this;
  }

  public ApprovalFlowRoutesIndexResponse addApprovalFlowRoutesItem(ApprovalFlowRoutesIndexResponseApprovalFlowRoutes approvalFlowRoutesItem) {
    this.approvalFlowRoutes.add(approvalFlowRoutesItem);
    return this;
  }

   /**
   * Get approvalFlowRoutes
   * @return approvalFlowRoutes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ApprovalFlowRoutesIndexResponseApprovalFlowRoutes> getApprovalFlowRoutes() {
    return approvalFlowRoutes;
  }


  public void setApprovalFlowRoutes(List<ApprovalFlowRoutesIndexResponseApprovalFlowRoutes> approvalFlowRoutes) {
    this.approvalFlowRoutes = approvalFlowRoutes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalFlowRoutesIndexResponse approvalFlowRoutesIndexResponse = (ApprovalFlowRoutesIndexResponse) o;
    return Objects.equals(this.approvalFlowRoutes, approvalFlowRoutesIndexResponse.approvalFlowRoutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalFlowRoutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalFlowRoutesIndexResponse {\n");
    sb.append("    approvalFlowRoutes: ").append(toIndentedString(approvalFlowRoutes)).append("\n");
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

