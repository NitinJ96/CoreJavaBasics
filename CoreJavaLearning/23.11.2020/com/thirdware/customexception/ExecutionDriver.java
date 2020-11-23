package com.thirdware.customexception;

public class ExecutionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = "My new Custom Exception";
			throw new MyException(s);
		}catch (MyException e){
			System.out.println("Catch Block");
			System.out.println("MyException is caught");
			System.out.println("Message caught from MyException: "+e.getMessage());
		}finally {
			System.out.println("\nFinally Block: Custom Exception is handled");
		}
	}

}
