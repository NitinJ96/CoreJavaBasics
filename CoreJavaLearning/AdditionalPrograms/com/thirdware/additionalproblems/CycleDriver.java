package com.thirdware.additionalproblems;



class BiCycle {
	
	static String define_me() {
		return "a vehicle with pedals";
	}
	
}

class MotorCycle extends BiCycle {
	
	static String define_me(){
		return "a cycle with an engine.";
	}
}


public class CycleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorCycle M = new MotorCycle();
		System.out.println("Hello I am motorcycle, I am "+M.define_me());
		System.out.println("My ancestor is a cycle who is "+BiCycle.define_me());
	}

}
