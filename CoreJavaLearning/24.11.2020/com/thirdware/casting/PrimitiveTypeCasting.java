package com.thirdware.casting;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive type Casting:
		// boolean<byte<short<char<int<long<float<double
		int num=49;
		
		// Higher Order casting : Implicit Casting
		double num1 = num;
		float num2 = num;
		
		// Lower Order Casting : Explicit Casting
		int num3 = (int) num1;
		float num4 = (float) num1;
	}

}
