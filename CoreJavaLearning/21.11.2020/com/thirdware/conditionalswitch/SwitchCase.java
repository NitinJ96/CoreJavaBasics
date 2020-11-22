package com.thirdware.conditionalswitch;

import java.util.Scanner;

import com.thirdware.conditionalif.LeapYear;

public class SwitchCase {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the month to find number of days: ");
		String month = scanner.next();
		System.out.println("Enter the year: ");
		int year = scanner.nextInt();
		
		switch(month) {
			case "January" : getDaysInMonth(1, year); break;
			case "Feburary" : getDaysInMonth(2, year); break;
			case "March" : getDaysInMonth(3, year); break;
			case "April" : getDaysInMonth(4, year); break;
			case "May" : getDaysInMonth(5, year); break;
			case "June" : getDaysInMonth(6, year); break;
			case "July" : getDaysInMonth(7, year); break;
			case "August" : getDaysInMonth(8, year); break;
			case "September" : getDaysInMonth(9, year); break;
			case "October" : getDaysInMonth(10, year); break;
			case "November" : getDaysInMonth(11, year); break;
			case "December" : getDaysInMonth(12, year); break;
			default : System.out.println("Enter a correct month and year");
		}
		
		
	}
	
	public static void getDaysInMonth(int month, int year){
	     if(year>0 && year<9999){
	     int days=0;
	     switch (month){
	         case 1:case 3:case 5: case 7: case 8:
	             case 10: case 12: days = 31; break;
	         
	         case 2: days = LeapYear.isLeapYear(year)==true?29:28; break;
	         
	         case 4:case 6:case 9:case 11: days = 30; break;
	         
	    }
	     System.out.println("No of days in the month:"+month+" and year:"+year+" is :"+days);
	 }
	}

}
