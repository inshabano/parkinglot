package Controller;

import DTOs.ResponseToTicket;
import DTOs.issueTicketRequestDto;

import DTOs.issueTicketResponseDto;
import Exceptions.WrongGateID;
import models.Ticket;
import services.TicketService;


public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){        //DEPENDENCY INJECTION
        this.ticketService = ticketService;
    }

    public issueTicketResponseDto IssueTicket(issueTicketRequestDto requestDto){
       issueTicketResponseDto issueTicketResponseDto =
               new issueTicketResponseDto();
        Ticket ticket;
        try{
            ticket = ticketService.issueTicket(requestDto.getVehicleType(),
                    requestDto.getVehicleNo(),
                    requestDto.getVehicleOwnerName(),
                    requestDto.getGateID());
        } catch (WrongGateID e) {
           issueTicketResponseDto.setResponseToTicket(ResponseToTicket.FAILED);
           issueTicketResponseDto.setErrorMessage(e.getMessage());
           return issueTicketResponseDto;
        }
        issueTicketResponseDto.setResponseToTicket(ResponseToTicket.SUCCESS);
        issueTicketResponseDto.setTicket(ticket);
        return issueTicketResponseDto;
    }
}
