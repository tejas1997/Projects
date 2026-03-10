package stepdefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinitions {

    private WebDriver driver;

    @Before
    public void setUp() {

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

        if (driver != null) {
            driver.quit();
        }
    }

    @Given("I access the WebDriver University Contact Us Page")
    public void i_access_the_WebDriver_University_Contact_Us_Page() {

        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("I enter a firstname {word}")
    public void i_enter_a_first_name(String firstName) {

        driver.findElement(By.name("first_name")).sendKeys(firstName);
    }

    @And("I enter a lastname {word}")
    public void i_enter_a_last_name(String lastName) {

        driver.findElement(By.name("last_name")).sendKeys(lastName);
    }

    @And("I enter an email address {string}")
    public void i_enter_an_email_address(String emailAddress) {

        driver.findElement(By.name("email")).sendKeys(emailAddress);
    }

    @And("I enter a comment {string}")
    public void i_enter_a_comment(String comment) {

        driver.findElement(By.name("message")).sendKeys(comment);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {

        driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
    }

    @Then("I should be presented with a submission message {string}")
    public void i_should_be_presented_with_a_submission_message(String expectedMessage) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='contact_reply']/h1")));

        Assert.assertEquals(successMessage.getText(), expectedMessage);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String filename = "screenshot_" + System.currentTimeMillis() + ".png";

        File destination = new File("target/screenshots/" + filename);

        org.apache.commons.io.FileUtils.copyFile(source, destination);
    }
}