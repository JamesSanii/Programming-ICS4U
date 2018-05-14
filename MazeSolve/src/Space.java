public class Space {
	//Represents one space in the maze
	
	public boolean start = false;
	public char value;
	public boolean visited = false;
	public boolean correctPath = true;
	public int x;
	public int y;
	
	Space(char value, int x, int y){
		//constructor, values needed for construction
		this.x = x;
		this.y = y;
		this.value = value;
	}
	
	public char getValue() {
		//gets the value of a space
		return value;
	}
	
	public boolean correctPath() {
		//returns if part of correct path
		return correctPath;
	}
	
	public boolean notTested() {
		//returns which spots have been tested
		if (visited == false && value == '.') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean checkIfStart() {
		//if value is start assign as start
		if (value == 'S') {
			start = true;
			return true;
		}
		else { 
			return false;
		}
	}
	
	public int[] getCoordinate() {
		//return spot
		int [] coordinate = new int[] {x,y};
		return coordinate;
	}
	
	public void setVisited() {
		//set visited
		visited = true;
		value = 'x';
		
	}
	
	public void setCorrectPath(boolean isItCorrect) {
		//sets if part of the correct path
		correctPath = isItCorrect;
		value = '+';
	}
}

