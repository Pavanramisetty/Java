package com.fdmgroup.interfacesExercise;

import java.util.ArrayList;

public class CalorieCounter {
    private ArrayList<FoodItem> foodItemList = new ArrayList<>();
    
    public void addLowCalorieFood(FoodItem foodItem) {
    	if (foodItem.getCalories() <= 500) 
    	    foodItemList.add(foodItem);
    }
    
    public ArrayList<FoodItem> getAllLowCalorieFood(){
		return foodItemList;
    }
}
