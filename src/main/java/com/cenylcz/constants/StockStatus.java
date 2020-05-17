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

    @Override
    public String toString() {
        return "StockStatus{" +
                "stockStatus='" + stockStatus + '\'' +
                '}';
    }
}
