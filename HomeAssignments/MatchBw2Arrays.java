package day3.HomeAssignments;


public class MatchBw2Arrays {
	
	//Program to Find Intersection

	
	static int a[]= {3,2,11,4,6,7};
	static int b[] = {1,2,8,4,9,7};
	
	public static void main(String[] args) {
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				if(a[i]==b[j]) {
					System.out.println("The number "+a[i]+" is present in both arrays");
				}
				
			}
		}
			
		}
		
}
	

