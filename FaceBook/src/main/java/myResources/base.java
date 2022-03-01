package myResources;



import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {

		public WebDriver driver;
		
	public WebDriver initializeDriver() throws IOException
	{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Adnan\\Desktop\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;	
	}
}
