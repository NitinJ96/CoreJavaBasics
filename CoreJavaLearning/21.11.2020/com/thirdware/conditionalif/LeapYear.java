package com.thirdware.conditionalif;

import java.util.Scanner;

public class LeapYear {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static boolean isLeapYear(int year) {
		if(year<1 || year>9999) {
			return false;
		}
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();
		
		if(isLeapYear(year)) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+" is not a leap year");
		}
	}
}
