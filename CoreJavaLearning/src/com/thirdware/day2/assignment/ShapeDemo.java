package com.thirdware.day2.assignment;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Triangle triangle = new Triangle(3,6,5);
		 
		 triangle.setBreadth(15);
		 System.out.println("Area of Triangle is: "+triangle.getArea());
		 System.out.println("Peritmeter of Triangle is:"+triangle.getPerimeter());
		 
		 Rectangle rectangle = new Rectangle();
		 
		 rectangle.setBreadth(20);
		 rectangle.setLength(21);
		 System.out.println("Area of Rectangle is: "+rectangle.getArea());
		 System.out.println("Perimeter of Rectange is:"+rectangle.getPerimeter());

	}

}
