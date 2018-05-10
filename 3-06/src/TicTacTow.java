import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public class TicTacTow {
	
	String userValue = "O";
	String computerValue = "X";
	String[] board = new String[] {"1","2","3","4","5","6","7","8","9"};
	

	public boolean whoWins(String[] theBoard, String playerValue) {
		if (theBoard[0] == theBoard[1] && theBoard[0] == theBoard[2] && theBoard[0] == playerValue) {
			return true;
			
		}
		else if (theBoard[3] == theBoard[4] && theBoard[3] == theBoard[4] && theBoard[3] == playerValue) {
			return true;
		}
		else if (theBoard[6] == theBoard[7] && theBoard[6] == theBoard[8] && theBoard[6] == playerValue) {
			return true;
		}
		else if (theBoard[3] == theBoard[4] && theBoard[3] == theBoard[4] && theBoard[3] == playerValue) {
			return true;
		}
		else if (theBoard[0] == theBoard[3] && theBoard[0] == theBoard[6] && theBoard[0] == playerValue) {
			return true;
		}
		else if (theBoard[1] == theBoard[4] && theBoard[1] == theBoard[7] && theBoard[1] == playerValue) {
			return true;
		}
		else if (theBoard[2] == theBoard[5] && theBoard[2] == theBoard[8] && theBoard[2] == playerValue) {
			return true;
		}
		else {
			return false;
		}
	}
	void placement(String xOrO) {
		boolean validChoice = false;
		while (validChoice == false) {
			Scanner input = new Scanner( System.in );
			System.out.println("enter where in the grid you want to play");
			String x = input.nextLine();
			System.out.println(x);
			int userChoice = Integer.parseInt(x);
			System.out.println(userChoice);
			if (userChoice < 9 && userChoice > 0) {
				if (board[userChoice - 1] != "X" || board[userChoice] != "O") {
					board[userChoice - 1] = xOrO;
					validChoice = true;
				}
				
			}
			
		}
		
	}
	public ArrayList<String> availableSpots() {
		ArrayList<String> emptySpots=new ArrayList<String>(); 
		int counter = 0;
		while (counter < 9){
			if (board[counter] != "X" || board[counter] != "O") {
				emptySpots.add(Integer.toString(counter));
			}
			counter++;
		}
		return emptySpots;	
	}
	
	
	
	public void showGame() {
		System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("---+---+---");
		System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("---+---+---");
		System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
	}
	
	public int win(ArrayList<String> newBoard, String player) {
		int winChance = 0;
		ArrayList<String> availSpots = availableSpots();
		if(whoWins(board,"O") == true) {
			return 1;
		}
		else if(whoWins(board,"X") == true) {
			return -1;
		}
		else if (availSpots.isEmpty() == true) {
			return 0;
		}
		
		ArrayList<String> moves=new ArrayList<String>(); 
		for(int i = 0; i < availSpots.size(); i++) {
			ArrayList<String> possibleMoves = new ArrayList<String>();
			possibleMoves = newBoard.clone(newBoard[availSpots[i]]);
			
		}
		newBoard[availSpots[i]] = player;
		if (player == "O") {
			int result = win(newBoard, "X");
			move.score = result.score;
		}
		else {
			int result = win(newBoard, "O");
			move.score = result.score;
		}
		
		newBoard[availSpots[i]] = move.index;
		moves.add(move);
		
		int bestMove;
		if(player == "O") {
			int bestScore = -10000;
			for (int i = 0; i < moves.length; i++) {
				if(moves[i].score > bestScore) {
					bestScore = moves[i].score;
					bestMove = i;
				}
			}
		}
		else {
			int bestScore = 10000;
			for (int i = 0; i < moves.length; i++) {
				if(moves[i].score > bestScore) {
					bestScore = moves[i].score;
					bestMove = i;
				}
			}
		}
		return moves[bestMove];
	}
	}
	



