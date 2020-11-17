package com.test.package2;
import java.util.Scanner;
public class Palindrome {
	
	static void palindrome() {
		Scanner input= new Scanner(System.in);
		System.out.print("enter the string to check palindrome");
		String name;
		name=input.nextLine();
		String reverse = "";
		
		int len=name.length();
		
		for(int i=len-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
			}
		
		if(name.equals(reverse)) {
			System.out.print("entered stering is palindrome");
		}else {
			System.out.print("entered stering is not a palindrome");

		}
		}
	
	
	public static void main(String args[]) {
		palindrome();
}
}
