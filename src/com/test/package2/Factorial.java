package com.test.package2;
import java.util.Scanner;
public class Factorial {
	static void factorial() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value");
		int number=input.nextInt();
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial*=i;
		}System.out.println(factorial);
		}
	
	
	public static void main(String args[]) {
		factorial();
	}
}
