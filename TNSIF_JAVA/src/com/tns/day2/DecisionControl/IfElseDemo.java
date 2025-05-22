package com.tns.day2.DecisionControl;

public class IfElseDemo {
	
	public static void main(String[] args) {
		
		int age=11;
		if(age>=18)System.out.println("eligible to vote"); //condition is false (11<18) so skipped
		else System.out.println("not eligible to vote"); //printed as if is false
		System.out.println("if-else implementation");
		
	}

}
