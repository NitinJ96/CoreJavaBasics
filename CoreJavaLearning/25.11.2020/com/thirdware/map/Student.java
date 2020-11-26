package com.thirdware.map;

public class Student {

	private int admissionNumber;
	private String name;
	private int age;
	private String dob;
	private char gender;

	public int getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public Student(String name, int age, String dob, char gender, int admissionNumber) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.admissionNumber = admissionNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDob() {
		return dob;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + admissionNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (admissionNumber != other.admissionNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n\tName: " + name + "\n\tAge: " + age + "\n\tdob: " + dob
				+ "\n\tGender: " + gender;
	}
	
	
	
	

}
