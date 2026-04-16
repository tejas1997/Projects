package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Popup_PO extends BasePO {

    private @FindBy(xpath = "//div[@class='Blh9Gf']") 
    WebElement popup;
    private @FindBy(xpath = "//span[@role='button']") 
    WebElement closeButton;

    public Popup_PO() 
    {
        super();
    }
    
    public void navigateTo_Flipkart_Unauth_Home_Page() 
    {
        navigateTo("https://www.flipkart.com/");
    }

    public void popupDisplayed() {
        waitForElement(popup);
    }
    
    public void clickCloseButton() {
        waitForWebElementAndClickElement(closeButton);
    }
    
    public void popupDismissed() {
        waitForElementVisiblity(popup);
    }
    
}
