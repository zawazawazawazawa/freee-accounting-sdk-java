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

/**
 * InlineResponse20013Taxes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20013Taxes {
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


  public InlineResponse20013Taxes available(Boolean available) {
    
    this.available = available;
    return this;
  }

   /**
   * true: 使用する、false: 使用しない
   * @return available
  **/
  @ApiModelProperty(example = "true", required = true, value = "true: 使用する、false: 使用しない")

  public Boolean getAvailable() {
    return available;
  }


  public void setAvailable(Boolean available) {
    this.available = available;
  }


  public InlineResponse20013Taxes code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 税区分コード
   * minimum: 0
   * maximum: 2147483647
   * @return code
  **/
  @ApiModelProperty(example = "21", required = true, value = "税区分コード")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public InlineResponse20013Taxes displayCategory(DisplayCategoryEnum displayCategory) {
    
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


  public InlineResponse20013Taxes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 税区分名
   * @return name
  **/
  @ApiModelProperty(example = "sales_with_tax", required = true, value = "税区分名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse20013Taxes nameJa(String nameJa) {
    
    this.nameJa = nameJa;
    return this;
  }

   /**
   * 税区分名（日本語表示用）
   * @return nameJa
  **/
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
    InlineResponse20013Taxes inlineResponse20013Taxes = (InlineResponse20013Taxes) o;
    return Objects.equals(this.available, inlineResponse20013Taxes.available) &&
        Objects.equals(this.code, inlineResponse20013Taxes.code) &&
        Objects.equals(this.displayCategory, inlineResponse20013Taxes.displayCategory) &&
        Objects.equals(this.name, inlineResponse20013Taxes.name) &&
        Objects.equals(this.nameJa, inlineResponse20013Taxes.nameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, code, displayCategory, name, nameJa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013Taxes {\n");
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

