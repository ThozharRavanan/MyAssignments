package Week3.Day1;

public class Safari extends BrowsrerSuper{
	
	public void readerMode() {
		System.out.println("Reader Mode");
	}
	public void fullScreenMode() {
System.out.println("Full Screen");
	}
public static void main(String[] args) {
	
	Safari s = new Safari();
	//Child Class Methods
	s.readerMode();
	s.fullScreenMode();
	
	//BaseClassMethods
	System.out.println("Name of the browser : "+s.browserName);
	System.out.println("Version of the browser : "+s.browserVersion);
	s.closeBrowser();
}
}
