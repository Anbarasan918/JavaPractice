package Polmorphism; //overloading by no of arguments

public class Add {
		static int Add(int a,int b) {
			return a+b;
		}
		
		static int Add(int a,int b,int c) {
			return a+b-c;
		}
		public static void main(String args[]) {
			System.out.println(Add(5,20));
			System.out.println(Add(5,20,30));
			
		}
}
