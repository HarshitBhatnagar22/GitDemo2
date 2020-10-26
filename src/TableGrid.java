import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22746/ind-vs-ban-1st-t20i-bangladesh-tour-of-india-2019");
		WebElement Table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount= Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] ")).size();
		int count= Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<count-2;i++)
		{
			String value=Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueInteger=Integer.parseInt(value);
			sum = sum + valueInteger;
			
		}
		System.out.println(sum);
		String ExtraValue=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int valueInteger1= Integer.parseInt(ExtraValue);
		int totalSum = sum + valueInteger1;
		System.out.println("Total Sum = "+totalSum);
		
		String ActualTotal= driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalValue= Integer.parseInt(ActualTotal);
		if(ActualTotalValue==totalSum){
			
			System.out.println("Pass");
			
		}
		else{
			
			System.out.println("Fail");
		}
		
		
		

	}

}
