import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();	
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
        
	    driver.switchTo().window(parentid);
	    System.out.println(driver.getTitle());
		
		
	}

}
