package Service;

import Dao.*;
import Domain.Flight;
import Domain.Passenger;
import Domain.Ticket;

public class FlightManagerServiceImp implements FlightManagerService {

    FlightDao flightDao = new FlightDaoImpl();

    @Override
    public void createFlight(Flight flight) {

        flightDao.createFlight(flight);
    }

    @Override
    public void createPassenger(Passenger p) {
        Passenger passenger =Passenger.builder().withPassengerName(p.getPassengerName()).withPassengerId(p.getPassengerId()).build();

        PassengerDao passengerDao =new PassengerDaoImpl();
        passengerDao.createPassenger(passenger);
    }

    @Override
    public void createTicket(Ticket ticket) {
        TicketDao ticketDao = new TicketDaoImpl();
        ticketDao.createTicket(ticket);

    }


    //kendi yapacagi isleri bitirip
    //dao'u cagiriyor


}
