/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: April 2018
 * Main code to test the oop
 *
 ****************************************************************************/
public class Main {
	public static void main(String[] args) {
		Bike Bike1 = new Bike();
		System.out.println(Bike1.licensePlateNumber());
		System.out.println(Bike1.theColour());
		System.out.println(Bike1.theNumberOfDoors());
		System.out.println(Bike1.theSpeed());
		System.out.println(Bike1.maxSpeed());
		System.out.println(Bike1.accelerate(100));
		System.out.println(Bike1.brake(20));
		System.out.println(Bike1.numberOfWheels());
		Truck Truck2 = new Truck("QWER123", "Orange", 0, 150, 2, 18);
		System.out.println(Truck2.licensePlateNumber());
		System.out.println(Truck2.theColour());
		System.out.println(Truck2.theNumberOfDoors());
		System.out.println(Truck2.theSpeed());
		System.out.println(Truck2.maxSpeed());
		System.out.println(Truck2.accelerate(100));
		System.out.println(Truck2.brake(20));
		System.out.println(Truck2.numberOfWheels());
		Truck Truck3 = new Truck("QWER123", 0, 150, 2, 18);
		System.out.println(Truck3.licensePlateNumber());
		System.out.println(Truck3.theNumberOfDoors());
		System.out.println(Truck3.theSpeed());
		System.out.println(Truck3.maxSpeed());
		System.out.println(Truck3.accelerate(100));
		System.out.println(Truck3.brake(20));
		System.out.println(Truck3.numberOfWheels());
	}
	
}
