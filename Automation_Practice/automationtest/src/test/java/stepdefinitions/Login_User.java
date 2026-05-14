package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BasePO;
import pageobjects.Login_PO;

public class Login_User extends BasePO {

private Login_PO login_po;

public Login_User(Login_PO login_po) 
{
    this.login_po = login_po;
}

@Given("I access the Flipkart homepage")
public void i_access_the_flipkart_homepage() {
    login_po.navigateTo_Flipkart_Unauth_Home_Page();
}

@And("a login popup is displayed")
public void a_login_popup_is_displayed() {
    login_po.popupDisplayed();
}

@When("I click on the close button")
public void i_click_on_the_close_button() {
    login_po.clickCloseButton();
}

@And("the popup should be dismissed")
public void the_popup_should_be_dismissed(){
    login_po.popupDismissed();
}

@And("I should be able to interact with the homepage")
public void i_should_be_able_to_interact_with_the_homepage() {
    login_po.homepageInteraction();
}

@Then("I should be able to tap on Login button")
public void i_should_be_able_to_tap_on_login_button() 
{
    login_po.clickLoginButton();
}
}