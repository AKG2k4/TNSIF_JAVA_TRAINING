package com.tns.day4.firstpackage;

public class Executor {

	public static void main(String[] args) {
		
		Base b1=new Base();
		b1.varDefault=40;
		b1.varPublic=70;
		b1.varProtected=90;
		//b1.varPrivate=80; 
		
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		//obj.methodPrivate();
	}

}
