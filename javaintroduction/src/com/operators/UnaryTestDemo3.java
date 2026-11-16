package com.operators;

//Unary operators : + - ++ --
//pre-increment & post-increment ----> ++
// pre-decrement & post-decrement ----> --

public class UnaryTestDemo3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		System.out.println(+a); //5
		System.out.println(-b); //-6
		
		System.out.println(a++); //a = a + 1 = 5 ---->6(update value)
		System.out.println(++a); //7=1+6
	
		
		System.out.println(--b);//5
		System.out.println(b--);//5
		System.out.println(b);//4
		
		
		System.out.println(++a); //1+7=8
		System.out.println(a++); //8----->9(update value)
		System.out.println(++a); //1+9=10
		System.out.println(++a); //1+10=11
		System.out.println(a++); //11----->12(update value)
		System.out.println(++a); //1+12=13
		System.out.println(a++); //13--->14(update value)
		System.out.println(++b); //1+4=5
		System.out.println(--b); //1-5=4
		System.out.println(--a); //1-14=13
		System.out.println(a++); //13--->14(update value)
		System.out.println(a--); //14---->13(update value)
		System.out.println(a++); //13---->14
		System.out.println(a--); //14--->13
		System.out.println(++b); //1+4=5
		
		
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);


	}

}
