package com.cenylcz.domain.business;

import com.cenylcz.Model;
import com.cenylcz.domain.DateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
@Table(name = "trade", schema = "business")
public class Trade extends Model implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trade_Key", unique = true, nullable = false)
    private Integer tradeKey;

    @Column(name = "ticker", nullable = false)
    private String ticker;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "open_unit_cost", nullable = false)
    private Double openUnitCost;

    @Column(name = "close_unit_cost")
    private Double closeUnitCost;

    @Column(name = "purchase_time", nullable = false)
    private ZonedDateTime purchaseTime;

    @Column(name = "close_time")
    private ZonedDateTime closeTime;

    @Column(name = "status", nullable = false)
    private String status;

    public Integer getTradeKey() {
        return tradeKey;
    }

    public void setTradeKey(Integer tradeKey) {
        this.tradeKey = tradeKey;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
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
        if (this.purchaseTime != null) {
            return Timestamp.from(this.purchaseTime.toInstant());
        }
        return null;
    }

    @JsonDeserialize(using = DateDeserializer.class)
    public void setPurchaseTime(Timestamp purchaseTime) {
        if (purchaseTime != null) {
            this.purchaseTime = purchaseTime.toLocalDateTime().atZone(ZoneId.of("Z"));
        }
    }

    public Timestamp getCloseTime() {
        if (this.closeTime != null) {
            return Timestamp.from(this.closeTime.toInstant());
        }
        return null;
    }

    @JsonDeserialize(using = DateDeserializer.class)
    public void setCloseTime(ZonedDateTime closeTime) {
        if (closeTime != null) {
            this.closeTime = closeTime.toLocalDateTime().atZone(ZoneId.of("Z"));
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return Objects.equals(tradeKey, trade.tradeKey) && Objects.equals(ticker, trade.ticker) && Objects.equals(quantity, trade.quantity) && Objects.equals(openUnitCost, trade.openUnitCost) && Objects.equals(closeUnitCost, trade.closeUnitCost) && Objects.equals(purchaseTime, trade.purchaseTime) && Objects.equals(closeTime, trade.closeTime) && Objects.equals(status, trade.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tradeKey, ticker, quantity, openUnitCost, closeUnitCost, purchaseTime, closeTime, status);
    }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeKey=" + tradeKey +
                ", ticker='" + ticker + '\'' +
                ", quantity=" + quantity +
                ", openUnitCost=" + openUnitCost +
                ", closeUnitCost=" + closeUnitCost +
                ", purchaseTime=" + purchaseTime +
                ", closeTime=" + closeTime +
                ", status='" + status + '\'' +
                '}';
    }
}
