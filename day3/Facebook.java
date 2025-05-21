package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti')]")).click();
		
		//firstname
		driver.findElement(By.name("firstname")).sendKeys("Gowtham");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Tamilselvan");
		
		WebElement Day = driver.findElement(By.id("day"));
		Select select = new Select(Day);
		select.selectByValue("10");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select select2 = new Select(Month);
		select2.selectByVisibleText("May");
		
		WebElement yr = driver.findElement(By.id("year"));
		Select select3 = new Select(yr);
		select3.selectByIndex(15);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("gowtham@gmail.com");
		
//		WebElement pwd = driver.findElement(By.id("password_step_input"));
//		pwd.sendKeys("Password1@");
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	
	}

}
