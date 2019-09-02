package Client;

import Dao.*;
import Domain.*;
import Service.FlightManagerService;

import java.util.List;
import java.util.Scanner;

public class FlightManagerClientImpl implements FlightManagerClient {

    private FlightManagerService service;

    public FlightManagerClientImpl(FlightManagerService service) {
        this.service = service;
    }

    @Override
    public void createPassenger() {
        String name;
        String id;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your SSN: ");
        id = scanner.nextLine();
        Passenger passenger = Passenger.builder().withPassengerName(name).withPassengerId(id).build();
        service.createPassenger(passenger);  //call service with passenger as argument,
        System.out.println("Welcome " + name);
    }

    @Override
    public void createTicket() {

        Scanner scanner = new Scanner(System.in);
        FlightDaoImpl flightDao = new FlightDaoImpl();
        PassengerDaoImpl passengerDao = new PassengerDaoImpl();
        SeatDaoImpl seatDao = new SeatDaoImpl();
        FoodDaoImpl foodDao = new FoodDaoImpl();
        System.out.println("Please inter 1 for business and 2 for Economy class :");
        int num = scanner.nextInt();

        String reservationId = null;
        Flight flight = null;
        Passenger passenger = null;
        Finance totalPrice = null;
        if (num == 1) {
            if (!seatDao.getAllBusiness().isEmpty()) {
                System.out.println("Business tickets have expired,inter 1 for economy or 0 for exist");
                int num2 = scanner.nextInt();
                if (num2 == 0) {
                    System.exit(0);
                }
                if (!seatDao.getAllEconomy().isEmpty()) {
                    System.out.println("All tickets have expired");
                    System.exit(0);
                }
                List<Seat> economy = seatDao.getAllEconomy();

                Seat seat = economy.get(0);
                System.out.println("<<Choose your food menu>> 1-Vegetarian 2-Meat 3-Chicken :");
                int num3 = scanner.nextInt();
                if (num3 == 1) {
                    List<Food> economyMenu = foodDao.getAllEconomy();
                    Food food = economyMenu.get(0);

                    Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
                    service.createTicket(ticket);
                    System.out.println(ticket);
                    System.exit(0);
                } else if (num3 == 2) {
                    List<Food> economyMenu = foodDao.getAllEconomy();
                    Food food = economyMenu.get(1);

                    Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
                    service.createTicket(ticket);
                    System.out.println(ticket);
                    System.exit(0);
                } else if (num3 == 3) {
                    List<Food> economyMenu = foodDao.getAllEconomy();
                    Food food = economyMenu.get(2);

                    Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
                    service.createTicket(ticket);
                    System.out.println(ticket);
                    System.exit(0);
                }
            }
            List<Seat> vip = seatDao.getAllBusiness();
            Seat seat = vip.get(0);
            System.out.println("<<Choose your food menu>> 1-Vegetarian 2-Meat 3-Chicken : ");
            int num4 = scanner.nextInt();
            if (num4 == 1) {
                List<Food> vipMenu = foodDao.getAllBusiness();
                Food food = vipMenu.get(0);

                Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
                service.createTicket(ticket);
                System.out.println(ticket);
            } else if (num4 == 2) {
                List<Food> vipMenu = foodDao.getAllBusiness();
                Food food = vipMenu.get(1);

                Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
                service.createTicket(ticket);
                System.out.println(ticket);
            } else if (num4 == 3) {
                List<Food> vipMenu = foodDao.getAllBusiness();
                Food food = vipMenu.get(2);

                Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
                service.createTicket(ticket);
                System.out.println(ticket);
            }
            System.exit(0);

        }
        if (!seatDao.getAllEconomy().isEmpty()) {
            System.out.println("Economy tickets have expired,inter 1 for business or 0 for exist");
            int num5 = scanner.nextInt();
            if (num5 == 0) {
                System.exit(0);
            }
            if (!seatDao.getAllBusiness().isEmpty()) {
                System.out.println("All tickets have expired");
                System.exit(0);
            }
            List<Seat> business = seatDao.getAllBusiness();

            Seat seat = business.get(0);
            System.out.println("<<Choose your food menu>> 1-Vegetarian 2-Meat 3-Chicken :");
            int num6 = scanner.nextInt();
            if (num6 == 1) {
                List<Food> vipMenu = foodDao.getAllBusiness();
                Food food = vipMenu.get(0);

                Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
                service.createTicket(ticket);
                System.out.println(ticket);
                System.exit(0);
            } else if (num6 == 2) {
                List<Food> vipMenu = foodDao.getAllBusiness();
                Food food = vipMenu.get(1);

                Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
                service.createTicket(ticket);
                System.out.println(ticket);
                System.exit(0);
            } else if (num6 == 3) {
                List<Food> vipMenu = foodDao.getAllBusiness();
                Food food = vipMenu.get(2);

                Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
                service.createTicket(ticket);
                System.out.println(ticket);
                System.exit(0);
            }
        }
        List<Seat> economy = seatDao.getAllEconomy();

        Seat seat = economy.get(0);
        System.out.println("<<Choose your food menu>> 1-Vegetarian 2-Meat 3-Chicken :");
        int num3 = scanner.nextInt();
        if (num3 == 1) {
            List<Food> economyMenu = foodDao.getAllEconomy();
            Food food = economyMenu.get(0);

            Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
            service.createTicket(ticket);
            System.out.println(ticket);
            System.exit(0);
        } else if (num3 == 2) {
            List<Food> economyMenu = foodDao.getAllEconomy();
            Food food = economyMenu.get(1);

            Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
            service.createTicket(ticket);
            System.out.println(ticket);
            System.exit(0);
        } else if (num3 == 3) {
            List<Food> economyMenu = foodDao.getAllEconomy();
            Food food = economyMenu.get(2);

            Ticket ticket = Ticket.builder().withReservationId(reservationId).withFlight(flight).withPassenger(passenger).withSeat(seat).withFood(food).withTotalPrice(totalPrice).build();
            service.createTicket(ticket);
            System.out.println(ticket);
            System.exit(0);
        }
    }

    @Override
    public void createFlight() {
        Flight flight = Flight.builder().build();

        service.createFlight(flight);
    }

}



