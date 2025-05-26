package Week3.Day1;

public class Edge extends BrowsrerSuper {
	
	public void takeSnap() {
		System.out.println("Take Screenshot");
	}
	public void clearCookies() {
System.out.println("Clear cookies");

	}
public static void main(String[] args) {
	Edge e = new Edge();
	//Child Class Methods
	e.takeSnap();
	e.clearCookies();
	//BaseClassMethods
	
	System.out.println("Name of the browser : "+e.browserName);
	System.out.println("Version of the browser : "+e.browserVersion);
	e.closeBrowser();
}
}
