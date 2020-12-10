package com.thirdware.fileinputoutput;

import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeLinkedHashSet {

	private static LinkedHashSet<Employee> employeeSet = new LinkedHashSet<Employee>();
	private static Set<String> departmentList = new LinkedHashSet<String>();
	private static Set<String> employeeIDList = new LinkedHashSet<String>();

	// Adds data to the LinkedHashSet
	public void addEmployeeToSet(Employee employee) {
		employeeSet.add(employee);
	}

	// Checks if list is empty or not!
	public boolean isEmployeeList() {
		return employeeSet.isEmpty();
	}

	// prints the whole set
	public void printEmployee() {
		if (!isEmployeeList()) {
			System.out.println("\n==============EmployeeData============\n");
			for (Employee employee : employeeSet) {
				employee.setManagerName(getManager(employee));
				System.out.println(employee.toString());
			}
		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}
	}

	// Returns the employee Set
	public Set<Employee> getEmployeeSet() {
		return employeeSet;
	}

	// returns the name of the Manager
	public static String getManager(Employee employee) {
		if (!employeeSet.isEmpty()) {
			for (Employee emp : employeeSet) {
				if (emp.getEmployeeID().equals(employee.getManagerEmpID())) {
					return emp.getEmployeeName();
				}
			}
		}
		return "Manager not Available";
	}

	public void changeManagerName(Employee employeeManagerChange) {
		if (!isEmployeeList()) {
			for (Employee emp : employeeSet) {
				if (emp.getEmployeeName().equals("Anshuman Gupta")) {
					employeeManagerChange.setManagerEmpID(emp.getEmployeeID());
				}
			}
			System.out.println("====================Printing Employee Data after Changing the Manager Name=============");
			printEmployee();
		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}
	}

	// Creates DepartmentList
	private void setDepartmentList() {
		if (!isEmployeeList()) {
			for (Employee employee : employeeSet) {
				departmentList.add(employee.getDepartmentName());
			}
		}
	}

	// Print Department List
	public boolean getDepartmentList() {
		setDepartmentList();
		if (!departmentList.isEmpty()) {
			System.out.print("DepartmentList:");
			for (String string : departmentList) {
				System.out.print("\n\t" + string);
			}
			return true;
		} else {
			return false;
		}
	}

	// Creates EmployeeIDList
	private void setEmployeeIDList() {
		if (!isEmployeeList()) {
			for (Employee employee : employeeSet) {
				employeeIDList.add(employee.getEmployeeID());
			}
		}
	}

	// Prints EmployeeIDList
	public boolean getEmployeeIDList() {
		setEmployeeIDList();
		if (!employeeIDList.isEmpty()) {
			System.out.print("EmployeeID List");
			for (String string : employeeIDList) {
				System.out.print("\n\t" + string);
			}
			return true;
		} else {
			return false;
		}
	}

	// Returns the total salary based on department
	public long getTotalSalaryForDepartment(String deptName) {
		long totalSalary = 0;
		if (!isEmployeeList()) {
			for (Employee employee : employeeSet) {
				if (employee.getDepartmentName().equals(deptName)) {
					totalSalary += employee.getGrossSalary();
				}
			}
			return totalSalary;
		} else {
			return 0;
		}
	}

	public void deleteEmployee(String employeeID) {
		if (!isEmployeeList()) {
			for (Employee employee : employeeSet) {
				if (employee.getEmployeeID().equals(employeeID)) {
					nullifyManager(employeeID);
					employeeSet.remove(employee);
					break;
				}
			}
			System.out.println("\nEmployee with " + employeeID + " is deleted");
		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}
	}

	private void nullifyManager(String employeeID) {
		for (Employee employee : employeeSet) {
			if (employee.getManagerEmpID().equals(employeeID)) {
				employee.setManagerEmpID(null);
				employee.setManagerName(null);
			}
		}
	}

	public void getEligibleEmployees(String deptName, String criteria, int noOfYears) {
		if (!isEmployeeList()) {
			for (Employee employee : employeeSet) {
				if (employee.getDepartmentName().equals(deptName) && employee.getExperienceInYears() >= noOfYears) {
					System.out.println(employee.toString());
				}
			}
		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}
	}

	public void getEligibleEmployees(String deptName, String criteria, long grossSalary) {
		if (!isEmployeeList()) {
			for (Employee employee : employeeSet) {
				if (employee.getDepartmentName().equals(deptName) && employee.getGrossSalary() >= grossSalary) {
					System.out.println(employee.toString());
				}
			}
		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}

	}

}
