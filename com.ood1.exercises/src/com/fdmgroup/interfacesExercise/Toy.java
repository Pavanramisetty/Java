package com.fdmgroup.interfacesExercise;

public class Toy implements BasketItem{
    private int minAge;
    private int maxAge;
    
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	@Override
	public String getName() {
		return null;
	}
	@Override
	public void setName(String name) {
		System.out.println(name);
		
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setPrice(double price) {
		System.out.println(price);
	}
	@Override
	public String toString() {
		return "Toy [minAge=" + minAge + ", maxAge=" + maxAge + "]";
	}  
	
	
}
