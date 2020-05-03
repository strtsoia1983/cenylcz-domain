package com.cenylcz.constants;

public enum ForexStatus {
    IMPORT("import"),
    ORDER("order"),
    OPEN("open"),
    CLOSE("close"),
    COMPLETE("complete");

    private String ticketStatus;

    ForexStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public String toString() {
        return "TicketStatus{" +
                "ticketStatus='" + ticketStatus + '\'' +
                '}';
    }
}
