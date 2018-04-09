/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: April 2018
 * create a truck
 *
 ****************************************************************************/
public class Truck extends Vehicle {
	//default constructor
	public Truck() {
		this("KM5PL51", "red", 0, 200, 2, 4);
	}
	//user input constructor
	public Truck( String licensePlate, String colour, int speed, int maxSpeed, int numberOfDoors, int wheels) {
		this.licensePlate = licensePlate;
		this.colour = colour;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.numberOfDoors = numberOfDoors;
		this.wheels = wheels;
		
	}
	//polymorphism test has no color
	public Truck( String licensePlate, int speed, int maxSpeed, int numberOfDoors, int wheels) {
		this.licensePlate = licensePlate;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.numberOfDoors = numberOfDoors;
		this.wheels = wheels;
	}
}
