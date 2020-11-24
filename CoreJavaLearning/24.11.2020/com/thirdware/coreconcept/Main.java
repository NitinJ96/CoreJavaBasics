package com.thirdware.coreconcept;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner =  new Scanner(System.in);
	static Employee employee;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit = false;
		int choice;
		printInstructions();
		while(!quit) {
			System.out.print("\nEnter the Choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice){
            case 0: printInstructions(); break;
            case 1: addEmployee(); break;
            case 2: addIncrement(); break;
            case 3: addTax(); break;
            case 4: printEmployeeDetails();break;
            case 5: quit = true; break;
        }
		}
		System.out.println("Thanks for using the Application");
	}
	
	private static void printInstructions(){
        System.out.println("Press");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To add employee");
        System.out.println("\t 2 - To increment the salary to 5%");
        System.out.println("\t 3 - TO implement taxation on salary");
        System.out.println("\t 4 - To print the Employee Details");
        System.out.println("\t 5 - To quit the application");
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
		
	}
	
	public static void addIncrement() {
		try {
			if(employee.getName()!=null) {
				EmployeeFinancials.incrementAnnualSalary(employee);
				System.out.println("Employee details after incrementing salary:");
				System.out.println(employee.toString());
			}
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("No employee is present, please Enter the employee details");
		}
		
	}
	
	public static void addTax() {
		try {
			if(employee.getName()!=null) {
				EmployeeFinancials.calculateTax(employee);
				System.out.println("Employee details after Taxation:");
				System.out.println(employee.toString());
			}
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("No employee is present, please Enter the employee details");
		}
		
	}
	
	public static void printEmployeeDetails() {
		System.out.println(employee.toString());
	}

}
