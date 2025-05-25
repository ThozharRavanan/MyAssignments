package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		
		//Initialising the Driver and Maximising the windows
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Adding implicit wait for flawless UI
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Providing user name anee password
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("DemoSalesManager");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("crmsfa");
		
		//Login
		WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
		
//		Creating Lead
		WebElement lead = driver.findElement(By.xpath("//li//a[text()='Leads']"));
		lead.click();
//      Finding leads
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		
//		Selecting First Leaf Id
		WebElement firstoccuringleaf = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a[@class='linktext'])[1]"));
		String leaf1 = firstoccuringleaf.getText();
		firstoccuringleaf.click();
//		Delete the Leaf1
		WebElement delete = driver.findElement(By.xpath("//a[text()='Delete']"));
		delete.click();
//      Finding leads again
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		
//      Passing the Last lead value		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leaf1);
		
//      Clicking the find search box
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//      Verifying if No records is displayed
		
		
		
		
		WebElement norecords = driver.findElement(By.xpath("//div[text()='No records to display']"));
		if(norecords.isDisplayed())
		{
			System.out.println("Old Records are not displayed");
		}
}
}