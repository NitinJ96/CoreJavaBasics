package com.thirdware.additionalproblems;

import java.util.Scanner;

public class Average {

	static Scanner scanner =  new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 numbers to get average: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		Average average = new Average();
		average.average(a, b, c);

	}
	
	public void average(double a, double b, double c) {
		double average = (a+b+c)/3;
		System.out.println("Average of "+a+","+b+","+c+" is "+average);
	}

}
