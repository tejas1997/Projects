package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import driver.DriverFactory;
//import utils.Global_Vars;

public class BasePO {
    public BasePO() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }
    
    public void navigateTo(String url){
        getDriver().get(url);
    }

    public WebElement waitForElement(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement loginPopup = wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(loginPopup.isDisplayed());
        return loginPopup;
    }

    public WebElement waitForWebElementAndClickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));
        webElement.click();
        return webElement;
    }

    public void waitForElementVisiblity(WebElement element) 
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        boolean isInvisible = wait.until(ExpectedConditions.invisibilityOf(element));
        Assert.assertTrue(isInvisible, "Element should not be visible but is: " + element);    
    }

    public void interactWithHomepage(WebElement element) 
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(searchBox.isDisplayed());
    }

    public void searchForProduct(WebElement element, String productName) 
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOf(element));
        searchBox.clear();
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);
    }
}


