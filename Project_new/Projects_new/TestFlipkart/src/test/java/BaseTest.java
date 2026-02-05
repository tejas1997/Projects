import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
    public WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();    
        ChromeOptions options = new ChromeOptions();

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("linux")) {
        // For GitHub Codespaces / CI
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        } 
        else 
            {
              // For Local Windows / Mac
              options.addArguments("--start-maximized");
            }

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
    }

        
    @AfterMethod
    public void tearDown()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }
}