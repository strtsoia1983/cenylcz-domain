package com.cenylcz;

public enum PurchasedMethod {

    CREDIT_CARD("credit card"),
    CASH("cash"),
    CHECK("check"),
    TRANSFER("transfer");

    private final String purchasedMethod;

    PurchasedMethod(String purchasedMethod) {
        this.purchasedMethod = purchasedMethod;
    }

    public String getPurchasedMethod() {
        return purchasedMethod;
    }
}
