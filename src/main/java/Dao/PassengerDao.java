package Dao;

import Domain.Passenger;

import java.util.List;

public interface PassengerDao {
    void createPassenger(Passenger p);

    List<Passenger> getAllPassengers();
}
