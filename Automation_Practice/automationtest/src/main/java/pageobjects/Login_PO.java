package pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PO extends Popup_PO 
{

    private @FindBy(xpath = "//div[@class='Blh9Gf']") 
    WebElement pop_up;

    private @FindBy(xpath = "//span[@role='button']") 
    WebElement closebutton;

    private @FindBy(xpath = "//input[@class= 'nw1UBF v1zwn25']")
    WebElement searchbox;

    private @FindBy(xpath = "//div[@id='container']//span[text()='Login']") 
    WebElement loginButton;

    public Login_PO()
    {
        super();
    }
    
    public void navigateTo_Flipkart_Unauth_Home_Page() 
    {
        navigateTo("https://www.flipkart.com/");
    }

    public void popupDisplayed() 
    {
        waitForElement(pop_up);
    }
    
    public void clickCloseButton() 
    {
        waitForWebElementAndClickElement(closebutton);
    }
    
    public void popupDismissed() 
    {
        waitForElementVisiblity(pop_up);
    }
    
    public void homepageInteraction() 
    {
        interactWithHomepage(searchbox);
    }
    
    public void clickLoginButton(){
        waitForWebElementAndClickElement(loginButton);
    }
}
