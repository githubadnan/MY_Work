package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginLocators {

	
	public WebDriver driver;
	
	By emailField=By.xpath("//input[@placeholder='Email address or phone number']");
	By passField=By.xpath("//input[@placeholder='Password']");
	By LoginButton=By.xpath("//button[@value='1']");
	By AccountButton=By.xpath("//div[@aria-label='Account']");
	By LogoutButton=By.xpath("//span[contains(text(),'Log Out')]");
	
	
	public LoginLocators(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getEmailField()
	{
		return driver.findElement(emailField);
	}

	public WebElement getPasswordField()
	{
		return driver.findElement(passField);
	}
	
	public WebElement getButtonClick()
	{
		return driver.findElement(LoginButton);
	}
	
	public WebElement getAccountButtonClick()
	{
		return driver.findElement(AccountButton);
	}
	
	public WebElement getLogoutButtonClick()
	{
		return driver.findElement(LogoutButton);
	}
	

}
