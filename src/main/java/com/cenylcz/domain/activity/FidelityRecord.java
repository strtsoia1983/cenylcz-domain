package com.cenylcz.domain.activity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import java.time.LocalDate;

public class FidelityRecord extends Record {

    @CsvDate(value = "MM/dd/yyyy")
    @CsvBindByName(column = "Run Date")
    private LocalDate runDate;

    @CsvBindByName(column = "Action")
    private String action;

    @CsvBindByName(column = "Symbol")
    private String symbol;

    @CsvBindByName(column = "Security Description")
    private String securityDescription;

    @CsvBindByName(column = "Security Type")
    private String securityType;

    @CsvBindByName(column = "Exchange Quantity")
    private double exchangeQuantity;

    @CsvBindByName(column = "Exchange Currency")
    private String exchangeCurrency;

    @CsvBindByName(column = "Quantity")
    private double quantity;

    @CsvBindByName(column = "Currency")
    private String currency;

    @CsvBindByName(column = "Price")
    private double price;

    @CsvBindByName(column = "Exchange Rate")
    private double exchangeRate;

    @CsvBindByName(column = "Commission")
    private double commission;

    @CsvBindByName(column = "Fees")
    private double fees;

    @CsvBindByName(column = "Accrued Interest")
    private double accruedInterest;

    @CsvBindByName(column = "Amount")
    private double amount;

    @CsvDate(value = "MM/dd/yyyy")
    @CsvBindByName(column = "Settlement Date")
    private LocalDate settlementDate;

    public FidelityRecord() {
    }

    public FidelityRecord(LocalDate runDate, String action, String symbol, String securityDescription, String securityType, double exchangeQuantity, String exchangeCurrency, double quantity, String currency, double price, double exchangeRate, double commission, double fees, double accruedInterest, double amount, LocalDate settlementDate) {
        this.runDate = runDate;
        this.action = action;
        this.symbol = symbol;
        this.securityDescription = securityDescription;
        this.securityType = securityType;
        this.exchangeQuantity = exchangeQuantity;
        this.exchangeCurrency = exchangeCurrency;
        this.quantity = quantity;
        this.currency = currency;
        this.price = price;
        this.exchangeRate = exchangeRate;
        this.commission = commission;
        this.fees = fees;
        this.accruedInterest = accruedInterest;
        this.amount = amount;
        this.settlementDate = settlementDate;
    }

    public LocalDate getRunDate() {
        return runDate;
    }

    public void setRunDate(LocalDate runDate) {
        this.runDate = runDate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSecurityDescription() {
        return securityDescription;
    }

    public void setSecurityDescription(String securityDescription) {
        this.securityDescription = securityDescription;
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public double getExchangeQuantity() {
        return exchangeQuantity;
    }

    public void setExchangeQuantity(double exchangeQuantity) {
        this.exchangeQuantity = exchangeQuantity;
    }

    public String getExchangeCurrency() {
        return exchangeCurrency;
    }

    public void setExchangeCurrency(String exchangeCurrency) {
        this.exchangeCurrency = exchangeCurrency;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(double accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(LocalDate settlementDate) {
        this.settlementDate = settlementDate;
    }

    @Override
    public String toString() {
        return "FidelityRecord{" +
                "runDate=" + runDate +
                ", action='" + action + '\'' +
                ", symbol='" + symbol + '\'' +
                ", securityDescription='" + securityDescription + '\'' +
                ", securityType='" + securityType + '\'' +
                ", exchangeQuantity=" + exchangeQuantity +
                ", exchangeCurrency='" + exchangeCurrency + '\'' +
                ", quantity=" + quantity +
                ", currency='" + currency + '\'' +
                ", price=" + price +
                ", exchangeRate=" + exchangeRate +
                ", commission=" + commission +
                ", fees=" + fees +
                ", accruedInterest=" + accruedInterest +
                ", amount=" + amount +
                ", settlementDate=" + settlementDate +
                '}';
    }
}
