/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: Feb 2016
 * creates 10 rand ints spits out the max and min
 *
 ****************************************************************************/
import java.util.List;
import java.util.ArrayList;
public class RandomIntMinMax {

	public static List<Integer> intlist = new ArrayList<Integer>();
		
	

	public static int max(List<Integer> array) {
		int biggestNumber = array.get(0);
		for(int number = 1; number < 10; ++number) {
			if(array.get(number) > biggestNumber) {
				biggestNumber = array.get(number);}}
		return biggestNumber;
		}
	public static int min(List<Integer> array) {
		int smallestNumber = array.get(0);
		for(int number = 1; number < 10; ++number) {
			if(array.get(number) < smallestNumber) {
				smallestNumber = array.get(number);}}
		return smallestNumber;
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int howManyInserted = 0; howManyInserted < 10; howManyInserted ++  )
			intlist.add((int) ((Math.random()*99) + 1));
		System.out.println(intlist);
		System.out.println(max(intlist));
		System.out.println(min(intlist));
	}

}
