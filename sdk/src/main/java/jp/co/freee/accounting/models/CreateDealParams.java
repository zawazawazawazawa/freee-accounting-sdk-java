/*
 * freee API
 *  <h1 id=\"freee_api\">freee API</h1> <hr /> <h2 id=\"\">スタートガイド</h2> <p>1. セットアップ</p> <ol> <ul><li><a href=\"https://support.freee.co.jp/hc/ja/articles/202847230\" class=\"external-link\" rel=\"nofollow\">freeeアカウント（無料）</a>を<a href=\"https://secure.freee.co.jp/users/sign_up\" class=\"external-link\" rel=\"nofollow\">作成</a>します（すでにお持ちの場合は次へ）</li><li><a href=\"https://app.secure.freee.co.jp/developers/demo_companies/description\" class=\"external-link\" rel=\"nofollow\">開発者向け事業所・環境を作成</a>します</li><li><span><a href=\"https://app.secure.freee.co.jp/developers/applications\" class=\"external-link\" rel=\"nofollow\">前のステップで作成した事業所を選択してfreeeアプリを追加</a>します</span></li><li>Client IDをCopyしておきます</li> </ul> </ol>  <p>2. 実際にAPIを叩いてみる（ブラウザからAPIのレスポンスを確認する）</p> <ol> <ul><li><span><span>以下のURLの●をclient_idに入れ替えて<a href=\"https://app.secure.freee.co.jp/developers/tutorials/3-%E3%82%A2%E3%82%AF%E3%82%BB%E3%82%B9%E3%83%88%E3%83%BC%E3%82%AF%E3%83%B3%E3%82%92%E5%8F%96%E5%BE%97%E3%81%99%E3%82%8B#%E8%AA%8D%E5%8F%AF%E3%82%B3%E3%83%BC%E3%83%89%E3%82%92%E5%8F%96%E5%BE%97%E3%81%99%E3%82%8B\" class=\"external-link\" rel=\"nofollow\">アクセストークンを取得</a>します</span></span><ul><li><span><span><pre><code>https://accounts.secure.freee.co.jp/public_api/authorize?client_id=●&amp;redirect_uri=urn%3Aietf%3Awg%3Aoauth%3A2.0%3Aoob&amp;response_type=token</a></code></pre></span></span></li></ul></li><li><span><a href=\"https://developer.freee.co.jp/docs/accounting/reference#/%E9%80%A3%E7%B5%A1%E5%85%88\" class=\"external-link\" rel=\"nofollow\">APIリファレンス</a>で<code>Authorize</code>を押下します</span></li><li><span>アクセストークン<span><span>を入力して</span></span>&nbsp;もう一度<span><code>Authorize</code>を押下して<code>Close</code>を押下します</span></span></li><li>リファレンス内のCompanies（事業所）に移動し、<code>Try it out</code>を押下し、<code>Execute</code>を押下します</li><li>Response bodyを参照し、事業所ID(id属性)を活用して、Companies以外のエンドポイントでどのようなデータのやりとりできるのか確認します</li></ul> </ol> <p>3. 連携を実装する</p> <ol> <ul><li><a href=\"https://developer.freee.co.jp/tips\" class=\"external-link\" rel=\"nofollow\">API TIPS</a>を参考に、ユースケースごとの連携の概要を学びます。<span>例えば</span><span>&nbsp;</span><a href=\"https://developer.freee.co.jp/tips/how-to-cooperate-salesmanegement-system\" class=\"external-link\" rel=\"nofollow\">SFA、CRM、販売管理システムから会計freeeへの連携</a>や<a href=\"https://developer.freee.co.jp/tips/how-to-cooperate-excel-and-spreadsheet\" class=\"external-link\" rel=\"nofollow\">エクセルやgoogle spreadsheetからの連携</a>です</li><li>実利用向け事業所がすでにある場合は利用、ない場合は作成します（セットアップで作成したのは開発者向け環境のため活用不可）</li><li><a href=\"https://developer.freee.co.jp/docs/accounting/reference\" class=\"external-link\" rel=\"nofollow\">API documentation</a><span>&nbsp;を参照し、躓いた場合は</span><span>&nbsp;</span><a href=\"https://developer.freee.co.jp/community/forum/community\" class=\"external-link\" rel=\"nofollow\">Community</a><span>&nbsp;で質問してみましょう</span></li></ul> </ol> <p>アプリケーションの登録方法や認証方法、またはAPIの活用方法でご不明な点がある場合は<a href=\"https://support.freee.co.jp/hc/ja/sections/115000030743\">ヘルプセンター</a>もご確認ください</p> <hr /> <h2 id=\"_2\">仕様</h2>  <h3 id=\"api\">APIエンドポイント</h3>  <p>https://api.freee.co.jp/ (httpsのみ)</p>  <h3 id=\"_3\">認証方式</h3>  <p><a href=\"http://tools.ietf.org/html/rfc6749\">OAuth2</a>に対応</p>  <ul> <li>Authorization Code Flow (Webアプリ向け)</li>  <li>Implicit Flow (Mobileアプリ向け)</li> </ul>  <h3 id=\"_4\">認証エンドポイント</h3>  <p>https://accounts.secure.freee.co.jp/</p>  <ul> <li>authorize : https://accounts.secure.freee.co.jp/public_api/authorize</li>  <li>token : https://accounts.secure.freee.co.jp/public_api/token</li> </ul>  <h3 id=\"_5\">アクセストークンのリフレッシュ</h3>  <p>認証時に得たrefresh_token を使ってtoken の期限をリフレッシュして新規に発行することが出来ます。</p>  <p>grant_type=refresh_token で https://accounts.secure.freee.co.jp/public_api/token にアクセスすればリフレッシュされます。</p>  <p>e.g.)</p>  <p>POST: https://accounts.secure.freee.co.jp/public_api/token</p>  <p>params: grant_type=refresh_token&amp;client_id=UID&amp;client_secret=SECRET&amp;refresh_token=REFRESH_TOKEN</p>  <p>詳細は<a href=\"https://github.com/applicake/doorkeeper/wiki/Enable-Refresh-Token-Credentials#flow\">refresh_token</a>を参照下さい。</p>  <h3 id=\"_6\">アクセストークンの破棄</h3>  <p>認証時に得たaccess_tokenまたはrefresh_tokenを使って、tokenを破棄することができます。 token=access_tokenまたはtoken=refresh_tokenでhttps://accounts.secure.freee.co.jp/public_api/revokeにアクセスすると破棄されます。token_type_hintでaccess_tokenまたはrefresh_tokenを陽に指定できます。</p>  <p>e.g.)</p>  <p>POST: https://accounts.secure.freee.co.jp/public_api/revoke</p>  <p>params: token=ACCESS_TOKEN</p>  <p>または</p>  <p>params: token=REFRESH_TOKEN</p>  <p>または</p>  <p>params: token=ACCESS_TOKEN&amp;token_type_hint=access_token</p>  <p>または</p>  <p>params: token=REFRESH_TOKEN&amp;token_type_hint=refresh_token</p>  <p>詳細は <a href=\"https://tools.ietf.org/html/rfc7009\">OAuth 2.0 Token revocation</a> をご参照ください。</p>  <h3 id=\"_7\">データフォーマット</h3>  <p>リクエスト、レスポンスともにJSON形式をサポート</p>  <h3 id=\"_8\">共通レスポンスヘッダー</h3>  <p>すべてのAPIのレスポンスには以下のHTTPヘッダーが含まれます。</p>  <ul> <li> <p>X-Freee-Request-ID</p> <ul> <li>各リクエスト毎に発行されるID</li> </ul> </li> </ul>  <h3 id=\"_9\">共通エラーレスポンス</h3>  <ul> <li> <p>ステータスコードはレスポンス内のJSONに含まれる他、HTTPヘッダにも含まれる</p> </li>  <li> <p>type</p>  <ul> <li>status : HTTPステータスコードの説明</li>  <li>validation : エラーの詳細の説明（開発者向け）</li> </ul> </li> </ul>  <p>レスポンスの例</p>  <pre><code>  {     &quot;status_code&quot; : 400,     &quot;errors&quot; : [       {         &quot;type&quot; : &quot;status&quot;,         &quot;messages&quot; : [&quot;不正なリクエストです。&quot;]       },       {         &quot;type&quot; : &quot;validation&quot;,         &quot;messages&quot; : [&quot;Date は不正な日付フォーマットです。入力例：2013-01-01&quot;]       }     ]   }</code></pre> <hr /> <h2 id=\"_10\">連絡先</h2>  <p>ご不明点、ご要望等は <a href=\"https://support.freee.co.jp/hc/ja/requests/new\">freee サポートデスクへのお問い合わせフォーム</a> からご連絡ください。</p> <hr />&copy; Since 2013 freee K.K.
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
import jp.co.freee.accounting.models.CreateDealParamsDetails;
import jp.co.freee.accounting.models.CreateDealParamsPayments;

/**
 * CreateDealParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class CreateDealParams {
  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  /**
   * 収支区分 (収入: income, 支出: expense)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INCOME("income"),
    
    EXPENSE("expense");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private String dueDate;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_PARTNER_CODE = "partner_code";
  @SerializedName(SERIALIZED_NAME_PARTNER_CODE)
  private String partnerCode;

  public static final String SERIALIZED_NAME_REF_NUMBER = "ref_number";
  @SerializedName(SERIALIZED_NAME_REF_NUMBER)
  private String refNumber;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<CreateDealParamsDetails> details = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private List<CreateDealParamsPayments> payments = null;

  public static final String SERIALIZED_NAME_RECEIPT_IDS = "receipt_ids";
  @SerializedName(SERIALIZED_NAME_RECEIPT_IDS)
  private List<Integer> receiptIds = null;


  public CreateDealParams issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * 発生日 (yyyy-mm-dd)
   * @return issueDate
  **/
  @ApiModelProperty(example = "2013-01-01", required = true, value = "発生日 (yyyy-mm-dd)")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public CreateDealParams type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * 収支区分 (収入: income, 支出: expense)
   * @return type
  **/
  @ApiModelProperty(example = "income", required = true, value = "収支区分 (収入: income, 支出: expense)")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateDealParams companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 事業所ID
   * minimum: 1
   * maximum: 999999999999
   * @return companyId
  **/
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public CreateDealParams dueDate(String dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * 支払期日(yyyy-mm-dd)
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-12-31", value = "支払期日(yyyy-mm-dd)")

  public String getDueDate() {
    return dueDate;
  }


  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  public CreateDealParams partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 取引先ID
   * minimum: 1
   * maximum: 999999999999
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "取引先ID")

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }


  public CreateDealParams partnerCode(String partnerCode) {
    
    this.partnerCode = partnerCode;
    return this;
  }

   /**
   * 取引先コード
   * @return partnerCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "code001", value = "取引先コード")

  public String getPartnerCode() {
    return partnerCode;
  }


  public void setPartnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
  }


  public CreateDealParams refNumber(String refNumber) {
    
    this.refNumber = refNumber;
    return this;
  }

   /**
   * 管理番号
   * @return refNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "管理番号")

  public String getRefNumber() {
    return refNumber;
  }


  public void setRefNumber(String refNumber) {
    this.refNumber = refNumber;
  }


  public CreateDealParams details(List<CreateDealParamsDetails> details) {
    
    this.details = details;
    return this;
  }

  public CreateDealParams addDetailsItem(CreateDealParamsDetails detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CreateDealParamsDetails> getDetails() {
    return details;
  }


  public void setDetails(List<CreateDealParamsDetails> details) {
    this.details = details;
  }


  public CreateDealParams payments(List<CreateDealParamsPayments> payments) {
    
    this.payments = payments;
    return this;
  }

  public CreateDealParams addPaymentsItem(CreateDealParamsPayments paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * 支払行一覧（配列）：未指定の場合、未決済の取引を作成します。
   * @return payments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支払行一覧（配列）：未指定の場合、未決済の取引を作成します。")

  public List<CreateDealParamsPayments> getPayments() {
    return payments;
  }


  public void setPayments(List<CreateDealParamsPayments> payments) {
    this.payments = payments;
  }


  public CreateDealParams receiptIds(List<Integer> receiptIds) {
    
    this.receiptIds = receiptIds;
    return this;
  }

  public CreateDealParams addReceiptIdsItem(Integer receiptIdsItem) {
    if (this.receiptIds == null) {
      this.receiptIds = new ArrayList<>();
    }
    this.receiptIds.add(receiptIdsItem);
    return this;
  }

   /**
   * 証憑ファイルID（配列）
   * @return receiptIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "証憑ファイルID（配列）")

  public List<Integer> getReceiptIds() {
    return receiptIds;
  }


  public void setReceiptIds(List<Integer> receiptIds) {
    this.receiptIds = receiptIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDealParams createDealParams = (CreateDealParams) o;
    return Objects.equals(this.issueDate, createDealParams.issueDate) &&
        Objects.equals(this.type, createDealParams.type) &&
        Objects.equals(this.companyId, createDealParams.companyId) &&
        Objects.equals(this.dueDate, createDealParams.dueDate) &&
        Objects.equals(this.partnerId, createDealParams.partnerId) &&
        Objects.equals(this.partnerCode, createDealParams.partnerCode) &&
        Objects.equals(this.refNumber, createDealParams.refNumber) &&
        Objects.equals(this.details, createDealParams.details) &&
        Objects.equals(this.payments, createDealParams.payments) &&
        Objects.equals(this.receiptIds, createDealParams.receiptIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueDate, type, companyId, dueDate, partnerId, partnerCode, refNumber, details, payments, receiptIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDealParams {\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    receiptIds: ").append(toIndentedString(receiptIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
