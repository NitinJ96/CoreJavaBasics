package com.thirdware.multidimensional;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {{1,2,9,6},{1,5,6,0}};
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<4; j++) {
				System.out.println(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
