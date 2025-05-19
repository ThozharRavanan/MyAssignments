package day3.HomeAssignments;

import java.util.Arrays;

public class FindMissingElement {
	//Program to find missing Element

	public static void main(String[] args) {
		
//		Input -> {1, 4,3,2,8, 6, 7};        
		int [] arr = {1,4,3,2,8,6,7};
//		}
		//1 2 3 4 6 7 8 
		
		Arrays.sort(arr);
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[j]!=(j+1)) {
					System.out.println("The Missing element is :"+(j+1));
					break;
					
				}
				
			}
			
		}
		
		
	}



	

