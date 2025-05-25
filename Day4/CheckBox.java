package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {
	public static void main(String[] args) {
		
		//Initialising the driver and maximising
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		//Click on basic Checkbox
		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[1]")).click();
		
		//Click on basic Notification box
		WebElement notfication = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[2]"));
		notfication.click();
		
//      Verifying the message		
//		WebElement chckd = driver.findElement(By.xpath("//span[@text()='Checked']"));
		WebElement chckd = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		//		ui-growl-title
		String text = chckd.getText();
		if(text.equals("Checked"))
		{
			System.out.println("Expected message is displayed");
		}
		
	//  Choosing fav language
		WebElement java = driver.findElement(By.xpath("//table[@class='ui-selectmanycheckbox ui-widget']/tbody/tr/td[1]/div"));
		java.click();
		
		WebElement csharp = driver.findElement(By.xpath("//table[@class='ui-selectmanycheckbox ui-widget']/tbody/tr/td[4]/div"));
		csharp.click();
		
		//Using tri state Checkbox
		WebElement tristate = driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']"));
		tristate.click();
		if(tristate.isSelected()) {
			System.out.println("TriState Option has been chosen");
		}
		
		//Toggle switch and verification
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		WebElement togld = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String Istogld = togld.getText();
		if(Istogld.equals("Checked"))
		{
			System.out.println("Toggle Switch is checked");
		}
		
//		To Check if Checkbox is disabled
//		WebElement chkbox = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
//		WebElement chkbox = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']"));
//	
//		WebElement chkbox = driver.findElement(By.xpath("//span[text()='Disabled']"));
//		WebElement chkbox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		
		//Verifying if Check box is disabled
		WebElement chkbox = driver.findElement(By.xpath("//input[@name='j_idt87:j_idt102_input']"));
		
		boolean enabled = chkbox.isEnabled();
		
		if(enabled==true)
		{
			System.out.println("Checkbox is Enabled");
		}
		else
		{
			System.out.println("Checkbox is disabled");
		}
			
		//Dropdown Selection
//		WebElement dropdown = driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield')]"));
//		dropdown.click();
//		WebElement srchbox = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']"));
//		srchbox.sendKeys("London");
//		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]")).click();
//		
		
		WebElement parent = driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-multiple')]/ul"));
		parent.click();
		WebElement srchbox = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']"));
		srchbox.sendKeys("London");
		
		driver.findElement(By.xpath("//ul[@role='group']/li[2]/div/div[2]")).click();
		srchbox.clear();
		srchbox.sendKeys("Miami");
		driver.findElement(By.xpath("//ul[@role='group']/li/div/div[2]")).click();

		//Close
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
		driver.quit();
	}

}
