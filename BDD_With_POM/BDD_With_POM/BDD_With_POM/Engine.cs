using DiscernAI.Site_Pages;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Configuration.Json;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.UI;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DiscernAI.Support;
using OpenQA.Selenium;
using OpenQA.Selenium.Edge;

namespace DiscernAI

{
    public class Engine
    {
        public IWebDriver? driver;
        LoginPage? login;
        string? baseurl;
        Navigator? navigator;
        public void Starter()
        {
            var chromeOptions = new ChromeOptions();
            var edgeOptions = new EdgeOptions();

            var settings = new ConfigurationBuilder().AddJsonFile("Support/settings.json").Build();
            var browser = settings["Browsers:browserName"];
            var runType = settings["Browsers:RunType"];

            if (browser == "chrome" && runType == "head")
            {
                driver = new ChromeDriver(chromeOptions);
                driver.Manage().Window.Maximize();
            }

            else if (browser == "chrome" && runType == "headless")
            {
                chromeOptions.AddArgument("--headless");
                driver = new ChromeDriver(chromeOptions);
            }

            if (browser == "edge" && runType == "head")
            {
                driver = new EdgeDriver(edgeOptions);
                driver.Manage().Window.Maximize();
            }

            else if (browser == "edge" && runType == "headless")
            {
                edgeOptions.AddArgument("--headless");
                driver = new EdgeDriver(edgeOptions);
            }

            baseurl = settings["Environments:Test-on"];

            if (baseurl == "UAT")
            {
                baseurl = settings["Environments:UAT"];
            }
            else if (baseurl == "PRODUCTION")
            {
                baseurl = settings["Environments:PRODUCTION"];
            }

            driver.Url = baseurl;
            login = new LoginPage(driver);
        }
        public void LoginAdmin(string email)
        {
            login.enterEmail(email);
        }
        public void AdminPassword(string password)
        {
            login.enterPassword(password);
        }
        public void LoginButtonClick()
        {
            login.loginButton();
        }
    }
}
