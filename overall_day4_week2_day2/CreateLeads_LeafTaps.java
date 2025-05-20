package overall_day4_week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLeads_LeafTaps {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//Leads
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gowtham");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tamilselvan");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sword global");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA Management");
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
	}

}
