package com.thirdware.reversearray;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,6,3,5,4,10,9,8,7};
		int duplicateArray[] = new int[array.length];
		int i=array.length-1, j=0;
		while(i>-1) {
			duplicateArray[j]=array[i];
			i--;
			j++;
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(duplicateArray));
	}

}
