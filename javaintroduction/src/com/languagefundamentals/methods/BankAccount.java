package com.languagefundamentals.methods; 
import java.util.Scanner;
//wap to print bankaccount details and operations..?//
//withdraw
//deposit
//checkbalance


public class BankAccount {
	
	
	double balance=20000.00;
	

	public static void main(String[] args) {
	    System.out.println("main method started");
	    
	    
	    BankAccount b = new BankAccount();
	    b.checkBalance();
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter how much you want to withdraw...?");
	    double wamt = sc.nextDouble();
	    
	    System.out.println("enter how much you want to deposite...?");
	    double damt = sc.nextDouble();
	    
	    b.withDraw(wamt);
	    b.deposite(damt);
	    
	    System.out.println("main method ended");

	}
	
	void deposite(double damt) {
		balance = balance + damt;
		checkBalance();
	}
	
	void withDraw(double wamt) {
		balance = balance - wamt;
		checkBalance();
		
	}
	void checkBalance() {
		System.out.println("The current balance is :" + balance);
	}
	
	

}
