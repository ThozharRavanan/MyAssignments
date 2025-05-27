package homeAssignment.week3.day2;

import java.util.ArrayList;
import java.util.List;


//Creating a Class
public class FindIntersection {
	
	public static void main(String[] args) {
		//Declaring Arrays
		int Array1[] = {3, 2, 11, 4, 6, 7};
		int Array2[] = {1, 2, 8, 4, 9, 7};
		//Initializing the List
		List<Integer> li1= new ArrayList<Integer>();
		List<Integer> li2= new ArrayList<Integer>();
		List<Integer> intersection = new ArrayList<Integer>();
		
		//For each loop to add to List
		for (int i : Array1) {
			
			li1.add(i);
			
		}
		for (int i : Array2) {
			
			li2.add(i);
			
		}
	//Printing the responses	
	System.out.println(li1);
	System.out.println(li2);
	
	//Traditional for Loop for execution
	for (int i = 0; i < Array1.length; i++) {
		
		for (int j = 0; j < Array2.length; j++) {
			
			if((li1.get(i)).equals(li2.get(j)))
			{
                intersection.add(li1.get(i));
			}
		}
		
	}
	System.out.println("The Intersecting numbers are"+intersection);
	
	}
	
}
