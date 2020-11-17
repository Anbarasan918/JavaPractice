package com.test.package2;
import java.util.Arrays;
import java.util.Scanner;

public class Primenumber {
	
	 static void  primenumbers(){
		
			boolean prime = true;
			int primenumber[] = new int[25];
			int newArray[];
			int count=0;
		
		
		
		for(int i=2;i<1000;i++) {
				prime=true;
			for(int j=2;j<100;j++) {
				if(i%j==0 &&i!=j) {
					prime= false;
				}
			}
			if(prime) {
				if(count<=20) {
					 primenumber[count]=i;
						count++; 
			}
			}
		}
		
		for(int i=0;i<primenumber.length;i++){//length is the property of array  
			System.out.println(primenumber[i]);  
		}
		
		System.out.println(primenumber);
//			
//		 int arr[];
//
//		number=input.nextInt();
//		
//		int newarr[]=new int [number+1];
//
//			for(int i=2;i<=number;i++) {
//				primenumber=newarr ;
//				for(int j=2;j<100;j++) {
//				if(i%j==0 && i!=j) {
//					prime=true;
//					
//				}
//			}if(prime==true) {
//				System.out.println("the numer is not a prime number");
//			}else {
//				System.out.println();
//			}
//		
//			}
	}
	public static void main(String args[]){
		
		primenumbers();
	}
}
