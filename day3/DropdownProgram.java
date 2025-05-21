package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownProgram {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.telerik.com/contact");
		driver.manage().window().maximize();
		
		
		WebElement findElement = driver.findElement(By.name("DropdownListFieldController_0"));
		//Finding the WebElement
		Select select = new Select(findElement);
		//Object for Select class
		select.selectByIndex(5);
		

		WebElement findElement2 = driver.findElement(By.name("DropdownListFieldController"));
		//Finding the WebElement
		Select select2 = new Select(findElement2);
		
		select2.selectByVisibleText("UI for jQuery");
		
		
		//Name
		driver.findElement(By.name("TextFieldController")).sendKeys("Dilip");
//		driver.findElement(By.name(null))
		driver.findElement(By.name("TextFieldController_0")).sendKeys("Testleaf");
		
		//email EmailTextFieldController
		driver.findElement(By.name("EmailTextFieldController")).sendKeys("dil25036956@gmail.com");

		//Company
		driver.findElement(By.name("TextFieldController_1")).sendKeys("CTT Tech");
		
		//Country-1
		
		WebElement findElement3 = driver.findElement(By.className("js-country-field"));
		
		Select select3 = new Select(findElement3);
		
		select3.selectByValue("Costa Rica");
		
		//Phone
		
		driver.findElement(By.name("TextFieldController_2")).sendKeys("8989567423");
		
		//Comments
		driver.findElement(By.name("ParagraphTextFieldController")).sendKeys("No Comments");
		
		
		
	
		
	}
}
