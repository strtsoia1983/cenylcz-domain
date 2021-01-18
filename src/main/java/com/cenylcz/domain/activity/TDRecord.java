package com.cenylcz.domain.activity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "td_record", schema = "activity")
public class TDRecord extends Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "td_record_key", unique = true, nullable = false)
    private Integer tdRecordKey;

    @CsvDate(value = "MM/dd/yyyy")
    @CsvBindByName(column = "DATE")
    @Column(name = "transaction_date", unique = false, nullable = false)
    private LocalDate transactionDate;

    @CsvBindByName(column = "TRANSACTION ID")
    @Column(name = "transaction_id", unique = false, nullable = false)
    private String transactionId;

    @CsvBindByName(column = "DESCRIPTION")
    @Column(name = "description", unique = false, nullable = true)
    private String description;

    @CsvBindByName(column = "QUANTITY")
    @Column(name = "quantity", unique = false, nullable = true)
    private Double quantity;

    @CsvBindByName(column = "SYMBOL")
    @Column(name = "symbol", unique = false, nullable = true)
    private String symbol;

    @CsvBindByName(column = "PRICE")
    @Column(name = "price", unique = false, nullable = true)
    private Double price;

    @CsvBindByName(column = "COMMISSION")
    @Column(name = "commission", unique = false, nullable = true)
    private Double commission;

    @CsvBindByName(column = "AMOUNT")
    @Column(name = "amount", unique = false, nullable = true)
    private Double amount;

    @CsvBindByName(column = "REG FEE")
    @Column(name = "reg_fee", unique = false, nullable = true)
    private Double regFee;

    @CsvBindByName(column = "SHORT-TERM RDM FEE")
    @Column(name = "short_term_rdm_fee", unique = false, nullable = true)
    private Double shortTermRdmFee;

    @CsvBindByName(column = "FUND REDEMPTION FEE")
    @Column(name = "fund_redemption_fee", unique = false, nullable = true)
    private Double fundRedemptionFee;

    @CsvBindByName(column = "DEFERRED SALES CHARGE")
    @Column(name = "deferred_sales_charge", unique = false, nullable = true)
    private Double deferredSalesCharge;


    public TDRecord() {
    }

    public TDRecord(Integer tdRecordKey, LocalDate transactionDate, String transactionId, String description, Double quantity, String symbol, Double price, Double commission, Double amount, Double regFee, Double shortTermRdmFee, Double fundRedemptionFee, Double deferredSalesCharge) {
        this.tdRecordKey = tdRecordKey;
        this.transactionDate = transactionDate;
        this.transactionId = transactionId;
        this.description = description;
        this.quantity = quantity;
        this.symbol = symbol;
        this.price = price;
        this.commission = commission;
        this.amount = amount;
        this.regFee = regFee;
        this.shortTermRdmFee = shortTermRdmFee;
        this.fundRedemptionFee = fundRedemptionFee;
        this.deferredSalesCharge = deferredSalesCharge;
    }

    public Integer getTdRecordKey() {
        return tdRecordKey;
    }

    public void setTdRecordKey(Integer tdRecordKey) {
        this.tdRecordKey = tdRecordKey;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getRegFee() {
        return regFee;
    }

    public void setRegFee(Double regFee) {
        this.regFee = regFee;
    }

    public Double getShortTermRdmFee() {
        return shortTermRdmFee;
    }

    public void setShortTermRdmFee(Double shortTermRdmFee) {
        this.shortTermRdmFee = shortTermRdmFee;
    }

    public Double getFundRedemptionFee() {
        return fundRedemptionFee;
    }

    public void setFundRedemptionFee(Double fundRedemptionFee) {
        this.fundRedemptionFee = fundRedemptionFee;
    }

    public Double getDeferredSalesCharge() {
        return deferredSalesCharge;
    }

    public void setDeferredSalesCharge(Double deferredSalesCharge) {
        this.deferredSalesCharge = deferredSalesCharge;
    }

    @Override
    public String toString() {
        return "TDRecord{" +
                "tdRecordKey=" + tdRecordKey +
                ", transactionDate=" + transactionDate +
                ", transactionId=" + transactionId +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", symbol='" + symbol + '\'' +
                ", price=" + price +
                ", commission=" + commission +
                ", amount=" + amount +
                ", regFee=" + regFee +
                ", shortTermRdmFee=" + shortTermRdmFee +
                ", fundRedemptionFee=" + fundRedemptionFee +
                ", deferredSalesCharge=" + deferredSalesCharge +
                '}';
    }
}
