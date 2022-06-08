package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information for a global position.
 */
@ApiModel(description = "Data structure containing information for a global position.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-06T09:29:52.657Z")


public class ChannelAccessAgreementInformation   {
  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("isMainItem")
  private Boolean isMainItem = null;

  public ChannelAccessAgreementInformation alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Name (alias) that the customer has assigned to the item for easy identification. Only required for customer usability.
   * @return alias
  **/
  @ApiModelProperty(example = "My mortgage for the village house", value = "Name (alias) that the customer has assigned to the item for easy identification. Only required for customer usability.")


  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public ChannelAccessAgreementInformation isMainItem(Boolean isMainItem) {
    this.isMainItem = isMainItem;
    return this;
  }

  /**
   * Whether the item is the customer's main item. Applies only when the operation is used by a physical or business customer, not when used by Santander staff.  The possible values are: - true = Main item - false = Secondary item
   * @return isMainItem
  **/
  @ApiModelProperty(example = "true", value = "Whether the item is the customer's main item. Applies only when the operation is used by a physical or business customer, not when used by Santander staff.  The possible values are: - true = Main item - false = Secondary item")


  public Boolean isIsMainItem() {
    return isMainItem;
  }

  public void setIsMainItem(Boolean isMainItem) {
    this.isMainItem = isMainItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelAccessAgreementInformation channelAccessAgreementInformation = (ChannelAccessAgreementInformation) o;
    return Objects.equals(this.alias, channelAccessAgreementInformation.alias) &&
        Objects.equals(this.isMainItem, channelAccessAgreementInformation.isMainItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, isMainItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelAccessAgreementInformation {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    isMainItem: ").append(toIndentedString(isMainItem)).append("\n");
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

