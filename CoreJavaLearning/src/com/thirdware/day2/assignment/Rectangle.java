package com.thirdware.day2.assignment;

public class Rectangle extends Shape{
	public double getArea() {
		return getBreadth()*getLength();
	}
	public double getPerimeter() {
		return 2*(getBreadth()+getLength());
	}
}
