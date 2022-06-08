package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing account information
 */
@ApiModel(description = "Data structure containing account information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-06T09:29:52.657Z")


public class Account   {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("bankId")
  private String bankId = null;

  /**
   * Format used for the account number
   */
  public enum AccountIdTypeEnum {
    INT("INT"),
    
    IBAN("IBAN"),
    
    BBAN("BBAN"),
    
    TXT("TXT");

    private String value;

    AccountIdTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountIdTypeEnum fromValue(String text) {
      for (AccountIdTypeEnum b : AccountIdTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("accountIdType")
  private AccountIdTypeEnum accountIdType = null;

  @JsonProperty("accountIdentification")
  private Object accountIdentification = null;

  @JsonProperty("accountDetailsLink")
  private String accountDetailsLink = null;

  @JsonProperty("openingDate")
  private LocalDate openingDate = null;

  @JsonProperty("closingDate")
  private LocalDate closingDate = null;

  public Account accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Account number.  The value uses the format defined in 'accountIdType'.
   * @return accountId
  **/
  @ApiModelProperty(example = "21000418401234567891", value = "Account number.  The value uses the format defined in 'accountIdType'.")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Account bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Unique bank ID
   * @return bankId
  **/
  @ApiModelProperty(value = "Unique bank ID")


  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public Account accountIdType(AccountIdTypeEnum accountIdType) {
    this.accountIdType = accountIdType;
    return this;
  }

  /**
   * Format used for the account number
   * @return accountIdType
  **/
  @ApiModelProperty(example = "BBAN", value = "Format used for the account number")


  public AccountIdTypeEnum getAccountIdType() {
    return accountIdType;
  }

  public void setAccountIdType(AccountIdTypeEnum accountIdType) {
    this.accountIdType = accountIdType;
  }

  public Account accountIdentification(Object accountIdentification) {
    this.accountIdentification = accountIdentification;
    return this;
  }

  /**
   * Data structure containing information related to account identification
   * @return accountIdentification
  **/
  @ApiModelProperty(value = "Data structure containing information related to account identification")


  public Object getAccountIdentification() {
    return accountIdentification;
  }

  public void setAccountIdentification(Object accountIdentification) {
    this.accountIdentification = accountIdentification;
  }

  public Account accountDetailsLink(String accountDetailsLink) {
    this.accountDetailsLink = accountDetailsLink;
    return this;
  }

  /**
   * Link to the account details.The exact value depends on the data to be accessed.
   * @return accountDetailsLink
  **/
  @ApiModelProperty(example = "/accounts/{account_id}", value = "Link to the account details.The exact value depends on the data to be accessed.")


  public String getAccountDetailsLink() {
    return accountDetailsLink;
  }

  public void setAccountDetailsLink(String accountDetailsLink) {
    this.accountDetailsLink = accountDetailsLink;
  }

  public Account openingDate(LocalDate openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  /**
   * Date on which the account and related basic services are operational for the account owner.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)
   * @return openingDate
  **/
  @ApiModelProperty(example = "2015-10-08", value = "Date on which the account and related basic services are operational for the account owner.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)")

  @Valid

  public LocalDate getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(LocalDate openingDate) {
    this.openingDate = openingDate;
  }

  public Account closingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
    return this;
  }

  /**
   * Date on which the account and related services cease to be operational for the account owner.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)
   * @return closingDate
  **/
  @ApiModelProperty(example = "9999-12-31", value = "Date on which the account and related services cease to be operational for the account owner.  The value uses the complete data format defined in ISO 8601:  'YYYY-MM-DD'  Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)")

  @Valid

  public LocalDate getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.bankId, account.bankId) &&
        Objects.equals(this.accountIdType, account.accountIdType) &&
        Objects.equals(this.accountIdentification, account.accountIdentification) &&
        Objects.equals(this.accountDetailsLink, account.accountDetailsLink) &&
        Objects.equals(this.openingDate, account.openingDate) &&
        Objects.equals(this.closingDate, account.closingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bankId, accountIdType, accountIdentification, accountDetailsLink, openingDate, closingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    accountIdType: ").append(toIndentedString(accountIdType)).append("\n");
    sb.append("    accountIdentification: ").append(toIndentedString(accountIdentification)).append("\n");
    sb.append("    accountDetailsLink: ").append(toIndentedString(accountDetailsLink)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
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

