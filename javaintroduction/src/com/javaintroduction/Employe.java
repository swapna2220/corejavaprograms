package com.javaintroduction;

public class Employe {
		 //instance variables
		String name;
		String deptname;
		int id;
		//static variables
		static  String countryName="india";
		static int idPassword=100;
		
		//main method
		public static void main(String[] args) {
		//object created	     
		Employe e1=new Employe();
		Employe e2=new Employe();
		Employe e3=new Employe();
		//object assigned
		e1.name="swapna";
		e1.deptname="sss";
		e1.id=1;
		
		e2.name="sarayu";
		e2.deptname="EEE";
		e2.id=2;
		
		e3.name="susmi";
		e3.deptname="cse";
		e3.id=3;
		//to print instance variables
		System.out.println(e1.name);
		System.out.println(e1.deptname);
		System.out.println(e1.id);
		
		System.out.println(e2.name);
		System.out.println(e2.deptname);
		System.out.println(e2.id);
		
		System.out.println(e3.name);
		System.out.println(e3.deptname);
		System.out.println(e3.id);
		
		System.out.println(countryName);
		System.out.println(idPassword);


	}

}
