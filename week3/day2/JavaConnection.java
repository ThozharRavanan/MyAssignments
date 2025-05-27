package homeAssignment.week3.day2;
//Implementing the Interface
public class JavaConnection implements DatabaseConnection{
//implementing declared but not implemented methods in  Concrete class 
//Override already declared methods
	@Override
	public void connect() {
		System.out.println("Connect the Database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the Database");
		
	}

	@Override
	public void executeUpdate() { 
		System.out.println("Execute the update");
		
	}
//Executing the main Function	
public static void main(String[] args) {
	//Creating object
	JavaConnection j = new JavaConnection();
	//Calling the methods
	j.connect();
	j.disconnect();
	j.executeUpdate();
}
}
