package homeAssignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
	//Initializing the array
	int arr [] = {3, 2, 11, 4, 6, 7}; 
	//Initializing the list
	List<Integer> li = new ArrayList<Integer>();
	
	//Adding bvallues to list using for each		
	for (int i : arr) {
	li.add(i);	
		
	}
	//Sorting the list and printing
	Collections.sort(li);
	System.out.println("The Sorted list is"+li);

//Executing conditions to Find maximum number
//	int max = arr[0];
	int max = li.get(0);
	int secondMax = li.get(0);
//	int secondMax = arr[0];
//	for (int i = 0; i < arr.length; i++) {
//	if(arr[i]> max)
//	max = arr[i];
	for(int i=0;i<li.size();i++) {
		if((li.get(i))>max)
		{
			secondMax = max;

			max=li.get(i);
			
		}
		else if ((li.get(i) > secondMax) && (li.get(i) != max)) {
		    secondMax = li.get(i);
		}
	
	}
	//Printing the Max and seco ndmax
	System.out.println("Maximum number is "+max);
	System.out.println("The Second maximum number is "+secondMax);
	}
	}
