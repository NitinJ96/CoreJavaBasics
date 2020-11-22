package com.thirdware.additionalproblems;

import java.util.Scanner;

public class Complex {
	
	public static Scanner scanner =  new Scanner(System.in);
	private double real, imaginary;
	
	public Complex(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public static void sum(Complex num1, Complex num2) {
		double real = num1.real + num2.real;
		double imaginary = num1.imaginary + num2.imaginary;
		System.out.println("The sum of "+num1.toString()+" and "+num2.toString()+" = "+
				real+" + "+"( "+imaginary+" )"+"i");
	}
	
	public static void difference(Complex num1, Complex num2) {
		double real = num1.real - num2.real;
		double imaginary = num1.imaginary - num2.imaginary;
		System.out.println("The difference of "+num1.toString()+" and "+num2.toString()+" = "+
				real+" + ("+imaginary+")i");
	}
	
	@Override
	public String toString() {
		return this.real+"+"+this.imaginary+"i";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex number1, number2;
		System.out.println("Enter the real and imaginary parts of first complex Number: ");
		number1 = getComplexNumberFromUser();
		System.out.println("Enter the real and imaginary parts of second complex Number: ");
		number2 = getComplexNumberFromUser();
		
		System.out.println("Number1 = "+number1.toString());
		System.out.println("Number2 = "+number2.toString());
		sum(number1, number2);
		difference(number1, number2);
		
	}
	
	public static Complex getComplexNumberFromUser() {
		System.out.print("Real: ");
		double real = scanner.nextDouble();
		System.out.print("Imaginary: ");
		double imaginary = scanner.nextDouble();
		Complex number = new Complex(real, imaginary);
		return number;
	}

}
