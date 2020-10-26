import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown2 {
	
	public static void main(String[] args) throws InterruptedException{	

		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.cssSelector("a[text='Chennai (MAA)']")).click();
		//driver.findElement(By.xpath("//div[@class='dropdownDiv']/ul/li[6]/a")).click();
		//driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		//Thread.sleep(2000L);
		//System.out.println((driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()));
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
			
			System.out.println("is enabled");
			Assert.assertTrue(true);
			
		}
		else{
			
			Assert.assertTrue(false);
		}
		
		//System.out.println((driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()));

		
	/*	System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		
		int i =1;
		while(i<5){
			
			driver.findElement(By.id("hrefIncAdt")).click();
			i=i+1;

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText()); */

		//driver.close();
	}

}
