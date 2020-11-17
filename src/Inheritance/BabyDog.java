package Inheritance;

public class BabyDog extends Dog {
		void cry() {System.out.println("crying");}
		
		public static void main(String args[]) {
			BabyDog action=new BabyDog();
			action.bark();
			action.sleep();
			
			BabyCat act=new BabyCat();
			act.meow();
			act.sleppy();
			
		}

}
