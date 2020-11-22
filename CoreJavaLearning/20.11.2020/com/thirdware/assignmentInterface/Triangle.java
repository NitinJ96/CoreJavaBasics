package com.thirdware.assignmentinterface;

public class Triangle implements IShape {
	private double sideA, sideB, sideC;
	private double height, base;
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}
	
	public double getSideA() {
		return this.sideA;
	}
	public double getSideB() {
		return this.sideB;
	}
	public double getSideC() {
		return this.sideC;
	}
	public double getHeight() {
		return this.height;
	}
	public double getBase() {
		return this.base;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		if(this.base == 0.0 && this.height == 0.0) {
			double area = heronsArea();
			System.out.println("Area of Triangle is:"+area);
		}else {
			System.out.println("Area of Triangle is:"+(getHeight()*getBase()/2));
		}
			
	}
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		if(this.base != 0.0 && this.height != 0.0) {
			System.out.println("Provide 3 sides");
		}else {
			System.out.println("Perimeter of Triangle is: "+(getSideA()+getSideB()+getSideC()));
		}
	}
	
	private double heronsArea(){
		double p = (getSideA()+getSideB()+getSideC())/2;
		double cal = p*(p-getSideA())*(p-getSideB())*(p-getSideC());
		double area = Math.sqrt(cal);
		return area;
		
	}
	
}
