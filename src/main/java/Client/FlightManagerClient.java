package Client;

import Dao.*;
import Domain.Flight;
import Domain.Passenger;
import Domain.Ticket;

import java.util.Random;

public interface FlightManagerClient {



    void createPassenger();
    void createFlight();
    void createTicket(Random reservationId, FlightDao flightDao, PassengerDao passengerDao, SeatDao seatDao, FoodDao foodDao, FinanceDao totalPrice);

    void createTicket();
}
