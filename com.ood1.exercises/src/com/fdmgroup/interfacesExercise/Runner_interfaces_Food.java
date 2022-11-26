package com.fdmgroup.interfacesExercise;

import java.util.ArrayList;

public class Runner_interfaces_Food {

	public static void main(String[] args) {
		// Creating toy object
		Toy toy1 = new Toy();
		toy1.setMaxAge(4);
		toy1.setMinAge(2);
		toy1.setName("Unicorn");
		toy1.setPrice(20);
		
		// Creating laptop Object
        Laptop laptop1 = new Laptop();
        laptop1.setCpuSpeed(200);
        laptop1.setHardDrive(300);
        laptop1.setMemory(500);
        laptop1.setName("Acer");
        laptop1.setPrice(500);
        
        // Creating Snack Objects with more than 500 calaries
        Snack snack1 = new Snack();
        snack1.setCalories(600);
        snack1.setFatContent(200);
        snack1.setSugarContent(50);
        
        // Creating Snack object with less than 500 calories
        Snack snack2 = new Snack();
        snack2.setCalories(300);
        snack2.setFatContent(100);
        snack2.setSugarContent(20);
        
        // Creating Ready meal object with more than 500 calories
        ReadyMeal readyMeal1 = new ReadyMeal();
        readyMeal1.setCalories(600);
        readyMeal1.setCuisineType("Multicuisine");
        readyMeal1.setName("Tim hortons");
        readyMeal1.setPrice(300);
        
        // Creating Ready meal object with less than 500 calories
        ReadyMeal readyMeal2 = new ReadyMeal();
        readyMeal2.setCalories(300);
        readyMeal2.setCuisineType("Not Multicuisine");
        readyMeal2.setName("Star bucks");
        readyMeal2.setPrice(200);
        
        // Creating Basket Object
        Basket basket1 = new Basket();
   
        // Creating Calorie counter object
        CalorieCounter calorieCounter1 = new CalorieCounter();
        
        // Calling methods
        basket1.addItem(readyMeal2);
        basket1.addItem(readyMeal1);
        basket1.addItem(laptop1);
        basket1.addItem(toy1);
        basket1.addItem(snack2);
        basket1.addItem(snack1);
        
        for(BasketItem b : basket1.getAllItems()) {
        	System.out.println("Item in the basket is : " + b);
        }
        
        // Printing all the items in the basket 
        System.out.println("\n Total Food Item in the basket :  " + basket1.getAllItems().size() + "  Items \n");
        
        // Deleting one item in the basket
        System.out.println("Deleted laptop Item from the basket as it is expensive \n");
        basket1.removeItem(laptop1);
               
        for(BasketItem b : basket1.getAllItems()) {
        	System.out.println("The name of the Item in the basket is : " + b);
        }
       
        // Printing all the items in the basket 
        System.out.println("\n Total Items in the basket after deleting laptop are :  " + basket1.getAllItems().size() + "  Items \n");       
        
        // Calling Calorie counter
        calorieCounter1.addLowCalorieFood(snack2);
        calorieCounter1.addLowCalorieFood(snack1);
        calorieCounter1.addLowCalorieFood(readyMeal2);
        calorieCounter1.addLowCalorieFood(readyMeal1); 
        
        for(FoodItem f : calorieCounter1.getAllLowCalorieFood()) {
        	System.out.println("All food items are below 500 calories are: " + f);
        }        
	}
}
