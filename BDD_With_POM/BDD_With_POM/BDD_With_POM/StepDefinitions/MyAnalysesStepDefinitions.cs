using DiscernAI.Site_Pages;
using DiscernAI.Support;
using System;
using TechTalk.SpecFlow;

namespace DiscernAI.StepDefinitions
{
    [Binding]
    public class MyAnalysesStepDefinitions
    {
        Frameworks frameWorks;
        Engine engine;
        LoginPage loginPage;
        Navigator navigate;
        Accessories accessories;
        AnalysisBuilder analysisBuilder;
        MyAnalyses myAnalyses;
        public MyAnalysesStepDefinitions(Engine engineinstance) {
            engine = engineinstance;
        }
        [Scope(Feature = "MyAnalyses")]
        [When(@"Get logged in then click on '([^']*)' link")]
        public void WhenGetLoggedInThenClickOnMyAnalysesLink(string p0)
        {
            navigate = new Navigator(engine.driver);
            myAnalyses = new MyAnalyses(engine.driver);
            navigate.ClickNavigationLink(p0);
        }
    }
}
