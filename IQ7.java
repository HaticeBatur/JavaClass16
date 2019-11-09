package com.class16;

public class IQ7 {
		//write a prime to check whether a given number is prime or not?
	public static void main(String[] args) {
		
		//take range of numbers from 1-100 and print all prime
		int num=101;
		boolean isPrime=true;
		
		if(num==0 || num==1) {
			isPrime=false;
		}else {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+ " is a prime number");
		}else {
			System.out.println(num+ " is not a prime number");
		}
		}
		
		System.out.println("================");
		//nested loop
		
		int num1=89;
		for(int i=2; i<100; i++) {
			for(int j=2; j<=i; j++) {
				if(j==i) {
					System.out.print(i+" ");
					System.out.println();
					if(num1==i) {
						System.out.println(num1+" is a prime");
					break;
					}
				}if(i%j==0) {
					break;
				}
			}
		}
		
	}
}
