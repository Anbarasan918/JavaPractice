package Polmorphism; //overloading by datatype of arguments

public class Add1 {
	static int Add(int a,int b) {
		return a-b;
	}
	static float Add(float a, float b) {
		return a+b;
	}
	public static void main(String args[]) {
	
		System.out.println(Add1.Add( 2, 5));
		System.out.println(Add1.Add( 2.5f, 5.1f));

	}
}
