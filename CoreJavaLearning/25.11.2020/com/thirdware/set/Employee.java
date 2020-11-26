package com.thirdware.set;

public class Employee extends PersonalInfo{
	private String name;
	private double monthlySalary;
	Department department;

	public Employee(String name, int id, char gender, String phone, String address, double monthlySalary, int deptCode,
			String deptName) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		long temp;
		temp = Double.doubleToLongBits(monthlySalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (Double.doubleToLongBits(monthlySalary) != Double.doubleToLongBits(other.monthlySalary))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nEmployeeName: " + getName() + "\nEmployeeID: " + getId() + "\nphoneNumber: " + getPhone()
				+ "\nAddress: " + getAddress() + "\nGender: " + getGender() + "\nMonthlySalary: " + monthlySalary
				+ "\nAnnualSalary: " + monthlySalary * 12 + department.toString();
	}
}
