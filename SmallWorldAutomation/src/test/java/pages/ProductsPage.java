package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import org.openqa.selenium.TimeoutException;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertTrue;

public class ProductsPage extends BrowserDriver {

    public static By OpenFilter = By.xpath("//span[@class='select_container']//select[@class='product_sort_container']");
    public static By SortOptionZtoA = By.xpath("//option[@value='za']");
    public static By SortVerify = By.cssSelector(".inventory_item");

    public static By AddToCart = By.xpath("//button[contains(@class, 'btn_inventory') and contains(text(), 'Add to cart')]");

    public static By removeButtonLabel = By.xpath("//button[contains(@class, 'btn_inventory') and contains(text(), 'Remove')]");

    public static By shoppingCartBadgeLocator = By.xpath("//a[@class='shopping_cart_link']//span[@class='shopping_cart_badge']");
    //a[@class='shopping_cart_link']//span[@class='shopping_cart_badge']
    //  //span[@class='shopping_cart_badge']
    public static By shoppingCartIcon = By.xpath("//a[@class='shopping_cart_link']");

    public static By checkOutRemovebtn = By.cssSelector("button.btn_secondary.btn_small.cart_button");

    public static By checkoutButton = By.id("checkout");

    public static By firstName = By.id("first-name");

    public static By finishbtn = By.id("finish");

    public static By thankYoumsg = By.cssSelector("h2.complete-header");

    public static By backHomeButton = By.id("back-to-products");
    public static List<String> getProductNames() {
        List<WebElement> productElements = driver.findElements(SortVerify);
        List<String> productNames = new ArrayList<>();

        for (WebElement productElement : productElements) {
            String productName = productElement.findElement(By.cssSelector(".inventory_item_name")).getText();
            productNames.add(productName);
            System.out.println(productName);
        }
        return productNames;
    }

    /*
    // Method to verify if the products are sorted in ascending order (A to Z)
    public static boolean isProductSortedAscending() {
        List<String> productNames = getProductNames();
        List<String> sortedProductNames = new ArrayList<>(productNames);
        Collections.sort(sortedProductNames);
        System.out.println(sortedProductNames);
        return productNames.equals(sortedProductNames);
    }
    */

    // Method to verify if the products are sorted in descending order (Z to A)
    public static boolean isProductSortedDescending() {
        List<String> productNames = getProductNames();
        List<String> sortedProductNames = new ArrayList<>(productNames);
        Collections.sort(sortedProductNames, Collections.reverseOrder());
        System.out.println(sortedProductNames);
        return productNames.equals(sortedProductNames);
    }

    // Method to select the filter option for sorting in descending order (Z to A)
    public static void selectSortOptionDescending() {
        driver.findElement(OpenFilter).click();
        driver.findElement(SortOptionZtoA).click();
    }

    public static void addToCartButtonClick() {
        driver.findElement(AddToCart).click();
    }

    public static void ButtonlabelChanged() {
        WebElement removeButton = driver.findElement(removeButtonLabel);
        if (removeButton.isDisplayed()) {
            System.out.println("Button label changed to Remove");
        } else {
            System.out.println("Button label did not change to Remove");
        }
    }

    public static void CartBadgeDisplayed(boolean expectedDisplayed) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            // Wait for the shopping cart badge to be present
            WebElement shoppingCartBadge = wait.until(ExpectedConditions.presenceOfElementLocated(shoppingCartBadgeLocator));

            if (expectedDisplayed) {
                // Verify that the shopping cart badge is displayed
                if (shoppingCartBadge.isDisplayed()) {
                    System.out.println("Shopping cart badge is displayed with count: " + shoppingCartBadge.getText());
                } else {
                    System.out.println("Shopping cart badge is not displayed as expected");
                }
            } else {
                // Verify that the shopping cart badge is not displayed
                if (!shoppingCartBadge.isDisplayed()) {
                    System.out.println("Shopping cart badge is not displayed as expected");
                } else {
                    System.out.println("Shopping cart badge is displayed, but it was not expected");
                }
            }
        } catch (TimeoutException e) {
            if (expectedDisplayed) {
                System.out.println("Shopping cart badge is not displayed as expected");
            } else {
                System.out.println("Shopping cart badge is not displayed, which was expected");
            }
        }
    }

    public static void shoppingCartClick() {
        driver.findElement(shoppingCartIcon).click();
    }

    public static void checkOutPageRemoveButton() {
        driver.findElement(checkOutRemovebtn).click();
    }

    public static void clickCheckOutButton(){
        driver.findElement(checkoutButton).click();
    }

    public static void checkOutForm(){
        driver.findElement(firstName).sendKeys("Test");
        // Press Tab to move to Last Name
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        // Type Last Name
        driver.switchTo().activeElement().sendKeys("User");

        // Press Tab to move to Zip/Postal Code
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        // Type Zip/Postal Code
        driver.switchTo().activeElement().sendKeys("5667");

        // Press Tab twice to move to the next input
        driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.TAB);

        // Press Enter
        driver.switchTo().activeElement().sendKeys(Keys.RETURN);
    }

    public static void finishButton(){
        driver.findElement(finishbtn).click();
    }

    public static void finishPage(){
        assertTrue("Thank you message is not displayed", driver.findElement(thankYoumsg).isDisplayed());
        assertTrue("Back home button is not displayed",driver.findElement(backHomeButton).isDisplayed());
    }
}
