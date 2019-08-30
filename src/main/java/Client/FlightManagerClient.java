package Client;

import Domain.Flight;
import Domain.Passenger;
import Domain.Ticket;

public interface FlightManagerClient {
    void createPassenger(Passenger passenger);
    void createFlight(Flight flight);
    void createTicket(Ticket ticket);
}
