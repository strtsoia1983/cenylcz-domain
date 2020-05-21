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

    @Column(name = "symbol", nullable = false)
    private String symbol;

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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
        return "Symbol{" +
                "stockKey=" + stockKey +
                ", symbol='" + symbol + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
