package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BasePO;
import pageobjects.Popup_PO;

public class Popup_Dismiss extends BasePO {

private Popup_PO popup_po;

public Popup_Dismiss(Popup_PO popup_po) 
{
    this.popup_po = popup_po;
}

@Given("I access the Flipkart homepage as a non-logged-in user")
public void i_access_the_flipkart_homepage_as_a_non_logged_in_user() 
{
    popup_po.navigateTo_Flipkart_Unauth_Home_Page();
}

@And("a login popup is displayed")
public void a_login_popup_is_displayed() 
{
    popup_po.popupDisplayed();
}

@When("I click on the close button of the popup")
public void i_click_on_the_close_button_of_the_popup() 
{
    popup_po.clickCloseButton();
}

@And("the login popup should be dismissed")
public void the_login_popup_should_be_dismissed()
{
    popup_po.popupDismissed();
}

@And("I should be able to interact with the homepage without any obstruction")
public void i_should_be_able_to_interact_with_the_homepage_without_any_obstruction() 
{
    popup_po.homepageInteraction();
}

@Then("I should be able to search for {string}")
public void i_should_be_able_to_search_for(String product) 
{
    popup_po.search_For_Product();
}
}