//
//  maxMinNumbers.swift
//  Calcs average grade in a 2D array
//
//  Created by James Sanii on 20/02/18.
//  Copyright 2018 MTHS. All rights reserved.
//
import Foundation

var array = [[Double]]() 

func averageCalc(intArray: [[Double]]) -> Double {
	//returns the average number in the array
	var RunningTotal: Double = 0.0
	var Divisor: Double = 0.0
	for colmns in 0...3 {
    	for rows in 0...5 {
    		RunningTotal = RunningTotal + intArray[colmns][rows]
    		Divisor = Divisor + 1.0

        
    	}
	}
	let average = RunningTotal / Divisor
	return average
}
srand(UInt32(time(nil)))
for colmns in 0...3 {
	array.append([])
    	for rows in 0...5 {
        array[colmns].append(Double(random()%(101)))
        if (array[colmns][rows] < 50){
        	array[colmns][rows] = (Double(random()%(101)))
        }
    }
}

for student in 1...array.count {
	print("Student \(student):", terminator: "")
	for assignment in array[student-1] {
		print(" \(Int(assignment))", terminator: "")
	}
	print("")
}

print("The average grade is \(averageCalc(intArray: array)).")