package com.tns.day4.firstpackage;

public class Base {

	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=80;
	
	void methodDefault() {
		System.out.println("I am a default method");
		System.out.println("Default variable: "+varDefault);
	}
	
	public void methodPublic() {
		System.out.println("I am a public method");
		System.out.println("Public variable: "+varPublic);
	}
	
	private void methodPrivate() {
		System.out.println("I am a private method");
		System.out.println("Public variable: "+varPrivate);
	}
	
	protected void methodProtected() {
		System.out.println("I am a protected method");
		System.out.println("Public variable: "+varProtected);
	}
	
}
