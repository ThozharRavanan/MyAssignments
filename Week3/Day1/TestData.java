package Week3.Day1;

//Creating Base class
public class TestData {
	
	//Creating multiple methods under Base class
	public void enterCredentials()
	{
		System.out.println("Please Enter the Credentials");
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigating Back to Home Page");
	}
	//Declaring main method
	public static void main(String[] args) {
		
		//Creating object for Base Class
		TestData t = new TestData();

		//Calling the Same Class Methods	
		t.enterCredentials();
		t.navigateToHomePage();
	}
}
