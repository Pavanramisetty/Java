package com.fdmgroup.interfacesExercise;

public class ReadyMeal implements BasketItem, FoodItem{
	private String cuisineType;

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCalories(int calories) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub	
	}

	@Override
	public String toString() {
		return "ReadyMeal [cuisineType=" + cuisineType + "]";
	}
	
	

}
