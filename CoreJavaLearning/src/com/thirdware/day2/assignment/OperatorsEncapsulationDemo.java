package com.thirdware.day2.assignment;

public class OperatorsEncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperatorsEncapsulation operator = new OperatorsEncapsulation();
		operator.setA(5);
		operator.setB(7);
		operator.setC(-6);
		operator.setX(false);
		
		System.out.println("Value of a is: "+operator.getA());
		System.out.println("Value of b is: "+operator.getB());
		System.out.println("Value of c is: "+operator.getC());
		System.out.println("Value of x is: "+operator.isX());
		
		System.out.println("\nUnary Operator:\n");
		operator.unaryOperator();
		System.out.println("\nAssignment Operators:\n");
		operator.assignmentOperator();
		System.out.println("\nRelational Operator\n");
		operator.relationalOperator();
		System.out.println("\nLogial Operator\n");
		operator.logicalOperator();
		System.out.println("\nTernary Operator\n");
		operator.ternaryOperator();

	}

}
