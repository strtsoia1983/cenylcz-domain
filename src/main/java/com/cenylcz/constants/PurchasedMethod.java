package com.cenylcz.constants;

public enum PurchasedMethod {

    CREDIT_CARD("CREDIT_CARD"),
    CASH("CASH"),
    CHECK("CHECK"),
    TRANSFER("TRANSFER");

    private final String purchasedMethod;

    PurchasedMethod(final String purchasedMethod) {
        this.purchasedMethod = purchasedMethod;
    }

    public String toString() {
        return purchasedMethod;
    }
}
