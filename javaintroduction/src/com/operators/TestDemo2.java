package com.operators;
//ii)Assignment  operators
//= += -= *= /= %=
public class TestDemo2 {
	public static void main(String[] args) {
		
		
		int a = 10;
		System.out.println(a);
		
		//a  = a + 5.5;//Type mismatch: cannot convert from double to int
		//a = (int)(a + 5.5);

		//double is converting to int automatically with compound operator which +=
		//will consider this concept as Narrowing
		
		
		
		a += 5.5; //a+5.5
		System.out.println(a);//15
		
		//a = a - 3.5; //Type mismatch: cannot convert from double to int
		
		a  -= 3.5; //a = a-3.5 = 11.5
		System.out.println(a);//11

	   //a = a * 2.5; //Type mismatch: cannot convert from double to int
		a = a*= 2.5; //a = a*2.5
        System.out.println(a); //27
        
       // a = a /2.5; //Type mismatch: cannot convert from double to int

        a = a/= 2.5;//a = a/2.5
        System.out.println(a);//10
        
       // a = a % 1.5; //Type mismatch: cannot convert from double to int
        a = a %= 1.5;
        System.out.println(a);
		
		double d1 = a; //int can convert to directly to double will consider as implicit type casting and also we consider as widening
	}

}
