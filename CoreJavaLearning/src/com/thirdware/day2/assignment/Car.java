package com.thirdware.day2.assignment;

public class Car extends Vehicle {

	@Override
	public void gas() {
		// TODO Auto-generated method stub
		System.out.println("Car runs on Diesel");
	}

	@Override
	public void noOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("Car runs on 4 wheels");
	}
	
	public void vehicleType() {
		System.out.println("Four Wheeler");
	}
	
}
