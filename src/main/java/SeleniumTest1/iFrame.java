package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("start-maximized");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html/body/a/img")).click();
		driver.close();
		//driver.get("https://www.softwaretestinghelp.com/");
		//driver.switchTo().frame("470c05c504daf72");

	}
	
	//driver.findElements(By.tagName("iframe")).size() // to find number of frames in a page

}
