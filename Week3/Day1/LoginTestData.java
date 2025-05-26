package Week3.Day1;
//Creating Child class inheriting the Base
public class LoginTestData extends TestData{
	
	//Creating Multiple methods for child class
	public void enterUsername() {
		System.out.println("Please Enter Username");
	}
	public void enterPassword() 
	{
		System.out.println("Please enter the password");
	}
	
//Declaring and initiating main method	
public static void main(String[] args) {
//	Creating object for Child class
	LoginTestData l = new LoginTestData();
	
//Calling the Base Class methods
	l.enterCredentials();
	l.navigateToHomePage();
//Calling the Same Class Methods	
	l.enterPassword();
	l.enterUsername();
	
}
}
