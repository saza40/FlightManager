package Dao;

import Domain.Finance;

public interface FinanceDao {
   double getTotalPrice(Finance totalPrice);

    double getTotalIncome(Finance totalIncome);

    double getProfit(Finance profit);

    double getTotalPrice();

    double getTotalIncome();

    double getProfit();
}
