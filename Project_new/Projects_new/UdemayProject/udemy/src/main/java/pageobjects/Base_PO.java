package pageobjects;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.time.Duration;

public class Base_PO {
    public Base_PO() {
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }
    public void navigateTo(String url){
        getDriver().get(url);
    }

    public void sendKeys(By by, String textToEnter){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToEnter);
    }
}
