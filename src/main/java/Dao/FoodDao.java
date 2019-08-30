package Dao;

import Domain.Food;
import com.sun.tools.javac.util.List;

public interface FoodDao {
    List<Food> createMenu(Food menu);

     void createBusinessMenu();
     void createEconomyMenu();

}
