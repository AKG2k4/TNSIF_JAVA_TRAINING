package com.tns.day7.Abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		
//		Shape s=new Shape();
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle(25.0f,40.5f);
		sq.calArea();
		r1.calArea();
		t1.calArea();
		sq.show();
		r1.show();
		t1.show();
	}

}
