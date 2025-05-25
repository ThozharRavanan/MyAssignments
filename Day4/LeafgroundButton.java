package week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {
	public static void main(String[] args) {
		
//		Intialising and Launching the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//Click and Confirm title
		WebElement clickNconfrm = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']"));
		clickNconfrm.click();
		
		//Verifying the Title
		String title = driver.getTitle();
		if(title.contentEquals("Dashboard"))
		{
			System.out.println("Title is"+title);
		}
		
		//NAvigating back
		driver.navigate().back();
		
		// ‘Confirm if the button is disabled’ is disabled.  
		WebElement disabledbtn = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"));
		boolean enabled = disabledbtn.isEnabled();
		System.out.println("Is the Button enabled :"+enabled);
		
		
		// Identifying the position of the button with the text ‘Submit.’ 
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']"));

		System.out.println("Index position of submit Element is :"+submitBtn.getLocation());
		
		// Identifying the background color of the button with the text ‘Find the Save Button color'
		
		WebElement colorBtn = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']"));
		String bgcolor = colorBtn.getCssValue("background-color");
		System.out.println("The Background Colour is "+bgcolor);
		
		//Identifying the height and width of the button with the text ‘Find the height and width of this button.’ 
		
		WebElement HeightNWidth = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']"));
		Dimension size = HeightNWidth.getSize();
		System.out.println(size);
		
		driver.quit();
	}

}
