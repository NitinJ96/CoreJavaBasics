package com.thirdware.set;

public class EmployeeFinancials {
	public static void incrementAnnualSalary(Employee employee) {
		double AnnualSalary = employee.getMonthlySalary() * 12;
		double increment = AnnualSalary * 5 / 100;
		AnnualSalary = increment + AnnualSalary;
		employee.UpdateSalary(AnnualSalary / 12);
	}

	public static void calculateTax(Employee employee) {
		double AnnualSalary = employee.getMonthlySalary() * 12;
		double taxation;
		if (employee.getGender() == 'M') {
			taxation = AnnualSalary / 10;
			AnnualSalary = AnnualSalary - taxation;
			employee.UpdateSalary(AnnualSalary / 12);
		}
		if (employee.getGender() == 'F') {
			taxation = AnnualSalary / 20;
			AnnualSalary = AnnualSalary - taxation;
			employee.UpdateSalary(AnnualSalary / 12);
		}
	}
}
