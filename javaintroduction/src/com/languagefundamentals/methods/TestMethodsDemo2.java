package com.languagefundamentals.methods;

//(i)no_return type & no parameters
//wap calculate the vales using methods

public class TestMethodsDemo2 {
	void addition() {
		System.out.println("addition method called");
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void subtraction() {
		System.out.println("subtraction method called");
		int a=100;
		int b=50;
		System.out.println(a-b);
	}
	void multiplication() {
		System.out.println("multiplication method called");
		int a=10;
		int b=50;
		System.out.println(a*b);
	}
	void division() {
		System.out.println("division method called" );
		int a=100;
		int b=50;
		System.out.println(a/b);
	}
	void modulus() {
		System.out.println("modulus method called");
		int a= 98;
		int b=8;
		System.out.println(a%b);
				
	}

	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
	    TestMethodsDemo2 a=new TestMethodsDemo2();
		a.addition();
		a.subtraction();
		a.multiplication();
		a.division();
		a.modulus();
				
		
		
		System.out.println("main method ended");

	}

}
