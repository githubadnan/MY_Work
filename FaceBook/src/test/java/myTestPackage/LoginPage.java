package myTestPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import myResources.base;
import pageObject.LoginLocators;

public class LoginPage extends base{

	
	@Test
	public void LoginPageNavigation() throws IOException, InterruptedException {
		driver=initializeDriver();
		driver.get("https://www.facebook.com");
		LoginLocators Run = new LoginLocators(driver);
		Run.getEmailField().sendKeys(""); //Enter Your Facebook Email ID
		Run.getPasswordField().sendKeys(""); //Enter Your Facebook Email ID's Password
		Run.getButtonClick().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Run.getAccountButtonClick().click();
		Run.getLogoutButtonClick().click();
		
		
	}
}
