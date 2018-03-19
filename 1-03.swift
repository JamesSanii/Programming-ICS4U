//

//  1-03.swift

//  E = mc^2

//

//  Created by James Sanii on 08/02/18.

//  Copyright © 2018 MTHS. All rights reserved.

//
import Foundation
print("Type the mass to get energy output")
let speedOfLight: Double = 2.998 * pow(10,8)
var energy: Double = 0.0
var mass: Double = -1.0
var massInput: String?
var breakLoop = false
while breakLoop == false {
	massInput = readLine(strippingNewline: true)
	if Double(massInput!) != nil{
		mass = Double(massInput!)!
		energy = mass * speedOfLight * speedOfLight
		
		breakLoop = true
	}
	else{
		print("Please enter a number greater than zero")
	}
}

print("The energy output is: " + String(energy))
