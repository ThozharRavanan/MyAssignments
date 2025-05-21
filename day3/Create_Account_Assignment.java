package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Account_Assignment {
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("democsr");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
//		driver.findElement(By.xpath("")).click();
//		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//Account name
		driver.findElement(By.xpath("//input[contains(@id,'accountName')]")).sendKeys("Gowtham");
		
		//Description
		WebElement desc = driver.findElement(By.xpath("//textarea[@name='description']"));
		desc.sendKeys("Sample program");
		
		//Dropdown 1
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropIndustry = driver.findElement(By.name("industryEnumId"));
		Select select = new Select(dropIndustry);
		select.selectByIndex(3);
		
		WebElement dropOwnership = driver.findElement(By.name("ownershipEnumId"));
		Select select2 = new Select(dropOwnership);
		select2.selectByVisibleText("S-Corporation");
		
		WebElement dropsrc = driver.findElement(By.id("dataSourceId"));
		Select s3 = new Select (dropsrc);
		s3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement DropId = driver.findElement(By.id("marketingCampaignId"));
		Select s4 = new Select(DropId);
		s4.selectByIndex(6);
		
		WebElement tx = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s5 = new Select(tx);
		s5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	driver.close();
	}

}
