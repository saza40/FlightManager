package Dao;

import Domain.Seat;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SeatDaoImpl implements SeatDao {
    Map<Integer, Seat> business = new HashMap<>();
    Map<Integer, Seat> economy = new HashMap<>();

    public void createSeatBusiness(int num,Seat seat) { business.put(num,seat);}
   public void createSeatEconomy(int num,Seat seat){economy.put(num,seat);}


@Override
    public List<Seat> getAllBusiness() {
        return (List<Seat>) business.values().stream().map(b -> Seat.builder().withSeatType(b.getSeatType()).withSeatPrice(b.getSeatPrice()).build()).collect(Collectors.toList());
    }
@Override
    public List<Seat> getAllEconomy() {
        return (List<Seat>) economy.values().stream().map(e -> Seat.builder().withSeatType(e.getSeatType()).withSeatPrice(e.getSeatPrice()).build()).collect(Collectors.toList());

    }
}
