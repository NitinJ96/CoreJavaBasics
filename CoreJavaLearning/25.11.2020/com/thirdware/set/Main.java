package com.thirdware.set;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static Employee employee;
	private static EmployeeSet employeeSet = new EmployeeSet();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				addEmployee();
				break;
			case 2:
				addIncrement();
				break;
			case 3:
				addTax();
				break;
			case 4:
				printEmployeeSet();
				break;
			case 5:
				removeEmployee();
				break;
			case 6:
				printEmployee();
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
		System.out.println("\t 1 - To add employee");
		System.out.println("\t 2 - To increment the salary to 5%");
		System.out.println("\t 3 - To implement taxation on salary");
		System.out.println("\t 4 - To print All Employee Details");
		System.out.println("\t 5 - To remove Employee details");
		System.out.println("\t 6 - To print Specific Employee details");
		System.out.println("\t 7 - To quit the application");
	}

	public static void addEmployee() {
		System.out.print("\nEnter the EmployeeName: ");
		String name = scanner.nextLine();
		System.out.print("Enter the EmployeeID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the Gender: [M/F] ");
		char gender = scanner.nextLine().charAt(0);
		System.out.print("Enter the phoneNumber: ");
		String phone = scanner.nextLine();
		System.out.print("Enter the Address: ");
		String address = scanner.nextLine();
		System.out.print("Enter the department Code: ");
		int deptCode = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the department name: ");
		String deptName = scanner.nextLine();
		System.out.print("Enter the monthlySalary: ");
		double monthlySalary = scanner.nextDouble();

		employee = new Employee(name, id, gender, phone, address, monthlySalary, deptCode, deptName);
		employeeSet.addEmployeeDetails(employee);

	}

	public static void addIncrement() {
		System.out.print("Enter the name of Employee to increment Salary: ");
		String name = scanner.nextLine();
		if (employeeSet.incrementEmployeeSalary(name)) {
			System.out.println(name+"'s Salary Incremented");
		}
	}

	public static void addTax() {
		System.out.print("Enter the name of Employee to increment Salary: ");
		String name = scanner.nextLine();
		if (employeeSet.calculateTaxation(name)) {
			System.out.println(name+"'s Taxation done");
		}
	}

	public static void removeEmployee() {
		System.out.print("Enter the Employee Name to be removed: ");
		String name = scanner.nextLine();
		if(employeeSet.removeEmployeeDetails(name)) {
			System.out.println(name+" details Removed");
		}
	}
	
	public static void printEmployee() {
		System.out.print("Enter the name of to employee to display Details: ");
		String name = scanner.nextLine();
		employeeSet.printSpecificEmployee(name);
	}

	public static void printEmployeeSet() {
		employeeSet.printEmployeeSet();
	}

}
