package assignment_2;

class Shape{
	private String shapeName;

	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}
	public void display() {
		System.out.println("shapeName: "+shapeName);
	}
}

class Circle extends Shape{
	private double radius;

	public Circle( double radius) {
		super("Circle");
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Radius: "+radius+
				           ", Area: "+calculateArea());
	}
	
}

class ColoredCircle extends Circle{
	
	private String color;

	public ColoredCircle(double radius, String color) {
		super(radius);
		this.color = color;
	}
	
	public void display() {
		super.display();
		System.out.println("Color: "+color);
	}
	
	
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColoredCircle circle=new ColoredCircle(5, "red");
		circle.display();

	}

}
