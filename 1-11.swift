//
//  1-11.swift
//  This program creates an ADT array of students
//
//  Created by James Sanii on 08/03/18.
//  Copyright © 2018 MTHS. All rights reserved.
//
//

enum Grade: String{
	case ONE = "ONE"
	case TWO = "TWO"
	case THREE = "THREE"
	case FOUR = "FOUR"
	case FIVE = "FIVE"
	case SIX = "SIX"
	case SEVEN = "SEVEN"
	case EIGHT = "EIGHT"
	case NINE = "NINE"
	case TEN = "TEN"
	case ELEVEN = "ELEVEN"
	case TWELVE = "TWELVE"
	case JK = "JK"
	case SK = "SK"}

struct Student {
	//This is the ADT that defines what a student is 
	
	var _firstName: String
	var _middleName: String
	var _lastName: String
	var _grade: Grade
	var _birthDate: String 
	
	func firstName()->String {
		//returns the first name
		return _firstName
	}
	func middleName()->String {
		//returns the middle name
		return _middleName
	}
	func lastName()->String {
		//returns the last name
		return _lastName
	}
	func birthDate()->String {
		//returns the birth date
		return _birthDate
	}
	func grade()->Grade {
		//returns the grade
		return _grade
	}
	func wholeName()->String {
		var fullName: String
		fullName = ("\(_firstName) \(_middleName) \(_lastName)")
		//returns the full name
		return fullName
	}
}

var numberOfStudents = 0
var userStudentInput: String?
var properInput = false

while properInput == false {
	print("How many students?")
	userStudentInput = readLine()
	if Int(userStudentInput!) != nil {
		numberOfStudents = Int(userStudentInput!)!}
		if numberOfStudents > 0{
			properInput = true
		}
	else{print("Please enter a valid number")}
}

var classOfStudents: [Student] = []
var firstName: String?
var middleName: String?
var lastName: String?
var birthDate: String?
var stringGrade: String?
var grade: Grade = Grade.ONE
var properGradeInput = false

for i in 1...numberOfStudents {
	//get fields required to create student
	print("What is student " + String(i) + "first name?")
	firstName = readLine(strippingNewline: true)

	print("What is student " + String(i) + "middle name?")
	middleName = readLine(strippingNewline: true)

	print("What is student " + String(i) + "last name?")
	lastName = readLine(strippingNewline: true)

	print("What is student " + String(i) + "birthday? (dd/mm/yyyy)")
	birthDate = readLine(strippingNewline: true)

	while properGradeInput == false {
		//check that inputted grade is valid
		print("What is student " + String(i) + "grade?")
		stringGrade = readLine(strippingNewline: true)
		if Grade(rawValue: stringGrade!) != nil {
			grade = Grade(rawValue: stringGrade!)!
			properGradeInput = true
		} else {
			print("Please enter a valid grade")
		}
	}
	properGradeInput = false
	classOfStudents.append(Student(_firstName: firstName!, _middleName: middleName!, _lastName: lastName!, _grade: grade, _birthDate: birthDate!))
}

//print each student
for student in classOfStudents {
	// Did not like this line at all stated it took too long to comprehend
	//print("Name: " + student.wholeName() + "Birth Date: " + student.birthDate() + "Grade: " + student.grade())
	//this is the fix
	print("Name: \(student.wholeName()) Birth Date: \(student.birthDate()) Grade: \(student.grade())")
}