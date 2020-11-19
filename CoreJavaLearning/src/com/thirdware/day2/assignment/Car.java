package com.thirdware.day2.assignment;

public class Car extends Vehicle {
	
	private int gear;
	private String gas;
	private String modelName;
	
	

	public Car() {
		setVehicleType("Car");
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getGas() {
		return gas;
	}

	public void setGas(String gas) {
		this.gas = gas;
	}

	@Override
	public void gas() {
		// TODO Auto-generated method stub
		System.out.println("Car runs on "+this.gas);
	}

	@Override
	public void modelName() {
		// TODO Auto-generated method stub
		System.out.println("Name of model "+this.modelName);
	}
	
	@Override
	public void gear() {
		System.out.println("This is "+this.gear+" gear vehicle");
	}
	
	
}
