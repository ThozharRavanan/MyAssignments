package pack.marathon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys",Keys.ENTER);
		driver.manage().window().maximize();
		
//		String SearchResult1 = driver.findElement(By.xpath("//span[text()='1-48 of over 30,000 results for']")).getText();
String SearchResult1 = driver.findElement(By.xpath("//span[contains(text(),'1-48')]")).getText();
		System.out.println(SearchResult1);
		
		WebElement bags = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
		System.out.print(" "+bags.getText());
//		List<WebElement> findElements = driver.findElements(By.className("a-link-normal s-line-clamp-2 s-link-style a-text-normal"));
//		findElements.size();
//		
//		for (int i = 0; i < findElements.size(); i++) {
//			
//			System.out.println(findElements.get(i).getText());
//			
//		}
//		
		
		WebElement safari = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[5]"));
		safari.click();
		
		WebElement skybags = driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/span/span[3]//a/span"));
		skybags.click();
		
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		WebElement Loacting1stBag = driver.findElement(By.xpath("((//div[@class='a-section a-spacing-none s-result-item s-flex-full-width s-border-bottom-none s-widget s-widget-spacing-large'])[2]/following::div/a)[1]"));
		String FirstBAg = Loacting1stBag.getText();
		System.out.println("Name of the Bag :" +FirstBAg);
		

		//Price of the bag
		WebElement PriceofBag1 = driver.findElement(By.xpath("//a[@class='a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal']//span"));
		String searchedbagPrice = PriceofBag1.getText();
		System.out.println("The Price of bag is :"+searchedbagPrice);
		
		String title = driver.getTitle();
		System.out.println("Title of the webPage is:"+title);
		
		driver.quit();
//		
		
		
		
		
	}

}
