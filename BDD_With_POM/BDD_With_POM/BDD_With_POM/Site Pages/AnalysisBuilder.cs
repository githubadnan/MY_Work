using DiscernAI.Support;
using OpenQA.Selenium;
using OpenQA.Selenium.Interactions;
using OpenQA.Selenium.Support.UI;
using SeleniumExtras.WaitHelpers;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;
using TechTalk.SpecFlow.Configuration.JsonConfig;

namespace DiscernAI.Site_Pages
{
    public class AnalysisBuilder
    {
        public IWebDriver driver;
        Accessories accesories;
        public AnalysisBuilder(IWebDriver driver)
        {
            this.driver = driver;
            accesories = new Accessories(driver);
        }

        By FrameDropDownSelect = By.Id("mat-select-2");
        By OptionSelect = By.ClassName("option-label");

        public void FrameworkDropDown()
        {


           
            Thread.Sleep(1000);
            IWebElement matCardContent = driver.FindElement(By.CssSelector("mat-card-content"));

            //Use JavaScript to scroll into view
            IJavaScriptExecutor js = (IJavaScriptExecutor)driver;
            js.ExecuteScript("arguments[0].scrollIntoView();", matCardContent);

            Thread.Sleep(1000); // You can adjust the sleep duration as needed
            IWebElement selectFrameworkLabel = driver.FindElement(By.XPath("//mat-label[contains(text(), 'Select Framework')]"));

            Thread.Sleep(1000);
            // Click the parent <mat-form-field> element to expand the dropdown
            IWebElement matFormField = selectFrameworkLabel.FindElement(By.XPath("./ancestor::mat-form-field"));
            matFormField.Click();

            Thread.Sleep(1000);
            IList<IWebElement> dropdownvalues = driver.FindElements(By.CssSelector("#mat-option-6 > span"));
        
            String[] allText = new String[dropdownvalues.Count];
            int i = 0;
            foreach (IWebElement element in dropdownvalues)
            {
                allText[i++] = element.Text;
                //Console.WriteLine(element.Text);
                element.Click();
            }
            
            Actions tabAction = new Actions(driver);
            tabAction.SendKeys(Keys.Tab).Perform();
            
            Thread.Sleep(9000);
            driver.FindElement(FrameDropDownSelect).Click();
            Thread.Sleep(3000);
            SelectElement oSelect = new SelectElement(driver.FindElement(OptionSelect));
            IList<IWebElement> elementCount = oSelect.Options;
            Console.Write(elementCount.Count);
           


        }
    }
}