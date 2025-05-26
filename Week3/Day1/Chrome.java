package Week3.Day1;

public class Chrome extends BrowsrerSuper {

	public void OpenIncognito() {
		System.out.println("Incognito");

	}
	public void clearCache(){
		
		System.out.println("Clear the cache");
		
	}
	public static void main(String[] args) {
		Chrome c = new Chrome();
		//Child Class Methods
		c.clearCache();
		c.OpenIncognito();
		//BaseClassMethods
		c.closeBrowser();
		System.out.println("Name of the browser : "+c.browserName);
		System.out.println("Version of the browser : "+c.browserVersion);
	}
}
