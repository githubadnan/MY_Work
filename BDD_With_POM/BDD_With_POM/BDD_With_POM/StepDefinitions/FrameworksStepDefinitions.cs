using DiscernAI.Site_Pages;
using DiscernAI.Support;
using System;
using TechTalk.SpecFlow;

namespace DiscernAI.StepDefinitions
{
    [Binding]
    public class FrameworksStepDefinitions
    {
        Frameworks frameWorks;
        Engine engine;
        LoginPage loginPage;
        Navigator navigate;
        Accessories accessories;
        AnalysisBuilder analysisBuilder;
        MyAnalyses myAnalyses;

        public FrameworksStepDefinitions(Engine engineinstance)
        {
            engine = engineinstance;
        }

        [Scope(Feature = "Frameworks")]
        [When(@"Get logged in then click on '([^']*)' link")]
        public void WhenGetLoggedInThenClickOnLink(string navLink)
        {
            navigate = new Navigator(engine.driver);
            frameWorks = new Frameworks(engine.driver);
            analysisBuilder = new AnalysisBuilder(engine.driver);
            navigate.ClickNavigationLink(navLink);
        }
    }
}
