package com.class16;

public class IQ6 {
	public static void main(String[] args) {
		//write a palindrome
		
		String original="aibopohopobia";
		String reverse="";
		for(int i=original.length()-1; i>=0; i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
		if(original.equals(reverse)) {
			System.out.println(original +" is a paindrome");
		}else {
			System.out.println(original +" is not a paindrome");
		}
	}

}
