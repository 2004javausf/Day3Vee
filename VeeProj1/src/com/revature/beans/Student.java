package com.revature.beans;

public class Student {
	
	private String name;
	private String grade;	// grade is from A-F
	private int marks;		// Marks is from 1-100
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade=grade;
	}
	
	public int getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return "Student [Name=" + name + ", Marks=" + marks + ", Grade=" + grade + "]";
	}

	public void setMarks(int marks) {
		this.marks=marks;
	}

}
