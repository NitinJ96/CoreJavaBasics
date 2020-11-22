package com.thirdware.statickeyword;

public class ObjectCount {
	
	public static int objectCount;
	
//	private ObjectCount() {
//		objectCount = 1;
//	}
	
	public ObjectCount() {
		this.objectCount++;
	}

	public static int getObjectCount() {
		return objectCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ObjectCount();
		System.out.println("Object Count: "+getObjectCount());
//		ObjectCount sample2 = new ObjectCount();
//		System.out.println("Object Count: "+getObjectCount());
	}

}
