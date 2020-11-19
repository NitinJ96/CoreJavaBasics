package com.thirdware.day2.assignment;

public class Triangle extends Shape {
	
	private double sideB, sideC;
	
	public Triangle(double sideA,double sideB,double sideC) {
		setLength(sideA);
		getLength();
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public double getArea() {
		return getLength()*getBreadth()/2;
	}
	public double getPerimeter() {
		return getLength()+sideB+sideC;
	}
}
