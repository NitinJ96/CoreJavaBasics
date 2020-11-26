package com.thirdware.arraylist;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<Grocery> groceryList = new ArrayList<>();
	
	public void addGroceryItem(Grocery grocery) {
		this.groceryList.add(grocery);
	}
	
	public void printGroceryList(){
        System.out.println("You have "+ groceryList.size()+" item in your grocery list");
        for (int i = 0; i<groceryList.size(); i++){
            System.out.println((i+1)+"."+groceryList.get(i).toString());
        }
    }
	
	public boolean removeGroceryItem(String itemName) {
		for (Grocery grocery : groceryList) {
			if(grocery.getGroceryItem().equals(itemName)) {
				groceryList.remove(grocery);
				return true;
			}
		}
		return false;
	}
}
