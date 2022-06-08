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
 * Data structure containing file details
 */
@ApiModel(description = "Data structure containing file details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-06T09:29:52.657Z")


public class File   {
  @JsonProperty("fileId")
  private String fileId = null;

  @JsonProperty("instance")
  private String instance = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("typeDescription")
  private String typeDescription = null;

  @JsonProperty("referencelink")
  private String referencelink = null;

  public File fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * Unique file ID
   * @return fileId
  **/
  @ApiModelProperty(example = "2139j3ndfuiofnk23jkduiog", value = "Unique file ID")


  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public File instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Document storage location
   * @return instance
  **/
  @ApiModelProperty(example = "repository1", value = "Document storage location")


  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  public File typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Document type code
   * @return typeCode
  **/
  @ApiModelProperty(example = "Santdr-eDoc", value = "Document type code")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public File typeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
    return this;
  }

  /**
   * Description of the document type
   * @return typeDescription
  **/
  @ApiModelProperty(example = "SCC_COMUNICADOS", value = "Description of the document type")


  public String getTypeDescription() {
    return typeDescription;
  }

  public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
  }

  public File referencelink(String referencelink) {
    this.referencelink = referencelink;
    return this;
  }

  /**
   * Reference link
   * @return referencelink
  **/
  @ApiModelProperty(example = "/documents/2139j3ndfuiofnk23jkduiog?repository_id=repositorio1&document_type=SCC_COMUNICADOS", value = "Reference link")


  public String getReferencelink() {
    return referencelink;
  }

  public void setReferencelink(String referencelink) {
    this.referencelink = referencelink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    File file = (File) o;
    return Objects.equals(this.fileId, file.fileId) &&
        Objects.equals(this.instance, file.instance) &&
        Objects.equals(this.typeCode, file.typeCode) &&
        Objects.equals(this.typeDescription, file.typeDescription) &&
        Objects.equals(this.referencelink, file.referencelink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, instance, typeCode, typeDescription, referencelink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class File {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
    sb.append("    referencelink: ").append(toIndentedString(referencelink)).append("\n");
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

