package com.lexicon.flight.test.dao;

import Dao.FoodDao;
import Dao.FoodDaoImpl;
import Domain.Food;

public class FoodDaoTest {
    FoodDao foodDao=new FoodDaoImpl();
    public void listBusiness{

       Food menu1 = Food.builder().withMenuName("Vegetarian").withMenuType("VIP").withMenuPrice(450d).build();
       Food menu2 = Food.builder().withMenuName("Meat").withMenuType("VIP").withMenuPrice(550d).build();
       Food menu3=Food.builder().withMenuName("Chicken").withMenuType("VIP").withMenuPrice(500d).build();

       FoodDao.createBusinessMenu


    }
}
