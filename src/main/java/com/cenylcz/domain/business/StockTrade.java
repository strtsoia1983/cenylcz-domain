package com.cenylcz.domain.business;

import com.cenylcz.constants.StockStatus;
import com.cenylcz.constants.TradePlatform;
import com.cenylcz.convert.StockStatusConvert;
import com.cenylcz.convert.TradePlatformConvert;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "stockTrade", schema = "business")
public class StockTrade extends Ticket implements Serializable {

    public StockTrade() {

    }

    @JsonCreator
    public StockTrade(@JsonProperty(required = true, value = "stockTradeKey") Integer stockTradeKey,
                      @JsonProperty(required = true, value = "ticker") String ticker,
                      @JsonProperty(required = true, value = "fullName") String fullName,
                      @JsonProperty(required = true, value = "quantity") Integer quantity,
                      @JsonProperty(required = true, value = "openUnitCost") Double openUnitCost,
                      @JsonProperty(required = true, value = "closeUnitCost") Double closeUnitCost,
                      @JsonProperty(required = true, value = "purchaseTime") Timestamp purchaseTime,
                      @JsonProperty(required = true, value = "closeTime") Timestamp closeTime,
                      @JsonProperty(required = true, value = "gainLostTotal") Double gainLostTotal,
                      @JsonProperty(required = true, value = "status") StockStatus status,
                      @JsonProperty(required = true, value = "tradePlatform") TradePlatform tradePlatform) {
        this.stockTradeKey = stockTradeKey;
        this.ticker = ticker;
        this.fullName = fullName;
        this.quantity = quantity;
        this.openUnitCost = openUnitCost;
        this.closeUnitCost = closeUnitCost;
        this.purchaseTime = purchaseTime;
        this.closeTime = closeTime;
        this.gainLostTotal = gainLostTotal;
        this.status = status;
        this.tradePlatform = tradePlatform;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_trade_key", unique = true, nullable = false)
    private Integer stockTradeKey;

    @Column(name = "ticker", unique = false, nullable = false)
    private String ticker;

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

    @Column(name = "status", nullable = false)
    @Convert(converter = StockStatusConvert.class)
    private StockStatus status;

    @Column(name = "trade_platform", nullable = false)
    @Convert(converter = TradePlatformConvert.class)
    private TradePlatform tradePlatform;

    public Integer getStockTradeKey() {
        return stockTradeKey;
    }

    public void setStockTradeKey(Integer stockTradeKey) {
        this.stockTradeKey = stockTradeKey;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
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

    public TradePlatform getTradePlatform() {
        return tradePlatform;
    }

    public void setTradePlatform(TradePlatform tradePlatform) {
        this.tradePlatform = tradePlatform;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockTradeKey=" + stockTradeKey +
                ", ticker='" + ticker + '\'' +
                ", fullName='" + fullName + '\'' +
                ", quantity=" + quantity +
                ", openUnitCost=" + openUnitCost +
                ", closeUnitCost=" + closeUnitCost +
                ", purchaseTime=" + purchaseTime +
                ", closeTime=" + closeTime +
                ", gainLostTotal=" + gainLostTotal +
                ", status=" + status +
                ", tradePlatform=" + tradePlatform +
                '}';
    }
}
