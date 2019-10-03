package com.cenylcz.constants;

public enum TicketStatus {

    OPEN("open"),
    CLOSE("close");

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
