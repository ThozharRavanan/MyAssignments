package overall_day4_week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount_leaftaps {
	
	public static void main(String[] args) throws InterruptedException {
		
//		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		//Leads
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("accountName")).sendKeys("Gowtham");
		driver.findElement(By.id("groupNameLocal")).sendKeys("TamilSelvan");
		
		driver.findElement(By.id("annualRevenue")).sendKeys("11Lpa");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Autmation Tester");
		driver.findElement(By.id("annualRevenue")).sendKeys("numberEmployees");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();		
		System.out.println(title);
		
//		driver.close();

	}

}





