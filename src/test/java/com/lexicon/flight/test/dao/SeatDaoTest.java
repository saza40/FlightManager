package com.lexicon.flight.test.dao;

import Dao.SeatDao;
import Dao.SeatDaoImpl;
import Domain.Seat;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SeatDaoTest {

    @Test
    public void listBusiness() {
        //Map<Integer, Seat> business = new HashMap<>();
        SeatDao seatDao = new SeatDaoImpl();

        Seat seat1 = Seat.builder().withSeatType("Business").withSeatPrice(20000d).build();
        Seat seat2 = Seat.builder().withSeatType("Business").withSeatPrice(20000d).build();
        Seat seat3 = Seat.builder().withSeatType("Business").withSeatPrice(20000d).build();
        Seat seat4 = Seat.builder().withSeatType("Business").withSeatPrice(20000d).build();
        Seat seat5 = Seat.builder().withSeatType("Business").withSeatPrice(20000d).build();

        seatDao.createSeatBusiness(1, seat1);
        seatDao.createSeatBusiness(2, seat2);
        seatDao.createSeatBusiness(3, seat3);
        seatDao.createSeatBusiness(4, seat4);
        seatDao.createSeatBusiness(5, seat5);
//        System.out.println(seatDao.getAllBusiness());

        List<Seat> seats = seatDao.getAllBusiness();
        seats.stream()
                .forEach(seat -> System.out.println( seat.toString())) ;

        //Assert.assertEquals(seat1, seats.get(1));
    }

    @Test
    public void listEconomy(){

        //Map<Integer, Seat> economy= new HashMap<>();
        SeatDao seatDao1= new SeatDaoImpl();

        Seat seat6= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        Seat seat7= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        Seat seat8= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        Seat seat9= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        Seat seat10= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        seatDao1.createSeatEconomy(6,seat6);
        seatDao1.createSeatEconomy(7, seat7);
        seatDao1.createSeatEconomy(8,seat8);
        seatDao1.createSeatEconomy(9,seat9);
        seatDao1.createSeatEconomy(10,seat10);



        System.out.println(seatDao1.getAllEconomy());
    }
}