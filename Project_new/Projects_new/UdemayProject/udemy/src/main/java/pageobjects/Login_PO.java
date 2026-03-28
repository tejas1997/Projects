package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Global_Vars;


public class Login_PO extends Base_PO {

    private @FindBy(id = "text")
    WebElement usernameField;

    private @FindBy(id = "password")
    WebElement passwordField;

    private @FindBy(id = "login-button")
    WebElement loginButton;

    public Login_PO() {
        super();
    }
    
    public void navigateTo_WebDriverUniversity_Login_Page() {
        navigateTo(Global_Vars.WEBDRIVER_UNIVERSITY_URL + "/Login-Portal/index.html");
    }

    public void setUsername(String usrname) {
        sendKeys(usernameField, usrname);
    }

    public void setPassword(String pssword) {
        sendKeys(passwordField, pssword);
    }

    public void clickLoginButton() {
        waitForElementAndClick(loginButton);
    } 

}
