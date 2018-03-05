//
//  Enum.swift
//  Planet enum test learning what an enum is and how to use
//
//  Created by James Sanii on 02/03/18.
//  Copyright 2018 MTHS. All rights reserved.
//

enum Planets: Int {
	case MERCURY = 1,VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE
}
var counter = 1;
while counter < 9{
	print(Planets(rawValue: counter)!)
	counter = counter + 1

}
//for Planet in 0...Planets.length{
	//print(Planets)
