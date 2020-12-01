package com.thirdware.fileinputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.thirdware.set.EmployeeSet;

public class CSVReadWriteUpdate {

	private static Employee employee;
	private EmployeeLinkedHashSet employeeLinkedHashSet = new EmployeeLinkedHashSet();

	public void readDataFromCSV() {
		String filePath = "C:\\Users\\nitin\\Desktop\\Thirdware Training\\JavaAssignmentFiles\\Employees.csv";
		String delimiter = ",";
		String line = "";
		int iteration = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			while ((line = br.readLine()) != null) {
				if (iteration == 0) {
					iteration++;
					continue;
				}
				String[] data = line.split(delimiter);
				String employeeID = data[0];
				String employeeName = data[1];
				String departmentName = data[2];
				String managerEmpID = data[3];
				long grossSalary = Long.parseLong(data[4]);
				int experienceInYears = Integer.parseInt(data[5]);
				employee = new Employee(employeeID, employeeName, departmentName, managerEmpID, grossSalary,
						experienceInYears);
				employeeLinkedHashSet.addEmployeeToSet(employee);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employeeLinkedHashSet.printEmployee();
	}

	public void writeDataToCSV() {

		if (!employeeLinkedHashSet.isEmployeeList()) {
			String DELIMITER = ",";
			String NEW_LINE_SEPARATOR = "\n";
			String FILE_HEADER = "Emp Id,Emp Name,Department,Manager Emp Id,Gross Salary [In INR],Experience In Years";

			try {
				FileWriter fileWriter = new FileWriter(
						"C:\\Users\\nitin\\Desktop\\Thirdware Training\\JavaAssignmentFiles\\SortedEmployees.csv");
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				PrintWriter printWriter = new PrintWriter(bufferedWriter);
				printWriter.append(FILE_HEADER + NEW_LINE_SEPARATOR);
				for (Employee employee : employeeLinkedHashSet.getEmployeeSet()) {
					printWriter.append(employee.getEmployeeID() + DELIMITER + employee.getEmployeeName() + DELIMITER
							+ employee.getDepartmentName() + DELIMITER + employee.getManagerEmpID() + DELIMITER
							+ employee.getGrossSalary() + DELIMITER + employee.getExperienceInYears()
							+ NEW_LINE_SEPARATOR);
				}
				printWriter.flush();
				printWriter.close();
				System.out.println("Successfully Created SortedEmployee CSV File");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}

	}

	public void updateDataToCSV() {
		if (!employeeLinkedHashSet.isEmployeeList()) {
			String DELIMITER = ",";
			String NEW_LINE_SEPARATOR = "\n";
			String FILE_HEADER = "Emp Id,Emp Name,Department,Manager Emp Id,Gross Salary [In INR],Experience In Years";
			
			//Changing the ManagerName
			for (Employee employee : employeeLinkedHashSet.getEmployeeSet()) {
				if (employee.getEmployeeName().equals("Sundar Ramanujam")) {
					employeeLinkedHashSet.changeManagerName(employee);
				}
			}

			try {
				FileWriter fileWriter = new FileWriter(
						"C:\\Users\\nitin\\Desktop\\Thirdware Training\\JavaAssignmentFiles\\temp.csv");
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				PrintWriter printWriter = new PrintWriter(bufferedWriter);
				printWriter.append(FILE_HEADER + NEW_LINE_SEPARATOR);
				for (Employee employee : employeeLinkedHashSet.getEmployeeSet()) {
					printWriter.append(employee.getEmployeeID() + DELIMITER + employee.getEmployeeName() + DELIMITER
							+ employee.getDepartmentName() + DELIMITER + employee.getManagerEmpID() + DELIMITER
							+ employee.getGrossSalary() + DELIMITER + employee.getExperienceInYears()
							+ NEW_LINE_SEPARATOR);
				}
				printWriter.flush();
				printWriter.close();
				System.out.println("\nSuccessfully Updated Employees.csv File");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}
	}
	
	public void deleteDataInCsv(String employeeID) {
		
		if (!employeeLinkedHashSet.isEmployeeList()) {
			String DELIMITER = ",";
			String NEW_LINE_SEPARATOR = "\n";
			String FILE_HEADER = "Emp Id,Emp Name,Department,Manager Emp Id,Gross Salary [In INR],Experience In Years";
			
			employeeLinkedHashSet.deleteEmployee(employeeID);

			try {
				FileWriter fileWriter = new FileWriter(
						"C:\\Users\\nitin\\Desktop\\Thirdware Training\\JavaAssignmentFiles\\temp.csv");
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				PrintWriter printWriter = new PrintWriter(bufferedWriter);
				printWriter.append(FILE_HEADER + NEW_LINE_SEPARATOR);
				for (Employee employee : employeeLinkedHashSet.getEmployeeSet()) {
					printWriter.append(employee.getEmployeeID() + DELIMITER + employee.getEmployeeName() + DELIMITER
							+ employee.getDepartmentName() + DELIMITER + employee.getManagerEmpID() + DELIMITER
							+ employee.getGrossSalary() + DELIMITER + employee.getExperienceInYears()
							+ NEW_LINE_SEPARATOR);
				}
				printWriter.flush();
				printWriter.close();
				System.out.println("\nSuccessfully Updated Employees.csv File");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("Employee List Empty - Press 1 to add data to Employee List");
		}

		
	}
}
