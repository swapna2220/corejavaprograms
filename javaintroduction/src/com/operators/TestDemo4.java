package com.operators;

//iv) comparison operator -----> boolean expression
//== != < <= > >=
//== operator check the values if the data is primitive
//== operator check the addresses if the data is object types
public class TestDemo4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		String s1 = new String("srikanth");
		String s2 = new String("Srikanth");
		System.out.println(s1==s2);//false----> here,checking the addresses
		System.out.println(s1.equals(s2));//equals() from String class checks the content
		System.out.println(s1.equalsIgnoreCase(s2));//equalsIgnoreCase() from String class check the content

		
		System.out.println(a==c); //true --->here,checking the values
		

	}

}
