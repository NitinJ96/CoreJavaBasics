package com.thirdware.forloop;

import java.util.Scanner;

public class PerfectNumber {
	
	static Scanner scanner = new Scanner(System.in);
	public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sum = 0;
        for(int i =1; i<=number/2; i++){
            if(number%i==0){
                sum += i;
            }
            if(sum==number)
                return true;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number to check for PerfectNumber: ");
		int num = scanner.nextInt();
		
		if(isPerfectNumber(num)) {
			System.out.println("The "+num+" is a PerfectNumber");
		}else {
			System.out.println("The "+num+" is not a PerfectNumber");
		}
	}

}
