import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement WebTable = driver.findElement(By.cssSelector("#product"));
		int rowcount = WebTable.findElements(By.tagName("tr")).size();
		System.out.println(rowcount);
		int columncount = WebTable.findElements(By.tagName("th")).size();
		System.out.println(columncount);
		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());
		
		//	System.out.println(WebTable.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		////List<WebElement> Secondrow= WebTable.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		//System.out.println(Secondrow.get(0).getText());
		//System.out.println(Secondrow.get(1).getText());
		//System.out.println(Secondrow.get(2).getText());

	}

}
