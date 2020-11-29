package com.thirdware.arraylist;

import java.util.Comparator;

public class Grocery implements Comparator<Grocery> {
	private String groceryItem;
	private int quantity;

	public Grocery(String groceryItem, int quantity) {
		super();
		this.groceryItem = groceryItem;
		this.quantity = quantity;
	}

	public String getGroceryItem() {
		return groceryItem;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "\nGroceryItem: " + groceryItem + "\nquantity: " + quantity;
	}

	@Override
	public int compare(Grocery grocery1, Grocery grocery2) {
		// TODO Auto-generated method stub
		return grocery1.groceryItem.compareTo(grocery2.groceryItem);
	}
	
	
}
