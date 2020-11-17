package Polmorphism;



public class Dog extends Animal{
	
	Dog(){System.out.println("dog is barking");}

	final int a=10;
	void bark() {System.out.println("barking");}
	void color() {System.out.println("black");}
	void eat() {System.out.println("eating breed");}
	void animal1(){
		System.out.println(super.color);
		super.eat();
	}
		
		
		public static void main(String args[]) {
			Dog m2=new Dog();
			m2.color();
			m2.animal1();
			
			
			
		}
}
