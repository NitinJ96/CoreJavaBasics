package com.thirdware.day2.assignment;

public abstract class Vehicle {
	
	private String engine;
	private String vehicleType;
	private int wheels;

	public void start() {
		if(engine == "ON") {
			System.out.println(this.vehicleType+" Starts");
		}else {
			System.out.println("Engine is Off");
		}
	}
	
	public void stop() {
		if(engine == "OFF") {
			System.out.println(this.vehicleType+" Starts");
		}else {
			System.out.println("Engine is Off");
		}
	}
	
	public abstract void gas();
	
	public abstract void gear();
	
	public abstract void modelName();
	
	public String getEngine() {
		return engine;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		if(vehicleType=="Car") {
			this.vehicleType = vehicleType;
			this.wheels = 4;
		}
		if(vehicleType == "Bike") {
			this.vehicleType = vehicleType;
			this.wheels = 2;
		}
		
	}
	
}
