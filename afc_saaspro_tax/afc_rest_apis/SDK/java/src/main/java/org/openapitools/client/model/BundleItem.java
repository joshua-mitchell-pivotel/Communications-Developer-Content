/*
 * SaasPro
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
 * Bundled items associated with a bundle package
 */
@ApiModel(description = "Bundled items associated with a bundle package")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-14T16:02:52.336-05:00[America/New_York]")
public class BundleItem {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "TransactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private Integer transactionId;

  public static final String SERIALIZED_NAME_SERVICE_ID = "ServiceId";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private Integer serviceId;

  public static final String SERIALIZED_NAME_PERCENTAGE = "Percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Double percentage;

  public static final String SERIALIZED_NAME_FIXED_AMOUNT = "FixedAmount";
  @SerializedName(SERIALIZED_NAME_FIXED_AMOUNT)
  private Double fixedAmount;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private Integer lines;

  public static final String SERIALIZED_NAME_MINUTES = "Minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  private Double minutes;

  public static final String SERIALIZED_NAME_TRANSACTION_DESC = "TransactionDesc";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DESC)
  private String transactionDesc;

  public static final String SERIALIZED_NAME_SERVICE_DESC = "ServiceDesc";
  @SerializedName(SERIALIZED_NAME_SERVICE_DESC)
  private String serviceDesc;


  public BundleItem transactionId(Integer transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Transaction id for item
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction id for item")

  public Integer getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }


  public BundleItem serviceId(Integer serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Service id for item
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service id for item")

  public Integer getServiceId() {
    return serviceId;
  }


  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }


  public BundleItem percentage(Double percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Percentage of package charge to be applied to item
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage of package charge to be applied to item")

  public Double getPercentage() {
    return percentage;
  }


  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }


  public BundleItem fixedAmount(Double fixedAmount) {
    
    this.fixedAmount = fixedAmount;
    return this;
  }

   /**
   * Fixed charge to be applied to item
   * @return fixedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fixed charge to be applied to item")

  public Double getFixedAmount() {
    return fixedAmount;
  }


  public void setFixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
  }


  public BundleItem lines(Integer lines) {
    
    this.lines = lines;
    return this;
  }

   /**
   * Fixed lines to be applied to item
   * @return lines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fixed lines to be applied to item")

  public Integer getLines() {
    return lines;
  }


  public void setLines(Integer lines) {
    this.lines = lines;
  }


  public BundleItem minutes(Double minutes) {
    
    this.minutes = minutes;
    return this;
  }

   /**
   * Fixed minutes to be applied to item
   * @return minutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fixed minutes to be applied to item")

  public Double getMinutes() {
    return minutes;
  }


  public void setMinutes(Double minutes) {
    this.minutes = minutes;
  }


  public BundleItem transactionDesc(String transactionDesc) {
    
    this.transactionDesc = transactionDesc;
    return this;
  }

   /**
   * Transaction id for item
   * @return transactionDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction id for item")

  public String getTransactionDesc() {
    return transactionDesc;
  }


  public void setTransactionDesc(String transactionDesc) {
    this.transactionDesc = transactionDesc;
  }


  public BundleItem serviceDesc(String serviceDesc) {
    
    this.serviceDesc = serviceDesc;
    return this;
  }

   /**
   * Service id for item
   * @return serviceDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service id for item")

  public String getServiceDesc() {
    return serviceDesc;
  }


  public void setServiceDesc(String serviceDesc) {
    this.serviceDesc = serviceDesc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleItem bundleItem = (BundleItem) o;
    return Objects.equals(this.transactionId, bundleItem.transactionId) &&
        Objects.equals(this.serviceId, bundleItem.serviceId) &&
        Objects.equals(this.percentage, bundleItem.percentage) &&
        Objects.equals(this.fixedAmount, bundleItem.fixedAmount) &&
        Objects.equals(this.lines, bundleItem.lines) &&
        Objects.equals(this.minutes, bundleItem.minutes) &&
        Objects.equals(this.transactionDesc, bundleItem.transactionDesc) &&
        Objects.equals(this.serviceDesc, bundleItem.serviceDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, serviceId, percentage, fixedAmount, lines, minutes, transactionDesc, serviceDesc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleItem {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    transactionDesc: ").append(toIndentedString(transactionDesc)).append("\n");
    sb.append("    serviceDesc: ").append(toIndentedString(serviceDesc)).append("\n");
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

