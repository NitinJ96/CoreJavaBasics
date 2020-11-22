package com.thirdware.string;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class StringMethod {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a FirstName: ");
		String firstName = scanner.next();
		System.out.println("Enter the LastName");
		String lastName = scanner.next();
		System.out.println("Enter a fullName: ");
		String fullName = scanner.next();
		
		System.out.println("Char at index 5 in firstName: "+firstName.charAt(3));
		System.out.println("concat firstName and lastName: "+firstName.concat(lastName));
		System.out.println("Check if full name contains firstName: "+fullName.contains(firstName));
		System.out.println("Get index of firstName in fullName: "+fullName.indexOf(lastName));
		System.out.println("Get last index for firstName in fullName: "+fullName.lastIndexOf(firstName));
		System.out.println("FullName to lowercase: "+fullName.toLowerCase());
		System.out.println("FullName to upperCase: "+fullName.toUpperCase());
		System.out.println("To get substring of firstName from index 5"+fullName.substring(5));
		System.out.println("TO get length of String: "+fullName.length());
		System.out.println("To check if fullName and lastName are equal: "+fullName.equalsIgnoreCase(firstName));
		
	}
}
