package homeAssignment.week3.day2;
//Extending the Class
public class JavaConnectionAgain extends MySqlConnection{
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
		
			
	}//Executing the main Function	
	public static void main(String[] args) {
		//Creating object
		JavaConnectionAgain j2 = new JavaConnectionAgain();
		//Calling the methods
		j2.connect();
		j2.disconnect();
		j2.executeUpdate();
		j2.executeQuery();

}
}
