package com.thirdware.arraysumavg;

import java.util.Arrays;

public class ArraySumAvg {
	public static void main(String[] args) {
		double array[] = {56,89,32,15,3,15,651,13};
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum of Array values: "+Arrays.toString(array)+" is: "+sum);
		System.out.println("Average of Array values: "+Arrays.toString(array)+" is: "+(sum/array.length));
	}
}
