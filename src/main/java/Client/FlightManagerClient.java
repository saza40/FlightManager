package Client;

import Dao.SeatDao;
import Domain.Flight;
import Domain.Passenger;
import Domain.Ticket;

public interface FlightManagerClient {



    void createPassenger();
    void createFlight();
    void createTicket(SeatDao seatDao);
}
