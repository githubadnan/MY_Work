package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;

public class Navigator extends BrowserDriver {

    public static By openHamburger = By.xpath("//button[@id='react-burger-menu-btn'][.='Open Menu']\n");
    public static void OpenHamburgerClick(){
        driver.findElement(openHamburger).click();
    }
    public static By menuLinkLists = By.xpath("//div[@class='bm-menu']//nav[@class='bm-item-list']//a");
    public static void ClickOnMenu(String linkText){

        // Find all anchor elements within the specified XPath
        List<WebElement> navLinkClick = driver.findElements(menuLinkLists);

        // Iterate through the anchor elements
        for (int i = 0; i < navLinkClick.size(); i++) {
            // Get the text of the current anchor element
            String currentLinkText = navLinkClick.get(i).getText().trim();

            // Check if the link text matches the desired linkText
            if (currentLinkText.equals(linkText)) {
                // Click the link if found and return
                navLinkClick.get(i).click();
                return;
            }
        }
        throw new NoSuchElementException("Navigation link with text '" + linkText + "' not found.");
    }
}

