package assignment_2;

abstract class Shape_figure{
	public abstract void draw(); 
	
}
class Circle1 extends Shape_figure{
	public void draw() {
		System.out.println("Drawing a Circle!");
	}
}
class Rectangle extends Shape_figure{
	public void draw() {
		System.out.println("Drawing a Rectangle!");
	}
}

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape_figure shape1=new Circle1();
		shape1.draw();
		Shape_figure shape2=new Rectangle();
		shape2.draw();
	}

}
