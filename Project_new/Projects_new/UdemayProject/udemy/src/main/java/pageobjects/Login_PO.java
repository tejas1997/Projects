package pageobjects;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public Alert waitForAlert(int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public String getAlertTextAndAccept(int timeoutInSeconds) {
    Alert alert = waitForAlert(timeoutInSeconds);
    String text = alert.getText();
    alert.accept();
    return text;
    }   
}
