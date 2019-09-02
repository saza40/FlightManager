package Dao;

import Domain.Food;
import java.util.List;

public interface FoodDao {
    void createBusinessMenu(int num,Food food);
    void createEconomyMenu(int num,Food food);

    List<Food> getAllBusiness();
    List<Food> getAllEconomy();

}
