using Newtonsoft.Json.Linq;
using OpenQA.Selenium;
using OpenQA.Selenium.Interactions;
using OpenQA.Selenium.Support.UI;
using SeleniumExtras.WaitHelpers;
using System;
using System.Collections.Generic;
using System.Diagnostics.Metrics;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace DiscernAI.Site_Pages
{
    public class Users
    {
        IWebDriver driver;
        WebDriverWait wait;

        public Users(IWebDriver driver)
        {
            this.driver = driver;
            wait = new WebDriverWait(driver, TimeSpan.FromSeconds(60));
        }

        By createUserbtn = By.CssSelector("button[class='default-btn tagus mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-unthemed mat-mdc-button-base'] span[class='mat-mdc-button-touch-target']");

        public void ClickCreateUserbtn()
        {
            driver.FindElement(createUserbtn).Click();
        }

        By firstName = By.Name("firstName");

        public void FirstNameField(string frstName)
        {
            IWebElement firstNameElement = wait.Until(ExpectedConditions.ElementToBeClickable(firstName));
            firstNameElement.SendKeys(frstName);
        }

        By lastName = By.Name("lastName");

        public void LastNameField(string LstName)
        {
            IWebElement lastNameElement = wait.Until(ExpectedConditions.ElementToBeClickable(lastName));
            lastNameElement.SendKeys(LstName);
        }

        By emailEnter = By.Name("email");

        public void EmailEnterField(string eMail)
        {
            IWebElement emailElement = wait.Until(ExpectedConditions.ElementToBeClickable(emailEnter));
            emailElement.SendKeys(eMail);
        }

        By roleOptionClick = By.XPath("//mat-label[contains(text(), 'Select Role')]");
        By selectOption = By.CssSelector("mat-option");

        public void SelectRoleFromDropdown(string desiredRole)
        {
            /*
            DefaultWait<IWebDriver> fluentWait = new DefaultWait<IWebDriver>(driver);
            fluentWait.Timeout = TimeSpan.FromSeconds(6);
            fluentWait.PollingInterval = TimeSpan.FromMilliseconds(250);
            */

            Thread.Sleep(5000);
            IWebElement selectRoleDropdown = wait.Until(ExpectedConditions.ElementToBeClickable(roleOptionClick));
            selectRoleDropdown.Click();

            // Locate all the options in the dropdown
            var options = wait.Until(ExpectedConditions.PresenceOfAllElementsLocatedBy(selectOption));

            for (int i = 0; i < options.Count; i++)
            {
                // Get the text of the option
                string optionText = options[i].Text;

                // Check if the option text matches the desired role
                if (optionText.Trim() == desiredRole)
                {
                    // Click the desired option to select it
                    options[i].Click();
                    break; // Exit the loop once the option is selected
                }
            }
        }

        By passwordField = By.Name("password");

        public void EnterPassword(String pwd)
        {
            driver.FindElement(passwordField).Click();
            driver.FindElement(passwordField).SendKeys(pwd);
        }

        By confirmPasswordField = By.Name("confirmPassword");

        public void EnterConfirmPassword(String pwd)
        {
            driver.FindElement(confirmPasswordField).Click();
            driver.FindElement(confirmPasswordField).SendKeys(pwd);
        }

        By domainField = By.CssSelector("[aria-label='Enter Domains']");

        public void EnterDomainField(String domnField)
        {
            driver.FindElement(domainField).Click();
            driver.FindElement(domainField).SendKeys(domnField);
        }

        By saveBtn = By.XPath("//span[@class='mdc-button__label' and text()='Save']");

        public void SaveButtonClick()
        {
            driver.FindElement(saveBtn).Click();
        }
    }
}
