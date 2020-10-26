import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// driver.get("http://www.spicejet.com");

		// static drop-down. this below operarion can only be applied when the
		// static dropdown have select tagname
		// driver.findElement(By.cssSelector(".paxinfo")).click();
		// Select s = new
		// Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		// s.selectByIndex(0);
		// s.selectByValue("3");
		// driver.quit();

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		// Thread.sleep(2000L);
		// driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		// driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();

		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), 6);
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

	}

}
