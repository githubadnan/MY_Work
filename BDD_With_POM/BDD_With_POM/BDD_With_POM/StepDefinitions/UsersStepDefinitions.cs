using DiscernAI.Site_Pages;
using DiscernAI.Support;
using System;
using TechTalk.SpecFlow;

namespace DiscernAI.StepDefinitions
{
    [Binding]
    public class UsersStepDefinitions
    {
        Frameworks frameWorks;
        Engine engine;
        LoginPage loginPage;
        Navigator navigate;
        Accessories accessories;
        AnalysisBuilder analysisBuilder;
        MyAnalyses myAnalyses;
        Reporting Report;
        Users user;

        public UsersStepDefinitions(Engine engineinstance) {
            engine = engineinstance;
        }

        [Scope(Feature = "Users")]
        [When(@"Get logged in then click on '([^']*)' link")]
        public void WhenGetLoggedInThenClickOnLink(string navLink)
        {
            navigate = new Navigator(engine.driver);
            user = new Users(engine.driver);
            accessories = new Accessories(engine.driver);
            navigate.ClickNavigationLink(navLink);
        }

        [Then(@"I click on the Create User button")]
        public void ThenIClickOnTheCreateUserButton()
        {
            user.ClickCreateUserbtn();
        }

        [When(@"page opened i click on First Name field and enter First Name '([^']*)'")]
        public void WhenPageOpenedIClickOnFirstNameFieldAndEnterFirstName(string testingUser)
        {
            user.FirstNameField(testingUser);
        }

        [Then(@"I click on last Name field and enter Last Name '([^']*)'")]
        public void ThenIClickOnLastNameFieldAndEnterLastName(string test)
        {
            user.LastNameField(test);
        }

        [Then(@"I click on Email field and enter email '([^']*)'")]
        public void ThenIClickOnEmailFieldAndEnterEmail(string p0)
        {
            user.EmailEnterField(p0);
        }

        [Then(@"I click on Role dropdown and select Admin")]
        public void ThenIClickOnRoleDropdownAndSelectAdmin()
        {
            user.SelectRoleFromDropdown("Admin");
        }

        [Then(@"I click on Role dropdown and select User")]
        public void ThenIClickOnRoleDropdownAndSelectUser()
        {
            user.SelectRoleFromDropdown("User");
        }


        [Then(@"I click on Password field and enter Password '([^']*)'")]
        public void ThenIClickOnPasswordFieldAndEnterPassword(string p0)
        {
            user.EnterPassword(p0);
        }

        [Then(@"I click on Confirm Password field and enter the same confirm password '([^']*)'")]
        public void ThenIClickOnConfirmPasswordFieldAndEnterTheSameConfirmPassword(string p0)
        {
            user.EnterConfirmPassword(p0);
        }


        [Then(@"I click on Domain field and enter domain name '([^']*)'")]
        public void ThenIClickOnDomainFieldAndEnterDomainName(string p0)
        {
            user.EnterDomainField(p0);
        }

        [Then(@"Then i click on Save button")]
        public void ThenThenIClickOnSaveButton()
        {
            //user.SaveButtonClick();
        }

    }
}
