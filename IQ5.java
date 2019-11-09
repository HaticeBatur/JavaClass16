package com.class16;

public class IQ5 {
	public static void main(String[] args) {
		/*
		 * Write a java program to reverse String
		 * Reverse a String word by word
		 */
		String given="Welcome to the Java class";
		/*to reverse String
		 * split();
		 * Step1: split-->array of String
		 * Strep 2: --> use for loop and use decrement
		 *  to print values
		 */
		
		String[] str=given.split(" ");
		
		String reversed="";
		
		for(int i=str.length-1; i>=0; i--) {
			reversed=reversed+str[i]+" ";
			}
		System.out.print(reversed);
		System.out.println();
		System.out.println("==============");
		
		//Write a program to reverse a string
		//by charArray
		String given1="Write a program to reverse a string";
		char[] ch=given1.toCharArray();
			for(int i=ch.length-1; i>=0; i--) {
				System.out.print(ch[i]);
			}
			System.out.println();
			System.out.println("==============");
			//by charAt
			
		String given2= "Write a program to reverse a string";
		String ch1="";
		for(int i=given2.length()-1; i>=0; i--) {
			ch1=ch1+given2.charAt(i);
			
			
		}System.out.print(ch1);
		}
		
}
