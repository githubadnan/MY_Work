using DiscernAI.Site_Pages;
using DiscernAI.Support;
using System;
using TechTalk.SpecFlow;

namespace DiscernAI.StepDefinitions
{
    [Binding]
    public class ReportingStepDefinitions
    {
        Frameworks frameWorks;
        Engine engine;
        LoginPage loginPage;
        Navigator navigate;
        Accessories accessories;
        AnalysisBuilder analysisBuilder;
        MyAnalyses myAnalyses;
        Reporting Report;
        public ReportingStepDefinitions(Engine engineinstance) {
            engine = engineinstance;
        }
        [Scope(Feature = "Reporting")]
        [When(@"Get logged in then click on '([^']*)' link")]
        public void WhenGetLoggedInThenClickOnLink(string navLink)
        {
            navigate = new Navigator(engine.driver);
            Report = new Reporting(engine.driver);
            navigate.ClickNavigationLink(navLink);
        }
    }
}
