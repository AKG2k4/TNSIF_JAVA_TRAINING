package com.tns.day3.Constructor;

public class ConstructorDemo {

	public static void main(String[] args) {

		Customer obj=new Customer("Arya",1,"Bengaluru");
		System.out.println(obj);
		Customer tester=new Customer(null,2,"Madras");
		tester.setCustomerName("Vimarsh");
		tester.setCustomerCity("Chennai");
		System.out.println(tester.getCustomerCity());
	}

}
