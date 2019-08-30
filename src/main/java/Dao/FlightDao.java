package Dao;

import Domain.Flight;
import java.util.List;


public interface FlightDao {
    void createFlight(Flight flight);

    List<Flight> getAllFlight(String flightNumber);
}
