package SeleniumTest1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.id("REGIS"));
		}
		catch (Throwable e) {
			//System.out.println("I guess Arithmetic exception");
			
			e.printStackTrace();
		}
		finally {
		driver.close();	
		}
		
		
	}
}