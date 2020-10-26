import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    //1- give the counts of the links on the page
		
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://demo.triazinesoft.com/triazinewebsite/cloud-hosting.html#");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement Footerdriver= driver.findElement(By.cssSelector(".row.cstmRow"));//2- limiting the scope of driver and finding count of links in foooter section.
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());
		//System.out.println(Footerdriver.findElement(By.tagName("a")).getText());
		
		//3-
	//WebElement Columndriver = Footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		WebElement Columndriver = Footerdriver.findElement(By.xpath("//ul[@id='FooterDIV1']"));
	System.out.println(Columndriver.findElements(By.tagName("a")).size());
		
		//4- click on each link in the footer section column
	    for(int i=1;i<Columndriver.findElements(By.tagName("a")).size();i++)
	     {
	    	 String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	     Columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
            
	     }
	    	Set<String>abc= driver.getWindowHandles();
	    	Iterator<String>it= abc.iterator();
	    	
	    	while(it.hasNext())
	    	{
	    		driver.switchTo().window(it.next());
	    		System.out.println(driver.getTitle());
	    		
	    	} 
	    	 
	     }
	}


