/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: Feb 2018
 * create random grades for four students in a 2D array print average 
 * and each of their grades, includes variance to encourage higher numbers
 *
 ****************************************************************************/
public class GradeAverageCalc2DArray {
	
	public static double max(double [][] array) {
		double runningTotal = 0.0;
		double numberOfGrades = 24.0;
		double average = 0.0;
		for(int row = 0; row < array.length; row++){
		    for(int column = 0; column < array[row].length; column++){
		        runningTotal =runningTotal + array[row][column];
		        average = runningTotal / numberOfGrades;}
		        
		}
		return average;
	}
		
		
	
	public static void main(String[] args) {
		double [][] gradeAndNames = new double [4][6];
		for(int row = 0; row < gradeAndNames.length; row++){
		    for(int column = 0; column < gradeAndNames[row].length; column++){
		        int randInt =(int)(Math.random()*(101))+0;
		        if (randInt < 50) {
		        	randInt = (int)(Math.random()*(101))+0;} 
		        gradeAndNames[row][column]=randInt;
		    }
		}
		for(int row = 0; row < gradeAndNames.length; row++){
			System.out.println();
			System.out.print("student #" + row + ":");
		    for(int column = 0; column < gradeAndNames[row].length; column++){
		        System.out.print(gradeAndNames[row][column]);
		    }
		}
		System.out.println();
		System.out.println("The average grade was " + max(gradeAndNames) + "percent");
		
		
	}	
}
