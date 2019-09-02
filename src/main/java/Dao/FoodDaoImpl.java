package Dao;

import Domain.Food;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FoodDaoImpl implements FoodDao {

    Map<Integer, Food> vipMenu = new HashMap<>();
    Map<Integer, Food> economyMenu = new HashMap<>();

    public void createBusinessMenu(int num, Food food) {
        vipMenu.put(num, food);
    }

    public void createEconomyMenu(int num, Food food) {
        economyMenu.put(num, food);
    }

    @Override
    public List<Food> getAllBusiness() {
        return (List<Food>) vipMenu.values().stream().map(b -> Food.builder().withMenuType(b.getMenuType()).withMenuName(b.getMenuName()).withMenuPrice(b.getMenuPrice()).build()).collect(Collectors.toList());
    }

    @Override
    public List<Food> getAllEconomy() {
        return  economyMenu.values().stream().map(s -> Food.builder().withMenuType(s.getMenuType()).withMenuName(s.getMenuName()).withMenuPrice(s.getMenuPrice()).build()).collect(Collectors.toList());


    }

}