package com.revature.beans;

public class Staff {

	private String name;
	private String post;  	// post means Position/Designation
	private double salary;	// salary is hourly pay
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getPost() {
		return post;
	}
	
	public void setPost(String post) {
		this.post=post;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Staff [Name=" + name + ", Designation=" + post + ", Salary=" + salary + "per Hour]";
	}

	public void setSalary(int sal) {
		this.salary=sal;
	}
}
