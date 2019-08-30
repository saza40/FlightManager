package Service;

import Dao.FlightDao;
import Dao.FlightDaoImpl;
import Dao.PassengerDao;
import Dao.TicketDao;
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

        PassengerDao passengerDao = null;
        passengerDao.createPassenger(p);
    }

    @Override
    public void createTicket(Ticket ticket) {
        TicketDao ticketDao = null;
        ticketDao.createTicket(ticket);

    }


    //kendi yapacagi isleri bitirip
    //dao'u cagiriyor


}
