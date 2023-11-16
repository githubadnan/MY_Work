using DiscernAI.Site_Pages;
using DiscernAI.Support;
using System;
using TechTalk.SpecFlow;

namespace DiscernAI.StepDefinitions
{
    [Binding]
    public class AnalysisBuilderStepDefinitions
    {
        Frameworks frameWorks;
        Engine engine;
        LoginPage loginPage;
        Navigator navigate;
        Accessories accessories;
        AnalysisBuilder analysisBuilder;
        MyAnalyses myAnalyses;
     
        public AnalysisBuilderStepDefinitions(Engine engineinstance)
        {
            engine = engineinstance;        
        }
        [Scope(Feature = "AnalysisBuilder")]
        [When(@"Get logged in then click on '([^']*)' link")]
        public void WhenGetLoggedInThenClickOnLink(string p0)
        {
            navigate = new Navigator(engine.driver);
            analysisBuilder = new AnalysisBuilder(engine.driver);
            navigate.ClickNavigationLink(p0);
            //analysisBuilder.FrameworkDropDown();
            //analysisBuilder.AccountDropdown();       
            //analysisBuilder.AnalyzeFornBtnRadio();
            //analysisBuilder.GetOnlineActivityValue();
            //analysisBuilder.RunActionsUntilOnlineActivityIsZero();
            analysisBuilder.FrameworkDropDown();
        }
    }
}
