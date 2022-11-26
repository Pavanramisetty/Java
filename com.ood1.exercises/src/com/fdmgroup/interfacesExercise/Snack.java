package com.fdmgroup.interfacesExercise;

public class Snack implements FoodItem, BasketItem{
   private int fatContent;
   private int sugarContent;
   
public int getFatContent() {
	return fatContent;
}
public void setFatContent(int fatContent) {
	this.fatContent = fatContent;
}
public int getSugarContent() {
	return sugarContent;
}
public void setSugarContent(int sugarContent) {
	this.sugarContent = sugarContent;
}
@Override
public int getCalories() {
	return fatContent;
	//int calories = fatContent * sugarContent;
	
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
	return "Snack [fatContent=" + fatContent + ", sugarContent=" + sugarContent + "]";
}

}
