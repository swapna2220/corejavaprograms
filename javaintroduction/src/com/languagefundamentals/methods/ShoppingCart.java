package com.languagefundamentals.methods;

import java.util.Scanner;

public class ShoppingCart {
	Scanner sc = new Scanner(System.in);//sc = scanner object

	public static void main(String[] args) {
		System.out.println("welcome to vcube shopping mart: ");
		
		ShoppingCart s = new ShoppingCart();
		
		double mp = s.getMobileInfo();
		double wp = s.watchesInfo();
		
		System.out.println("total bill is :" + mp + wp);

	}
	 double watchesInfo() {
		 double totalaWatchesPrices = 0;
		 System.out.println("enter each watch price :");
		 double watchprice = sc.nextDouble();
				 
		System.out.println("enter quantity :");
		int qty = sc.nextInt();
		 
		totalaWatchesPrices = qty * watchprice;
		 return totalaWatchesPrices;
	 }
	
	double getMobileInfo() {
		double mobileprice = 0;//variable
		
		System.out.println("mobile price :");
		double mobilePrice = sc.nextDouble();//sc = scanner object reference variable//nextDoubl = call chesam
		
		System.out.println("enter quantity :");
		int qty = sc.nextInt();
		
		
		mobilePrice = qty * mobilePrice;
		
		return mobilePrice;
	}

}
