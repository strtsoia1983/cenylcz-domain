package com.cenylcz.constants;

public enum TicketStatus {
    IMPORT("import"),
    ORDER("order"),
    OPEN("open"),
    CLOSE("close"),
    COMPLETE("complete");

    private String ticketStatus;

    TicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public String toString() {
        return "TicketStatus{" +
                "ticketStatus='" + ticketStatus + '\'' +
                '}';
    }
}
