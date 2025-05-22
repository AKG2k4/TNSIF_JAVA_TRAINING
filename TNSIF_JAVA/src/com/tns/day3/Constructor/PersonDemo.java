package com.tns.day3.Constructor;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name, income, gender, age, tax: ");	
		Person p=new Person(sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
		System.out.println(p);
		sc.close();
	}

}
