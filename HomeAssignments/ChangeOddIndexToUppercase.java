package day3.HomeAssignments;

//Change Odd index to uppercase

public class ChangeOddIndexToUppercase {
public static void main(String[] args) {
	
	String str = "changeme";
	
	
	
	char[] stArray = str.toCharArray();

	for (int i = 0; i < stArray.length; i++) {
	
		if(i%2!=0)
		{
			stArray[i] = Character.toUpperCase(stArray[i]);
				
		}
		
	}
//		String StringAgain = stArray.toString();
		for (char c : stArray) {

			System.out.println(c);
				
		}
		for (int i = 0; i < stArray.length; i++) {
			
			if(i%2!=0)
			{
				stArray[i]=Character.toLowerCase(stArray[i]);
					
			}
			
		}
//			String StringAgain = stArray.toString();
			for (char c : stArray) {

				System.out.println(c);
					
			}
	
	}
}

