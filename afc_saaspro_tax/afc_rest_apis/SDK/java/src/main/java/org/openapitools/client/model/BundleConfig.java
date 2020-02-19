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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BundleItem;

/**
 * Bundles associated with a client profile configuration  Maybe associated with 0 to many profiles
 */
@ApiModel(description = "Bundles associated with a client profile configuration  Maybe associated with 0 to many profiles")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-14T16:02:52.336-05:00[America/New_York]")
public class BundleConfig {
  public static final String SERIALIZED_NAME_BUNDLE_PACKAGE = "BundlePackage";
  @SerializedName(SERIALIZED_NAME_BUNDLE_PACKAGE)
  private Integer bundlePackage;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "BundleId";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private Integer bundleId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BUNDLE_ITEMS = "BundleItems";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ITEMS)
  private List<BundleItem> bundleItems = null;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public BundleConfig bundlePackage(Integer bundlePackage) {
    
    this.bundlePackage = bundlePackage;
    return this;
  }

   /**
   * Bundle Package - example:  20000
   * @return bundlePackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bundle Package - example:  20000")

  public Integer getBundlePackage() {
    return bundlePackage;
  }


  public void setBundlePackage(Integer bundlePackage) {
    this.bundlePackage = bundlePackage;
  }


  public BundleConfig bundleId(Integer bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * Bundle Id - example:  20001
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bundle Id - example:  20001")

  public Integer getBundleId() {
    return bundleId;
  }


  public void setBundleId(Integer bundleId) {
    this.bundleId = bundleId;
  }


  public BundleConfig description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Bundle Description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bundle Description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BundleConfig bundleItems(List<BundleItem> bundleItems) {
    
    this.bundleItems = bundleItems;
    return this;
  }

  public BundleConfig addBundleItemsItem(BundleItem bundleItemsItem) {
    if (this.bundleItems == null) {
      this.bundleItems = new ArrayList<BundleItem>();
    }
    this.bundleItems.add(bundleItemsItem);
    return this;
  }

   /**
   * Bundled items - percentage should add up to 100% (as applicable)
   * @return bundleItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bundled items - percentage should add up to 100% (as applicable)")

  public List<BundleItem> getBundleItems() {
    return bundleItems;
  }


  public void setBundleItems(List<BundleItem> bundleItems) {
    this.bundleItems = bundleItems;
  }


  public BundleConfig version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version for bundle - intended to allow changes to format   without having to perform expensive SQL updates on existing bundles
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version for bundle - intended to allow changes to format   without having to perform expensive SQL updates on existing bundles")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleConfig bundleConfig = (BundleConfig) o;
    return Objects.equals(this.bundlePackage, bundleConfig.bundlePackage) &&
        Objects.equals(this.bundleId, bundleConfig.bundleId) &&
        Objects.equals(this.description, bundleConfig.description) &&
        Objects.equals(this.bundleItems, bundleConfig.bundleItems) &&
        Objects.equals(this.version, bundleConfig.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundlePackage, bundleId, description, bundleItems, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleConfig {\n");
    sb.append("    bundlePackage: ").append(toIndentedString(bundlePackage)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bundleItems: ").append(toIndentedString(bundleItems)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

