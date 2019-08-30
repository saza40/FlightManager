package com.lexicon.flight.test.doamin;


import Dao.FlightDao;
import Dao.FlightDaoImpl;
import Domain.Flight;
import Service.FlightManagerService;
import org.junit.Assert;
import org.junit.Test;

public class FlightDaoTest {
    FlightDao flightDao=new FlightDaoImpl();
    @Test
    public void flightTest() {

            Flight flight = Flight.builder().withFlightName("B737").withFlightNumber("1122").withFlightDestination("Istanbul").build();
            flightDao.createFlight(flight);


        Assert.assertTrue("true",flight.getFlightNumber().equals("1122"));
    }

}
