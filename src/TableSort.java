import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2")).click();
		//driver.findElement(By.cssSelector("tr th:nth-child(2")).click();
		List<WebElement> FirstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> OriginalList = new  ArrayList<String>();
        for(int i=0;i<FirstColList.size();i++){
        	
        	OriginalList.add(FirstColList.get(i).getText());
        }
        ArrayList<String> CopiedList = new  ArrayList<String>();
        for(int i=0;i<OriginalList.size();i++){
        
        	CopiedList.add(OriginalList.get(i));
        }
        System.out.println("*******************************************************");
        Collections.sort(CopiedList);
        Collections.reverse(CopiedList);
        for(String s : CopiedList){// enhanced for loop
        	
        	System.out.println(s);
        }
        System.out.println("**********************Orginal******************************");
        for(String s : OriginalList){
        	
        	System.out.println(s);
        }
        
        Assert.assertTrue(OriginalList.equals(CopiedList));
        
	}

}
