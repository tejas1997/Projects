package pageobjects;
import org.openqa.selenium.By;

public class Login_PO extends Base_PO {

    public Login_PO() {
        super();
    }
    
    public void navigateTo_WebDriverUniversity_Login_Page() {
        navigateTo("https://webdriveruniversity.com/Login-Portal/index.html");
    }

    public void setUsername(String usrname) {
        sendKeys(By.id("text"), usrname);
    }

    public void setPassword(String pssword) {
        sendKeys(By.id("password"), pssword);
    }

    public void clickLoginButton() {
        waitForElementAndClick(By.id("login-button"));
    } 

    public void validateTextOnAlert(String expectedMessage) {
        waitForAlert(expectedMessage);
    }
}
