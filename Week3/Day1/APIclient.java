package Week3.Day1;

public class APIclient {
	//Polymorphism Meyhod Overloading
	
	//Creating Send Request method with 1 argument
	public void sendRequest(String endPoint) {
		
		System.out.println(endPoint);
	}
	//Creating Send Request method with 2 arguments
public void sendRequest(String endPoint,String requestBody,Boolean requestStatus) {

	System.out.println(endPoint);
	//Validting the Request status
	if (requestStatus.equals(true)) {
		
		System.out.println("The Response is true");
	}
	else
	{
		System.out.println("The Response is false");
	}
	System.out.println(requestBody);
}


//Creating main method
public static void main(String[] args) {
//	 Creating Object for the Class
	APIclient a = new APIclient();
	//Calling the Overloaded methods using Object
	a.sendRequest("Calling the Primary endpoint");
	a.sendRequest("End Point to Launch", "This is the body", false);
}
}
