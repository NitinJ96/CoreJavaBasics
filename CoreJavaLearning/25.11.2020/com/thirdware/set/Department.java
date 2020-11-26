package com.thirdware.set;

public class Department {
	private int deptCode;
	private String deptName;

	public Department(int deptCode, String deptName) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
	}

	public int getDeptCode() {
		return deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public String toString() {
		return "\nDeptCode: " + deptCode + "\ndeptName: " + deptName;
	}
}
