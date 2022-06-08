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
 * Data structure containing information about different loan balances
 */
@ApiModel(description = "Data structure containing information about different loan balances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-06T09:29:52.657Z")


public class LoanBalances   {
  @JsonProperty("principal")
  private Object principal = null;

  public LoanBalances principal(Object principal) {
    this.principal = principal;
    return this;
  }

  /**
   * Data structure containing the principal balance. The principal balance is the remaining loan balance to be paid.
   * @return principal
  **/
  @ApiModelProperty(value = "Data structure containing the principal balance. The principal balance is the remaining loan balance to be paid.")


  public Object getPrincipal() {
    return principal;
  }

  public void setPrincipal(Object principal) {
    this.principal = principal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanBalances loanBalances = (LoanBalances) o;
    return Objects.equals(this.principal, loanBalances.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanBalances {\n");
    
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
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

