package com.fdmgroup.interfacesExercise;

import java.util.ArrayList;

public class Basket {
  private ArrayList<BasketItem> itemList = new ArrayList<>();
  
  public void addItem(BasketItem basketItem) {
	itemList.add(basketItem);  
  }
  
  public void removeItem(BasketItem basketItem) {
	  itemList.remove(basketItem);
  }
  
  public ArrayList<BasketItem> getAllItems(){
	return itemList;	
  }
}
