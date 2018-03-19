/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: Mar 2018
 * Lets user create an array of students with name, grade and B-day
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
	//The ADT used to define a student
	//enum for grades to check what inputs are viable
	enum Grades {
		ONE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		ELEVEN,
		TWELVE,
		JK,
		SK;
	}
	// define what info is needed for a student
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private String _bDay; //dd/mm/yyyy
	private Grades _grade;
	private String _fullName;
	// class for a student
	public Student(String firstName, String middleName, String lastName,
					  String birthDate, String inputGrade) {
		//info needed to create a student
		this._firstName = firstName;
		this._middleName = middleName;
		this._lastName = lastName;
		this._bDay = birthDate;
		this._grade = Grades.valueOf(inputGrade.toUpperCase());
		this._fullName = (firstName+" "+middleName+" "+lastName);
	}
	
	public String firstName() {
		//returns the first name
		return this._firstName;
	}
	public String middleName() {
		//returns the middle name
		return this._middleName;
	}
	public String lastName() {
		//returns the last name
		return this._lastName;
	}
	public String birthDate() {
		//returns the birth date
		return this._bDay;
	}
	public Grades grade() {
		//returns the grade
		return this._grade;
	}
	public String fullName() {
		//returns the full name
		return this._fullName;
	}
}

public class ADTStudentArray {
	
	public static void main(String[] args) throws IOException {
		//Fill an array with students
		
		int numberOfStudents = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
		while(true) {
			//get the number of students in the classroom
			System.out.println("How many students are in the class?");
			String input = reader.readLine();
			numberOfStudents = Integer.parseInt(input);
			if(numberOfStudents>0) {
				break;}
			else {
					 System.out.println("Please enter a positive number");
				}
				System.out.println("Please enter a number");
			}
		
		
		Student[] studentArray = new Student[numberOfStudents];
		
		for(int student=1; student<=studentArray.length; student++) {
			//get fields required to create student
			System.out.println("Student "+student+"'s first name:");
			String firstName = reader.readLine();
			System.out.println("Student "+student+"'s middle name:");
			String middleName = reader.readLine();
			System.out.println("Student "+student+"'s last name:");
			String lastName = reader.readLine();
			System.out.println("Student "+student+"'s B-Day: (dd/mm/yyyy)");
			String birthDate = reader.readLine();
			System.out.println("Student "+student+"'s Grade:");
			String grade = reader.readLine();
			
			studentArray[student-1] = new Student(firstName, middleName, lastName,
											 birthDate, grade);
		}
		
		//print each student
		for(Student student: studentArray) {
			System.out.println("Name: "+student.fullName()+" Birth Date: "
								+student.birthDate()+" Grade: "+student.grade());
		}
	}
}