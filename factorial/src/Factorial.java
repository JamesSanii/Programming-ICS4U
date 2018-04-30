/****************************************************************************
*
* Created by: James Sanii
* Created on: may 2018
* calculates factorial
*
****************************************************************************/
public class Factorial {
	
	Factorial(int number ){
		//constructor
		this.number = number;
		this.factorial = number;
	}
	//variables needed
	int number;
	int factorial = 0;
	
	public int calcFactorial(int input){
		//logic to calculate a factorial and return it
		int newNumber = input - 1;
		if (newNumber > 1) {
			this.factorial = this.factorial * newNumber;
			calcFactorial(newNumber);
		}
		return this.factorial;
	}
}


