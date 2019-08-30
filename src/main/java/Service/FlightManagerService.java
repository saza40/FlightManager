package Service;

import Domain.Finance;
import Domain.Flight;
import Domain.Passenger;
import Domain.Ticket;

public interface FlightManagerService {
    void createFlight(Flight flight);

    void createPassenger(Passenger p);

    void createTicket(Ticket ticket);


}
