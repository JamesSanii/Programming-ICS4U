public class Factorial {
//factorial class
	public init(number: Int)  {
		//Default Constructor for factorial class
		_number = number
		_factorial = number;
	}
	//variables needed
	var _number: Int
	var _factorial = 0
	//function to calc factorial
	func calcFactorial(input: Int) -> Int {
		let newNumber = input - 1;
		if newNumber > 1 {
			_factorial = _factorial * newNumber
			calcFactorial(input:newNumber)
		}
		return _factorial
	}
}
//creating and printing factorials
let factorialTest = Factorial(number: 3)
print("The factorial for 3 is: ")
print(factorialTest.calcFactorial(input: factorialTest._number))
let factorialTest2 = Factorial(number: 4)
print("The factorial for 4 is: ")
print(factorialTest2.calcFactorial(input: factorialTest2._number))
let factorialTest3 = Factorial(number: 5)
print("The factorial for 5 is: ")
print(factorialTest3.calcFactorial(input: factorialTest3._number))