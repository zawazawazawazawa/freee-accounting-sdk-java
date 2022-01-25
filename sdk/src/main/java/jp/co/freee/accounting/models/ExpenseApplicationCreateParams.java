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
import jp.co.freee.accounting.models.ExpenseApplicationCreateParamsExpenseApplicationLines;

/**
 * ExpenseApplicationCreateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseApplicationCreateParams {
  public static final String SERIALIZED_NAME_APPROVAL_FLOW_ROUTE_ID = "approval_flow_route_id";
  @SerializedName(SERIALIZED_NAME_APPROVAL_FLOW_ROUTE_ID)
  private Integer approvalFlowRouteId;

  public static final String SERIALIZED_NAME_APPROVER_ID = "approver_id";
  @SerializedName(SERIALIZED_NAME_APPROVER_ID)
  private Integer approverId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft;

  public static final String SERIALIZED_NAME_EXPENSE_APPLICATION_LINES = "expense_application_lines";
  @SerializedName(SERIALIZED_NAME_EXPENSE_APPLICATION_LINES)
  private List<ExpenseApplicationCreateParamsExpenseApplicationLines> expenseApplicationLines = new ArrayList<>();

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_SECTION_ID = "section_id";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private Integer sectionId;

  public static final String SERIALIZED_NAME_SEGMENT1_TAG_ID = "segment_1_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT1_TAG_ID)
  private Long segment1TagId;

  public static final String SERIALIZED_NAME_SEGMENT2_TAG_ID = "segment_2_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT2_TAG_ID)
  private Long segment2TagId;

  public static final String SERIALIZED_NAME_SEGMENT3_TAG_ID = "segment_3_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT3_TAG_ID)
  private Long segment3TagId;

  public static final String SERIALIZED_NAME_TAG_IDS = "tag_ids";
  @SerializedName(SERIALIZED_NAME_TAG_IDS)
  private List<Integer> tagIds = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public ExpenseApplicationCreateParams() { 
  }

  public ExpenseApplicationCreateParams approvalFlowRouteId(Integer approvalFlowRouteId) {
    
    this.approvalFlowRouteId = approvalFlowRouteId;
    return this;
  }

   /**
   * 申請経路ID&lt;br&gt; &lt;ul&gt;     &lt;li&gt;経費申請のステータスを申請中として作成する場合は、必ず指定してください。&lt;/li&gt;     &lt;li&gt;指定する申請経路IDは、申請経路APIを利用して取得してください。&lt;/li&gt;     &lt;li&gt;         未指定の場合は、基本経路を設定している事業所では基本経路が、基本経路を設定していない事業所では利用可能な申請経路の中から最初の申請経路が自動的に使用されます。         &lt;ul&gt;            &lt;li&gt;意図しない申請経路を持った経費申請の作成を防ぐために、使用する申請経路IDを指定することを推奨します。&lt;/li&gt;         &lt;/ul&gt;     &lt;/li&gt;     &lt;li&gt;         ベーシックプランの事業所では以下のデフォルトで用意された申請経路のみ指定できます         &lt;ul&gt;         &lt;li&gt;指定なし&lt;/li&gt;         &lt;li&gt;承認者を指定&lt;/li&gt;         &lt;/ul&gt;     &lt;/li&gt; &lt;/ul&gt; 
   * minimum: 1
   * maximum: 2147483647
   * @return approvalFlowRouteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "申請経路ID<br> <ul>     <li>経費申請のステータスを申請中として作成する場合は、必ず指定してください。</li>     <li>指定する申請経路IDは、申請経路APIを利用して取得してください。</li>     <li>         未指定の場合は、基本経路を設定している事業所では基本経路が、基本経路を設定していない事業所では利用可能な申請経路の中から最初の申請経路が自動的に使用されます。         <ul>            <li>意図しない申請経路を持った経費申請の作成を防ぐために、使用する申請経路IDを指定することを推奨します。</li>         </ul>     </li>     <li>         ベーシックプランの事業所では以下のデフォルトで用意された申請経路のみ指定できます         <ul>         <li>指定なし</li>         <li>承認者を指定</li>         </ul>     </li> </ul> ")

  public Integer getApprovalFlowRouteId() {
    return approvalFlowRouteId;
  }


  public void setApprovalFlowRouteId(Integer approvalFlowRouteId) {
    this.approvalFlowRouteId = approvalFlowRouteId;
  }


  public ExpenseApplicationCreateParams approverId(Integer approverId) {
    
    this.approverId = approverId;
    return this;
  }

   /**
   * 承認者のユーザーID&lt;br&gt; 「承認者を指定」の経路を申請経路として使用する場合に指定してください。&lt;br&gt; 指定する承認者のユーザーIDは、申請経路APIを利用して取得してください。 
   * minimum: 1
   * maximum: 2147483647
   * @return approverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "承認者のユーザーID<br> 「承認者を指定」の経路を申請経路として使用する場合に指定してください。<br> 指定する承認者のユーザーIDは、申請経路APIを利用して取得してください。 ")

  public Integer getApproverId() {
    return approverId;
  }


  public void setApproverId(Integer approverId) {
    this.approverId = approverId;
  }


  public ExpenseApplicationCreateParams companyId(Integer companyId) {
    
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


  public ExpenseApplicationCreateParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 備考 (10000文字以内)
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "◯◯連携先ID: cx12345", value = "備考 (10000文字以内)")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ExpenseApplicationCreateParams draft(Boolean draft) {
    
    this.draft = draft;
    return this;
  }

   /**
   * 経費申請のステータス&lt;br&gt; falseを指定した時は申請中（in_progress）で経費申請を作成します。&lt;br&gt; trueを指定した時は下書き（draft）で経費申請を作成します。&lt;br&gt; 未指定の時は下書きとみなして経費申請を作成します。 
   * @return draft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "経費申請のステータス<br> falseを指定した時は申請中（in_progress）で経費申請を作成します。<br> trueを指定した時は下書き（draft）で経費申請を作成します。<br> 未指定の時は下書きとみなして経費申請を作成します。 ")

  public Boolean getDraft() {
    return draft;
  }


  public void setDraft(Boolean draft) {
    this.draft = draft;
  }


  public ExpenseApplicationCreateParams expenseApplicationLines(List<ExpenseApplicationCreateParamsExpenseApplicationLines> expenseApplicationLines) {
    
    this.expenseApplicationLines = expenseApplicationLines;
    return this;
  }

  public ExpenseApplicationCreateParams addExpenseApplicationLinesItem(ExpenseApplicationCreateParamsExpenseApplicationLines expenseApplicationLinesItem) {
    this.expenseApplicationLines.add(expenseApplicationLinesItem);
    return this;
  }

   /**
   * Get expenseApplicationLines
   * @return expenseApplicationLines
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ExpenseApplicationCreateParamsExpenseApplicationLines> getExpenseApplicationLines() {
    return expenseApplicationLines;
  }


  public void setExpenseApplicationLines(List<ExpenseApplicationCreateParamsExpenseApplicationLines> expenseApplicationLines) {
    this.expenseApplicationLines = expenseApplicationLines;
  }


  public ExpenseApplicationCreateParams issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * 申請日 (yyyy-mm-dd)
   * @return issueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-17", required = true, value = "申請日 (yyyy-mm-dd)")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public ExpenseApplicationCreateParams parentId(Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * 親申請ID(法人向けプロフェッショナル, 法人向け エンタープライズプラン)&lt;br&gt; &lt;ul&gt;   &lt;li&gt;承認済みの既存各種申請IDのみ指定可能です。&lt;/li&gt;   &lt;li&gt;各種申請一覧APIを利用して取得してください。&lt;/li&gt; &lt;/ul&gt; 
   * minimum: 1
   * maximum: 2147483647
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "親申請ID(法人向けプロフェッショナル, 法人向け エンタープライズプラン)<br> <ul>   <li>承認済みの既存各種申請IDのみ指定可能です。</li>   <li>各種申請一覧APIを利用して取得してください。</li> </ul> ")

  public Integer getParentId() {
    return parentId;
  }


  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public ExpenseApplicationCreateParams sectionId(Integer sectionId) {
    
    this.sectionId = sectionId;
    return this;
  }

   /**
   * 部門ID
   * minimum: 1
   * maximum: 2147483647
   * @return sectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "101", value = "部門ID")

  public Integer getSectionId() {
    return sectionId;
  }


  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }


  public ExpenseApplicationCreateParams segment1TagId(Long segment1TagId) {
    
    this.segment1TagId = segment1TagId;
    return this;
  }

   /**
   * セグメント１ID(法人向けプロフェッショナル, 法人向けエンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt; 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return segment1TagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "セグメント１ID(法人向けプロフェッショナル, 法人向けエンタープライズプラン)<br> セグメントタグ一覧APIを利用して取得してください。<br> <a href=\"https://support.freee.co.jp/hc/ja/articles/360020679611\" target=\"_blank\">セグメント（分析用タグ）の設定</a><br> ")

  public Long getSegment1TagId() {
    return segment1TagId;
  }


  public void setSegment1TagId(Long segment1TagId) {
    this.segment1TagId = segment1TagId;
  }


  public ExpenseApplicationCreateParams segment2TagId(Long segment2TagId) {
    
    this.segment2TagId = segment2TagId;
    return this;
  }

   /**
   * セグメント２ID(法人向け エンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt; 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return segment2TagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "セグメント２ID(法人向け エンタープライズプラン)<br> セグメントタグ一覧APIを利用して取得してください。<br> <a href=\"https://support.freee.co.jp/hc/ja/articles/360020679611\" target=\"_blank\">セグメント（分析用タグ）の設定</a><br> ")

  public Long getSegment2TagId() {
    return segment2TagId;
  }


  public void setSegment2TagId(Long segment2TagId) {
    this.segment2TagId = segment2TagId;
  }


  public ExpenseApplicationCreateParams segment3TagId(Long segment3TagId) {
    
    this.segment3TagId = segment3TagId;
    return this;
  }

   /**
   * セグメント３ID(法人向け エンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt; 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return segment3TagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "セグメント３ID(法人向け エンタープライズプラン)<br> セグメントタグ一覧APIを利用して取得してください。<br> <a href=\"https://support.freee.co.jp/hc/ja/articles/360020679611\" target=\"_blank\">セグメント（分析用タグ）の設定</a><br> ")

  public Long getSegment3TagId() {
    return segment3TagId;
  }


  public void setSegment3TagId(Long segment3TagId) {
    this.segment3TagId = segment3TagId;
  }


  public ExpenseApplicationCreateParams tagIds(List<Integer> tagIds) {
    
    this.tagIds = tagIds;
    return this;
  }

  public ExpenseApplicationCreateParams addTagIdsItem(Integer tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * メモタグID
   * @return tagIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "メモタグID")

  public List<Integer> getTagIds() {
    return tagIds;
  }


  public void setTagIds(List<Integer> tagIds) {
    this.tagIds = tagIds;
  }


  public ExpenseApplicationCreateParams title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 申請タイトル (250文字以内)
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "大阪出張", required = true, value = "申請タイトル (250文字以内)")

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
    ExpenseApplicationCreateParams expenseApplicationCreateParams = (ExpenseApplicationCreateParams) o;
    return Objects.equals(this.approvalFlowRouteId, expenseApplicationCreateParams.approvalFlowRouteId) &&
        Objects.equals(this.approverId, expenseApplicationCreateParams.approverId) &&
        Objects.equals(this.companyId, expenseApplicationCreateParams.companyId) &&
        Objects.equals(this.description, expenseApplicationCreateParams.description) &&
        Objects.equals(this.draft, expenseApplicationCreateParams.draft) &&
        Objects.equals(this.expenseApplicationLines, expenseApplicationCreateParams.expenseApplicationLines) &&
        Objects.equals(this.issueDate, expenseApplicationCreateParams.issueDate) &&
        Objects.equals(this.parentId, expenseApplicationCreateParams.parentId) &&
        Objects.equals(this.sectionId, expenseApplicationCreateParams.sectionId) &&
        Objects.equals(this.segment1TagId, expenseApplicationCreateParams.segment1TagId) &&
        Objects.equals(this.segment2TagId, expenseApplicationCreateParams.segment2TagId) &&
        Objects.equals(this.segment3TagId, expenseApplicationCreateParams.segment3TagId) &&
        Objects.equals(this.tagIds, expenseApplicationCreateParams.tagIds) &&
        Objects.equals(this.title, expenseApplicationCreateParams.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalFlowRouteId, approverId, companyId, description, draft, expenseApplicationLines, issueDate, parentId, sectionId, segment1TagId, segment2TagId, segment3TagId, tagIds, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseApplicationCreateParams {\n");
    sb.append("    approvalFlowRouteId: ").append(toIndentedString(approvalFlowRouteId)).append("\n");
    sb.append("    approverId: ").append(toIndentedString(approverId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    expenseApplicationLines: ").append(toIndentedString(expenseApplicationLines)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    segment1TagId: ").append(toIndentedString(segment1TagId)).append("\n");
    sb.append("    segment2TagId: ").append(toIndentedString(segment2TagId)).append("\n");
    sb.append("    segment3TagId: ").append(toIndentedString(segment3TagId)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
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

