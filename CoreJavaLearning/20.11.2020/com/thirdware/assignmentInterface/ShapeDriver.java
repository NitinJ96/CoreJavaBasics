package com.thirdware.assignmentInterface;

public class ShapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle(5,6);
		rectangle.area();
		rectangle.perimeter();
		
		System.out.println();
		
		Triangle triangle1 = new Triangle(3,4,5);
		triangle1.area();
		triangle1.perimeter();
		
		Triangle triangle2 = new Triangle(2,6);
		triangle2.area();
		triangle2.perimeter();
	}

}
