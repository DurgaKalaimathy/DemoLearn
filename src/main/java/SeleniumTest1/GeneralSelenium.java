package SeleniumTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GeneralSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Durga");
		
		Select select= new Select(driver.findElement(By.xpath("//select[@name='country']")));
		select.selectByVisibleText("SINGAPORE");
		//driver.findElement(By.cssSelector("input#submit")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		List<WebElement> list= driver.findElements(By.name("//input"));
		System.out.println(list);
		
	}

}
