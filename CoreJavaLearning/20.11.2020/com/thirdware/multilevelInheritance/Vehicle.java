package com.thirdware.multilevelInheritance;

public class Vehicle {
	private String name;
    private String type;
    private int currentSpeed;


	public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;

        this.currentSpeed = 0;
    }

    public void move(int speed) {
        currentSpeed = speed;
        System.out.println("Vehicle.move(): Moving at  " + currentSpeed);

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void stop() {
        this.currentSpeed = 0;
    }

}
