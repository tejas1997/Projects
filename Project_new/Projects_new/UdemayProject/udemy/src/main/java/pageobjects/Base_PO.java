package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driver.DriverFactory;
import utils.Global_Vars;

public class Base_PO {
    public Base_PO() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }
    
    public void navigateTo(String url){
        getDriver().get(url);
    }

    public void sendKeys(By by, String textToEnter){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToEnter);
    }

    public void sendKeys(WebElement element, String textToEnter){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToEnter);
    }

    public void waitForElementAndClick(By by){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public WebElement waitForElement(By by){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.EXPLICIT_WAIT));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

    public void waitForElementAndClick(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }    

     public void waitForAlert(String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.alertIsPresent());
        String alert_text = getDriver().switchTo().alert().getText();
        Assert.assertEquals(alert_text, text);
    } 

    public void validateText(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.EXPLICIT_WAIT));
        WebElement submissionMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='contact_reply']/h1")));
        String actualMessageText = submissionMessage.getText();
        Assert.assertEquals(actualMessageText, expectedMessage);
    }
}

