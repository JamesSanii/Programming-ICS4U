/****************************************************************************
*
* Created by: James Sanii
* Created on: May 2018
* main for factorial
*
****************************************************************************/
public class Main {
	public static void main(String[] args) {
		//creates and prints the factorials
		Factorial five = new Factorial(5);
		System.out.println("The factorial for five is: " + five.calcFactorial(five.number));
		Factorial four = new Factorial(4);
		System.out.println("The factorial for four is: " +four.calcFactorial(four.number));
		Factorial three = new Factorial(3);
		System.out.println("The factorial for three is: " + three.calcFactorial(three.number));
	}
}
