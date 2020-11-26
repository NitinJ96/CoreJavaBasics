package com.thirdware.collection;

import java.util.ArrayList;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("Nitin");
		arrayList.add("E14155");
		arrayList.add(32);
		arrayList.add(16120.2161);
		arrayList.add("Welcome");
		
		System.out.println(arrayList);
		
		arrayList.remove(23); //Removes the item if item is present else removes the index(first preference is index)
		//This gives out index out of bound error
		System.out.println(arrayList);
		
		arrayList.add(6, "HI"); //provides Index out of bound error if list length not specified
		System.out.println(arrayList);
		
	}

}
