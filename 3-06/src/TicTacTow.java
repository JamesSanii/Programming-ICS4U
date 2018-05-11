import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public class TicTacTow {
	
	TicTacTow(){
		int countDown = 0;
		while (countDown < 9) {
			board.add(Integer.toString(countDown));
			countDown ++;
		}
	}
	String userValue = "O";
	String computerValue = "X";
	ArrayList<String> board = new ArrayList<String>();
	
	

	public boolean whoWins(ArrayList<String> theBoard, String playerValue) {
		if (theBoard.get(0) == theBoard.get(1) && theBoard.get(0) == theBoard.get(2) && theBoard.get(0) == playerValue) {
			return true;
			
		}
		else if (theBoard.get(3) == theBoard.get(4) && theBoard.get(3) == theBoard.get(4) && theBoard.get(3) == playerValue) {
			return true;
		}
		else if (theBoard.get(6) == theBoard.get(7) && theBoard.get(6) == theBoard.get(8) && theBoard.get(6) == playerValue) {
			return true;
		}
		else if (theBoard.get(3) == theBoard.get(4) && theBoard.get(3) == theBoard.get(5) && theBoard.get(3) == playerValue) {
			return true;
		}
		else if (theBoard.get(0) == theBoard.get(3) && theBoard.get(0) == theBoard.get(6) && theBoard.get(0) == playerValue) {
			return true;
		}
		else if (theBoard.get(1) == theBoard.get(4) && theBoard.get(1) == theBoard.get(7) && theBoard.get(1) == playerValue) {
			return true;
		}
		else if (theBoard.get(2) == theBoard.get(5) && theBoard.get(2) == theBoard.get(8) && theBoard.get(2) == playerValue) {
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
				if (board.get(userChoice - 1) != "X" || board.get(userChoice - 1) != "O") {
					board.set(userChoice - 1, xOrO);
					validChoice = true;
				}
				
			}
			
		}
		
	}
	public ArrayList<String> availableSpots() {
		ArrayList<String> emptySpots=new ArrayList<String>(); 
		int counter = 0;
		while (counter < 9){
			if (board.get(counter) != "X" || board.get(counter) != "O") {
				emptySpots.add(Integer.toString(counter));
			}
			counter++;
		}
		return emptySpots;	
	}
	
	
	
	public void showGame() {
		System.out.println(" " + board.get(0) + " | " + board.get(1) + " | " + board.get(2));
		System.out.println("---+---+---");
		System.out.println(" " + board.get(3) + " | " + board.get(4) + " | " + board.get(5));
		System.out.println("---+---+---");
		System.out.println(" " + board.get(6) + " | " + board.get(7) + " | " + board.get(8));
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
		
		ArrayList<Move> moves=new ArrayList<Move>(); 
		for(int i = 0; i < availSpots.size(); i++) {
			Move move = new Move();
			move.index = newBoard.get(Integer.parseInt(availSpots.get(i)));
			newBoard.set(Integer.parseInt(availSpots.get(i)), player);
			if (player == "O") {
				int result = win(newBoard, "X");
				move.score = result;
			}
			else {
				int result = win(newBoard, "O");
				move.score = result;
			}
		
			newBoard.set(Integer.parseInt(availSpots.get(i)), move.index);
			moves.add(move);
		}
		
		int bestMove = 0;
		if(player == "O") {
			int bestScore = -10000;
			for (int i = 0; i < moves.size(); i++) {
				if(moves.get(i).score > bestScore) {
					bestScore = moves.get(i).score;
					bestMove = i;
				}
			}
		}
		else {
			int bestScore = 10000;
			for (int i = 0; i < moves.size(); i++) {
				if(moves.get(i).score > bestScore) {
					bestScore = moves.get(i).score;
					bestMove = i;
				}
			}
		}
		board.set(Integer.parseInt(moves.get(bestMove).index), player);
		return 0;
	}
	}
	



