package com.thirdware.coreconcept;

public class Employee extends PersonalInfo {
	private String name;
	private double monthlySalary;
	Department department;
	public Employee(String name,int id, char gender, String phone, String address, double monthlySalary, int deptCode, String deptName) {
		super(id, phone, address, gender);
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.department = new Department(deptCode, deptName);
	}
	public String getName() {
		return name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void UpdateSalary(double updatedSalary) {
		this.monthlySalary = updatedSalary;
	}
	@Override
	public String toString() {
		return "\nEmployeeName: " + getName() + "\nEmployeeID: " + getId() 
		+ "\nphoneNumber: " + getPhone() + "\nAddress: " + getAddress() 
		+ "\nGender: " + getGender() + "\nMonthlySalary: " 
		+ monthlySalary + "\nAnnualSalary: "+ monthlySalary*12 + department.toString();
	}
}
