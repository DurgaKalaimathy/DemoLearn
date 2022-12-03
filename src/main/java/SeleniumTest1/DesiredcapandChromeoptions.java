package SeleniumTest1;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredcapandChromeoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		//options.addArguments("disable-infobars");
		//options.addArguments("incognito");
		options.addArguments("start-maximized");
		options.addArguments("--headless");//runs in backend
		//options.addExtensions(new File("C://Users//DURGLT//Downloads//undefined 3.1.3.0.crx"));
		//DesiredCapabilities cap= new DesiredCapabilities();
		//cap.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(cap);
		ChromeDriver driver=new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.guru99.com/chrome-options-desiredcapabilities.html");
		String title= driver.getTitle();
		System.out.println(title);
		driver.quit();		
		}

}
