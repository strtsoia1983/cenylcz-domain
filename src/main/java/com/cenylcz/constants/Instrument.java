package com.cenylcz.constants;

public enum Instrument {

    EURUSD("UER_USD"),
    NZDCHF("NZD_CHF"),
    AUDCHF("AUD_CHF"),
    CADCHF("CAD_CHF");

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
