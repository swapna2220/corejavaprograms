package com.operators;

//Vi)Bitwise operators : & | ^ ~
// Bitwise operators working between both values & conditions

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("**********Bitwise And & *************");
		System.out.println(true & true); //true
		System.out.println(true & false);//false
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		
		System.out.println("********************");
		
		System.out.println(1 & 1);//1 --->true
		System.out.println(1 & 0);//0 --->false
		System.out.println(0 & 1);//0 --->false
		System.out.println(0 & 0);//0 ---->false
		
	    System.out.println("********************");
	    
	    System.out.println(73 & 27);//1 --->true
		System.out.println(82 & 15);//0 --->false
		System.out.println(95 & 62);//0 --->false
		System.out.println(89 & 22);//0 ---->false

	    

		

	}

}
