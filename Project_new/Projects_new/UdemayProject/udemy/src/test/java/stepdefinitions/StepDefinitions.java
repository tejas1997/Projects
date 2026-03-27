package stepdefinitions;

import org.openqa.selenium.By;
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

    @Given("I access the WebDriver University Contact Us Page")
    public void i_access_the_WebDriver_University_Contact_Us_Page() {

        navigateTo("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("I enter a firstname {word}")
    public void i_enter_a_first_name(String firstName) {

        sendKeys(By.name("first_name"), firstName);
    }

    @And("I enter a lastname {word}")
    public void i_enter_a_last_name(String lastName) {

        sendKeys(By.name("last_name"), lastName);
    }

    @And("I enter an email address {string}")
    public void i_enter_an_email_address(String emailAddress) {
        sendKeys(By.name("email"), emailAddress);
    }

    @And("I enter a comment {string}")
    public void i_enter_a_comment(String comment) {

        sendKeys(By.name("message"), comment);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {

        waitForElementAndClick(By.xpath("//input[@value='SUBMIT']"));
    }

    @Then("I should be presented with a submission message {string}")
    public void i_should_be_presented_with_a_submission_message(String expectedMessage) throws Exception {

        WebElement successMessage = waitForElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(successMessage.getText(), expectedMessage);
    }
}