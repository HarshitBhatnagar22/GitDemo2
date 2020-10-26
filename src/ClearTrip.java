import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		//Thread.sleep(9000L);
		//driver.findElement(By.id("DepartDate")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.")).click();
		Select s = new Select(driver.findElement(By.id("Adults")));
		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		Select s2 = new Select(driver.findElement(By.id("Infants")));
		s.selectByValue("7");
		s1.selectByValue("2");
		s2.selectByValue("1");
		
		driver.findElement(By.cssSelector("#MoreOptionsLink")).click();
		Select s3 = new Select(driver.findElement(By.xpath("//*[@id='Class']")));
		s3.selectByIndex(0);
		
		driver.findElement(By.xpath("//*[@id='AirlineAutocomplete']")).sendKeys("Air India");
		
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());
	}

}