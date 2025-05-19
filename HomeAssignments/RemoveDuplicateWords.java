package day3.HomeAssignments;

public class RemoveDuplicateWords {
	
public static void main(String[] args) {
	
	String text = "We learn Java basics as part of java sessions in java week1";
	
	
	String[] split = text.split("java");
	for (int i = 0; i < split.length; i++) {
		
		System.out.println(split[i]);
		
	}
	
//	String replaceFirst = text.replaceFirst("Java", " ");
//	
//	System.out.println(replaceFirst);
}

}
