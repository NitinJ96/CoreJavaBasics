package com.thirdware.day2.assignment;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setModelName("FORD-GT40");
		car.setGas("Diesel");
		car.setEngine("ON");
		car.setGear(6);
		car.start();
		car.gas();
		car.gear();
		car.modelName();
		car.stop();
		
		System.out.println();
		Bike bike = new Bike();
		bike.setModelName("BMW S 1000");
		bike.setGas("Petrol");
		bike.setEngine("ON");
		bike.setGear(5);
		bike.start();
		bike.gas();
		bike.gear();
		bike.modelName();
		bike.stop();
		
		
		
		
	}

}
