package com.cenylcz.domain.business;

import com.cenylcz.Model;
import com.cenylcz.constants.Instrument;
import com.cenylcz.constants.TicketStatus;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "ticket", schema = "business")
public class Ticket extends Model implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_key", unique = true, nullable = false)
    private Integer ticketKey;

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
    private Timestamp openTime;

    @Column(name = "close_time")
    private Timestamp closeTime;

    @Column(name = "profit", precision = 8, scale = 2)
    private Double profit;

    @Enumerated(EnumType.STRING)
    @Column(name = "ticket_status", nullable = false)
    private TicketStatus ticketStatus;

    public Integer getTicketKey() {
        return ticketKey;
    }

    public void setTicketKey(Integer ticketKey) {
        this.ticketKey = ticketKey;
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

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketKey=" + ticketKey +
                ", units=" + units +
                ", instrument=" + instrument +
                ", openPrice=" + openPrice +
                ", closePrice=" + closePrice +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", profit=" + profit +
                ", ticketStatus=" + ticketStatus +
                '}';
    }
}
