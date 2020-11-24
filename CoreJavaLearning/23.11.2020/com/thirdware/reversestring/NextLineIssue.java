package com.thirdware.reversestring;

import java.util.Scanner;

public class NextLineIssue {
	static Scanner scanner =  new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer: ");
		int a = scanner.nextInt();
		System.out.println(a);
		System.out.println("Next int:");
		int b  = scanner.nextInt();
		System.out.println(b);
		// 12
		/// 12 \n
		
		System.out.println("Enter a string: ");
		String s = scanner.next();
		System.out.println(s);
		
	}

}
