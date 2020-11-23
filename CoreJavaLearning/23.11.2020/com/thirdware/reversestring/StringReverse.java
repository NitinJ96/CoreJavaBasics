package com.thirdware.reversestring;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringReverse {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Enter a String: ");
			String str = scanner.next();
			System.out.println("Reversed String: "+reverse(str));
		}catch (InputMismatchException e) {
			System.out.println("Enter the proper String Error:"+e);
		}catch (NullPointerException e) {
			System.out.println("No Data is present in the string Error:"+e);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			scanner.close();
			System.out.println("End of Program");
		}
		
		
	}
	
	public static String reverse(String str) {
		String reverse = "";
		for(int i=str.length()-1; i>-1; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}

}
