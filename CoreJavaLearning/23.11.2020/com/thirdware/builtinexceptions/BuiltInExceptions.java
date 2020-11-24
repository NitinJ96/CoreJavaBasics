package com.thirdware.builtinexceptions;

public class BuiltInExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Short.MAX_VALUE);
		System.out.println((short) 32798);
		arithmeticException(5, 0);
		assertionError(false);
		stringNull(null);
		stringOutOfBound("nitin");
		numberFormatException("Hi");
		int a[] = {1,2,6,3,};
		arrayOutOfBound(a);
		
	}
	
	public static void arithmeticException(int a, int b) {
		try {
			System.out.println("a/b = "+(a/b));
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by Zero, Error:"+e);
		}
	}
	
	public static void assertionError(boolean a) {
		try {
			assert a;
		}catch(AssertionError e) {
			System.out.println("a is less than 10: Error"+e.getMessage());
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
	
	public static void numberFormatException(String s) {
		try {
			int x = Integer.parseInt(s);
			System.out.println("Number is "+x);
		}catch (NumberFormatException e) {
			System.out.println("The String does not contain a number, Error:"+e);
		}
	}
	
	public static void arrayOutOfBound(int a[]) {
		try {
			System.out.println("Array value: "+a[100]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Character Accessed beyond length of string, Error:"+e);
		}
	}

}
