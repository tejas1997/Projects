package pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Popup_PO extends BasePO 
{

    private @FindBy(xpath = "//div[@class='Blh9Gf']") 
    WebElement popup;

    private @FindBy(xpath = "//span[@role='button']") 
    WebElement closeButton;

    private @FindBy(xpath = "//input[@name='q']")
    WebElement searchBox;

    public Popup_PO() 
    {
        super();
    }
    
    public void navigateTo_Flipkart_Unauth_Home_Page() 
    {
        navigateTo("https://www.flipkart.com/");
    }

    public void popupDisplayed() 
    {
        waitForElement(popup);
    }
    
    public void clickCloseButton() 
    {
        waitForWebElementAndClickElement(closeButton);
    }
    
    public void popupDismissed() 
    {
        waitForElementVisiblity(popup);
    }
    
    public void homepageInteraction() 
    {
        interactWithHomepage(searchBox);
    }

    public void search_For_Product(String searchItem) 
    {
        searchForProduct(searchBox, searchItem);
    }
}
