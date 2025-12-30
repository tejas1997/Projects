package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
    private WebDriver driver;
    private WebDriverWait wait;

    private By searchBox = By.name("q");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void search(String text) {
        WebElement search = wait.until(
            ExpectedConditions.visibilityOfElementLocated(searchBox)
        );
        search.sendKeys(text);
        search.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.urlContains("search"));
    }
}
