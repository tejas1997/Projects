package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Popup_PO extends BasePO {

    private @FindBy(xpath = "//div[@class='Blh9Gf']") 
    WebElement popup;

    private @FindBy(xpath = "//span[@role='button']") 
    WebElement closeButton;

    private @FindBy(xpath = "//input[@class= 'nw1UBF v1zwn25']")
    WebElement searchBox;

    private String product_1 = "iPhone";
    private String product_2 = "nothing phone";

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
    
    public void homepageInteraction() {
        interactWithHomepage(searchBox);
    }

    public void search_For_Product() {
        searchForProduct(searchBox, product_1);
        searchForProduct(searchBox, product_2);
    }
}
