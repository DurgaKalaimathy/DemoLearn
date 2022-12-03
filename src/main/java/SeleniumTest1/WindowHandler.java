package SeleniumTest1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> i= windows.iterator()	;
		String parentwindow=i.next();
		System.out.println("Parent window is : " +parentwindow);
		String childwindow=i.next();
		System.out.println("Child window is : " +childwindow);
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.id("w3loginbtn")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
		driver.findElement(By.id("modalusername")).sendKeys("durga");
	}

}
