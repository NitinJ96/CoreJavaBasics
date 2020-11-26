package com.thirdware.arraylist;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
    private static Grocery groceryItem; // object of the class grocery
    public static void main(String[] args) {
        boolean quit =  false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0: printInstructions(); break;
                case 1: groceryList.printGroceryList(); break;
                case 2: addItem(); break;
                case 3: removeItem();break;
                case 4: quit = true; break;
            }
        }
    }
    
    static void printInstructions(){
        System.out.println("Press");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item on the list");
        System.out.println("\t 3 - To remove an item form the list");
        System.out.println("\t 4 - To quit the application");
    }
    
    public static void addItem() {
    	System.out.print("Enter the grocery name: ");
    	String name = scanner.nextLine();
    	System.out.print("Enter the quantity: ");
    	int quantity = scanner.nextInt();
    	scanner.nextLine();
    	
    	groceryItem = new Grocery(name, quantity);
    	groceryList.addGroceryItem(groceryItem);
    }
    
    public static void removeItem() {
    	System.out.print("Enter the Item to be removed: ");
    	String itemName = scanner.nextLine();
    	if(groceryList.removeGroceryItem(itemName)) {
    		System.out.println(itemName+ " is removed form the Grocery List");
    	}else {
    		System.out.println(itemName + " is not in the list");
    	}
    }
    

}
