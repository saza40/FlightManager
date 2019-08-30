package Dao;

import Domain.Flight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightDaoImpl implements FlightDao {

    private Map<String, Flight> flights = new HashMap<>();

    public void createFlight(Flight flight) {
        if (flights.containsKey(flight.getFlightNumber())) {
            throw new RuntimeException("Flight is Exist");
        }

        flights.put(flight.getFlightNumber(), flight);
    }

    public List<Flight> getAllFlight(String flightNumber) {

        return flights.values().stream().map(f -> Flight.builder().withFlightName(f.getFlightName()).withFlightNumber(f.getFlightNumber()).withFlightDestination(f.getFlightDestination()).build()).collect(Collectors.toList());
    }
}





