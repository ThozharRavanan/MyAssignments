package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
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
		WebElement lead = driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a[text()='Leads']"));
		lead.click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("GS limited");
//		Providing Name
		WebElement fname = driver.findElement(By.xpath("//span[text()='First name']/following::input[@id='createLeadForm_firstName']"));
		fname.sendKeys("Gowtham");
		WebElement lname = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lname.sendKeys("Tamil selvan");
		WebElement fnamelocal = driver.findElement(By.xpath("//input[@name='firstNameLocal']"));
		fnamelocal.sendKeys("Ravan");
		
		//Deparment Name
		WebElement deptName = driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']"));
		deptName.sendKeys("Testing");
		
		//Description
		WebElement desc = driver.findElement(By.xpath("//span[contains(text(),'Desc')]/following::textarea[1]"));
		desc.sendKeys("Description is here");
		
		//Enter Email address
		driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("gtboss69@gmail.com");
		
		//State Selected as Newyork
		WebElement state = driver.findElement(By.xpath("//select[contains(@id,'generalStateProvince')]"));
		Select select = new Select(state);
		select.selectByVisibleText("New York");
		
		//Click on Create Button 
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Click on Edit Button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clearing Description
		WebElement desc2 = driver.findElement(By.xpath("//textarea[@name='description']"));
		desc2.clear();
		
		//Important Note
		WebElement impNote = driver.findElement(By.xpath("//textarea[@name='importantNote']"));
		impNote.sendKeys("This is a Imp note");
		
		WebElement update = driver.findElement(By.xpath("(//input[@name='submitButton'])[1]"));
		update.click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}

}
