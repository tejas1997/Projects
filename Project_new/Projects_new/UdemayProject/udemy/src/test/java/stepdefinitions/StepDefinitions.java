package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Base_PO;

public class StepDefinitions extends Base_PO {

    private WebDriver driver;

    @Given("I access the WebDriver University Contact Us Page")
    public void i_access_the_WebDriver_University_Contact_Us_Page() {

        navigateTo("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("I enter a firstname {word}")
    public void i_enter_a_first_name(String firstName) {

        DriverFactory.getDriver().findElement(By.name("first_name")).sendKeys(firstName);
    }

    @And("I enter a lastname {word}")
    public void i_enter_a_last_name(String lastName) {

        DriverFactory.getDriver().findElement(By.name("last_name")).sendKeys(lastName);
    }

    @And("I enter an email address {string}")
    public void i_enter_an_email_address(String emailAddress) {
        DriverFactory.getDriver().findElement(By.name("email")).sendKeys(emailAddress);
    }

    @And("I enter a comment {string}")
    public void i_enter_a_comment(String comment) {

        DriverFactory.getDriver().findElement(By.name("message")).sendKeys(comment);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {

        DriverFactory.getDriver().findElement(By.xpath("//input[@value='SUBMIT']")).click();
    }

    @Then("I should be presented with a submission message {string}")
    public void i_should_be_presented_with_a_submission_message(String expectedMessage) throws Exception {

        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='contact_reply']/h1")));

        Assert.assertEquals(successMessage.getText(), expectedMessage);
    }
}