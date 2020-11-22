package com.thirdware.multipleinheritance;

public class SmartPhone extends MobilePhone implements Holograph {
	
	
	public void internet() {
		System.out.println("Connect to internet");
	}
	
	public void Whatsapp() {
		System.out.println("Message or call using whatsapp");
	}
	@Override
	public void display3DImage() {
		// TODO Auto-generated method stub
		System.out.println("Display 3D image in Projection");
	}

	@Override
	public void projectVideo() {
		// TODO Auto-generated method stub
		System.out.println("ON Production");
	}
	
}
