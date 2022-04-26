package com.example.foodapp.model;

import java.util.ArrayList;

public class FoodManager {
    private ArrayList <FoodItem> foodList;

    public FoodManager() {
        foodList = new ArrayList<>();
    }

    public void addFood(FoodItem food){
        foodList.add(food);
    }

    public void deleteFood(FoodItem food){
        foodList.remove(food);
    }

}
