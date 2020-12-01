package com.thirdware.fileinputoutput;

public class Employee {

	private String employeeID;
	private String employeeName;
	private String departmentName;
	private String managerEmpID;
	private long grossSalary;
	private int experienceInYears;
	private String managerName;

	public Employee(String employeeID, String employeeName, String departmentName, String managerEmpID,
			long grossSalary, int experienceInYears) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.departmentName = departmentName;
		this.managerEmpID = managerEmpID;
		this.grossSalary = grossSalary;
		this.experienceInYears = experienceInYears;
	}

	public void setManagerEmpID(String managerEmpID) {
		this.managerEmpID = managerEmpID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getManagerEmpID() {
		return managerEmpID;
	}

	public long getGrossSalary() {
		return grossSalary;
	}

	public int getExperienceInYears() {
		return experienceInYears;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerName() {
		return managerName;
	}

	@Override
	public String toString() {
		return "\n\tEmployee ID: " + employeeID + "\n\tName: " + employeeName + "\n\tDepartment: " + departmentName
				+ "\n\tManager: " + getManagerName() + "\n\tGross Salary: INR " + grossSalary + "\n\tExperience: "
				+ experienceInYears + " years";
	}

}
