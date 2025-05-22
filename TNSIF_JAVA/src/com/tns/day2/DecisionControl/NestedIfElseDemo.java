package com.tns.day2.DecisionControl;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		
		int a=10,b=20,c=5;
		if(a>b&&a>c)
			System.out.println("a is the greatest value: "+a);
		else
			if(b>c)
				System.out.println("b is the greatest value: "+b);
			else
				System.out.println("c is the greatest value: "+c);
		
	}

}
