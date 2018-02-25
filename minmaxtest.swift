//
//  maxMinNumbers.swift
//  Calcs min and max numbers using different functions from an array of 
// 10 random ints from 1-99
//
//  Created by James Sanii on 20/02/18.
//  Copyright 2018 MTHS. All rights reserved.
//
import Foundation

var RandomInts: [Int] = []
var counter = 0
func minCalc(array: [Int]) -> Int {
	//returns the min int in array
	var minNumber: Int = array[0]
	for item in array {
		if item<minNumber {
			minNumber = item
		}
	}
	return minNumber
}
func maxCalc(array: [Int]) -> Int {
	//returns the maximum integer in the array
	var maxNumber: Int = array[0]
	for item in array {
		if item>maxNumber {
			maxNumber = item
		}
	}
	return maxNumber
}

// generates an array containing random integers between 1 and 99 that is
// 10 integers long
srand(UInt32(time(nil)))
while (counter < 10) {
	counter = counter + 1
	RandomInts.append(Int(random()%(99) + 1))
}

print("\(RandomInts)")
print("The minimum number is \(minCalc(array: RandomInts)).")
print("The maximum number is \(maxCalc(array: RandomInts)).")