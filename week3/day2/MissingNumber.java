package homeAssignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
	
	public static void main(String[] args) {
		//Initializing the array
		int Array [] = {1,2,3,4,10,6,8};
		//Initializing the list
		List<Integer> lis = new ArrayList<Integer>();
		//Sorting the array
		Arrays.sort(Array);
		
		//Find maximum number
		int max = Array[0];
		for (int i = 0; i < Array.length; i++) {
			if(Array[i]> max)
			{
				max = Array[i];
			}
		}
		//Print the max number
		System.out.println("Maximum number is :" +max);
		//Adding values to list
		for (int i : Array) {
//			System.out.println(i);
			lis.add(i);
		}
		
		
		System.out.println(lis);
//		
//		for (int i = 1; i < lis.size(); i++) {
//			
//			 if (!lis.contains(i)) {
//        System.out.println("Missing number: " + i);
//	
//		}
		
		//Using Traditional For for Fetching missing
		for (int i = 0; i < lis.size() - 1; i++) {
			int current = lis.get(i);
			int next = lis.get(i + 1);

			// If there is a gap
				if (next != current + 1) {
						for (int missing = current + 1; missing < next; missing++) {
							System.out.println("Missing number: " + missing);
						}
							}
		}
		}
	}		
	
				
	


