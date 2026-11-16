package com.languagefundamentals.methods;
import java.util.Scanner;
//ii) no _return_type & with parameters :BODMAS

public class TestMethodDemo3 {
	static void addition(int a,int b) { //a and b are parameters
		System.out.println("addition method called");
		System.out.println("sum of two numbers is :" + a+b);//string plus anything is string-->2050
		//System.out.println("sum of two numbers is :"+(a+b));
	}
	static void subtraction(int a,int x) {
		System.out.println("subtraction method called");
		System.out.println("sum of two numbers is :"+(a-x));
	}
	static void multiplication(float a,float b,float c) {
		System.out.println(" multiplication method called");
		System.out.println("sum of two numbers is :"+ a*b*c);
	}
	static void division(float a,float b,float c) {
		System.out.println("division method called :"+a/b*c);
	}
	static void modulus(double d1, double d2) {
		System.out.println("modulus method called");
		System.out.println("sum of two numbers is :"+d1%d2);
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x number");
		int a = sc.nextInt();
		System.out.println("enter y number");
		int b = sc.nextInt();
		addition(a,b);//20 and 50 arguments-->call by the value
		
		System.out.println("enter v1 number for subtraction");
		float f1 =sc.nextFloat();
		System.out.println("enter s1 number for subtraction ");
		float f2=sc.nextFloat();
	
		
		
		
		
		
		
		
	
		subtraction(40, 50);
		multiplication(2,3,6);//int can convert float
		division(10,5,3);
		modulus(99,6);
		System.out.println("main method ended");

	}

}
