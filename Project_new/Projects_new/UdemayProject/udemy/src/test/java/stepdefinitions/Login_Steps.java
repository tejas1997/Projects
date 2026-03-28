package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Base_PO;
import pageobjects.Login_PO;

public class Login_Steps extends Base_PO {

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po) {
        this.login_po = login_po; 
    }

    @Given("I access the WebDriver University login Page")
    public void i_access_the_webdriver_university_login_page() {
       login_po.navigateTo_WebDriverUniversity_Login_Page(); 
    }

    @When("I enter a username {string}")
    public void i_enter_a_username(String username) {
        login_po.setUsername(username);
    }

    @And("I enter a password {string}")
    public void i_enter_a_password(String password) {
        login_po.setPassword(password);
    }

    @And("I click on the Login button")
    public void i_click_on_the_login_button() {
        login_po.clickLoginButton();
    }

    @Then("I should be presented with validation message {string}")
    public void i_should_be_presented_with_validation_message(String expectedMessage) {
        waitForAlert(expectedMessage);
    }
}