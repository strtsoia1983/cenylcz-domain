package com.cenylcz.constants;

public enum TradePlatform {
    FIDELITY("Fidelity"),
    FIRSTTRADE("firstTrade");

    private final String platform;

    TradePlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "TradePlatform{" +
                "platform='" + platform + '\'' +
                '}';
    }
}
