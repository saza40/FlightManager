import Client.FlightManagerClient;
import Client.FlightManagerClientImpl;
import Dao.*;
import Domain.Flight;
import Domain.Food;
import Domain.Seat;
import Domain.Ticket;
import Service.FlightManagerService;
import Service.FlightManagerServiceImp;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        FlightDao flightDao=new FlightDaoImpl();

            Flight flight = Flight.builder().withFlightName("B737").withFlightNumber("1122").withFlightDestination("Istanbul").build();
            flightDao.createFlight(flight);
        SeatDao seatDao = new SeatDaoImpl();
        FoodDao foodDao = new FoodDaoImpl();

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

        Seat seat6= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        Seat seat7= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        Seat seat8= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        Seat seat9= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        Seat seat10= Seat.builder().withSeatType("Economey").withSeatPrice(5000d).build();
        seatDao.createSeatEconomy(6,seat6);
        seatDao.createSeatEconomy(7, seat7);
        seatDao.createSeatEconomy(8,seat8);
        seatDao.createSeatEconomy(9,seat9);
        seatDao.createSeatEconomy(10,seat10);

        Food menu1 = Food.builder().withMenuName("Vegetarian").withMenuType("VIP").withMenuPrice(450d).build();
        Food menu2 = Food.builder().withMenuName("Meat").withMenuType("VIP").withMenuPrice(550d).build();
        Food menu3 = Food.builder().withMenuName("Chicken").withMenuType("VIP").withMenuPrice(500d).build();

        foodDao.createBusinessMenu(1, menu1);
        foodDao.createBusinessMenu(2, menu2);
        foodDao.createBusinessMenu(3, menu3);

        Food menu1E = Food.builder().withMenuName("Vegetarian").withMenuType("Economy").withMenuPrice(150d).build();
        Food menu2E = Food.builder().withMenuName("Meat").withMenuType("Economy").withMenuPrice(250d).build();
        Food menu3E = Food.builder().withMenuName("Chicken").withMenuType("Economy").withMenuPrice(200d).build();

        foodDao.createEconomyMenu(1, menu1E);
        foodDao.createEconomyMenu(2, menu2E);
        foodDao.createEconomyMenu(3, menu3E);



        FlightManagerService flightManagerService =new FlightManagerServiceImp();
        FlightManagerClient client=new FlightManagerClientImpl(flightManagerService);
        client.createPassenger();
        client.createFlight();
        client.createTicket();
    }

}
