
public class Main {
	public static void main(String[] args) {
		Vehicle Car1 = new Vehicle();
		System.out.println(Car1.licensePlateNumber());
		System.out.println(Car1.theColour());
		System.out.println(Car1.theNumberOfDoors());
		System.out.println(Car1.theSpeed());
		System.out.println(Car1.maxSpeed());
		System.out.println(Car1.accelerate(100));
		System.out.println(Car1.brake(20));
		Vehicle Car2 = new Vehicle("QWER123", "Orange", 2, 50, 100 );
		System.out.println(Car2.licensePlateNumber());
		System.out.println(Car2.theColour());
		System.out.println(Car2.theNumberOfDoors());
		System.out.println(Car2.theSpeed());
		System.out.println(Car2.maxSpeed());
		System.out.println(Car2.accelerate(100));
		System.out.println(Car2.brake(20));
	}
	
}
