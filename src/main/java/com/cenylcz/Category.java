package com.cenylcz;

public enum Category {

    GAS("gas"),
    GROCERY("grocery"),
    DINING("dining"),
    TRAVEL("travel"),
    UTILITY("utility"),
    MEDICARE("medicare"),
    CLOTHES("clothes"),
    APPLIANCES("appliances"),
    COSMETIC("cosmetic"),;

    private final String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
