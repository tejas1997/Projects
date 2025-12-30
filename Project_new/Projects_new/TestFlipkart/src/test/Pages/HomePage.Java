package pages;

import org.openqa.selenium.WebDriver;

public class HomePage
{
    By searchBox = By.name("q");
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void search(String text)
    {
        driver.findElement(searchBox);
        searchBox.sendKeys(Keys.ENTER);
    }
}