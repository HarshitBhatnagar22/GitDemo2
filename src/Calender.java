import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")){
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.className("day"));
		
		int count=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++){
			
			String a=driver.findElements(By.className("day")).get(i).getText();
			if(a.equalsIgnoreCase("15")){
				
				driver.findElements(By.className("day")).get(i).click();
				break;
				
			}
			
		}


	}

}
