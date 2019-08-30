package Dao;

import Domain.Food;
import com.sun.tools.javac.util.List;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FoodDaoImpl implements FoodDao {

    Map<Integer, Food> vipMenu = new HashMap<>();
    Map<Integer, Food> economyMenu = new HashMap<>();

    @Override
    public List<Food> createMenu(Food menu) {
        return null;
    }

    @Override
    public void createBusinessMenu() {

    }

    @Override
    public void createEconomyMenu() {

    }

   /* public List<Food> createMenu(Food food) {
        Map<Integer, Food> vipMenu = new HashMap<>();
        Map<Integer, Food> economyMenu = new HashMap<>();


     *//*   Food menu1 = new Food("VegetarianMenu", "VIP", 350.0);
        vipMenu.put(1, menu1);
        Food menu2 = new Food("MeatMenu", "VIP", 450.0);
        vipMenu.put(2, menu2);
        Food menu3 = new Food("ChickenMenu", "VIP", 400.0);
        vipMenu.put(3, menu3);

        Food menuT1 = new Food("VegetarianMenu", "Economy", 250.0);
        economyMenu.put(1, menuT1);
        Food menuT2 = new Food("MeatMenu", "Economy", 350.0);
        economyMenu.put(2, menuT2);
        Food menuT3 = new Food("ChickenMenu", "Economy", 300.0);
        economyMenu.put(3, menuT3);*//*



        public void createBusinessMenu() { vipMenu.put();}
        public void createEconomyMenu(){economyMenu.put();}



        public List<Food> getAllBusiness() {
            return (List<Food>) vipMenu.values().stream().map(b -> Food.builder().withMenuType(b.getMenuType()).withMenuName(b.getMenuName()).withMenuPrice(b.getMenuPrice()).build()).collect(Collectors.toList());
        }

        public List<Food> getAllEconomy() {
            return (List<Food>) economyMenu.values().stream().map(s -> Food.builder().withMenuType(s.getMenuType()).withMenuName(s.getMenuName()).withMenuPrice(s.getMenuPrice()).build()).collect(Collectors.toList());


        }

}*/
}