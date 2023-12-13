package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;
import static org.junit.Assert.assertTrue;

public class LoginPage extends BrowserDriver {

    public static By emailField = By.name("user-name");
    public static void EnterEmail(String userID) {
        driver.findElement(emailField).sendKeys(userID);
    }

    public static By passwordField = By.name("password");
    public static void EnterPassword(String enterPassword) {
        driver.findElement(passwordField).sendKeys(enterPassword);
    }

    public static By loginButton = By.name("login-button");
    public static void LoginButton() {
        driver.findElement(loginButton).click();
    }

    public static By mainHeading = By.xpath("//div[@class='app_logo'][text()='Swag Labs']");
    public static void MainHeading(){
        //driver.findElement(mainHeading)
        WebElement swagLabsHeading = driver.findElement(mainHeading);
        assertTrue(swagLabsHeading.isDisplayed());

    }

    public static By productHeading = By.xpath("//span[@class='title' and contains(text(),'Products')]");
    public static void ProductsHeading() {
        WebElement productsHeading = driver.findElement(productHeading);
        assertTrue(productsHeading.isDisplayed());
    }

    public static By errorMessage = By.xpath("//h3[@data-test='error']");
    public static void ErrorMessage(){
        WebElement ErrorMessage = driver.findElement(errorMessage);
        assertTrue(ErrorMessage.isDisplayed());
    }
}
