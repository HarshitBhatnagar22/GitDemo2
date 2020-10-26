import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "Rahul Shetty";
		String text2 = "Hello World";
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000L);
		System.out.println((driver.switchTo().alert().getText()));
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("name")).sendKeys(text2);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000L);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

		
		//total number of radio button count
		
		System.out.println(driver.findElements(By.xpath("//*[@type='radio']")).size());
		Assert.assertEquals(driver.findElements(By.xpath("//*[@type='radio']")).size(), 3);
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		 int i=1;
		if(i<3){
			
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();
			i++;
		}
		
		

	}

}
