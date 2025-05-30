package pack.marathon1;

import java.time.Duration;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		
		//Select tab Cinema
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//selecting cinema 

//		Selecting 1st dropdown
//		WebElement findElement = driver.findElement(By.xpath("(//select[@data-pc-section='select'])[2]"));
//		Select select = new Select(findElement);
//		select.selectByVisibleText("Select Cinema");
//	driver.findElement(By.xpath("//div[@class='p-hidden-accessible p-dropdown-hidden-select']/following::option[1]")).click();
		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
	
		//Selecting Theatre
				driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();
		//Tomorrow Data
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='p-dropdown-item'][2]")).click();
				
		//Choosing the Movie
		WebElement movie = driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]"));
		Thread.sleep(1000);
		movie.click();
	//Select timing
//		driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[5]")).click();
		driver.findElement(By.xpath("//div[@id='time']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
	//Click Book button
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-hORkcV gUVSfS bgColor filter-btn']")).click();
	
	//Confimation -terms box
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
	//Choose Seat
		driver.findElement(By.xpath("//span[@id='SL.SILVER|G:6']")).click();
	//Print seat number
		String SeatNumber = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("The Seat number is : "+SeatNumber);
	//Print GrandPrice
		String GrandTotal = driver.findElement(By.xpath("//div[@class='grand-prices']")).getText();
		System.out.println("The Total Price is"+GrandTotal);
	//Proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
	//Continue	
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
	//Close
//		driver.findElement(By.xpath("//div[@class='cross-icon mx-2']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		System.out.println("The Popup is close and Booking is cancelled");
	driver.quit();
	}

}
