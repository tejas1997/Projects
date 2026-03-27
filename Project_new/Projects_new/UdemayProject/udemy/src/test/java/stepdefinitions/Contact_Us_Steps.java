package stepdefinitions;

import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Base_PO;
import pageobjects.Contact_PO;
public class Contact_Us_Steps extends Base_PO {

    public Contact_PO contact_po;

    public Contact_Us_Steps(Contact_PO contact_po) {
        this.contact_po = contact_po;
    }

    @Given("I access the WebDriver University Contact Us Page")
    public void i_access_the_WebDriver_University_Contact_Us_Page() {

        contact_po.navigateTo_WebDriverUniversity_Contact_Us_Page();
    }

    @When("I enter a firstname {word}")
    public void i_enter_a_first_name(String firstName) {

        contact_po.setFirstName(firstName);
    }

    @And("I enter a lastname {word}")
    public void i_enter_a_last_name(String lastName) 
    {
        contact_po.setLastName(lastName);
    }

    @And("I enter an email address {string}")
    public void i_enter_an_email_address(String emailAddress) {
        contact_po.setEmail(emailAddress);
    }

    @And("I enter a comment {string}")
    public void i_enter_a_comment(String comment) {
        contact_po.setComment(comment);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contact_po.clickSubmitButton();
    }

    @Then("I should be presented with a submission message {string}")
    public void i_should_be_presented_with_a_submission_message(String expectedMessage) throws Exception {
        String actualMessage = contact_po.getSubmissionMessage(expectedMessage);
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}