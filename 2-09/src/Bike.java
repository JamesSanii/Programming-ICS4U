/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: April 2018
 * creation of a bike
 *
 ****************************************************************************/
public class Bike extends Vehicle {
	//default constructor
	public Bike() {
		this("KM5PL51", "red", 0, 200);
	}
	//user input constructor
	public Bike( String licensePlate, String colour, int speed, int maxSpeed) {
		this.licensePlate = licensePlate;
		this.colour = colour;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.numberOfDoors = 0;
		this.wheels = 2;
		
	}
	
	public Bike( String licensePlate, int speed, int maxSpeed) {
		this.licensePlate = licensePlate;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.numberOfDoors = 0;
		this.wheels = 2;
		
	}

}
