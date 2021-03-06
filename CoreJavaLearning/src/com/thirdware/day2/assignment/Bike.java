package com.thirdware.day2.assignment;

public class Bike extends Vehicle {
	
	private int gear;
	private String gas;
	private String modelName;

	public Bike() {
		setVehicleType("Bike");
	}
	

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
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
		System.out.println("Bike Runs on "+this.gas);
	}

	@Override
	public void modelName() {
		// TODO Auto-generated method stub
		System.out.println("Model of bike:"+this.modelName);
	}
	
	@Override
	public void gear() {
		if(this.gear==0) {
			System.out.println("This is a gearless Bike");
		}else {
			System.out.println("This is "+this.gear+" gear vehicle");
		}
	}
	

}
