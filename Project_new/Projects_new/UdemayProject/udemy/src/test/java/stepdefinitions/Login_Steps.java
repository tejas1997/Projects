package stepdefinitions;
import pageobjects.Base_PO;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps extends Base_PO {

    private WebDriver driver;

    public Login_Steps() {
        driver = getDriver();
    }

    @Given("I access the WebDriver University login Page")
    public void i_access_the_webdriver_university_login_page() {
        navigateTo("https://webdriveruniversity.com/Login-Portal/index.html");
    }

    @When("I enter a username {string}")
    public void i_enter_a_username(String username) {
        sendKeys(By.id("text"), username);
    }

    @And("I enter a password {string}")
    public void i_enter_a_password(String password) {
        sendKeys(By.id("password"), password);
    }

    @And("I click on the Login button")
    public void i_click_on_the_login_button() {
        sendKeys(By.id("login-button"), " ");
    }

    @Then("I should be presented with validation message {string}")
    public void i_should_be_presented_with_validation_message(String expectedMessage) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Wait for alert to appear
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();

        Assert.assertEquals(actualMessage, expectedMessage);

        // Close alert (important)
        alert.accept();
    }
}