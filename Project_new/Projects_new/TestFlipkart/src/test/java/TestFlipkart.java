
import org.openqa.selenium.By; // 2. Added Import
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFlipkart extends BaseTest{

    @Test  
    public void test() 
    {
        HomePage homePage = new HomePage(driver);
        homePage.search("iPhone");
        String expectedUrl = "https://www.flipkart.com/search?q=iPhone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Search failed!");
    }
}