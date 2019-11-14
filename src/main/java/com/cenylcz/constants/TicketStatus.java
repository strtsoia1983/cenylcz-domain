package com.cenylcz.constants;

public enum TicketStatus {
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
