package Dao;

import Domain.Food;
import Domain.Seat;

public abstract class FinanceDaoImpl implements FinanceDao {
    private Seat seat;
    private Food food;
    private double totalIncome;
    private double totalPrice;
    private double profit;

    @Override
    public double getTotalPrice() {

        return seat.getSeatPrice() + food.getMenuPrice();

    }


    @Override
    public double getTotalIncome() {

        return totalIncome + getTotalPrice();
    }

    @Override
    public double getProfit() {
        return getTotalIncome() * 0.3;

    }

}