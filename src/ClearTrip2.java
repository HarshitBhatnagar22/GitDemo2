import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("UNI");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.id("autocomplete")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		//System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("Unted Staes (USAA)")){
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			
			if(i>10){
			
				break;
			}
		}
		 if(i>10){
			 
			 System.out.println("Element not found");
			 
		 }
		 else{
			 System.out.println("Element found");

		 }
	}

}
