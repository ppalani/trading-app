package com.example.trading_app.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TradeDTO {

    private String tradeId;
    private String accountNumber;
    private String symbol;   // ticker
    private LocalDate tradeDate;
    private String activity;
    private BigDecimal quantity;
    private BigDecimal price;
    private BigDecimal amount;

    // Getters and setters
    public String getTradeId() { return tradeId; }
    public void setTradeId(String tradeId) { this.tradeId = tradeId; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public LocalDate getTradeDate() { return tradeDate; }
    public void setTradeDate(LocalDate tradeDate) { this.tradeDate = tradeDate; }

    public String getActivity() { return activity; }
    public void setActivity(String activity) { this.activity = activity; }

    public BigDecimal getQuantity() { return quantity; }
    public void setQuantity(BigDecimal quantity) { this.quantity = quantity; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
}
