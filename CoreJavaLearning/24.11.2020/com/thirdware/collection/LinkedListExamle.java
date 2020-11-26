package com.thirdware.collection;

import java.util.LinkedList;

public class LinkedListExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		
		linkedList.add("Nitin");
		linkedList.add("E14155");
		linkedList.add(32);
		linkedList.add(16120.2161);
		linkedList.add("Welcome");
		
		System.out.println(linkedList);
		
		linkedList.remove(); //Removes the first item
		System.out.println(linkedList);
		
		linkedList.add(6, "HI"); //provides Index out of bound error if list length not specified
		System.out.println(linkedList);
	}

}
