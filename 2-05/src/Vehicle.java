
public class Vehicle {
	public Vehicle() {
		this("KM5PL51", "red", 4, 0, 200);
	}
	public Vehicle( String licensePlate, String colour, int numberOfDoors, int speed, int maxSpeed) {
		this.licensePlate = licensePlate;
		this.colour = colour;
		this.numberOfDoors = numberOfDoors;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
	}
	String licensePlate;
	String colour;
	int numberOfDoors;
	int speed;
	int maxSpeed;
	
	protected String licensePlateNumber() {
		return licensePlate;
	}
	
	protected String theColour() {
		return colour;
	}
	
	protected int theNumberOfDoors() {
		return numberOfDoors;
	}
	
	protected int theSpeed() {
		return speed;
	}
	
	protected int maxSpeed() {
		return maxSpeed;
	}
	
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
	
	protected int brake(int howLong) {
		while (howLong > 0) {
			speed = speed - 1;
			howLong = howLong - 1;		
		}
		return speed;
	}
}
