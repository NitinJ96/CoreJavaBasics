package com.thirdware.casting;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primitive to Wrapper Class - Auto - boxing
		int num = 100;
		Integer num1 = new Integer(num); //Explicit
		Integer num2 = num; // Implicit Casting
		Integer num3 = Integer.valueOf(num); // Explicit AutoBoxing
		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		
		double number = 15151.132651;
		Double number1 = new Double(number);
		Double number2 = number;
		
		//Wrapper Class to Primitive Data type
		Integer value = new Integer(100);
		int value1 = value; // Implicit Un-boxing
		int value2 = value.intValue();// Explicit Un-boxing
		
		Double data = new Double(156151.61561);
		double data1 = data;
		double data2 = data.doubleValue();
		
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
	}

}
