package com.thirdware.day2;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Encapsulation object = new Encapsulation();
		System.out.println(object.getName());
		System.out.println(object.getAge());
		object.setAge(24);
		System.out.println(object.getName());
		System.out.println(object.getAge());
	}
}
