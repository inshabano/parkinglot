package reprositrory;

import models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepo {
    private Map<Long, Ticket> tickets = new HashMap<>();
    private  Long priviousID = 0L;
    public Ticket saveTicket(Ticket ticket){ //ID will be diff of returned ticket
        priviousID+=1;
        ticket.setId(priviousID);
        tickets.put(priviousID,ticket);
        return ticket;
    }
}
