package com.example.trading_app.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "trade_details")
public class Trade {

    @Id
    @Column(name = "trade_id", nullable = false)
    private String tradeId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "trade_date")
    private LocalDate tradeDate;

    @Column(name = "activity")
    private String activity;

    @Column(name = "description")
    private String description;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "cusip")
    private String cusip;

    @Column(name = "type")
    private String tradeType;  // mapped from "type"

    @Column(name = "quantity", precision = 20, scale = 4)
    private BigDecimal quantity;

    @Column(name = "price", precision = 20, scale = 6)
    private BigDecimal price;

    @Column(name = "amount", precision = 25, scale = 6)
    private BigDecimal amount;

    @Column(name = "friendly_account_name")
    private String friendlyAccountName;

    @Column(name = "create_date")
    private LocalDate createDate;

    // Constructors
    public Trade() {}

    // Getters and Setters
    public String getTradeId() { return tradeId; }
    public void setTradeId(String tradeId) { this.tradeId = tradeId; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public LocalDate getTradeDate() { return tradeDate; }
    public void setTradeDate(LocalDate tradeDate) { this.tradeDate = tradeDate; }

    public String getActivity() { return activity; }
    public void setActivity(String activity) { this.activity = activity; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getCusip() { return cusip; }
    public void setCusip(String cusip) { this.cusip = cusip; }

    public String getTradeType() { return tradeType; }
    public void setTradeType(String tradeType) { this.tradeType = tradeType; }

    public BigDecimal getQuantity() { return quantity; }
    public void setQuantity(BigDecimal quantity) { this.quantity = quantity; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getFriendlyAccountName() { return friendlyAccountName; }
    public void setFriendlyAccountName(String friendlyAccountName) { this.friendlyAccountName = friendlyAccountName; }

    public LocalDate getCreateDate() { return createDate; }
    public void setCreateDate(LocalDate createDate) { this.createDate = createDate; }
}
