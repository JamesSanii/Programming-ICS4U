import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
	//maze class
	int height;
	int length;
	private Space[][] grid;
	int[] placeHolder = new int[] {0,0};
	//get maze
	Maze(String fileLocation) throws FileNotFoundException {
		Scanner input = new Scanner(new File(fileLocation));
		int height = 1;
		int length = input.nextLine().length();
		
		
		while(input.hasNextLine()) {
			//find how big maze is
			input.nextLine();
			height++;
		}
		
		this.height = height;
		this.length = length;
		input.close();
		//create maze
		grid = new Space[height][length];
		
		Scanner mazeInput = new Scanner(new File(fileLocation));
		int x = 0;
		while(mazeInput.hasNextLine()) {
			//loops through and recreates the maze as an array
			String rowOfMaze = mazeInput.nextLine();
			char[] arrayMaze = rowOfMaze.toCharArray();
			for(int i = 0; i < arrayMaze.length; i++) {
				grid[x][i] = new Space(arrayMaze[i],x,i);
			}
			x++;
		}
		//close maze input
		mazeInput.close();
		//get start position
		placeHolder = getStart();
		int xStart = placeHolder[0];
		int yStart = placeHolder[1];
		//get the proper path
		getPath(xStart, yStart);
	}
	
	public int[] getStart() {
		//finds the start
		for(Space[] row: grid) {
			for (Space spot:row) {
				if(spot.checkIfStart() == true) {
					return spot.getCoordinate();
				}
			}
		}
		//never will happen
		return new int[] {-78,-99};
	}
	
	public boolean getPath(int x, int y) {
		//get the path
		//recursive function to find solution
		if (grid[x][y].getValue() == 'G') {
			//if goal return true
			return true;
		}
		if (grid[x][y].getValue() == '+' || grid[x][y].getValue() == '#' || grid[x][y].getValue() == 'x') {
			//values which will return false
			return false;
		}
		grid[x][y].setVisited();
		//checks path around current state
		if (x!= 0) {
			if(getPath(x-1,y)) {
				grid[x][y].setCorrectPath(true);
				return true;
			}
		}
		if (x != this.height-1) {
			if(getPath(x+1,y)) {
				grid[x][y].setCorrectPath(true);
				return true;
			}
		}
		if (y!= 0) {
			if(getPath(x,y-1)) {
				grid[x][y].setCorrectPath(true);
				return true;
			}
		}
		
		if (y != this.length-1) {
			if(getPath(x,y+1)) {
				grid[x][y].setCorrectPath(true);
				return true;
			}
		}
		return false;
	}
	
	public int pathCounter(int[] spot) {
		//used to make sure only proper path is marked as +
		int x = spot[0];
		int y = spot[1];
		int counter = 0;
		if (x!= 0) {
			if(grid[x-1][y].value == '+') {
				counter++;
			}
		}
		if (x != this.length-1) {
			if(grid[x][y+1].value == '+') {
				counter++;
			}
		}
		if (y != 0) {
			if(grid[x][y-1].value == '+') {
				counter++;
			}
		}
		if (y != this.height -1) {
			if(grid[x+1][y].value == '+') {
				counter++;
			}
		}
		return counter;
		
	}
	public void printSolvedMaze() {
		//prints the maze
		for(Space[] row: grid) {
			for(Space spot: row) {
				if(spot.start == true) {
					System.out.print('S');
				}
				else if(spot.correctPath() &&
						spot.getValue() == '+') {
					System.out.print('+');
				} else {
					if (spot.getValue() == '+') {
						System.out.print('.');
					}
					else{System.out.print(spot.getValue());}
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		//main, runs code
		Maze getPath = new Maze("Maze1.txt");
		getPath.printSolvedMaze();
	}
}
