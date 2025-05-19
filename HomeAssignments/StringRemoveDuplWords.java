package day3.HomeAssignments;



public class StringRemoveDuplWords {
	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = text.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			for (int j = i+1; j < split.length; j++) {
				
				if(split[i].equalsIgnoreCase(split[j]))
					
				{
					count++;
//					split[i].replaceAll(split[i], " ");
					split[j]=" ";
				}
				
			}
		
		}
		System.out.println("There are duplicates  : "+count);
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(" "+split[i]);
			
		}
		
		
	}

}
