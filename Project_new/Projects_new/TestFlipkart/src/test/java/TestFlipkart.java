
import org.openqa.selenium.By; // 2. Added Import
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFlipkart {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup(); // 3. Setup Driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        try {
            // Wait a moment for page load
            Thread.sleep(2000); 
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("iPhone", Keys.ENTER);
            
            Thread.sleep(3000); // Wait for results
            WebElement str = driver.findElement(By.xpath("//span[contains(text(), 'Showing')]"));
            System.out.println("Results text: " + str.getText());
        } catch (Exception e) {
            System.out.println("Error during setup: " + e.getMessage());
        }
    }

    @Test  
    public void test() {
        System.out.println("Test execution started...");
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}