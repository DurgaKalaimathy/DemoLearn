package SeleniumTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		String result= driver.findElement(By.xpath("//table/tbody/tr/td[3]")).getText();
		List<WebElement> headers= driver.findElements(By.xpath("//table/thead"));//to fetch header
		System.out.println(headers.size());
		for (int i=0; i<headers.size();i++)
		{
			String str=headers.get(i).getText();
			System.out.println(str);
		}
		//Dynamic Web Table
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.findElement(By.className("dataTable"));
		List<WebElement> h= driver.findElements(By.xpath("//table/thead"));
		for (int i=0;i<h.size();i++)
		{
			String str1=h.get(i).getText();
			System.out.println(str1);
		}
		String str= driver.findElement(By.xpath("//table/tbody/tr/td[1]")).getText();
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
