package Dao;

import Domain.*;

import java.util.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TicketDaoImpl implements TicketDao {

    private Map<String, Ticket> tickets = new HashMap<>();

    @Override
    public void createTicket(Ticket ticket) {

    }

    @Override
    public List<Ticket> getAllTickets() {
        return tickets.values().stream().map(t -> Ticket.builder()
                .withFlight(t.getFlight())
                .withFood(t.getFood())
                .withPassenger(t.getPassenger())
                .withReservationId(t.getReservationId())
                .withSeat(t.getSeat())
                .withTotalPrice(t.getTotalPrice())
                .build())
                .collect(Collectors.toList());

    }

}
