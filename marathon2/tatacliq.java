package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v129.page.Page.GetAppIdResponse;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		Actions action =  new Actions(driver);
//		Mouse over brands
		WebElement brandshover = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		brandshover.click();
		action.clickAndHold(brandshover);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement hovertowatch = driver.findElement(By.xpath("//div[contains(@aria-label,'Watches ')]"));
		wait.until(ExpectedConditions.elementToBeClickable(hovertowatch));
		action.moveToElement(hovertowatch).clickAndHold().perform();
		System.out.println(hovertowatch.getText());
		
		//Choose Casio
		WebElement casio = driver.findElement(By.xpath("//div[text()='Casio']"));
//		WebElement firstpopular = driver.findElement(By.xpath("(//div[@class='DesktopHeader__featureBrands'])/div[@class='DesktopHeader__brandsHeader']/div[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(casio));
		casio.click();
		
		//Dropdown
		driver.findElement(By.xpath("//div[@class='SelectBoxDesktop__base']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
//		WebElement dropdown = driver.findElement(By.xpath("//div[@class=SelectBoxDesktop__hideSelect]"));
//		wait.until(ExpectedConditions.elementToBeSelected(dropdown));
//		dropdown.clear();
//		driver.findElement(By.xpath("//div[text()='New Arrivals']")).click();
		//Selecting new Arrivals
		Select select = new Select(dropdown);

		select.selectByValue("isProductNew");

		//Selecting Men Radio button
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();
		
//		Print all prices ProductDescription__boldText
		Thread.sleep(5000);
		List<WebElement> Allprices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
//		List<WebElement> Allprices = driver.findElements(By.xpath("//h3[@class='ProductDescription__boldText']"));
		List<String> li = new ArrayList<String>();
//		Thread.sleep(5000);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ProductDescription__priceHolder']")));
//		wait.until(ExpectedConditions.visibilityOfAllElements(Allprices));
		System.out.println("All the prices are :");
		for (int i = 0; i < Allprices.size(); i++) {
			System.out.println(Allprices.get(i).getText());
			li.add(Allprices.get(i).getText());
			
		}
//		System.out.println("The total datas present are :" +li.size());
		String FirstResulting_value = li.get(0);
		String FirstResultingvalue_withoutsymbol = null ;
		if(FirstResulting_value.contains("₹"))
		{
			
			FirstResultingvalue_withoutsymbol = FirstResulting_value.replace("₹", "");
			
		}
		System.out.println("The First value is : "+FirstResultingvalue_withoutsymbol);
		
		
		//Locate and click the first watch 
		
//		WebElement casiowatch = driver.findElement(By.xpath("//div[@class='ProductDescription__content']/div[1]"));

//		wait.until(ExpectedConditions.elementToBeClickable(casiowatch));
//		casiowatch.click();
		
		WebElement WatchClick = driver.findElement(By.xpath("//h2[@class='ProductDescription__description  ']"));
		action.moveToElement(WatchClick).click().perform();
		
		//Get price 
		Thread.sleep(5000);
//		String Childtitle = driver.getTitle();
		Set<String> windowHandles = driver.getWindowHandles();
//		
		for (String handle : windowHandles) {
		    driver.switchTo().window(handle);
		}
		System.out.println("Switched to: " + driver.getTitle());
		
		//Getting price of watch in child window
		WebElement priceOfwatch = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']"));
		String text = priceOfwatch.getText();
		
		//Removing not needed characters
		double priceofOpenedWatch = Double.parseDouble(text.replaceAll("[^\\d.]", ""));
		//typecasting to int and converting to num 
		int intvalue=(int)priceofOpenedWatch;
		String string_priceofOpenedWatch = Integer.toString(intvalue);
		System.out.println("After typecasting to int and converting to num :"+string_priceofOpenedWatch);
		
		//Compare the prices
		if(FirstResultingvalue_withoutsymbol.equals(string_priceofOpenedWatch))
		{
			System.out.println("Both values are matching : "+true);
		}
		else
			{
				System.out.println(false);
			}
		//Add to bag
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		//Cart Count
		WebElement Cart = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		String CartCount = Cart.getText();
		System.out.println("Count inside the cart : "+CartCount);
		//Go to Bag
//		wait.until(ExpectedConditions.elementToBeClickable(gotobag));
		WebElement gotobag = driver.findElement(By.xpath("//span[text()='GO TO BAG']"));
		gotobag.click();
		Thread.sleep(10000);


		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc =  new File("./Screenshots/img.png");
		FileUtils.copyFile(src, desc);
		System.out.println("Screenshot has been captured");
		
		driver.close();
		driver.quit();
	}
	

}
