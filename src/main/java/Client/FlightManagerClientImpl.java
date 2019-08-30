package Client;

import Dao.FoodDaoImpl;
import Dao.SeatDao;
import Dao.SeatDaoImpl;
import Domain.*;
import Service.FlightManagerService;

import java.util.LinkedList;
import java.util.List;

import java.util.Scanner;

public class FlightManagerClientImpl {

    private FlightManagerService service;

    public void createPassenger() {
        Passenger passenger = Passenger.builder().build();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        Passenger passengerName = Passenger.builder().withPassengerName(scanner.nextLine()).build();

        System.out.println("Enter your SSN: ");
        Passenger passengerId = Passenger.builder().withPassengerId(scanner.nextLine()).build();

        service.createPassenger(passenger);  //call service with passenger as argument,
    }


    public void createTicket() {
        Ticket ticket = Ticket.builder().build();
        Scanner scanner = new Scanner(System.in);
        SeatDaoImpl seatDao = new SeatDaoImpl();
        FoodDaoImpl foodDao= new FoodDaoImpl();

        System.out.println("Please inter 1 for business and 2 for Economy class :");
        int num = scanner.nextInt();
        if (num == 1) {
            if (seatDao.getAllBusiness().isEmpty()) {
                System.out.println("Business tickets have expired,inter 2 for economy or 0 for exist");
                int num2 = scanner.nextInt();
                if (num2 == 0) {
                    System.exit(0);
                }
                if (seatDao.getAllEconomy().isEmpty()) {
                    System.out.println("All tickets have expired");
                    System.exit(0);
                }
                List<Seat> economy = seatDao.getAllEconomy();
                economy.poll();
            }
            System.out.println("<<Choose your food menu>> 1-Vegetarian 2-Meat 3-Chicken :");
            int num3 = scanner.nextInt();
            if (num3 == 1) {foodDao
            }

        }

    }

}

