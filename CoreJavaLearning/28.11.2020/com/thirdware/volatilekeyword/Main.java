package com.thirdware.volatilekeyword;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Counter count = new Counter();
		count.setName("Counter");
		
		
		System.out.println("To stop Press Enter");
		count.start();
		
		Scanner scanner =  new Scanner(System.in);
		scanner.nextLine();
		
		count.stopCounting();
		
		
	}

}
