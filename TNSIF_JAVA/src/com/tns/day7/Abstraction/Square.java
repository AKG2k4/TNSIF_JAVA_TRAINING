package com.tns.day7.Abstraction;

public class Square extends Shape {

	private float side;

	public Square() {
		side=2.0f;}
	
	public Square(float side) {
		super();
		this.side = side;}
	
	@Override
	void calArea() {
		area=side*side;}
	
}
