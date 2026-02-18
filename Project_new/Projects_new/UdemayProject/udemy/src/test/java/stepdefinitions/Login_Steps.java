package stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("unused")
public class Login_Steps {
    private WebDriver driver;

    @Before
    public void setUp() {
    // Initialize WebDriver here (e.g., using WebDriverManager or manually)
    // Example: driver = new ChromeDriver();
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--window-size=1920,1080");
    chromeOptions.addArguments("--remote-allow-origins=*");

    String os = System.getProperty("os.name").toLowerCase();

    if (os.contains("linux")) {
    chromeOptions.addArguments("--headless=new");    
    chromeOptions.addArguments("--no-sandbox");
    chromeOptions.addArguments("--disable-dev-shm-usage");
    chromeOptions.addArguments("--disable-gpu");
}
    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    driver = new ChromeDriver(chromeOptions);
    }

    @After
    public void tearDown() {
        // Quit WebDriver after each scenario
        driver.quit();
    }

    @Given("I access the WebDriver University login Page")
    public void i_access_the_webdriver_university_login_page() {
        // Navigate to the login page
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
    }

    @When("I enter a valid username {string}")
    public void i_enter_a_valid_username(String username) {
        // Enter valid credentials (replace with actual locators and values)
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys(username);
    }

    @And("I enter a valid password {string}")
    public void i_enter_a_valid_password(String password) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @And("I click on the Login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.xpath("//button[@id='login-button']")).click();
    }

    @Then("I should be presented with validation successful message")
    public void i_should_be_presented_with_validation_successful_message() throws Exception 
    {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Wait for alert
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to alert and get text
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals(actualMessage, "validation succeeded");     
    }
}
