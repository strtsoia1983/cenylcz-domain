package com.cenylcz.constants;

public enum Category {

    GAS("GAS"),
    GROCERY("GROCERY"),
    DINING("DINING"),
    TRAVEL("TRAVEL"),
    UTILITY("UTILITY"),
    MEDICARE("MEDICARE"),
    CLOTHES("CLOTHES"),
    APPLIANCES("APPLIANCES"),
    COSMETIC("COSMETIC");

    private final String category;

    Category(final String category) {
        this.category = category;
    }

    public String toString() {
        return category;
    }
}
