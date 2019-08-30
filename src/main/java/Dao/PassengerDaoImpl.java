package Dao;

import Domain.Passenger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PassengerDaoImpl implements PassengerDao {

    private Map<String, Passenger> passengers = new HashMap<>();

    public void createPassenger(Passenger passenger) {
        if (passengers.containsKey(passenger.getPassengerId())) {
            throw new RuntimeException("Passenger is Exist");
        }

        passengers.put(passenger.getPassengerId(), passenger);
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return passengers.values().stream().map(p -> Passenger.builder().withPassengerId(p.getPassengerId()).withPassengerName(p.getPassengerName()).build()).collect(Collectors.toList());

    }

}
