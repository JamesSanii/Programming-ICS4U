/****************************************************************************
*
* Created by: James Sanii
* Created on: April 2018
* creates and calculates info about the triangle
*
****************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	//get input function
	public static double getInput(){
		//variables needed for logic
		String input = "0";
		double output = 0.0;
		//buffer reader
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
		//try catch used to make sure user enters an input
		try {
			input = reader.readLine();
		}
		catch (IOException noInput) {
			noInput.printStackTrace();
		}
		//if input is empty makes input equal to zero
		if (input.isEmpty()== true) {
			input = "0";
		}
		//output is assigned to the input and is returned
		output = Double.parseDouble(input);
		return(output);
		
	}
	
	//main code
	public static void main(String[] args) {
		//instructions
		System.out.println("Welcome to the triangle calc program" +
		"It calculaes info about the triangle you create." + 
		"But it will not work if you input invalid info");
		//get user input for each possible piece of info
		System.out.println("Would you like to enter a value for side a.");
		double a = getInput();
		System.out.println("Would you like to enter a value for side b.");
		double b = getInput();
		System.out.println("Would you like to enter a value for side c.");
		double c = getInput();
		System.out.println("Would you like to enter a value for side angleA");
		double angleA = getInput();
		System.out.println("Would you like to enter a value for side angleB");
		double angleB = getInput();
		System.out.println("Would you like to enter a value for side angleC");
		double angleC = getInput();
		//create triangle
		Triangle userTriangle = new Triangle(a,b,c,angleA,angleB, angleC);
		//if the triangle is valid calc everything else
		if (userTriangle.isTriangleValid() == true) {
			System.out.println("Triangle is valid");
			//calc side variables and area variable
			userTriangle.a = userTriangle.getSideA();
			userTriangle.b = userTriangle.getSideB();
			userTriangle.c = userTriangle.getSideC();
			userTriangle.s = userTriangle.getS();
			userTriangle.area = userTriangle.calcArea();
			//prints area
			System.out.print("Triangle area: ");
			System.out.println(userTriangle.area);
			//calc and print height
			System.out.print("Triangle height: ");
			System.out.println(userTriangle.calcHeight());
			//calc and print radius of largest inscribed circle
			System.out.print("Largest inscribed circle radius: ");
			System.out.println(userTriangle.calcCircleRadius());
			//calc largest circumcircle
			System.out.print("Largest cicumcircle: ");
			System.out.println(userTriangle.calcCircumcircle());
		}
		//if not valid it is invalid therefore triangle can not be calculated
		else {
			System.out.println("Triangle is invalid");
		}
	}
}