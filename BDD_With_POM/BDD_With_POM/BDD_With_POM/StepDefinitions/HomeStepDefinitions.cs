using DiscernAI.Site_Pages;
using DiscernAI.Support;
using System;
using TechTalk.SpecFlow;

namespace DiscernAI.StepDefinitions
{
    [Binding]
    public class HomeStepDefinitions
    {
        Frameworks frameWorks;
        Engine engine;
        LoginPage loginPage;
        Navigator navigate;
        Accessories accessories;
        AnalysisBuilder analysisBuilder;
        MyAnalyses myAnalyses;
        Home home;
        public HomeStepDefinitions(Engine engineinstance) {
            engine = engineinstance;
        }

        [Scope(Feature = "Home")]
        [When(@"Get logged in then click on '([^']*)' link")]
        public void WhenGetLoggedInThenClickOnLink(string navLink)
        {
            navigate = new Navigator(engine.driver);
            home = new Home(engine.driver);
            navigate.ClickNavigationLink(navLink);
        }
    }
}
