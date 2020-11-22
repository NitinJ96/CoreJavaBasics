package com.thirdware.additionalproblems;

import java.util.Scanner;

public class Area {

	static Scanner scanner =  new Scanner(System.in);
	private double length, breadth;
	
	public void setDim(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getArea() {
		return this.breadth*this.length;
	}
	
	public static void main(String[] args) {
		
		Area rectangle = new Area();
		System.out.println("Enter the length of rectangle: ");
		double length = scanner.nextDouble();
		System.out.println("Enter the breadth of rectangle: ");
		double breadth = scanner.nextDouble();
		
		rectangle.setDim(length, breadth);
		System.out.println("Area of Rectangle: "+rectangle.getArea());
	}

}
