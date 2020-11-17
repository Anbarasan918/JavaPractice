package Polmorphism;

public class Circle implements Drawable,Cube {
	public void draw() {System.out.println("draw reactangle");}

	public static void  main(String args[]) {
		 Drawable d=new Circle();
		 d.draw();
		 
		 Cube c= new Square();
		 c.draw();
		 
		 Reactangle r=new Reactangle();
		 r.draw();
	}
}

