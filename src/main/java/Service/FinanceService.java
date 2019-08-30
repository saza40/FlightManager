package Service;

import Domain.Finance;

public interface FinanceService {
   double getTotalPrice(Finance totalPrice);

    double getTotalIncome(Finance totalIncome);

    double getProfit(Finance profit);
}
