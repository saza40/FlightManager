import Client.FlightManagerClient;
import Client.FlightManagerClientImpl;
import Dao.SeatDao;
import Dao.SeatDaoImpl;
import Domain.Seat;
import Service.FlightManagerService;
import Service.FlightManagerServiceImp;

public class Main {

    public static void main(String[] args) {
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

        FlightManagerService flightManagerService =new FlightManagerServiceImp();
        FlightManagerClient client=new FlightManagerClientImpl(flightManagerService);
        client.createPassenger();
        client.createTicket(seatDao);
    }

}
