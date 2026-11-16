package com.languagefundamentals.methods;

import java.util.Scanner;
//iv) with return_type & with parameters
//wap to find Area's of Triangle,Square,Rectangle, & Circle
//Area of Triangle : 0.5 * Base * Height
//Area of Square : side * side
//Area Of Rectangle : Length * Breadth
//Area of Circle : pi * r *
 
public class AreasInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a  base :");
		double b = sc.nextDouble();
		
		
		System.out.println("enter a height :");
		double h = sc.nextDouble();
		
		double arTri = getAreaOfTriangle(b,h);
		System.out.println("Area Of Triangle is :" + arTri);
	}
	 static double getAreaOfTriangle(double base, double height) {
	
		
		return 0.5 * base * height;
		

		
		
	}

}
