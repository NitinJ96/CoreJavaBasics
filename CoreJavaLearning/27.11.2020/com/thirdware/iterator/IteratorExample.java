package com.thirdware.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); 
		  
	     list.add("A"); 
	     list.add("B"); 
	     list.add("C"); 
	     list.add("D"); 
	     list.add("E"); 

	     // ListIterator to traverse the list 
	     ListIterator listIterator = list.listIterator(); 

	   
	     while (listIterator.hasNext()) 
	         System.out.print(listIterator.next() + " "); 

	     System.out.println(); 
	    

	     // Traversing the list in backward direction 
	     System.out.println("Displaying list elements in backward direction : "); 

	     while (listIterator.hasPrevious()) 
	         System.out.print(listIterator.previous() + " "); 

	     System.out.println(); 
	     
	     //Removing item using iterator
	     for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if(object.equals("A")) {
				iterator.remove();
			}
		}
	    
	    System.out.println(list);
	     
	}

}
