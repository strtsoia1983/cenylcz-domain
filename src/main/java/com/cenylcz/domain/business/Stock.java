package com.cenylcz.domain.business;

import com.cenylcz.constants.StockStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "stock", schema = "business")
public class Stock extends Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_key", unique = true, nullable = false)
    private Integer stockKey;

    @Column(name = "symbol", unique = false, nullable = false)
    private String symbol;

    @Column(name = "full_name", unique = false, nullable = false)
    private String fullName;

    @Column(name = "quantity", unique = false, nullable = false)
    private Integer quantity;

    @Column(name = "open_unit_cost", unique = false, nullable = false)
    private Double openUnitCost;

    @Column(name = "close_unit_cost", unique = false, nullable = false)
    private Double closeUnitCost;

    @Column(name = "purchase_time", unique = false, nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp purchaseTime;

    @Column(name = "close_time", unique = false, nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp closeTime;

    @Column(name = "gain_lost_total", unique = false, nullable = false)
    private Double gainLostTotal;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StockStatus status;

    public Integer getStockKey() {
        return stockKey;
    }

    public void setStockKey(Integer stockKey) {
        this.stockKey = stockKey;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getOpenUnitCost() {
        return openUnitCost;
    }

    public void setOpenUnitCost(Double openUnitCost) {
        this.openUnitCost = openUnitCost;
    }

    public Double getCloseUnitCost() {
        return closeUnitCost;
    }

    public void setCloseUnitCost(Double closeUnitCost) {
        this.closeUnitCost = closeUnitCost;
    }

    public Timestamp getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Timestamp purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public Timestamp getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Timestamp closeTime) {
        this.closeTime = closeTime;
    }

    public Double getGainLostTotal() {
        return gainLostTotal;
    }

    public void setGainLostTotal(Double gainLostTotal) {
        this.gainLostTotal = gainLostTotal;
    }

    public StockStatus getStatus() {
        return status;
    }

    public void setStatus(StockStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockKey=" + stockKey +
                ", symbol='" + symbol + '\'' +
                ", fullName='" + fullName + '\'' +
                ", quantity=" + quantity +
                ", openUnitCost=" + openUnitCost +
                ", closeUnitCost=" + closeUnitCost +
                ", purchaseTime=" + purchaseTime +
                ", closeTime=" + closeTime +
                ", gainLostTotal=" + gainLostTotal +
                ", status=" + status +
                '}';
    }
}
