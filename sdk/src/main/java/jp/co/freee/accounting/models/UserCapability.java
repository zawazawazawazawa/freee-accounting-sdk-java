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
 * UserCapability
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserCapability {
  public static final String SERIALIZED_NAME_CREATE = "create";
  @SerializedName(SERIALIZED_NAME_CREATE)
  private Boolean create;

  public static final String SERIALIZED_NAME_DESTROY = "destroy";
  @SerializedName(SERIALIZED_NAME_DESTROY)
  private Boolean destroy;

  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  private Boolean update;

  public UserCapability() { 
  }

  public UserCapability create(Boolean create) {
    
    this.create = create;
    return this;
  }

   /**
   * 作成
   * @return create
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "作成")

  public Boolean getCreate() {
    return create;
  }


  public void setCreate(Boolean create) {
    this.create = create;
  }


  public UserCapability destroy(Boolean destroy) {
    
    this.destroy = destroy;
    return this;
  }

   /**
   * 削除
   * @return destroy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "削除")

  public Boolean getDestroy() {
    return destroy;
  }


  public void setDestroy(Boolean destroy) {
    this.destroy = destroy;
  }


  public UserCapability read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * 閲覧
   * @return read
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "閲覧")

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    this.read = read;
  }


  public UserCapability update(Boolean update) {
    
    this.update = update;
    return this;
  }

   /**
   * 更新
   * @return update
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "更新")

  public Boolean getUpdate() {
    return update;
  }


  public void setUpdate(Boolean update) {
    this.update = update;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCapability userCapability = (UserCapability) o;
    return Objects.equals(this.create, userCapability.create) &&
        Objects.equals(this.destroy, userCapability.destroy) &&
        Objects.equals(this.read, userCapability.read) &&
        Objects.equals(this.update, userCapability.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, destroy, read, update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCapability {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    destroy: ").append(toIndentedString(destroy)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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

