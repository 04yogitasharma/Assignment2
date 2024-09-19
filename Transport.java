package assignment_2;

class Vehicle{
	public void start() {
		System.out.println("Vehicle is starting...........");
	}
	public void stop() {
		System.out.println("Vehicle is stoping............");
	}
}
class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car is starting ");
	}
	@Override
	public void stop() {
		System.out.println("Car is stoping");
	}
}

class Bike extends Vehicle{
	@Override
	public void start() {
		System.out.println("Bike is starting ");
	}
	@Override
	public void stop() {
		System.out.println("Bike is stoping");
	}
}

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle mycar=new Car();
		Vehicle mybike=new Bike();
		mycar.start();
		mycar.stop();
		System.out.println("...................................");
		mybike.start();
		mybike.stop();
	}

}
