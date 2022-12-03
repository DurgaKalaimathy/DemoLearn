package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test1 {
	ChromeDriver driver=new ChromeDriver();
	
	@Test(priority=1)
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("http://www.javatpoint.com/");
		driver.close();		
	}
	
	@Test (priority=2)
	public void selecttest()
	{
		driver.findElement(By.linkText("Python")).click();
	}
	
	@Test (priority=3)
	public void close()
	{
		driver.quit();
	}
	
}
