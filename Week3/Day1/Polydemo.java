package Week3.Day1;

public class Polydemo {
	public void reportStep(String message,String status) {

		System.out.println("The message is "+message);
		System.out.println("The Status is "+status);

	}

	public void reportStep(String message,String status,String custmsg) {
		
		System.out.println("The message is "+message);
		System.out.println("The status is "+status);
		System.out.println("The message is "+custmsg);

	}
	public void reportStep(String status,Boolean snap) {
		
		System.out.println("The Status is "+status);
		if(snap.equals(true))
		{
			System.out.println("Take Snapshot");
		}
		
		

	}
	public static void main(String[] args) {
		
		Polydemo p = new Polydemo();
		p.reportStep("hi", "Active");
		p.reportStep("My msg", "Inactive", "My Custom msg");
		p.reportStep("Hiberanated", false);
		p.reportStep("Active again", true);
	}

}
