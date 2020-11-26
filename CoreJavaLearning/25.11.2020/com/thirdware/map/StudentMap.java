package com.thirdware.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMap {
	private LinkedHashMap<Integer, Student> studentMap = new LinkedHashMap();
	
	public int checkAdmissionNumber() {
		if(studentMap.isEmpty()) {
			return 0;
		}
		return studentMap.size();
	}
	
	public void addStudentMap(int admissionNumber, Student student) {
		studentMap.put(admissionNumber, student);
	}
	
	public void printStudentMap() {
		if(!studentMap.isEmpty()) {
			for(Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
				System.out.println("\n\tAdmission Number: "+entry.getKey()+entry.getValue().toString());
			}
		}else {
			System.out.println("No Students Present");
		}
	}
	
	public boolean printSpecificStudent(int admissionNumber, String name){
		if(!studentMap.isEmpty()) {
			for(Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
				if(entry.getKey().equals(admissionNumber)&&entry.getValue().getName().equals(name)) {
					System.out.println("\n\tAdmission Number: "+entry.getKey()+":"+entry.getValue().toString());
					return true;
				}
			}
			System.out.println("Please provide valid details");
			return false;
		}else {
			System.out.println("No Students Present");
			return false;
		}
	}
	
}
