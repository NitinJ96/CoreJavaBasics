package com.thirdware.assignmentinterface;

public class Rectangle implements IShape {
	
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return this.length;
	}


	public int getBreadth() {
		return this.breadth;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle: "+getBreadth()*getLength());
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Rectangle: "+(2*(getBreadth()+getLength())));
		
	}
	
}
