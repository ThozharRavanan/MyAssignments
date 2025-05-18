package day2assignments;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library l = new Library();
		String BookName = l.addBook("Game Of Thrones");
		System.out.println("Book Added Successfully : "
				+ "" +BookName);
		
		l.issueBook();
	}
}
