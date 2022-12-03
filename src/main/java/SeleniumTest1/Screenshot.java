package SeleniumTest1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("start-maximized");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		driver.get("http://demo.guru99.com/V4/");
		TakesScreenshot ss=  (TakesScreenshot)driver;
		File srcfile= ss.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("C:/Users/DURGLT/Documents/Screenshot.png");
		FileUtils.copyFile(srcfile, DestFile);

	}

}
