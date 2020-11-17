package Polmorphism;

public class Bike extends Vehicle {
	
	void run() {System.out.println("bike is running safely");}
	
	public static void main(String args[]) {
		Bike drive=new Bike();
		drive.run();
	}
}
