package Client;

import Domain.Finance;

public class FinanceManagerClientImpl implements FinanceManagerClient{
    Finance totalIncome;
    Finance profit;

    @Override
    public void createTotalIncom() {
        System.out.println("Total income: " +totalIncome);

    }

    @Override
    public void createProfit() {
        System.out.println("Company profit: " +profit);

    }
}
