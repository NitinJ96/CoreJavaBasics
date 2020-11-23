package com.thirdware.builtinexceptions;

public class BuiltInExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void arithmeticException(int a, int b) {
		try {
			System.out.println("a/b = "+(a/b));
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by Zero, Error:"+a);
		}
	}
	
	public static void assertionError(int a) {
		try {
			assert(a>10);
		}catch(AssertionError e) {
			System.out.println("a is less than 10: Error"+e);
		}
	}
	
	public static void stringNull(String a) {
		try {
			System.out.println("String is "+a);
		}catch (NullPointerException e) {
			System.out.println("Entered String is null, Error: "+e);
		}
	}
	
	public static void stringOutOfBound(String name) {
		try {
			System.out.println("Character: "+name.charAt(100));
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Character Accessed beyond length of string, Error:"+e);
		}
	}
	
	public static void numberFormatException() {
		try {
			int x = Integer.parseInt("jbsiusb");
		}catch (NumberFormatException e) {
			System.out.println("The String does not contain a number, Error:"+e);
		}
	}

}
