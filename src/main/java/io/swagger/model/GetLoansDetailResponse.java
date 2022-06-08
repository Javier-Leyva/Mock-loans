package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GetLoanDetailResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about a loan
 */
@ApiModel(description = "Data structure containing information about a loan")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-06T09:29:52.657Z")


public class GetLoansDetailResponse   {
  @JsonProperty("loans")
  @Valid
  private List<GetLoanDetailResponse> loans = null;

  public GetLoansDetailResponse loans(List<GetLoanDetailResponse> loans) {
    this.loans = loans;
    return this;
  }

  public GetLoansDetailResponse addLoansItem(GetLoanDetailResponse loansItem) {
    if (this.loans == null) {
      this.loans = new ArrayList<GetLoanDetailResponse>();
    }
    this.loans.add(loansItem);
    return this;
  }

  /**
   * Get loans
   * @return loans
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GetLoanDetailResponse> getLoans() {
    return loans;
  }

  public void setLoans(List<GetLoanDetailResponse> loans) {
    this.loans = loans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansDetailResponse getLoansDetailResponse = (GetLoansDetailResponse) o;
    return Objects.equals(this.loans, getLoansDetailResponse.loans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansDetailResponse {\n");
    
    sb.append("    loans: ").append(toIndentedString(loans)).append("\n");
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

