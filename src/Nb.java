import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nbstage.getapermit.net/Security/SignIn.aspx");
		driver.findElement(By.id("ctl00_PageContent_RegisterButton__Button")).click();
		driver.findElement(By.id("ctl00_PageContent_AccountTypeId_3")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_PageContent_ConfirmPasscodeTextBox")).sendKeys("finally");
		driver.findElement(By.id("ctl00_PageContent_NextButton__Button")).click();
		driver.findElement(By.id("ctl00_PageContent_AcceptButton__Button")).click();
		
		
	}

}
