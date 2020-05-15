package com.cenylcz.constants;

public enum StockStatus {

    ACTIVE("ACTIVE"),
    PENDING("PENDING"),
    CANCELLED("CANCELLED"),
    CLOSED("CLOSED");

    private final String stockStatus;

    StockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    @Override
    public String toString() {
        return "StockStatus{" +
                "stockStatus='" + stockStatus + '\'' +
                '}';
    }
}
