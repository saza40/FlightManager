package Client;

import Domain.Flight;
import Domain.Passenger;
import Domain.Ticket;

public interface FlightManagerClient {
    void createPassenger();
    void createFlight();
    void createTicket();
}
