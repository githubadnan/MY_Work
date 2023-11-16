using OpenQA.Selenium;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiscernAI.Site_Pages
{
    public class Navigator
    {
        IWebDriver driver;

        public Navigator(IWebDriver driver)
        {
            this.driver = driver;
        }

        By navLinks = By.CssSelector("mat-accordion a");

        public void ClickNavigationLink(string linkText)
        {
            // Find all anchor elements within mat-accordion
            IList<IWebElement> navLinkClick = driver.FindElements(navLinks);

            // Iterate through the anchor elements
            for (int i = 0; i < navLinkClick.Count; i++)
            {
                // Get the text of the current anchor element
                string currentLinkText = navLinkClick[i].Text.Trim();

                // Check if the link text matches the desired linkText
                if (currentLinkText == linkText)
                {
                    // Click the link if found and return
                    navLinkClick[i].Click();
                    return;
                }
            }
            throw new NoSuchElementException($"Navigation link with text '{linkText}' not found.");
        }
    }
}
