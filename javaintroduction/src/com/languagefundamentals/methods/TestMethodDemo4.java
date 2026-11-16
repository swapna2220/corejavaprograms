package com.languagefundamentals.methods;
import java.util.Scanner;	
//wap to print student info
public class TestMethodDemo4 {

	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age :");
		int age = sc.nextInt();
		
		
		
		
		System.out.println("enter your first name :");
		sc.nextLine();
		String fn = sc.nextLine();
		System.out.println("enter your last name :");
		String ln= sc.next();
		
		
		
		System.out.println("enter your height :");
		float h = sc.nextFloat();
	
		
		System.out.println("enter your weight :");
		double w = sc.nextDouble();
		
		System.out.println("enter your gender :");
		char gen = sc.next().charAt(0);//method chaining
		
		
		
        //calling the method by values
		getStudentAge(age);
		getStudentFullName(fn,ln);
		getStudentHeight(h);
		studentWeightInfo(w);
		studentGender(gen);





		
		
		
		
		
		
		System.out.println("main method ended");
		

	}
	static void getStudentAge(int age) {
		System.out.println("student age is" + age);
		
	}
	static void getStudentFullName(String fname,String lname) {
		System.out.println("student full name is:" + fname + lname);
		
	}
	static void getStudentHeight(float height) {
		System.out.println("student height is :" + height);
	}
	static void studentWeightInfo(double weight) {
		System.out.println("student weight info :" + weight);
	}
	static void studentGender(char gen) {
		System.out.println("student gender is :"+gen);
	}

}

