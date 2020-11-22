package com.thirdware.thiskeyword;

public class BaseTimeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseTime sample1 = new BaseTime();
		BaseTime sample2 = new BaseTime(12);
		BaseTime sample3 = new BaseTime(22,4);
		BaseTime sample4 = new BaseTime(8,55,35);

		System.out.println(sample1.toMilitary());
		System.out.println(sample2.toMilitary());
		System.out.println(sample3.toMilitary());
		System.out.println(sample4.toMilitary());
	}

}
