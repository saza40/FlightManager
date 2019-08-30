package Dao;

import Domain.Ticket;

import java.util.List;

public interface TicketDao {
    void createTicket(Ticket ticket);

    List<Ticket> getAllTickets();
}
