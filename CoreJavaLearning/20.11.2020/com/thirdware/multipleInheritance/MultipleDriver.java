package com.thirdware.multipleInheritance;

public class MultipleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartPhone = new SmartPhone();
		System.out.println("Base class methods");
		smartPhone.call();
		smartPhone.message();
		smartPhone.receiveCall();
		
		System.out.println("\nDerived Class Methods");
		smartPhone.internet();
		smartPhone.Whatsapp();
		
		System.out.println("\nInterface Overriden Methods");
		smartPhone.display3DImage();
		smartPhone.projectVideo();
	}

}
