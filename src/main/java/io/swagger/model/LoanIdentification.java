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
 * Data structure containing identification information for a loan
 */
@ApiModel(description = "Data structure containing identification information for a loan")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-06T09:29:52.657Z")


public class LoanIdentification   {
  @JsonProperty("displayNumber")
  private String displayNumber = null;

  public LoanIdentification displayNumber(String displayNumber) {
    this.displayNumber = displayNumber;
    return this;
  }

  /**
   * Displayed loan number
   * @return displayNumber
  **/
  @ApiModelProperty(example = "2231231124124", value = "Displayed loan number")


  public String getDisplayNumber() {
    return displayNumber;
  }

  public void setDisplayNumber(String displayNumber) {
    this.displayNumber = displayNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanIdentification loanIdentification = (LoanIdentification) o;
    return Objects.equals(this.displayNumber, loanIdentification.displayNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanIdentification {\n");
    
    sb.append("    displayNumber: ").append(toIndentedString(displayNumber)).append("\n");
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

