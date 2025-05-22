package com.tns.day8.Static;

public class Employee {
	
	private String name;
	private int id;
	
	static String companyName="atria";

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= " + companyName + "]";
	}
	
	

}
