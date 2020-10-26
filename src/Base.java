import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] itemsNeeded = {"Brocolli","Cucumber","Carrot","Beetroot"};
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 5);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Thread.sleep(2000L);
		AddItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		//Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		//explicitly wait
		//WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
	}





public static  void AddItems(WebDriver driver, String[] itemsNeeded)
{
	int j =0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	for(int i =0;i<products.size();i++)
	{
		String[] name=products.get(i).getText().split("-");
		String Formattedname=name[0].trim();
		//format it the actual vegetable name
		
		//check whether name you extracted is in array or notXj
		//convert array into array list
		//array takes less memory whereas array list consumes memory
		
		List ItemsNeededList = Arrays.asList(itemsNeeded);
		
		
		if(ItemsNeededList.contains(Formattedname))
		{
			j++;
			 
			//click on add to cart
			driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
			
			//break;
			
			if(j==itemsNeeded.length)
			{
				break;
			}
		}
	}
	
}

}


