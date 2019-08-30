package Dao;

import Domain.Seat;

import java.util.List;


public interface SeatDao {
    void createSeatBusiness(int num,Seat seat);
    void createSeatEconomy(int num,Seat seat);

    List<Seat> getAllBusiness();
    List<Seat> getAllEconomy();
}
