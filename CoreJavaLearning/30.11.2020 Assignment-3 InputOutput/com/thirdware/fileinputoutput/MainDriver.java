package com.thirdware.fileinputoutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainDriver {

	private static Scanner scanner = new Scanner(System.in);
	private static CSVReadWriteUpdate csvObject = new CSVReadWriteUpdate();
	private static EmployeeLinkedHashSet employeeSet = new EmployeeLinkedHashSet();

	public static void main(String[] args) {
		boolean quit = false;
		int choice;
		printInstructions();
		while (!quit) {
			System.out.print("\nEnter the Choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				printEmployeeList();
				break;
			case 2:
				sortEmployee();
				break;
			case 3:
				getTotalsalary();
				break;
			case 4:
				changeManagerDetails();
				break;
			case 5:
				getEligibleEmployee();
				break;
			case 6:
				deleteEmployee();
				break;
			case 7:
				quit = true;
				break;
			}
		}
		System.out.println("Thanks for using the Application");
	}

	private static void printInstructions() {
		System.out.println("Press");
		System.out.println("\t 0 - To print choice options");
		System.out.println("\t 1 - To read data from CSV file and print the employeeList");
		System.out.println("\t 2 - To sort employeeList based on specific column name and write to CSV file");
		System.out.println("\t 3 - To get total salary based on Department");
		System.out.println("\t 4 - To change Manager details and update to CSV");
		System.out.println("\t 5 - To get eligible employee based based on criteria");
		System.out.println("\t 6 - To delete employee and update data");
		System.out.println("\t 7 - To quit the application");
	}

	public static void printEmployeeList() {
		csvObject.readDataFromCSV();
	}

	private static void sortEmployee() {
		System.out.println("Press: " + "\t1 - For EmployeeID\n" + "\t2 - For EmployeeName\n" + "\t3 - For Department\n"
				+ "\t4 - For ManagerID\n" + "\t5 - For GrossSalary\n" + "\t6 - For Experience\n");
		System.out.print("Enter the choice from the List above to sort and write to csv file: ");
		int choice = scanner.nextInt();
		boolean isSort = false;
		ArrayList<Employee> tempList = new ArrayList<Employee>(employeeSet.getEmployeeSet());
		switch (choice) {
		case 1:
			Collections.sort(tempList, new SortByEmployeeID());
			isSort = !isSort;
			break;
		case 2:
			Collections.sort(tempList, new SortByEmployeeName());
			isSort = !isSort;
			break;
		case 3:
			Collections.sort(tempList, new SortByDepartment());
			isSort = !isSort;
			break;
		case 4:
			Collections.sort(tempList, new SortByManagerID());
			isSort = !isSort;
			break;
		case 5:
			Collections.sort(tempList, new SortByGrossSalary());
			isSort = !isSort;
			break;
		case 6:
			Collections.sort(tempList, new SortByExperience());
			isSort = !isSort;
			break;
		default:
			System.out.println("Enter the correct Choice");
			break;
		}

		if (isSort) {
			employeeSet.getEmployeeSet().clear();
			employeeSet.getEmployeeSet().addAll(tempList);
			csvObject.writeDataToCSV();
		} else {
			System.out.println("Press 2 to select the options again");
		}

	}

	private static void getTotalsalary() {
		if (employeeSet.getDepartmentList()) {
			System.out.print("\nEnter the DepartmentName from the available list above: ");
			String deptName = scanner.nextLine();
			System.out.println(
					"Total Gross Salary of " + deptName + " is: " + employeeSet.getTotalSalaryForDepartment(deptName));
		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}
	}

	private static void deleteEmployee() {
		if (employeeSet.getEmployeeIDList()) {
			System.out.print("\nEnter the Employee ID from the available list above: ");
			String employeeID = scanner.nextLine();
			csvObject.deleteDataInCsv(employeeID);
		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}

	}

	private static void getEligibleEmployee() {
		if (employeeSet.getDepartmentList()) {
			System.out.print("\nEnter the DepartmentName from the available list above: ");
			String deptName = scanner.nextLine();
			System.out.println("\nSelect Criteria: " + "\n\t1 - Experience" + "\n\t2 - Gross Salary");
			System.out.print("Enter the Choice for Criteria: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			String criteria = null;
			int selectChoice = 0;
			int noOfYears = 0;
			long grossSalary = 0;
			switch (choice) {
			case 1:
				System.out.print("Enter the number of years to be eligible: ");
				noOfYears = scanner.nextInt();
				criteria = "Experience";
				selectChoice = 1;
				break;
			case 2:
				System.out.print("Enter the gross Salary to be eligible: ");
				grossSalary = scanner.nextLong();
				criteria = "Gross Salary";
				selectChoice = 2;
				break;
			}

			if (selectChoice == 1) {
				employeeSet.getEligibleEmployees(deptName, criteria, noOfYears);
			} else if (selectChoice == 2) {
				employeeSet.getEligibleEmployees(deptName, criteria, grossSalary);
			} else {
				System.out.println("Enter the correct options");
			}
		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}
	}

	private static void changeManagerDetails() {
		csvObject.updateDataToCSV();
	}

}
