using OpenQA.Selenium.Support.UI;
using OpenQA.Selenium;
using System;
using TechTalk.SpecFlow;
using OpenQA.Selenium.Interactions;
using DiscernAI.Site_Pages;
using TechTalk.SpecFlow.Infrastructure;
using NUnit.Framework;
using DiscernAI.Support;

namespace DiscernAI.StepDefinitions
{
    [Binding]
    public class CheckLoginStepDefinitions
    {
        //private readonly ISpecFlowOutputHelper _specFlowOutputHelper;
        Engine engine;
        LoginPage loginPage;
        string SaveText;
        string thetext;
        Accessories accessories; 
        public CheckLoginStepDefinitions(Engine engineinstance)
        {
            //_specFlowOutputHelper = outputHelper;
            //engine = new Engine();
            engine = engineinstance;
        }

        [Given(@"Navigate to the site")]
        public void GivenNavigateToTheSite()
        {
            engine.Starter();
            loginPage = new LoginPage(engine.driver);
            accessories = new Accessories(engine.driver);
        }

        [Then(@"Enter Admin email id '([^']*)'")]
        public void ThenEnterAdminEmailId(string p0)
        {
            accessories.ImplicitWait(30);
            engine.LoginAdmin(p0);
            SaveText = p0;
        }

        [Then(@"Enter Admin password '([^']*)'")]
        public void ThenEnterAdminPassword(string p0)
        {
            engine.AdminPassword(p0);
        }

        [Then(@"Click on Login button")]
        public void ThenClickOnLoginButton()
        {
            engine.LoginButtonClick();
            try
            {
                thetext = loginPage.HeaderEmailId();
                Assert.AreEqual(SaveText.Trim().ToLower(), thetext.Trim().ToLower());
                Console.WriteLine("");
            }
            catch (Exception ex)
            {
                Console.WriteLine("An error occurred: " + ex.Message);
            }
            //accessories.Dispose();
        }
        /*
        [AfterScenario]
        public void AfterScenario()
        {
            accessories.Dispose();
        }
        */
    }
}