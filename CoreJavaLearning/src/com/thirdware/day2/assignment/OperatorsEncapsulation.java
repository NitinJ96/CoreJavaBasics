package com.thirdware.day2.assignment;

public class OperatorsEncapsulation {
	
	private int a, b, c;
	private boolean x;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public boolean isX() {
		return x;
	}
	public void setX(boolean x) {
		this.x = x;
	}
	
	public void unaryOperator() {
		System.out.println("Unary minus (-c) : "+(-c));
		System.out.println("PostIncrement ((a++)) : "+(a++));
		System.out.println("PreIncrement (++a) : "+(++a));
		System.out.println("PostDecrement (a--) : "+(a--));
		System.out.println("PreDecrement (--a) : "+(--a));
	}
	
	public void assignmentOperator() {
		System.out.println("Compound Statement (a+=2):"+(a+=2));
		System.out.println("Compound Statement (a-=2):"+(a-=2));
		System.out.println("Compound Statement (a*=2):"+(a*=2));
		System.out.println("Compound Statement (a/=2):"+(a/=2));
		System.out.println("Compound Statement (a%=2):"+(a%=2));
	}
	
	public void relationalOperator() {
		System.out.println("Equal to (a==b): "+(a==b));
		System.out.println("Not Equal to (a!=b): "+(a!=b));
		System.out.println("Less than (a<b): "+(a<b));
		System.out.println("Greater than (a>b): "+(a>b));
		System.out.println("less than or equal to (a<=b): "+(a<=b));
		System.out.println("Greater than or equal to (a>=b): "+(a>=b));
	}
	public void logicalOperator() {
		System.out.println("AND ((c==-3)&&(a!=5))"+((c==-3)&&(a!=5)));
		System.out.println("OR ((c==-3)||(a!=5))"+((c==-3)||(a!=5)));
		System.out.println("NOT !true"+!true);
	}
	
	public void ternaryOperator() {
		System.out.println(a==b?"a is equal b":"a is not equal to b");
	}
}
