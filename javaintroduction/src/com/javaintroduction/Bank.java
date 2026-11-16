package com.javaintroduction;


public class Bank {	
   //instance variables
	int acno;
	int balance;
	String accountholdername;
	//static variables
	 static String bankName="sbi";
        //display method 
            void swapna() {	
        	System.out.println("____________________");
    		System.out.println("accountno="+acno);
    		System.out.println("balance="+balance);
    		System.out.println("accountholdername="+accountholdername);
            System.out.println("bankName="+bankName);
	
        }
        //main method//
        public static void main(String[] args) {
        	
    	    //b1 is object
        	Bank b1=new Bank();
        	//object tho call chesam
        	b1.acno=1122;
        	b1.balance=1000;
        	b1.accountholdername="swapna";
        	//method to call
        	b1.swapna();
        	
        	Bank b2=new Bank();
        	b2.acno=1123;
        	b2.balance=2000;
        	b2.accountholdername="venu";
        	b2.swapna();
        	
        	Bank b3=new Bank();
        	b3.acno=1124;
        	b3.balance=3000;
        	b3.accountholdername="susmi";
        	b3.swapna();
        	
        	Bank b4=new Bank();
        	b4.acno=1125;
        	b4.balance=4000;
        	b4.accountholdername="sarayu";
        	b4.swapna();
        	

        }
}    


