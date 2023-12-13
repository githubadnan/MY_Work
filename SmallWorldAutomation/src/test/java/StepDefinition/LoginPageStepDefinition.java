package StepDefinition;

import io.cucumber.java.en.*;

import static pages.LoginPage.*;
import static pages.Navigator.*;
import static pages.Navigator.ClickOnMenu;

public class LoginPageStepDefinition {

    @Given("^Navigate to the site$")
    public void Navigate_to_the_site() throws Throwable{
        // This step is intentionally left empty
    }
    @Then("^Enter User ID '(.+)'$")
    public void Enter_Correct_User_ID(String userID) throws Throwable{
        EnterEmail(userID);
    }
    @And("^Enter Password '(.+)'$")
    public void Enter_Correct_Password(String password) throws Throwable{
        EnterPassword(password);
    }
    @Then("^Click on login button$")
    public void Click_on_login_button() throws Throwable{
        LoginButton();
    }
    @Then("^Verify the user gets logged-in to the products page and the Swag Labs and Products headings are displayed$")
    public void verifySuccessfulLoginAndDisplayedHeadings() throws Throwable {
        // Implementation goes here
        MainHeading();
        ProductsHeading();
    }



    @Then("^Verify the user gets incorrect credentials error on login fields$")
    public void verifyIncorrectCredentialsErrorMessage() throws Throwable{
        ErrorMessage();
    }


    @Then("Click on Hamburger button")
    public void clickHamburgerButton() {
        OpenHamburgerClick();
    }

    @Then("Click on {string} link")
    public void clickOnLogoutLink(String linkText) {
        ClickOnMenu(linkText);
    }

}
