/****************************************************************************
*
* Created by: James Sanii
* Created on: Feb 2016
* assignment 3
*
****************************************************************************/
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class SortingNumbers {
	//the lists used
	public static List<Integer> intList = new ArrayList<Integer>();
	//placeholder list is used for sorting and later used for finding the smallest value
	public static List<Integer> placeHolderList = new ArrayList<Integer>();
		
	public static List<Integer> sort(List<Integer> array) {
			//variable used in function
			int smallestNumber = array.get(0);
			int counter = array.size();
			//sorting loop
			while(counter != 0) {
				for(int number = 1; number < counter; ++number) {
					if(array.get(number) < smallestNumber) {
						smallestNumber = array.get(number);
						}
					}
				placeHolderList.add(smallestNumber);
				array.remove(Integer.valueOf(smallestNumber));
				if (array.size() != 0) {
				smallestNumber = array.get(0);
				}
				counter--;}
			//puts the numbers back into original list	
			for (int number = 0; number < placeHolderList.size(); ++number) {
				array.add(placeHolderList.get(number));
				}
			//clear the placeholder for later use
			placeHolderList.clear();
			
			return intList;
			}
		
		public static List<Integer> where(int numberToFind) {
			//function to find where the value is in the list
			for(int number = 0; number < intList.size(); ++number) {
				if(intList.get(number) == numberToFind) {
					placeHolderList.add(number);
				}
			}
			//placeholder list is returned with all positions the number exists at
			return placeHolderList;
		}
		
		public static int properValueTest() {
			//function to test if a proper value is chosen by user
			int returnValue = 0;
			Scanner input = new Scanner( System.in );
			String userInput = input.nextLine();
			try {
				//Convert string to int
				returnValue = Integer.parseInt(userInput);
			} catch (NumberFormatException stringInput) {
			}
			if (returnValue <= 2000 && returnValue > 0) {
				return returnValue;	
			}
			else {
				return returnValue;
			}
		}
	
	public static void main(String[] args) {
		// main code
		//variables
		int newNumber = 0;
		int addNumber = 0;
		//creates a list of 250 random digits between 1-2000
		for(int howManyInserted = 0; howManyInserted < 250; howManyInserted ++  )
			intList.add((int) ((Math.random()*2000) + 1));
		System.out.println("A random list of 250 numbers has been created please "
				+ "enter a number to check if it is in the list(Between 0 and 2000");
		//loop to get user guess of number in list
		while (true){
			//run function to get input
			newNumber = properValueTest();
			if (newNumber != 0) {
				//prints the sorted list
				System.out.println("Sorted list");
				System.out.println(sort(intList));
				//find where number is
				where(newNumber);
				//if none
				if (placeHolderList.isEmpty()) {
					System.out.println("Your number is not in the list");
				}
				else {
					//if user number exists
					placeHolderList.clear();
					//clears for later use
					System.out.println("Your number exists in the following positions:");
					//get where so it can print then clears it
					System.out.println(where(newNumber));
					placeHolderList.clear();
					}
				break;
				}
			else {
				//improper value will make the user choose again
				System.out.println("Please enter a valid number");
				}
		}
		
		System.out.println("Please enter a number to add to "
				+ "the list, then I will tell you where it is in the list.");
		//gets number to add to array
		while (true){
			addNumber = properValueTest();
			if (addNumber != 0) {
				//if proper value
				intList.add(addNumber);
				//adds number to list
				System.out.println("List sorted after addition");
				System.out.println(sort(intList));
				//sort list
				System.out.println("Your number exists in the following positions:");
				System.out.println(where(addNumber));
				//print where number is 
				break;
				}
			else {
				//forces user to enter valid number
				System.out.println("Please enter a valid number");
				}
		}
	}
}
		
	

