package com.javaintroduction;
public class Bank1 {

	int acno;
	int balance;
	String accountholdername;
	//static variables
	 static String bankName;
        //display method 
        void swapna() {	
		System.out.println("acno="+acno);
		System.out.println("balance="+balance);
		System.out.println("accountholdername="+accountholdername);
		System.out.println("bankName="+bankName);
		System.out.println("____________________");
        }
        //main method//
        public static void main(String[] args) {
        	
    	    //b1 is object
        	Bank1 b1=new Bank1();
        	//object tho call chesam
        	//method to call
        	b1.swapna();
        	
        	Bank1 b2=new Bank1();
        	b2.swapna();
        	
        	Bank1 b3=new Bank1();
        	b3.swapna();
        	
        	Bank1 b4=new Bank1();
        	b4.swapna();
        	
        	Bank1 s5=new Bank1();
        	s5.swapna();	
        }
}



