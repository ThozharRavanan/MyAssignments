package day3.HomeAssignments;

import java.util.Arrays;

public class AnagramCheck {
public static void main(String[] args) {
	
	String Text1 = "stops";  
    String Text2 = "potss"; 
    
    if(Text1.length()!=Text2.length())
    {
    System.out.println("Length mismatch,the Strings are not Anagram");	
    }
    else {
    
    char[] cs1 = Text1.toCharArray();
    char[] cs2 = Text2.toCharArray();
    
    Arrays.sort(cs1);
    Arrays.sort(cs2);
//    for (int i = 0; i < cs1.length; i++) {
//    	
//    		if(cs1[i]==cs1[i]) {
//    			System.out.println("The Give Strings are Anagram");
//    		}
//	}		
	if(Arrays.equals(cs1, cs2))
	{
		System.out.println("The given Arrays are Anagaram");
	}
		
	}		 
}
}


