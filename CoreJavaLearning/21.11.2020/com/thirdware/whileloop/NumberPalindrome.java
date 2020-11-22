package com.thirdware.whileloop;

import java.util.Scanner;

public class NumberPalindrome {
	
	static Scanner scanner = new Scanner(System.in);
	public static boolean isPalindrome(int number){
        int temp = number, rem =0, rev =0;
        while(temp!=0){
            rem = temp%10;
            rev = (rev*10) + rem;
            temp = temp/10;
        }
        return number==rev;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.print("Enter the number to check for palindrome: ");
		int num = scanner.nextInt();
		
		if(isPalindrome(num)) {
			System.out.println("The "+num+" is a palindrome");
		}else {
			System.out.println("The "+num+" is not a palindrome");
		}
	}

}
