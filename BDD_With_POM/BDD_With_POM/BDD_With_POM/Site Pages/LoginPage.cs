using DiscernAI.Support;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Interactions;
using OpenQA.Selenium.Support.UI;
using SeleniumExtras.WaitHelpers;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace DiscernAI.Site_Pages
{
    public class LoginPage
    {
        //ChromeDriver driver;
        IWebDriver driver;
        /*public LoginPage(ChromeDriver driver) {
            this.driver = driver;
        }
        */
        public LoginPage(IWebDriver driver)
        {
            this.driver = driver;
        }

        //Locator for Email Id Field
        By EmailField = By.XPath("//*[@id=\"mat-input-0\"]");

        //Method to enter Email
        public void enterEmail(String email)
        {            
            driver.FindElement(EmailField).SendKeys(email);
        }

        //Locator for Password Field
        //By PasswordField = By.XPath("/html/body/app-root/div/div/app-login/div/div/div/div/form/div[1]/div[2]/mat-form-field/div[1]/div[2]/div[1]/label");
        By PasswordField = By.Name("password");

        //Method to enter Password
        public void enterPassword(String password) 
        {           
            Actions actions = new Actions(driver);
            // Locate the password input field
            IWebElement passwordField = driver.FindElement(PasswordField);

            // Move to the password input field
            actions.MoveToElement(passwordField).Click();

            // Send keys to the password input field
            actions.SendKeys(password).Perform();
        }

        //Locator for Login Button
        By Loginbtn = By.CssSelector("span.mdc-button__label");

        // Method to click Login Button
        public void loginButton()
        {
            driver.FindElement(Loginbtn).Click();
        }

        //Locator to verify email id on header
        By EamilIdHeader = By.CssSelector("span.fw-semibold");

        //Method to get EmailIdFrom Header
        public string HeaderEmailId()
        {
            WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
            IWebElement getEmailId = wait.Until(ExpectedConditions.ElementIsVisible(EamilIdHeader));
            string emailID = getEmailId.Text.Trim();
            return emailID;
        }
    }
}