package com.thirdware.day1;

public class ArithmeticOperationObject {
	int a = 15, b=12;
	public static void main(String[] args) {
		
		ArithmeticOperationObject object = new ArithmeticOperationObject();
		System.out.println("a = "+object.a);
		System.out.println("a = "+object.b);
		object.addition();
		object.subtraction();
		object.multiplication();
		System.out.println("Division: "+object.division());
		System.out.println("Modulus: "+object.modulus());
		
	}
	
	public void addition() {
		System.out.println("Addition: "+(a+b));
	}
	public void subtraction() {
		System.out.println("Subtraction: "+(a-b));
	}
	public void multiplication() {
		System.out.println("Multiplication: "+(a*b));
	}
	public int division() {
		return (a/b);
	}
	public int  modulus() {
		return (a%b);
	}


}
