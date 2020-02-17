package com.cenylcz.constants;

public enum Instrument {

    EUR_USD("UER_USD"),
    NZD_CHF("NZD_CHF"),
    AUD_CHF("AUD_CHF"),
    CAD_CHF("CAD_CHF"),
    USD_CHF("USD_CHF");

    private final String instrument;

    Instrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "instrument='" + instrument + '\'' +
                '}';
    }
}
