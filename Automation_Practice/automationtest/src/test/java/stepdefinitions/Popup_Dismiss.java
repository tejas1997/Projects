package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Popup_Dismiss {

public WebDriver getDriver() {
   ChromeDriver driver = new ChromeDriver();
   return driver;   
}

@Given("I access the Flipkart homepage as a non-logged-in user")
public void i_access_the_flipkart_homepage_as_a_non_logged_in_user() {
    getDriver().get("https://www.flipkart.com/");
}

@And("a login popup is displayed")
public void a_login_popup_is_displayed() {
    WebElement loginPopup = getDriver().findElement(By.xpath("(//div[@class='q7ywiQ'])[1]"));
    Assert.assertTrue(loginPopup.isDisplayed());
}

@When("I click on the close button of the login popup")
public void i_click_on_the_close_button_of_the_login_popup() {
    WebElement closeButton = getDriver().findElement(By.xpath("//span[@role='button']"));
    closeButton.click();
}

@Then("the login popup should be dismissed")
public void the_login_popup_should_be_dismissed() {
    WebElement loginPopup = getDriver().findElement(By.xpath("(//div[@class='q7ywiQ'])[1]"));
    Assert.assertFalse(loginPopup.isDisplayed());
}
}
