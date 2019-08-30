package Service;

import Dao.FinanceDao;
import Domain.Finance;

public class FinanceServiceImpl implements FinanceService {
    FinanceDao financeDao;

    @Override
    public double getTotalPrice(Finance totalPrice) {
        return  financeDao.getTotalPrice(totalPrice);
    }

    @Override
    public double getTotalIncome(Finance totalIncome) {
        return financeDao.getTotalIncome(totalIncome);

    }

    @Override
    public double getProfit(Finance profit) {
        return financeDao.getProfit(profit);

    }
}
