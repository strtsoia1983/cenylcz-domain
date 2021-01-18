package com.cenylcz.domain.activity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "fidelity_record_individual", schema = "activity")
public class FidelityRecordIndividual extends Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fidelity_record_individual_key", unique = true, nullable = false)
    private Integer fidelityRecordIndividualKey;

    @CsvDate(value = "MM/dd/yyyy")
    @CsvBindByName(column = "Run Date")
    @Column(name = "run_date", unique = false, nullable = false)
    private LocalDate runDate;

    @CsvBindByName(column = "Action")
    @Column(name = "action", unique = false, nullable = false)
    private String action;

    @CsvBindByName(column = "Symbol")
    @Column(name = "symbol", unique = false, nullable = false)
    private String symbol;

    @CsvBindByName(column = "Security Description")
    @Column(name = "security_description", unique = false, nullable = true)
    private String securityDescription;

    @CsvBindByName(column = "Security Type")
    @Column(name = "security_type", unique = false, nullable = true)
    private String securityType;

    @CsvBindByName(column = "Exchange Quantity")
    @Column(name = "exchange_quantity", unique = false, nullable = true)
    private Double exchangeQuantity;

    @CsvBindByName(column = "Exchange Currency")
    @Column(name = "exchange_currency", unique = false, nullable = true)
    private String exchangeCurrency;

    @CsvBindByName(column = "Quantity")
    @Column(name = "quantity", unique = false, nullable = true)
    private Double quantity;

    @CsvBindByName(column = "Currency")
    @Column(name = "currency", unique = false, nullable = true)
    private String currency;

    @CsvBindByName(column = "Price")
    @Column(name = "price", unique = false, nullable = true)
    private Double price;

    @CsvBindByName(column = "Exchange Rate")
    @Column(name = "exchange_rate", unique = false, nullable = true)
    private Double exchangeRate;

    @CsvBindByName(column = "Commission")
    @Column(name = "commission", unique = false, nullable = true)
    private Double commission;

    @CsvBindByName(column = "Fees")
    @Column(name = "fees", unique = false, nullable = true)
    private Double fees;

    @CsvBindByName(column = "Accrued Interest")
    @Column(name = "accrued_interest", unique = false, nullable = true)
    private Double accruedInterest;

    @CsvBindByName(column = "Amount")
    @Column(name = "amount", unique = false, nullable = true)
    private Double amount;

    @CsvDate(value = "MM/dd/yyyy")
    @CsvBindByName(column = "Settlement Date")
    @Column(name = "settlement_date", unique = false, nullable = true)
    private LocalDate settlementDate;

    public FidelityRecordIndividual() {
    }

    public FidelityRecordIndividual(Integer fidelityRecordIndividualKey, LocalDate runDate, String action, String symbol, String securityDescription, String securityType, Double exchangeQuantity, String exchangeCurrency, Double quantity, String currency, Double price, Double exchangeRate, Double commission, Double fees, Double accruedInterest, Double amount, LocalDate settlementDate) {
        this.fidelityRecordIndividualKey = fidelityRecordIndividualKey;
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

    public Integer getFidelityRecordIndividualKey() {
        return fidelityRecordIndividualKey;
    }

    public void setFidelityRecordIndividualKey(Integer fidelityRecordIndividualKey) {
        this.fidelityRecordIndividualKey = fidelityRecordIndividualKey;
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

    public Double getExchangeQuantity() {
        return exchangeQuantity;
    }

    public void setExchangeQuantity(Double exchangeQuantity) {
        this.exchangeQuantity = exchangeQuantity;
    }

    public String getExchangeCurrency() {
        return exchangeCurrency;
    }

    public void setExchangeCurrency(String exchangeCurrency) {
        this.exchangeCurrency = exchangeCurrency;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public Double getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(Double accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
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
        return "FidelityRecordIndividual{" +
                "fidelityRecordIndividualKey=" + fidelityRecordIndividualKey +
                ", runDate=" + runDate +
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
