package com.languagefundamentals.methods;
                                                                       //31/10/26
public class TestMethodDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		hello();

		TestMethodDemo1 t1=new TestMethodDemo1();
		t1.welcome();
	

		
		
		System.out.println("main method ended");

	}
	//public,static,int=access modifier//hello=method name
	public static void hello(){
		 System.out.println("good morning hava a nice day");
		
	}
	//void=return type //welcome=method name
	 void welcome() {
		 System.out.println("welcome to java world");
	 }

}
