package com.thirdware.staticKeyword;

public class ObjectCount {
	
	public static int objectCount;
	
	public ObjectCount() {
		this.objectCount++;
	}

	public static int getObjectCount() {
		return objectCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCount sample = new ObjectCount();
		System.out.println("Object Count: "+getObjectCount());
		ObjectCount sample2 = new ObjectCount();
		System.out.println("Object Count: "+getObjectCount());
	}

}
