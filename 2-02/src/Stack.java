/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: March 2018
 * This program is an example of a stack 
 *
 ****************************************************************************/
import java.util.ArrayList;

public class Stack {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public void push(int number) {
		list.add(number);
	}
	public int pop() {
		
		int returnValue = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return returnValue;
	}
}
