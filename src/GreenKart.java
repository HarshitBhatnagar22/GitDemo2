import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException	 {
		// TODO Auto-generated method stub
		String[] itemsNeeded = {"Brocolli","Cucumber","Carrot","Beetroot"};
		int j =0;
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000L);
		
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
