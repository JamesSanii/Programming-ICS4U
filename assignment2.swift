//
//  assignment2.swift
//  This code plays rock, paper, scissors
//
//  Created by James Sanii on 3/3/18.
//  Copyright 2018 MTHS. All rights reserved.
//
import Foundation

srand(UInt32(time(nil)))
var isUserChoiceValid = false
var computerChoice = ""
var userChoice: String?
var computerChoiceInt = (Int(random()%(3) + 1))

if computerChoiceInt == 1{
	computerChoice = "Rock"}
else if computerChoiceInt == 2{
	computerChoice = "Paper"}
else {
	computerChoice = "Scissors"}
print("We are playing Rock, Paper, Scissors!\nType 'Rock' to choose rock.\nType 'Paper' to choose paper.\nType 'Scissors'  to choose scissors");
while (isUserChoiceValid == false) {
	userChoice = readLine()
	if userChoice == "Rock" || userChoice == "Paper" || userChoice == "Scissors"{
		isUserChoiceValid = true
		print("Your choice is: " + userChoice!)}
	else {
		print("Please enter a valid choice.\nType 'Rock' to choose rock.\nType 'Paper' to choose paper.\nType 'Scissors'  to choose scissors")}
}
print("The computer chose: " + computerChoice)

if computerChoice == userChoice{
	print("It is a tie.")}
else if userChoice == "Rock" && computerChoice == "Scissors" || userChoice == "Paper" && computerChoice == "Rock" || userChoice == "Scissors" && computerChoice == "Paper"{
	print("You Win!")}
else{
	print("You Lose!")}