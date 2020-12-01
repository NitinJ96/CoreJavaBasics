package com.thirdware.fileinputoutput;

import java.util.Comparator;

public class SortingClass {

}

class SortByEmployeeID implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee1.getEmployeeID().compareTo(employee2.getEmployeeID());
	}

}

class SortByEmployeeName implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee1.getEmployeeName().compareTo(employee2.getEmployeeName());
	}

}

class SortByDepartment implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee1.getDepartmentName().compareTo(employee2.getDepartmentName());
	}

}

class SortByManagerID implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee1.getManagerEmpID().compareTo(employee2.getManagerEmpID());
	}

}

class SortByGrossSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		if (employee1.getGrossSalary() < employee2.getGrossSalary())
			return -1;
		else if (employee1.getGrossSalary() > employee2.getGrossSalary())
			return 1;
		else
			return 0;
	}
}

class SortByExperience implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee1.getExperienceInYears() - employee2.getExperienceInYears();
	}

}
