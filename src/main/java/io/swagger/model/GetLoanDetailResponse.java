package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Account;
import io.swagger.model.ChannelAccessAgreementInformation;
import io.swagger.model.LoanBalances;
import io.swagger.model.LoanIdentification;
import io.swagger.model.StatusInfo;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about a loan
 */
@ApiModel(description = "Data structure containing information about a loan")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-06T09:29:52.657Z")


public class GetLoanDetailResponse   {
  @JsonProperty("loanIdentification")
  private LoanIdentification loanIdentification = null;

  @JsonProperty("loanId")
  private String loanId = null;

  @JsonProperty("channelAccessAgreementInformation")
  private ChannelAccessAgreementInformation channelAccessAgreementInformation = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("typeDescription")
  private String typeDescription = null;

  @JsonProperty("conditions")
  private Object conditions = null;

  @JsonProperty("openingDate")
  private LocalDate openingDate = null;

  @JsonProperty("maturityDate")
  private LocalDate maturityDate = null;

  @JsonProperty("coolingPeriodIndicator")
  private Boolean coolingPeriodIndicator = null;

  @JsonProperty("statusInfo")
  private StatusInfo statusInfo = null;

  @JsonProperty("isRevocable")
  private Boolean isRevocable = null;

  @JsonProperty("numberOfPendingPayments")
  private String numberOfPendingPayments = null;

  @JsonProperty("paymentsPeriodicity")
  private Object paymentsPeriodicity = null;

  @JsonProperty("contract")
  private Object contract = null;

  @JsonProperty("balances")
  private LoanBalances balances = null;

  @JsonProperty("associatedAccount")
  private Account associatedAccount = null;

  public GetLoanDetailResponse loanIdentification(LoanIdentification loanIdentification) {
    this.loanIdentification = loanIdentification;
    return this;
  }

  /**
   * Get loanIdentification
   * @return loanIdentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LoanIdentification getLoanIdentification() {
    return loanIdentification;
  }

  public void setLoanIdentification(LoanIdentification loanIdentification) {
    this.loanIdentification = loanIdentification;
  }

  public GetLoanDetailResponse loanId(String loanId) {
    this.loanId = loanId;
    return this;
  }

  /**
   * Unique loan ID
   * @return loanId
  **/
  @ApiModelProperty(example = "2231231124124", value = "Unique loan ID")


  public String getLoanId() {
    return loanId;
  }

  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }

  public GetLoanDetailResponse channelAccessAgreementInformation(ChannelAccessAgreementInformation channelAccessAgreementInformation) {
    this.channelAccessAgreementInformation = channelAccessAgreementInformation;
    return this;
  }

  /**
   * Get channelAccessAgreementInformation
   * @return channelAccessAgreementInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ChannelAccessAgreementInformation getChannelAccessAgreementInformation() {
    return channelAccessAgreementInformation;
  }

  public void setChannelAccessAgreementInformation(ChannelAccessAgreementInformation channelAccessAgreementInformation) {
    this.channelAccessAgreementInformation = channelAccessAgreementInformation;
  }

  public GetLoanDetailResponse typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Loan type code
   * @return typeCode
  **/
  @ApiModelProperty(example = "M", value = "Loan type code")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public GetLoanDetailResponse typeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
    return this;
  }

  /**
   * Loan type description
   * @return typeDescription
  **/
  @ApiModelProperty(example = "mortgage", value = "Loan type description")


  public String getTypeDescription() {
    return typeDescription;
  }

  public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
  }

  public GetLoanDetailResponse conditions(Object conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Data structure containing information about the loan conditions
   * @return conditions
  **/
  @ApiModelProperty(value = "Data structure containing information about the loan conditions")


  public Object getConditions() {
    return conditions;
  }

  public void setConditions(Object conditions) {
    this.conditions = conditions;
  }

  public GetLoanDetailResponse openingDate(LocalDate openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  /**
   * Date when the proceeds for the loan were initially disbursed.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)
   * @return openingDate
  **/
  @ApiModelProperty(example = "2017-01-21", value = "Date when the proceeds for the loan were initially disbursed.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)")

  @Valid

  public LocalDate getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(LocalDate openingDate) {
    this.openingDate = openingDate;
  }

  public GetLoanDetailResponse maturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Date when the borrower's final loan payment is due.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)
   * @return maturityDate
  **/
  @ApiModelProperty(example = "2030-12-31", value = "Date when the borrower's final loan payment is due.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)")

  @Valid

  public LocalDate getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }

  public GetLoanDetailResponse coolingPeriodIndicator(Boolean coolingPeriodIndicator) {
    this.coolingPeriodIndicator = coolingPeriodIndicator;
    return this;
  }

  /**
   * Whether the borrower has the right to cancel the loan agreement
   * @return coolingPeriodIndicator
  **/
  @ApiModelProperty(example = "true", value = "Whether the borrower has the right to cancel the loan agreement")


  public Boolean isCoolingPeriodIndicator() {
    return coolingPeriodIndicator;
  }

  public void setCoolingPeriodIndicator(Boolean coolingPeriodIndicator) {
    this.coolingPeriodIndicator = coolingPeriodIndicator;
  }

  public GetLoanDetailResponse statusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
    return this;
  }

  /**
   * Get statusInfo
   * @return statusInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatusInfo getStatusInfo() {
    return statusInfo;
  }

  public void setStatusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
  }

  public GetLoanDetailResponse isRevocable(Boolean isRevocable) {
    this.isRevocable = isRevocable;
    return this;
  }

  /**
   * Whether the loan is revocable
   * @return isRevocable
  **/
  @ApiModelProperty(example = "false", value = "Whether the loan is revocable")


  public Boolean isIsRevocable() {
    return isRevocable;
  }

  public void setIsRevocable(Boolean isRevocable) {
    this.isRevocable = isRevocable;
  }

  public GetLoanDetailResponse numberOfPendingPayments(String numberOfPendingPayments) {
    this.numberOfPendingPayments = numberOfPendingPayments;
    return this;
  }

  /**
   * Number of pending loan instalments
   * @return numberOfPendingPayments
  **/
  @ApiModelProperty(example = "213", value = "Number of pending loan instalments")


  public String getNumberOfPendingPayments() {
    return numberOfPendingPayments;
  }

  public void setNumberOfPendingPayments(String numberOfPendingPayments) {
    this.numberOfPendingPayments = numberOfPendingPayments;
  }

  public GetLoanDetailResponse paymentsPeriodicity(Object paymentsPeriodicity) {
    this.paymentsPeriodicity = paymentsPeriodicity;
    return this;
  }

  /**
   * Data structure containing information about a periodicity. A periodicity is expressed as a time unit and a frequency of execution.
   * @return paymentsPeriodicity
  **/
  @ApiModelProperty(value = "Data structure containing information about a periodicity. A periodicity is expressed as a time unit and a frequency of execution.")


  public Object getPaymentsPeriodicity() {
    return paymentsPeriodicity;
  }

  public void setPaymentsPeriodicity(Object paymentsPeriodicity) {
    this.paymentsPeriodicity = paymentsPeriodicity;
  }

  public GetLoanDetailResponse contract(Object contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Data structure containing contract information
   * @return contract
  **/
  @ApiModelProperty(value = "Data structure containing contract information")


  public Object getContract() {
    return contract;
  }

  public void setContract(Object contract) {
    this.contract = contract;
  }

  public GetLoanDetailResponse balances(LoanBalances balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LoanBalances getBalances() {
    return balances;
  }

  public void setBalances(LoanBalances balances) {
    this.balances = balances;
  }

  public GetLoanDetailResponse associatedAccount(Account associatedAccount) {
    this.associatedAccount = associatedAccount;
    return this;
  }

  /**
   * Get associatedAccount
   * @return associatedAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Account getAssociatedAccount() {
    return associatedAccount;
  }

  public void setAssociatedAccount(Account associatedAccount) {
    this.associatedAccount = associatedAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoanDetailResponse getLoanDetailResponse = (GetLoanDetailResponse) o;
    return Objects.equals(this.loanIdentification, getLoanDetailResponse.loanIdentification) &&
        Objects.equals(this.loanId, getLoanDetailResponse.loanId) &&
        Objects.equals(this.channelAccessAgreementInformation, getLoanDetailResponse.channelAccessAgreementInformation) &&
        Objects.equals(this.typeCode, getLoanDetailResponse.typeCode) &&
        Objects.equals(this.typeDescription, getLoanDetailResponse.typeDescription) &&
        Objects.equals(this.conditions, getLoanDetailResponse.conditions) &&
        Objects.equals(this.openingDate, getLoanDetailResponse.openingDate) &&
        Objects.equals(this.maturityDate, getLoanDetailResponse.maturityDate) &&
        Objects.equals(this.coolingPeriodIndicator, getLoanDetailResponse.coolingPeriodIndicator) &&
        Objects.equals(this.statusInfo, getLoanDetailResponse.statusInfo) &&
        Objects.equals(this.isRevocable, getLoanDetailResponse.isRevocable) &&
        Objects.equals(this.numberOfPendingPayments, getLoanDetailResponse.numberOfPendingPayments) &&
        Objects.equals(this.paymentsPeriodicity, getLoanDetailResponse.paymentsPeriodicity) &&
        Objects.equals(this.contract, getLoanDetailResponse.contract) &&
        Objects.equals(this.balances, getLoanDetailResponse.balances) &&
        Objects.equals(this.associatedAccount, getLoanDetailResponse.associatedAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanIdentification, loanId, channelAccessAgreementInformation, typeCode, typeDescription, conditions, openingDate, maturityDate, coolingPeriodIndicator, statusInfo, isRevocable, numberOfPendingPayments, paymentsPeriodicity, contract, balances, associatedAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoanDetailResponse {\n");
    
    sb.append("    loanIdentification: ").append(toIndentedString(loanIdentification)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    channelAccessAgreementInformation: ").append(toIndentedString(channelAccessAgreementInformation)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    coolingPeriodIndicator: ").append(toIndentedString(coolingPeriodIndicator)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    isRevocable: ").append(toIndentedString(isRevocable)).append("\n");
    sb.append("    numberOfPendingPayments: ").append(toIndentedString(numberOfPendingPayments)).append("\n");
    sb.append("    paymentsPeriodicity: ").append(toIndentedString(paymentsPeriodicity)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    associatedAccount: ").append(toIndentedString(associatedAccount)).append("\n");
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

