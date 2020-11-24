package com.thirdware.casting;

class Super{
	Super(){
		System.out.println("This is Super Class");
	}
}

class Base extends Super{
	Base(){
		System.out.println("This is Base Class of Super Class");
	}
}

public class ObjectCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Casting Object of Base Class to Super class reference variable
			 Super object = new Base();
			 
			 //Casting Object of Super Class to Base class reference variable
			 Base base = (Base) new Super();
		}catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println("Class Casting Exception "+e);
		}
	}

}
