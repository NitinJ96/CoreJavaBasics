package com.thirdware.day2.assignment;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3,b = 5, c=-3;
		boolean x = true;
		System.out.println("a= "+a+" , b= "+b+" ,c= "+c+" ,x= "+x);
		System.out.println("Unary Operator");
		System.out.println("Unary minus (-c) : "+(-c)); //negates the negative sign gives positive value
		System.out.println("PostIncrement ((a++)) : "+(a++)); //assigns and then increments 3
		System.out.println("PreIncrement (++a) : "+(++a)); //increments the previously incremented value ans-5
		System.out.println("PostDecrement (a--) : "+(a--)); //assigns and decrements 5
		System.out.println("PreDecrement (--a) : "+(--a)); //decrements 3
		System.out.println();
		System.out.println("Assignment Operators");
		System.out.println("Compound Statement (a+=2):"+(a+=2)); //5(original value 3 & previously decremented value - 3)
		System.out.println("Compound Statement (a-=2):"+(a-=2)); //value = 5, after operation 3
		System.out.println("Compound Statement (a*=2):"+(a*=2)); //value = 3, after operation 6
		System.out.println("Compound Statement (a/=2):"+(a/=2)); //value = 6, after operation 3
		System.out.println("Compound Statement (a%=2):"+(a%=2)); //value =3, after operation 1
		System.out.println();
		System.out.println("Relational Operators");
		System.out.println("Equal to (a==b): "+(a==b)); //false a=1, b=5
		System.out.println("Not Equal to (a!=b): "+(a!=b)); //true
		System.out.println("Less than (a<b): "+(a<b)); //true
		System.out.println("Greater than (a>b): "+(a>b)); //false
		System.out.println("less than or equal to (a<=b): "+(a<=b)); //true
		System.out.println("Greater than or equal to (a>=b): "+(a>=b)); //false
		System.out.println();
		System.out.println("Logical Operator");
		System.out.println("AND ((c==-3)&&(a!=5))"+((c==-3)&&(b!=5))); //false since both the conditions are not true
		System.out.println("OR ((c==-3)||(a!=5))"+((c==-3)||(a!=5))); //true since either of the condition is true
		System.out.println("NOT !x"+!x); //false
		System.out.println();
		System.out.println("Ternary Operator");
		System.out.println(a==b?"a is equal b":"a is not equal to b"); // a not = b
		
	}

}
