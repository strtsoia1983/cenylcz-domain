package com.cenylcz.domain.business;

import com.cenylcz.Model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "trade", schema = "business")
public class Trade extends Model implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trade_key", unique = true, nullable = false)
    private Integer tradeKey;

    @Column(name = "symbol", unique = false, nullable = false)
    private String symbol;

    @Column(name = "quantity", unique = false, nullable = false)
    private Integer quantity;

    @Column(name = "open_unit_cost", unique = false, nullable = false)
    private Double openUnitCost;

    @Column(name = "close_unit_cost", unique = false, nullable = false)
    private Double closeUnitCost;

    @Column(name = "purchase_time", unique = false, nullable = false)
    private Date purchaseTime;

    @Column(name = "close_time", unique = false, nullable = false)
    private Date closeTime;

    @Column(name = "GAIN_LOST_TOTAL", unique = false, nullable = false)
    private Double gainLostTotal;

    public Integer getTradeKey() {
        return tradeKey;
    }

    public void setTradeKey(Integer tradeKey) {
        this.tradeKey = tradeKey;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Double getGainLostTotal() {
        return gainLostTotal;
    }

    public void setGainLostTotal(Double gainLostTotal) {
        this.gainLostTotal = gainLostTotal;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeKey=" + tradeKey +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", openUnitCost=" + openUnitCost +
                ", closeUnitCost=" + closeUnitCost +
                ", purchaseTime=" + purchaseTime +
                ", closeTime=" + closeTime +
                ", gainLostTotal=" + gainLostTotal +
                '}';
    }
}
