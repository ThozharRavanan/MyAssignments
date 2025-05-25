package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Radiobtn_prog {

	public static void main(String[] args) throws InterruptedException {


		EdgeDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		//Select Your Most Favourite Browser

		WebElement chrome = driver.findElement(By.xpath("//label[text()='Chrome']"));
		chrome.click();

		// Wait for UI update
		Thread.sleep(1000);

		// Find the actual radio input
		WebElement radiobtn = driver.findElement(By.id("j_idt87:console1:0"));

		// // finding the radio input tag -1 
		if (radiobtn.isSelected()) {
		    System.out.println("The Chrome radio button is selected");
		} else {
		    System.out.println("Chrome radio button is NOT selected");
		}

//		UnSelectable
		
		WebElement UnSelectable = driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']"));
		UnSelectable.click();
		UnSelectable.click();
		
		// finding the radio input tag -2 
		WebElement UnSelectableRadio = driver.findElement(By.xpath("(//input[@name='j_idt87:city2'])[1]"));
		if (UnSelectableRadio.isSelected()) {
		    System.out.println("The UnSelectable radio button is selected");
		} else {
		    System.out.println("UnSelectable radio button is NOT selected");
		}

		
		//Find the default select radio button
		//Identifying the Already Selected
		WebElement IntiallySelected = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		
		if (IntiallySelected.isSelected()) {
		    System.out.println("The IntiallySelected radio button is already selected");
		} else {
		    System.out.println("IntiallySelected radio button is NOT selected");
		}

	// To check if 21-40 is selected defaultly
WebElement lastradiobtn = driver.findElement(By.xpath("(//input[@name='j_idt87:age'])[2]"));
	if(lastradiobtn.isSelected())
	{
		System.out.println("21-40 Radio button is already checked");
	}
	else
	{
		driver.findElement(By.xpath("//label[contains(text(),'21-40')]")).click();
	}
	}		
}
