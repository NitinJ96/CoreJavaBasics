package com.thirdware.arraylist;

public class Grocery {
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
	
	
}
