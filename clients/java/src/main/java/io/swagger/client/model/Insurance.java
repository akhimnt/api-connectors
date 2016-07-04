package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;
import java.math.BigDecimal;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class Insurance   {
  
  private String currency = null;
  private Date timestamp = null;
  private BigDecimal walletBalance = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("walletBalance")
  public BigDecimal getWalletBalance() {
    return walletBalance;
  }
  public void setWalletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Insurance insurance = (Insurance) o;
    return Objects.equals(currency, insurance.currency) &&
        Objects.equals(timestamp, insurance.timestamp) &&
        Objects.equals(walletBalance, insurance.walletBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, timestamp, walletBalance);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insurance {\n");
    
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    walletBalance: ").append(StringUtil.toIndentedString(walletBalance)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}