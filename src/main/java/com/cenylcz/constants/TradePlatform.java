package com.cenylcz.constants;

public enum TradePlatform {
    FIDELITY("Fidelity"),
    AMERITRADE("Ameritrade"),
    FIRSTTRADE("FirstTrade");

    private final String platform;

    TradePlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String toString() {
        return "TradePlatform{" +
                "platform='" + platform + '\'' +
                '}';
    }
}
