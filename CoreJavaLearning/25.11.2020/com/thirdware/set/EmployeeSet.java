package com.thirdware.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeSet {
	Set<Employee> employeeSet = new LinkedHashSet<Employee>();

	public void addEmployeeDetails(Employee employee) {
		System.out.println(employeeSet);
		employeeSet.add(employee);
	}

	public boolean printEmployeeSet() {
		if (!employeeSet.isEmpty()) {
			for (Employee employee : employeeSet) {
				System.out.println(employee.toString());
			}
			return true;
		}
		System.out.println("No Employee Details Present");
		return false;
	}

	public boolean printSpecificEmployee(String name) {
		if (!employeeSet.isEmpty()) {
			for (Employee employee : employeeSet) {
				if (employee.getName().equals(name)) {
					System.out.println(employee.toString());
					return true;
				}
			}
			System.out.println("Enter Valid Employee Details");
			return false;
		}
		System.out.println("No Employee Details Present");
		return false;
	}

	public boolean removeEmployeeDetails(String name) {
		if (!employeeSet.isEmpty()) {
			for (Employee employee : employeeSet) {
				if (employee.getName().equals(name)) {
					employeeSet.remove(employee);
					return true;
				}
			}
			System.out.println("Enter Valid Employee Details");
			return false;
		}
		System.out.println("No Employee Details Present");
		return false;
	}

	public boolean incrementEmployeeSalary(String name) {
		if (!employeeSet.isEmpty()) {
			for (Employee employee : employeeSet) {
				if (employee.getName().equals(name)) {
					EmployeeFinancials.incrementAnnualSalary(employee);
					System.out.println("Employee details after incrementing salary:");
					System.out.println(employee.toString());
					return true;
				}
			}
			System.out.println("Enter Valid Employee Details");
			return false;
		}
		System.out.println("No Employee Details Present");
		return false;
	}

	public boolean calculateTaxation(String name) {
		if (!employeeSet.isEmpty()) {
			for (Employee employee : employeeSet) {
				if (employee.getName().equals(name)) {
					EmployeeFinancials.calculateTax(employee);
					System.out.println("Employee details after Taxation:");
					System.out.println(employee.toString());
					return true;
				}
			}
			System.out.println("Enter Valid Employee Details");
			return false;
		}
		System.out.println("No Employee Details Present");
		return false;
	}
}
