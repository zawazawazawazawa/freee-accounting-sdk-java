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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class User {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_FIRST_NAME_KANA = "first_name_kana";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME_KANA)
  private String firstNameKana;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_LAST_NAME_KANA = "last_name_kana";
  @SerializedName(SERIALIZED_NAME_LAST_NAME_KANA)
  private String lastNameKana;

  public User() { 
  }

  public User displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * 表示名
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "山田太郎", value = "表示名")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * メールアドレス
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "example@freee.co.jp", required = true, value = "メールアドレス")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public User firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * 氏名（名）
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "太郎", value = "氏名（名）")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public User firstNameKana(String firstNameKana) {
    
    this.firstNameKana = firstNameKana;
    return this;
  }

   /**
   * 氏名（カナ・名）
   * @return firstNameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "タロウ", value = "氏名（カナ・名）")

  public String getFirstNameKana() {
    return firstNameKana;
  }


  public void setFirstNameKana(String firstNameKana) {
    this.firstNameKana = firstNameKana;
  }


  public User id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * ユーザーID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "ユーザーID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public User lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * 氏名（姓）
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "山田", value = "氏名（姓）")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public User lastNameKana(String lastNameKana) {
    
    this.lastNameKana = lastNameKana;
    return this;
  }

   /**
   * 氏名（カナ・姓）
   * @return lastNameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ヤマダ", value = "氏名（カナ・姓）")

  public String getLastNameKana() {
    return lastNameKana;
  }


  public void setLastNameKana(String lastNameKana) {
    this.lastNameKana = lastNameKana;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.firstNameKana, user.firstNameKana) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.lastNameKana, user.lastNameKana);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, email, firstName, firstNameKana, id, lastName, lastNameKana);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    firstNameKana: ").append(toIndentedString(firstNameKana)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lastNameKana: ").append(toIndentedString(lastNameKana)).append("\n");
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

