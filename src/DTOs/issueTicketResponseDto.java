package DTOs;

import models.Ticket;

import java.util.PropertyResourceBundle;

public class issueTicketResponseDto {
    private ResponseToTicket responseToTicket;
    private String ErrorMessage;
    private Ticket ticket;     // in real world we don't expose ticket, only required things are shown

    public ResponseToTicket getResponseToTicket() {
        return responseToTicket;
    }

    public void setResponseToTicket(ResponseToTicket responseToTicket) {
        this.responseToTicket = responseToTicket;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
