package com.cenylcz.domain.business;

import com.cenylcz.Model;
import javax.persistence.*;

@Entity
@Table(name = "stock", schema = "business")
public class Stock extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_Key", unique = true, nullable = false)
    private Integer stockKey;

    @Column(name = "ticker", nullable = false)
    private String ticker;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "category", nullable = false)
    private String category;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "stockKey=" + stockKey +
                ", ticker='" + ticker + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
