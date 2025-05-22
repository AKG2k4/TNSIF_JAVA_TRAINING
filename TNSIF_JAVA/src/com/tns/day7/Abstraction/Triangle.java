package com.tns.day7.Abstraction;

public class Triangle extends Shape {
	
	private float base,height;
	
	public Triangle() {
		base=3.0f;
		height=12.0f;
}

	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		area=(base*height)/2;
	}
}