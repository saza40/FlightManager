package com.lexicon.flight.test.dao;

import Dao.FoodDao;
import Dao.FoodDaoImpl;
import Domain.Food;
import org.junit.Test;

import java.util.Collection;

public class FoodDaoTest {
    FoodDao foodDao = new FoodDaoImpl();
@Test
    public void vipMenu() {
        FoodDao foodDao = new FoodDaoImpl();
        Food menu1 = Food.builder().withMenuName("Vegetarian").withMenuType("VIP").withMenuPrice(450d).build();
        Food menu2 = Food.builder().withMenuName("Meat").withMenuType("VIP").withMenuPrice(550d).build();
        Food menu3 = Food.builder().withMenuName("Chicken").withMenuType("VIP").withMenuPrice(500d).build();

        foodDao.createBusinessMenu(1, menu1);
        foodDao.createBusinessMenu(2, menu2);
        foodDao.createBusinessMenu(3, menu3);
        System.out.println(foodDao.getAllBusiness());

    }
@Test
    public void economyMenu() {
        FoodDao foodDao = new FoodDaoImpl();
        Food menu1 = Food.builder().withMenuName("Vegetarian").withMenuType("Economy").withMenuPrice(150d).build();
        Food menu2 = Food.builder().withMenuName("Meat").withMenuType("Economy").withMenuPrice(250d).build();
        Food menu3 = Food.builder().withMenuName("Chicken").withMenuType("Economy").withMenuPrice(200d).build();

        foodDao.createEconomyMenu(1, menu1);
        foodDao.createEconomyMenu(2, menu2);
        foodDao.createEconomyMenu(3, menu3);
       // System.out.println(foodDao.getAllEconomy());
    Collection<Food> foods=foodDao.getAllEconomy();
    System.out.println(foods);
    }
}
