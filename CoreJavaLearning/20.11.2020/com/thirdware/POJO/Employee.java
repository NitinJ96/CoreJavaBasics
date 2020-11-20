package com.thirdware.POJO;

public class Employee {
	
	private int employeeID;
	private String EmployeeName;
	private String EmployeeAddress;
	
	public Employee(int employeeID, String employeeName, String employeeAddress) {
		super();
		this.employeeID = employeeID;
		EmployeeName = employeeName;
		EmployeeAddress = employeeAddress;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	@Override
	public String toString() {
		return "EmployeeName: "+getEmployeeName()+ "\nEmployeeId: "+getEmployeeID()+"\nEmployeeAddress: "+getEmployeeAddress();
	}
	
	
}
