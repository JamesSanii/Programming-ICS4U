//
//  main.swift
//  This program tests the vehicle class
//
//  Created by James Sanii on 27/03/18.
//  Copyright © 2018 MTHS. All rights reserved.
//
public class Vehicle {
	
	//default values and initialisation
	var _licensePlate: String
	var _colour: String
	var _numberOfDoors: Int = 4
	var _speed: Int = 0    	// km/h
	var _maxSpeed: Int = 200	// km/h
	var _numberOfWheels: Int
	
	public init(licensePlate: String, colour: String)  {
		//Default Constructor for vehicle class
		_licensePlate = licensePlate
		_colour = colour;
	}
	public init(licensePlate: String)  {
		//other Constructor for vehicle class
		_licensePlate = licensePlate
		_colour = colour;
	}
	func getLicensePlate() -> String { return _licensePlate } //Getter
	
	func setLicensePlate(newPlate: String){
		//Setter
		if newPlate.count == 7 {
			_licensePlate = newPlate
		} else {
			_licensePlate = "AAAAAAA"
		}
	}
	
	func getColour() -> String { return _colour } //Getter
	
	func setColour(newColour: String) {
		//Setter
		_colour = newColour
		}
	
	func getNumberOfDoors() -> Int { return _numberOfDoors } //Getter
	
	func getSpeed() -> Int { return _speed } //Getter
	
	func getMaxSpeed() -> Int { return _maxSpeed } //Getter
	
	func accelerate(n: Int) {
		//Allows the vehicle to accelerate an amount
		_speed += n
		if(_speed > _maxSpeed) {
			_speed = _maxSpeed
		}
	}
	
	func brake(n: Int) {
		//Allows the vehicle to brake an amount
		_speed -= n
		if(_speed < 0) {
			_speed = 0
		}
	}
	
	func getWheels() -> Int{
		return _numberOfWheels
	}
	func getStatus() -> String{
		//Returns the fields of the class
		return "License plate: \(_licensePlate)\nColour: \(_colour)\nNumber of doors: \(_numberOfDoors)\nSpeed: \(_speed)km/h\nMaximum speed: \(_maxSpeed)km/h";
	}

}

public class Bike: Vehicle{
	public init(licensePlate: String, colour: String, wheels: Int )  {
		//Default Constructor for Bike class
		_licensePlate = licensePlate
		_colour = colour
		_numberOfDoors = 0
		_numberOfWheels = wheels
	}
	public init(licensePlate: String, wheels: Int )  {
		// Constructor for Bike class
		_licensePlate = licensePlate
		_numberOfDoors = 0
		_numberOfWheels = wheels
	}
}

public class Truck: Vehicle{
	public init(licensePlate: String, colour: String, wheels: Int, doors: Int )  {
	//Default Constructor for Truck class
	_licensePlate = licensePlate
	_colour = colour
	_numberOfWheels = wheels
	_numberOfDoors = doors
	}
	public init(licensePlate: String, wheels: Int, doors: Int )  {
	// Constructor for Truck class
	_licensePlate = licensePlate
	_numberOfWheels = wheels
	_numberOfDoors = doors
	}
}

print("Vehicle 1")
let bike1: Bike =  Bike(licensePlate: "AAAA111", colour: "Red", wheels: 2)
print(bike1.getStatus())
bike1.accelerate(n: 5)
print(bike1.getStatus())
bike1.accelerate(n: 20)
print(bike1.getStatus())
bike1.brake(n: 30)
bike1.getWheels()
print(bike1.getStatus())

print("\nVehicle 2")
let truck: Truck =  Truck(licensePlate: "BBBB222", colour: "Blue", wheels: 18, doors: 2)
print(truck.getStatus())
truck.setLicensePlate(newPlate: "JAVAWNS")
print(truck.getStatus())
truck.getWheels()
truck.setColour(newColour: "Red")
print(truck.getStatus())