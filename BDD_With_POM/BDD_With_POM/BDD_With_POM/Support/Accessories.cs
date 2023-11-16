using OpenQA.Selenium.Support.UI;
using OpenQA.Selenium;
using System;
using TechTalk.SpecFlow;
using OpenQA.Selenium.Interactions;
using DiscernAI.Site_Pages;
using TechTalk.SpecFlow.Infrastructure;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium.Chrome;
using SeleniumExtras.WaitHelpers;

namespace DiscernAI.Support
{
    
    public class Accessories : IDisposable
    {
        //public ChromeDriver? driver;
        IWebDriver driver;
        /*
        public Accessories(ChromeDriver driver) {
            this.driver=driver;
        }
        */

        public Accessories(IWebDriver driver)
        {
            this.driver = driver;
        }

        public void ImplicitWait(double seconds = 10)
        {
            TimeSpan wait = TimeSpan.FromSeconds(seconds);
            driver.Manage().Timeouts().ImplicitWait = wait;
        }

        public void Dispose()
        {
            Dispose(true);
            GC.SuppressFinalize(this);
        }

        protected virtual void Dispose(bool disposing)
        {
            if (disposing)
            {
                // Dispose of managed resources (e.g., driver)
                if (driver != null)
                {
                    driver.Quit();
                    driver.Dispose();
                    driver = null;
                }
            }

            // Dispose of any unmanaged resources (if any)
        }
        
    }
}
