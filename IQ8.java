package com.class16;

public class IQ8 {
	public static void main(String[] args) {
		//Fibonacci series
		
		int a, b, c;
		a=0;
		b=1;
		//start from "1"
		for(int i=0; i<10; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			}
		System.out.println();
		System.out.println("===========");
		//start from "0"
		
		a=0;
		b=1;
		c=0;
		for(int i=0; i<10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			}
	}
}
