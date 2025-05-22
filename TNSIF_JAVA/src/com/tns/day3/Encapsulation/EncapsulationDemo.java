package com.tns.day3.Encapsulation;
import java.util.Scanner;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EncapsulationExample obj=new EncapsulationExample();
		System.out.println("Enter serial number, name, age: ");
		int sno=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		obj.setAge(sno);
		obj.setName(name);
		obj.setSerialNum(age);

		System.out.println(obj);
		sc.close();
	}

}
