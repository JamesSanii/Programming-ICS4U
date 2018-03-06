/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: March 2018
 * This code plays rock paper scissors
 *
 ****************************************************************************/
package assignment2;
import java.util.Scanner; 

public class RockPaperScissors {
	public static void main(String[] args) {
		boolean hasUserEnteredValidChoice = false;
		String computerChoice = "";
		String userChoice = "";
		int computerInt = (int)(Math.random()*3) + 1;
		System.out.println("We are playing Rock, Paper, Scissors!\n" 
				+"Type 'Rock' to choose rock.\n" 
				+ "Type 'Paper' to choose paper.\n"
				+ "Type 'Scissors'  to choose scissors");
		if (computerInt == 1) {
			computerChoice = "Rock";
		}
		else if (computerInt == 2) {
			computerChoice = "Paper";
		}
		else {
			computerChoice = "Scissors";
		}
		System.out.println("The computer has made its choice.\n" +
		"Please enter your choice: "); 
		while (hasUserEnteredValidChoice == false) {
			Scanner input = new Scanner( System.in );
			userChoice = input.nextLine();
			if (userChoice.equals("Rock") || userChoice.equals("Paper") || 
				userChoice.equals("Scissors")) {
				System.out.println("You have chosen: " + userChoice );
				hasUserEnteredValidChoice = true;
				input.close();
			}
			else {
				System.out.println("Your choice was invalid, "
					+ "please enter one of the following\n" 
					+"Type 'Rock' to choose rock.\n" 
					+ "Type 'Paper' to choose paper.\n"
					+ "Type 'Scissors'  to choose scissors");
			}
		
		}
		System.out.println("The computer chose: " + computerChoice );
		if (userChoice.equals(computerChoice)) {
			System.out.println("It is a Tie.");
		}
		else if (userChoice.equals("Rock") &&
				computerChoice.equals("Scissors")||
				userChoice.equals("Paper") &&
				computerChoice.equals("Rock")||
				userChoice.equals("Scissors") &&
				computerChoice.equals("Paper")) {
			System.out.println("You Win!");
		}
		else {
			System.out.print("You Lose.");
		}
	}
}
