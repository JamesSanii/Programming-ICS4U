//
//  main.swift
//  This program tests the vehicle class
//
//  Created by Matthew Lourenco on 27/03/18.
//  Copyright © 2018 MTHS. All rights reserved.
//
public class Vehicle {
	
	var _licensePlate: String
	var _colour: String
	var _numberOfDoors: Int = 4
	var _speed: Int = 0    	// km/h
	var _maxSpeed: Int = 200	// km/h
	
	public init(licensePlate: String, colour: String)  {
		//Default Constructor for vehicle class
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
	
	func getStatus() -> String{
		//Returns the fields of the class
		return "License plate: \(_licensePlate)\nColour: \(_colour)\nNumber of doors: \(_numberOfDoors)\nSpeed: \(_speed)km/h\nMaximum speed: \(_maxSpeed)km/h";
	}
}

print("Vehicle 1")
let vehicle1: Vehicle = try Vehicle(licensePlate: "ABCD123", colour: "Red")
print(vehicle1.getStatus())
vehicle1.accelerate(n: 5)
print(vehicle1.getStatus())
vehicle1.accelerate(n: 20)
print(vehicle1.getStatus())
vehicle1.brake(n: 30)
print(vehicle1.getStatus())

print("\nVehicle 2")
let vehicle2: Vehicle = try Vehicle(licensePlate: "BBBB222", colour: "Blue")
print(vehicle2.getStatus())
vehicle2.setLicensePlate(newPlate: "123ABCD")
print(vehicle2.getStatus())
vehicle2.setColour(newColour: "Red")
print(vehicle2.getStatus())