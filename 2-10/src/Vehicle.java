/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: April 2018
 * vehicle class
 *
 ****************************************************************************/
public abstract class Vehicle {
	//variables
	String licensePlate;
	String colour;
	int numberOfDoors;
	int speed;
	int maxSpeed;
	int wheels;
	//returns license plate number
	protected String licensePlateNumber() {
		return licensePlate;
	}
	
	//returns the color
	protected String theColour() {
		return colour;
	}
	
	//returns the number of doors
	protected int theNumberOfDoors() {
		return numberOfDoors;
	}
	
	//returns the speed
	protected int theSpeed() {
		return speed;
	}
	
	//returns max speed
	protected int maxSpeed() {
		return maxSpeed;
	}
	
	//acceleration calc and returns the new speed
	protected int accelerate(int howMuch){
		if (speed + howMuch < maxSpeed) {
			speed = speed + howMuch;
			return speed;
		}
		else {
			speed = maxSpeed;
			return speed;
		}
	}
	
	//calcs break and returns the new speed
	protected int brake(int howLong) {
		while (howLong > 0) {
			speed = speed - 1;
			howLong = howLong - 1;		
		}
		return speed;
	}
	
	//returns the number of wheels
	protected int numberOfWheels() {
		return wheels;
	}
}
