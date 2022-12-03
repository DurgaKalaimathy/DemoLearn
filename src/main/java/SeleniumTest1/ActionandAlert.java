package SeleniumTest1;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionandAlert {

 static Logger log = Logger.getLogger(ActionandAlert.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //BasicConfigurator.configure();
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURGLT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		log.info("opened url..");
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.name("alertbox"))).click().build().perform();
		System.out.println("Alert is clicked");
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		log.warn("Alert accepted");
		Actions action1= new Actions(driver);
		action1.moveToElement(driver.findElement(By.name("promptalertbox1234"))).click().build().perform();
		alert= driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.sendKeys("Yes");
		//alert.accept();
		alert.dismiss();
		
		
	}

}
