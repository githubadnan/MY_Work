
package StepDefinition;

import io.cucumber.java.en.*;
import io.opentelemetry.context.Scope;

import java.awt.*;

import static pages.LoginPage.*;
import static pages.Navigator.*;
import static pages.Navigator.ClickOnMenu;
import static pages.ProductsPage.*;

public class ProductPageStepDefinition {

    @When("I select the product filter option {string}")
    public void i_select_the_product_filter_option(String string) {
        selectSortOptionDescending();
    }

    @Then("I verify that the products are sorted by Name in descending order")
    public void VerifyProductSorting()
    {
        boolean isDesceding = isProductSortedDescending();
    }

    @When ("I click on Product Add to cart button")
    public void I_click_on_Product_Add_to_cart_button(){
        addToCartButtonClick();
    }

    @Then ("Add to cart button label must changed to Remove button")
    public void Add_to_cart_button_label_must_changed_to_Remove_button(){
        ButtonlabelChanged();
    }

    @And ("Cart Icon counter changed to 1")
    public void Cart_Icon_counter_changed_to_1(){
        CartBadgeDisplayed(true);
    }

    /*

    And I click on cart icon then it's open the checkout page
    I click on the Remove button on the checkout page to remove the product
    And Cart icon remove the product counter

     */

    @And ("I click on cart icon to open the checkout page")
    public void I_click_on_cart_icon_to_open_the_checkout_page(){
        shoppingCartClick();
    }

    @And("I click on the Remove button on the checkout page to remove the product")
    public void On_checkout_page_i_click_remove_button_to_remove_product(){
        checkOutPageRemoveButton();
    }

    @And("Cart icon remove the product counter")
    public void Cart_icon_remove_the_product_counter() throws InterruptedException {
        //Thread.sleep(3000);
        CartBadgeDisplayed(false);
    }

    @Then("I click on checkout button")
    public void I_click_on_checkout_button(){
        clickCheckOutButton();
    }

    @And("I fill the checkout form by giving First Name, Last Name and ZipPostal Code and click on Continue button")
    public void iFillTheCheckoutFormByGivingFirstNameLastNameAndZipPostalCodeAndClickOnContinueButton() {
        checkOutForm();
    }

    @Then("I click on Finish button")
    public void iClickOnFinishButton() {
        finishButton();
    }

    @And("Finish page must open with a message Thank you for your order! and with Back Home button")
    public void finishPageMustOpenWithAMessageThankYouForYourOrderAndWithBackHomeButton() {
        finishPage();
    }
}

