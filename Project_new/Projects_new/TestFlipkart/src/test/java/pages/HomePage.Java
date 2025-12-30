package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    private By searchBox = By.name("q");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String text) {
        WebElement search = driver.findElement(searchBox);
        search.sendKeys(text);
        search.sendKeys(Keys.ENTER);
    }
}
