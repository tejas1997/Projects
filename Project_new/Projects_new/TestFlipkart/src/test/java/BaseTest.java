import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
    public WebDriver driver;

    WebDriverManager.chromedriver().setup();

    @BeforeMethod
    public void setUp()
    {
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
    }

        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
    @AfterMethod
    public void tearDown()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }
}