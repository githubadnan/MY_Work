package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import cucumberOptions.TestRunner;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Cucumber.class)
public class stepDefinition {
	WebDriver driver;
    @Given("^goto olxmall site$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C://Users//Muhammad Adnan//Desktop//chromedriver_win32//chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://olx.com.pk/mall");
    	driver.manage().window().maximize();

    	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='moeRemoveBanner()']"))).click();
    	
    	driver.findElement(By.xpath("//div[@class='select__single-value css-cjljan-singleValue']")).click();
    	driver.findElement(By.xpath("//button[@class='searchbar_searchBtn__18y-E']")).click();
    }
    
    @When("^site opened goto mobile and tablets categories$")
    public void site_opened_goto_mobile_and_tablets_categories() throws Throwable {
    	driver.findElement(By.xpath("//a[text()='Mobiles & Tablets']")).click();

    }

    @Then("^select mobiles$")
    public void select_mobiles() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
    	Thread.sleep(5000);
    }

    @And("^filter the price in range of 40000 to 120000$")
    public void filter_the_price_in_range_of_40000_to_120000() throws Throwable {
    	
    	driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
        
        driver.findElement(By.xpath("//span[text()='Redmi Note 10 Pro - 6GB RAM - 128GB ROM - PTA Approved']")).click();
        String valueAttribute = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute);
		driver.navigate().back();
		
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
        
		driver.findElement(By.xpath("//span[text()='Poco X3 Pro - 8 GB RAM - 256 GB ROM - PTA Approved']")).click();
		String valueAttribute2 = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute2);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
		
		driver.findElement(By.xpath("//span[text()='Infinix Zero X Pro - 8GB RAM - 128GB ROM - PTA Approved - 1 Year Warranty']")).click();
		String valueAttribute3 = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute3);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
		
		driver.findElement(By.xpath("//span[text()='Poco X3 GT 5G - 8 GB RAM - 256 GB ROM - PTA Approved']")).click();
		String valueAttribute4 = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute4);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
		
		driver.findElement(By.xpath("//span[text()='Poco X3 GT 5G - 8GB RAM - 256 GB ROM - PTA Approved']")).click();
		String valueAttribute5 = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute5);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
		
		driver.findElement(By.xpath("//span[text()='Realme 7 Pro | PTA Approved | 1 Year Official Warranty']")).click();
		String valueAttribute6 = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute6);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
		
		        
		driver.findElement(By.xpath("//span[text()='Oppo Reno 6 - 6.4\" - 8 GB Ram - 128 GB Rom - PTA Approved']")).click();
		String valueAttribute7 = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute7);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
		
		driver.findElement(By.xpath("//span[text()='Poco X3 Pro - 8GB RAM - 256GB ROM - PTA Approved - 1 Year Official Warranty']")).click();
		String valueAttribute8 = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute8);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
		
		driver.findElement(By.xpath("//span[text()='Redmi Note 10 Pro - 8GB RAM - 128GB ROM - PTA Approved - 1 Year Warranty']")).click();
		String valueAttribute9 = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute9);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
		
		driver.findElement(By.xpath("//span[text()='Oppo Reno 5 Pro | PTA Approved | 1 Year Warranty']")).click();
		String valueAttribute10 = driver.findElement(By.xpath("//div[@class='product-price_productPrice__1KrKT']")).getText();
		System.out.println("Price are : "+ valueAttribute10);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='minPrice']")).clear();
		driver.findElement(By.xpath("//input[@id='minPrice']")).sendKeys("40000");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='maxPrice']")).clear();
        driver.findElement(By.xpath("//input[@id='maxPrice']")).sendKeys("120000");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}