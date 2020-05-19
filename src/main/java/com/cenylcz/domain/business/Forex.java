package com.cenylcz.domain.business;

import com.cenylcz.constants.Instrument;
import com.cenylcz.constants.ForexStatus;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "forex", schema = "business")
public class Forex extends Ticket implements Serializable {

    public Forex() {

    }

    @JsonCreator
    public Forex(@JsonProperty(required = true, value = "forexKey") Integer forexKey,
                 @JsonProperty(required = true, value = "units") Integer units,
                 @JsonProperty(required = true, value = "instrument") Instrument instrument,
                 @JsonProperty(required = true, value = "openPrice") Double openPrice,
                 @JsonProperty(required = true, value = "closePrice") Double closePrice,
                 @JsonProperty(required = true, value = "openTime") Timestamp openTime,
                 @JsonProperty(required = true, value = "closeTime") Timestamp closeTime,
                 @JsonProperty(required = true, value = "profit") Double profit,
                 @JsonProperty(required = true, value = "forexStatus") ForexStatus forexStatus) {
        this.forexKey = forexKey;
        this.units = units;
        this.instrument = instrument;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.profit = profit;
        this.forexStatus = forexStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "forex_key", unique = true, nullable = false)
    private Integer forexKey;

    @Column(name = "units", nullable = false)
    private Integer units;

    @Enumerated(EnumType.STRING)
    @Column(name = "instrument", nullable = false)
    private Instrument instrument;

    @Column(name = "open_price", nullable = false, precision = 8, scale = 2)
    private Double openPrice;

    @Column(name = "close_price", precision = 8, scale = 2)
    private Double closePrice;

    @Column(name = "open_time", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp openTime;

    @Column(name = "close_time")
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp closeTime;

    @Column(name = "profit", precision = 8, scale = 2)
    private Double profit;

    @Enumerated(EnumType.STRING)
    @Column(name = "forex_status", nullable = false)
    private ForexStatus forexStatus;

    public Integer getforexKey() {
        return forexKey;
    }

    public void setforexKey(Integer forexKey) {
        this.forexKey = forexKey;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public Timestamp getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Timestamp openTime) {
        this.openTime = openTime;
    }

    public Timestamp getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Timestamp closeTime) {
        this.closeTime = closeTime;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public ForexStatus getForexStatus() {
        return forexStatus;
    }

    public void setForexStatus(ForexStatus forexStatus) {
        this.forexStatus = forexStatus;
    }

    @Override
    public String toString() {
        return "forex{" +
                "forexKey=" + forexKey +
                ", units=" + units +
                ", instrument=" + instrument +
                ", openPrice=" + openPrice +
                ", closePrice=" + closePrice +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", profit=" + profit +
                ", forexStatus=" + forexStatus +
                '}';
    }
}
