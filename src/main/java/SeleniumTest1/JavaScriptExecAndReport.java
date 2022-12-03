package SeleniumTest1;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecAndReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		System.out.println(js.executeScript("return document.title").toString());
		
		js.executeScript("document.getElementById('modalusername').value='durga';");
		js.executeScript("document.getElementById('current-password').value='durga';");
		
		//WebElement login= 
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button/span")).click();
	//	js.executeScript("arguments[0].click();", login);
				js.executeScript("alert('Login Failed');");
		}

}
