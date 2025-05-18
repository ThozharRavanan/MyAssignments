package day2assignments;

public class Library {

	String addBook(String bookTitle){
		
		return bookTitle;
		}
	
	void issueBook(){
		
		System.out.println("Book issued successfully");
		
	}
public static void main(String[] args) {
	Library l = new Library();
	String book = l.addBook("Ponniyin Selvan");
	System.out.println("Book Name is :"+book);
	
	l.issueBook();
}
}