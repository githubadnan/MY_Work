using DiscernAI.Site_Pages;
using DiscernAI.Support;
using System;
using TechTalk.SpecFlow;

namespace DiscernAI.StepDefinitions
{
    [Binding]
    public class InvitesStepDefinitions
    {
        Frameworks frameWorks;
        Engine engine;
        LoginPage loginPage;
        Navigator navigate;
        Accessories accessories;
        AnalysisBuilder analysisBuilder;
        MyAnalyses myAnalyses;
        Invites invites;
        public InvitesStepDefinitions(Engine engineinstance) {
            engine = engineinstance;
        }
        [Scope(Feature = "Invites")]
        [When(@"Get logged in then click on '([^']*)' link")]
        public void WhenGetLoggedInThenClickOnLink(string navLink)
        {
            navigate = new Navigator(engine.driver);
            invites = new Invites(engine.driver);
            navigate.ClickNavigationLink(navLink);
        }
    }
}
