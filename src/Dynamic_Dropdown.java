import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*
		 * Assert.assertFalse(driver.findElement(By.cssSelector(
		 * "input[id*='friendsandfamily']")).isSelected());
		 * //System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='friendsandfamily']")).isSelected());
		 * driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).
		 * click(); Assert.assertTrue(driver.findElement(By.cssSelector(
		 * "input[id*='friendsandfamily']")).isSelected());
		 * //System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='friendsandfamily']")).isSelected());
		 */

		// count the number of check boxes code
		// System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());

		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// In dynamic dropdown the only issue by default selenium search from
		// top left there for when second xpath search is done without index
		// then it will search in first dropdown only.
		driver.findElement(By.cssSelector("a[text='Chennai (MAA)']")).click();
		// driver.findElement(By.xpath("(//a[@text='Bengaluru
		// (BLR)'])[2]")).click();
		// driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@text='Bengaluru (BLR)']")).click();
		driver.findElement(By.xpath("//div[@class='dropdownDiv']/ul/li[6]/a")).click();
		
		// travel date selection code
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

		driver.findElement(By.cssSelector(".paxinfo")).click();
		Thread.sleep(2000L);
		
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		// driver.findElement(By.cssSelector("#hrefIncAdt")).click();

		// Thread.sleep(2000l);
		// driver.close();

		// Parent child relationship loactor

	}

}
