package com.cenylcz.domain.business;

import com.cenylcz.Model;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "stock", schema = "cenylcz")
public class Stock extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_Key", unique = true, nullable = false)
    private Integer stockKey;

    @Column(name = "ticker", nullable = false)
    private String ticker;

    @Column(name = "description", nullable = false)
    private String description;

    public Integer getStockKey() {
        return stockKey;
    }

    public void setStockKey(Integer stockKey) {
        this.stockKey = stockKey;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(stockKey, stock.stockKey) && Objects.equals(ticker, stock.ticker) && Objects.equals(description, stock.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockKey, ticker, description);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockKey=" + stockKey +
                ", ticker='" + ticker + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
