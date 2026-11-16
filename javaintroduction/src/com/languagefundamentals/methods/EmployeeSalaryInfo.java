package com.languagefundamentals.methods;
import java.util.Scanner;
// iii) with return type & no parameters
//wap to print employee total salary which include all aspects
                                                                           
                                                                                 //02-10-26
public class EmployeeSalaryInfo {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		EmployeeSalaryInfo es = new EmployeeSalaryInfo();
		
		double bs = es.getBasicSalary();   //getBasicSalary=method ni call chesindhi //bs=value ni return chesindhi
		double hra = es.getHouseRentAllowance();//hra lo store chesindhi
		double lta = es.getLeaveTravelAssistance();
		double sa = es.getSpecialAllowance();
		double mc = es.getMealCoupons();
		double pf = es.getProvidentFund();
		double gratuity = es.getGratutity();
		double total_salary = bs + hra + lta + sa + mc + pf + gratuity;
		
		 System.out.println("total_salary is :" + total_salary);
		System.out.println("main method ended");
		

	}
	 double getBasicSalary() { 
		 System.out.println("enter your basic salary : ");
		 double basicsalary = sc.nextDouble();		 //variable
		 return basicsalary;	 
	}
	  double getHouseRentAllowance() {
		  System.out.println("enter your hra :");
		  double hra = sc.nextDouble();  //hra ni read chestadhi
		  return hra;//hra ni return chesindhi
	  }
	  double getLeaveTravelAssistance() {
		  System.out.println("enter LTA :");
		  double lta = sc.nextDouble();
		  return lta;
	  }
	  double getSpecialAllowance() {
		  System.out.println("enter SA :");
		  double sa = sc.nextDouble();
		  return sa;
	  }
	   double getMealCoupons() {
	   System.out.println("enter a mealcoupons :");
	   double mc = sc.nextDouble();
	   return mc;
	   }
	   double getProvidentFund() {
		   System.out.println("enter a PF");
		   double pf = sc.nextDouble();
		   return pf;
	   }
	   double getGratutity() {
		   System.out.println(" enter a gratuity :");
		   double gratutity = sc.nextDouble();
		   return gratutity;
	   }
	
	 

}
