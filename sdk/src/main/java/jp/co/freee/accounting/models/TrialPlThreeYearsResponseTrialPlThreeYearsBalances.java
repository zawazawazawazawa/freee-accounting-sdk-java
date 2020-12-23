/*
 * freee API
 *  <h1 id=\"freee_api\">freee API</h1> <hr /> <h2 id=\"start_guide\">スタートガイド</h2>  <p>freee API開発がはじめての方は<a href=\"https://developer.freee.co.jp/getting-started\">freee API スタートガイド</a>を参照してください。</p>  <hr /> <h2 id=\"specification\">仕様</h2>  <pre><code>【重要】会計freee APIの新バージョンについて 2020年12月まで、2つのバージョンが利用できる状態です。古いものは2020年12月に利用不可となります。<br> 新しいAPIを利用するにはリクエストヘッダーに以下を指定します。 X-Api-Version: 2020-06-15<br> 指定がない場合は2020年12月に廃止予定のAPIを利用することとなります。<br> 【重要】APIのバージョン指定をせずに利用し続ける場合 2020年12月に新しいバージョンのAPIに自動的に切り替わります。 詳細は、<a href=\"https://developer.freee.co.jp/release-note/2948\" target=\"_blank\">リリースノート</a>をご覧ください。<br> 旧バージョンのAPIリファレンスを確認したい場合は、<a href=\"https://freee.github.io/freee-api-schema/\" target=\"_blank\">旧バージョンのAPIリファレンスページ</a>をご覧ください。 </code></pre>  <h3 id=\"api_endpoint\">APIエンドポイント</h3>  <p>https://api.freee.co.jp/ (httpsのみ)</p>  <h3 id=\"about_authorize\">認証について</h3> <p>OAuth2.0を利用します。詳細は<a href=\"https://developer.freee.co.jp/docs\" target=\"_blank\">ドキュメントの認証</a>パートを参照してください。</p>  <h3 id=\"data_format\">データフォーマット</h3>  <p>リクエスト、レスポンスともにJSON形式をサポートしていますが、詳細は、API毎の説明欄（application/jsonなど）を確認してください。</p>  <h3 id=\"compatibility\">後方互換性ありの変更</h3>  <p>freeeでは、APIを改善していくために以下のような変更は後方互換性ありとして通知なく変更を入れることがあります。アプリケーション実装者は以下を踏まえて開発を行ってください。</p>  <ul> <li>新しいAPIリソース・エンドポイントの追加</li> <li>既存のAPIに対して必須ではない新しいリクエストパラメータの追加</li> <li>既存のAPIレスポンスに対する新しいプロパティの追加</li> <li>既存のAPIレスポンスに対するプロパティの順番の入れ変え</li> <li>keyとなっているidやcodeの長さの変更（長くする）</li> </ul>  <h3 id=\"common_response_header\">共通レスポンスヘッダー</h3>  <p>すべてのAPIのレスポンスには以下のHTTPヘッダーが含まれます。</p>  <ul> <li> <p>X-Freee-Request-ID</p> <ul> <li>各リクエスト毎に発行されるID</li> </ul> </li> </ul>  <h3 id=\"common_error_response\">共通エラーレスポンス</h3>  <ul> <li> <p>ステータスコードはレスポンス内のJSONに含まれる他、HTTPヘッダにも含まれる</p> </li> <li> <p>一部のエラーレスポンスにはエラーコードが含まれます。<br>詳細は、<a href=\"https://developer.freee.co.jp/tips/faq/40x-checkpoint\">HTTPステータスコード400台エラー時のチェックポイント</a>を参照してください</p> </li> <p>type</p>  <ul> <li>status : HTTPステータスコードの説明</li>  <li>validation : エラーの詳細の説明（開発者向け）</li> </ul> </li> </ul>  <p>レスポンスの例</p>  <pre><code>  {     &quot;status_code&quot; : 400,     &quot;errors&quot; : [       {         &quot;type&quot; : &quot;status&quot;,         &quot;messages&quot; : [&quot;不正なリクエストです。&quot;]       },       {         &quot;type&quot; : &quot;validation&quot;,         &quot;messages&quot; : [&quot;Date は不正な日付フォーマットです。入力例：2013-01-01&quot;]       }     ]   }</code></pre>  </br>  <h3 id=\"api_rate_limit\">API使用制限</h3>    <p>freeeは一定期間に過度のアクセスを検知した場合、APIアクセスをコントロールする場合があります。</p>   <p>その際のhttp status codeは403となります。制限がかかってから10分程度が過ぎると再度使用することができるようになります。</p>  <h4 id=\"reports_api_endpoint\">/reportsエンドポイント</h4>  <p>freeeは/reportsエンドポイントに対して1秒間に10以上のアクセスを検知した場合、APIアクセスをコントロールする場合があります。その際のhttp status codeは429（too many requests）となります。</p>  <p>レスポンスボディのmetaプロパティに以下を含めます。</p>  <ul>   <li>設定されている上限値</li>   <li>上限に達するまでの使用可能回数</li>   <li>（上限値に達した場合）使用回数がリセットされる時刻</li> </ul>  <h3 id=\"plan_api_rate_limit\">プラン別のAPI Rate Limit</h3>   <table border=\"1\">     <tbody>       <tr>         <th style=\"padding: 10px\"><strong>会計freeeプラン名</strong></th>         <th style=\"padding: 10px\"><strong>事業所とアプリケーション毎に1日でのAPIコール数</strong></th>       </tr>       <tr>         <td style=\"padding: 10px\">エンタープライズ</td>         <td style=\"padding: 10px\">10,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">プロフェッショナル</td>         <td style=\"padding: 10px\">5,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">ベーシック</td>         <td style=\"padding: 10px\">3,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">ミニマム</td>         <td style=\"padding: 10px\">3,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">上記以外</td>         <td style=\"padding: 10px\">3,000</td>       </tr>     </tbody>   </table>  <h3 id=\"webhook\">Webhookについて</h3>  <p>詳細は<a href=\"https://developer.freee.co.jp/docs/accounting/webhook\" target=\"_blank\">会計Webhook概要</a>を参照してください。</p>  <hr /> <h2 id=\"contact\">連絡先</h2>  <p>ご不明点、ご要望等は <a href=\"https://support.freee.co.jp/hc/ja/requests/new\">freee サポートデスクへのお問い合わせフォーム</a> からご連絡ください。</p> <hr />&copy; Since 2013 freee K.K.
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
import jp.co.freee.accounting.models.TrialBsThreeYearsResponseTrialBsThreeYearsItems;
import jp.co.freee.accounting.models.TrialBsThreeYearsResponseTrialBsThreeYearsPartners;
import jp.co.freee.accounting.models.TrialPlThreeYearsResponseTrialPlThreeYearsSections;

/**
 * TrialPlThreeYearsResponseTrialPlThreeYearsBalances
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialPlThreeYearsResponseTrialPlThreeYearsBalances {
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

  public static final String SERIALIZED_NAME_HIERARCHY_LEVEL = "hierarchy_level";
  @SerializedName(SERIALIZED_NAME_HIERARCHY_LEVEL)
  private Integer hierarchyLevel;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<TrialBsThreeYearsResponseTrialBsThreeYearsItems> items = null;

  public static final String SERIALIZED_NAME_LAST_YEAR_CLOSING_BALANCE = "last_year_closing_balance";
  @SerializedName(SERIALIZED_NAME_LAST_YEAR_CLOSING_BALANCE)
  private Integer lastYearClosingBalance;

  public static final String SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_NAME = "parent_account_category_name";
  @SerializedName(SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_NAME)
  private String parentAccountCategoryName;

  public static final String SERIALIZED_NAME_PARTNERS = "partners";
  @SerializedName(SERIALIZED_NAME_PARTNERS)
  private List<TrialBsThreeYearsResponseTrialBsThreeYearsPartners> partners = null;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<TrialPlThreeYearsResponseTrialPlThreeYearsSections> sections = null;

  public static final String SERIALIZED_NAME_TOTAL_LINE = "total_line";
  @SerializedName(SERIALIZED_NAME_TOTAL_LINE)
  private Boolean totalLine;

  public static final String SERIALIZED_NAME_TWO_YEARS_BEFORE_CLOSING_BALANCE = "two_years_before_closing_balance";
  @SerializedName(SERIALIZED_NAME_TWO_YEARS_BEFORE_CLOSING_BALANCE)
  private Integer twoYearsBeforeClosingBalance;

  public static final String SERIALIZED_NAME_YEAR_ON_YEAR = "year_on_year";
  @SerializedName(SERIALIZED_NAME_YEAR_ON_YEAR)
  private BigDecimal yearOnYear;


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances accountCategoryName(String accountCategoryName) {
    
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


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances accountGroupName(String accountGroupName) {
    
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


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances accountItemId(Integer accountItemId) {
    
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


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances accountItemName(String accountItemName) {
    
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


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances closingBalance(Integer closingBalance) {
    
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


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances hierarchyLevel(Integer hierarchyLevel) {
    
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


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances items(List<TrialBsThreeYearsResponseTrialBsThreeYearsItems> items) {
    
    this.items = items;
    return this;
  }

  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances addItemsItem(TrialBsThreeYearsResponseTrialBsThreeYearsItems itemsItem) {
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

  public List<TrialBsThreeYearsResponseTrialBsThreeYearsItems> getItems() {
    return items;
  }


  public void setItems(List<TrialBsThreeYearsResponseTrialBsThreeYearsItems> items) {
    this.items = items;
  }


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances lastYearClosingBalance(Integer lastYearClosingBalance) {
    
    this.lastYearClosingBalance = lastYearClosingBalance;
    return this;
  }

   /**
   * 前年度期末残高
   * @return lastYearClosingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "前年度期末残高")

  public Integer getLastYearClosingBalance() {
    return lastYearClosingBalance;
  }


  public void setLastYearClosingBalance(Integer lastYearClosingBalance) {
    this.lastYearClosingBalance = lastYearClosingBalance;
  }


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances parentAccountCategoryName(String parentAccountCategoryName) {
    
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


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances partners(List<TrialBsThreeYearsResponseTrialBsThreeYearsPartners> partners) {
    
    this.partners = partners;
    return this;
  }

  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances addPartnersItem(TrialBsThreeYearsResponseTrialBsThreeYearsPartners partnersItem) {
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

  public List<TrialBsThreeYearsResponseTrialBsThreeYearsPartners> getPartners() {
    return partners;
  }


  public void setPartners(List<TrialBsThreeYearsResponseTrialBsThreeYearsPartners> partners) {
    this.partners = partners;
  }


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances sections(List<TrialPlThreeYearsResponseTrialPlThreeYearsSections> sections) {
    
    this.sections = sections;
    return this;
  }

  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances addSectionsItem(TrialPlThreeYearsResponseTrialPlThreeYearsSections sectionsItem) {
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

  public List<TrialPlThreeYearsResponseTrialPlThreeYearsSections> getSections() {
    return sections;
  }


  public void setSections(List<TrialPlThreeYearsResponseTrialPlThreeYearsSections> sections) {
    this.sections = sections;
  }


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances totalLine(Boolean totalLine) {
    
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


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances twoYearsBeforeClosingBalance(Integer twoYearsBeforeClosingBalance) {
    
    this.twoYearsBeforeClosingBalance = twoYearsBeforeClosingBalance;
    return this;
  }

   /**
   * 前々年度期末残高
   * @return twoYearsBeforeClosingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "前々年度期末残高")

  public Integer getTwoYearsBeforeClosingBalance() {
    return twoYearsBeforeClosingBalance;
  }


  public void setTwoYearsBeforeClosingBalance(Integer twoYearsBeforeClosingBalance) {
    this.twoYearsBeforeClosingBalance = twoYearsBeforeClosingBalance;
  }


  public TrialPlThreeYearsResponseTrialPlThreeYearsBalances yearOnYear(BigDecimal yearOnYear) {
    
    this.yearOnYear = yearOnYear;
    return this;
  }

   /**
   * 前年比
   * @return yearOnYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.12", value = "前年比")

  public BigDecimal getYearOnYear() {
    return yearOnYear;
  }


  public void setYearOnYear(BigDecimal yearOnYear) {
    this.yearOnYear = yearOnYear;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialPlThreeYearsResponseTrialPlThreeYearsBalances trialPlThreeYearsResponseTrialPlThreeYearsBalances = (TrialPlThreeYearsResponseTrialPlThreeYearsBalances) o;
    return Objects.equals(this.accountCategoryName, trialPlThreeYearsResponseTrialPlThreeYearsBalances.accountCategoryName) &&
        Objects.equals(this.accountGroupName, trialPlThreeYearsResponseTrialPlThreeYearsBalances.accountGroupName) &&
        Objects.equals(this.accountItemId, trialPlThreeYearsResponseTrialPlThreeYearsBalances.accountItemId) &&
        Objects.equals(this.accountItemName, trialPlThreeYearsResponseTrialPlThreeYearsBalances.accountItemName) &&
        Objects.equals(this.closingBalance, trialPlThreeYearsResponseTrialPlThreeYearsBalances.closingBalance) &&
        Objects.equals(this.hierarchyLevel, trialPlThreeYearsResponseTrialPlThreeYearsBalances.hierarchyLevel) &&
        Objects.equals(this.items, trialPlThreeYearsResponseTrialPlThreeYearsBalances.items) &&
        Objects.equals(this.lastYearClosingBalance, trialPlThreeYearsResponseTrialPlThreeYearsBalances.lastYearClosingBalance) &&
        Objects.equals(this.parentAccountCategoryName, trialPlThreeYearsResponseTrialPlThreeYearsBalances.parentAccountCategoryName) &&
        Objects.equals(this.partners, trialPlThreeYearsResponseTrialPlThreeYearsBalances.partners) &&
        Objects.equals(this.sections, trialPlThreeYearsResponseTrialPlThreeYearsBalances.sections) &&
        Objects.equals(this.totalLine, trialPlThreeYearsResponseTrialPlThreeYearsBalances.totalLine) &&
        Objects.equals(this.twoYearsBeforeClosingBalance, trialPlThreeYearsResponseTrialPlThreeYearsBalances.twoYearsBeforeClosingBalance) &&
        Objects.equals(this.yearOnYear, trialPlThreeYearsResponseTrialPlThreeYearsBalances.yearOnYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategoryName, accountGroupName, accountItemId, accountItemName, closingBalance, hierarchyLevel, items, lastYearClosingBalance, parentAccountCategoryName, partners, sections, totalLine, twoYearsBeforeClosingBalance, yearOnYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialPlThreeYearsResponseTrialPlThreeYearsBalances {\n");
    sb.append("    accountCategoryName: ").append(toIndentedString(accountCategoryName)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    accountItemName: ").append(toIndentedString(accountItemName)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    lastYearClosingBalance: ").append(toIndentedString(lastYearClosingBalance)).append("\n");
    sb.append("    parentAccountCategoryName: ").append(toIndentedString(parentAccountCategoryName)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    totalLine: ").append(toIndentedString(totalLine)).append("\n");
    sb.append("    twoYearsBeforeClosingBalance: ").append(toIndentedString(twoYearsBeforeClosingBalance)).append("\n");
    sb.append("    yearOnYear: ").append(toIndentedString(yearOnYear)).append("\n");
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

