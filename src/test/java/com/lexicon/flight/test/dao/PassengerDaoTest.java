package com.lexicon.flight.test.dao;

import Domain.Passenger;
import org.junit.Assert;
import org.junit.Test;

public class PassengerDaoTest {
    @Test
    public void passengerTest(){
        Passenger passenger=Passenger.builder().withPassengerId("1111").withPassengerName("Sahar").build();

        Assert.assertTrue("true",passenger.getPassengerId().equals("1111"));
        Assert.assertTrue("true",passenger.getPassengerName().equals("Sahar"));
    }

}
