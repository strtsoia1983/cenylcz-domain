package com.cenylcz.constants;

public enum StockStatus {

    ACTIVE("Active"),
    PENDING("Pending"),
    CANCELLED("Cancelled"),
    CLOSED("Closed");

    private final String stockStatus;

    StockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    @Override
    public String toString() {
        return "StockStatus{" +
                "stockStatus='" + stockStatus + '\'' +
                '}';
    }
}
