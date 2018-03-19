//

//  1-06.swift

//  roll a dice of a size of your choosing

//

//  Created by James Sanii on 08/02/18.

//  Copyright © 2018 MTHS. All rights reserved.

//

import Foundation
srand(UInt32(time(nil)))
var input: String?
var numberOfSides: Int = 0
func rollDice(sideNumber: Int){
	let number = (Int(random()%(sideNumber) + 1))
	print(number)
}
while true {
	print("How many sides should the dice have?")
	input = readLine(strippingNewline: true)
	if Int(input!) != nil && Int(input!)! > 0{
		numberOfSides = Int(input!)!
		break
	}
	else {
		print("Please enter valid input")
	}
}
rollDice(sideNumber: numberOfSides)


