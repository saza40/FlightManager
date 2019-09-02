import Client.FlightManagerClient;
import Client.FlightManagerClientImpl;
import Service.FlightManagerService;
import Service.FlightManagerServiceImp;

public class Main {

    public static void main(String[] args) {
        FlightManagerService flightManagerService =new FlightManagerServiceImp();
        FlightManagerClient client=new FlightManagerClientImpl(flightManagerService);
        client.createPassenger();
        client.createTicket();
    }

}
