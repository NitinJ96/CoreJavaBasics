package com.thirdware.map;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner =  new Scanner(System.in);
	private static StudentMap studentMap = new StudentMap();
	private static Student student;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit =  false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.print("\nEnter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0: printInstructions(); break;
                case 1: studentMap.printStudentMap(); break;
                case 2: addStudent(); break;
                case 3: printSpecificStudentDetails();break;
                case 4: quit = true; break;
            }
        }
	}
	public static void printInstructions(){
        System.out.println("Press");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the all StudentDetails");
        System.out.println("\t 2 - To addmit Student");
        System.out.println("\t 3 - To print Specific Student Details");
        System.out.println("\t 4 - To quit the application");
    }
	
	public static void addStudent() {
		System.out.print("\nEnter the Name of Student: ");
		String name = scanner.nextLine();
		System.out.print("Enter the age of Student: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the date of birth of Student: ");
		String dob = scanner.nextLine();
		System.out.print("Enter the gender of Student: ");
		char gender = scanner.nextLine().charAt(0);
		
		int admissionNumber = 1000+studentMap.checkAdmissionNumber();
		
		student = new Student(name, age, dob, gender, admissionNumber);
		
		studentMap.addStudentMap(admissionNumber, student);
	}
	
	public static void printSpecificStudentDetails(){
		System.out.print("Enter the name of the Student: ");
		String name = scanner.nextLine();
		System.out.print("Enter the admission number of the Student: ");
		int admissionNumber = scanner.nextInt();
		
		studentMap.printSpecificStudent(admissionNumber, name);
	}

}
