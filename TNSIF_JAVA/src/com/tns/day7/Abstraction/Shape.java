package com.tns.day7.Abstraction;

public abstract class Shape {

	protected float area;
	abstract void calArea(); //abstract method
	void show() { //non-abstract method
		System.out.println("The area is: "+area);
	}
	
}
