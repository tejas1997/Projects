package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class Popup_Dismiss {

public WebDriver driver;

@Before
public void setup() {
    driver = new ChromeDriver();
}

@After
public void closeDriver() {
    if (driver != null) {
        driver.quit();
    }
}

@Given("I access the Flipkart homepage as a non-logged-in user")
public void i_access_the_flipkart_homepage_as_a_non_logged_in_user() {
    driver.get("https://www.flipkart.com/");
}

@And("a login popup is displayed")
public void a_login_popup_is_displayed() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement loginPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Blh9Gf']")));
    Assert.assertTrue(loginPopup.isDisplayed());
}

@When("I click on the close button of the popup")
public void i_click_on_the_close_button_of_the_popup() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='button']")));
    closeButton.click();
}

@And("the login popup should be dismissed")
public void the_login_popup_should_be_dismissed(){
    try{
   WebElement loginPopup = driver.findElement(By.xpath("//div[@class='Blh9Gf']"));
    Assert.assertFalse(loginPopup.isDisplayed());
}
catch(org.openqa.selenium.NoSuchElementException e) {
    Assert.assertTrue(true, "Popup is dismissed successfully");  
}
}

@And("I should be able to interact with the homepage without any obstruction")
public void i_should_be_able_to_interact_with_the_homepage_without_any_obstruction() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class= 'nw1UBF v1zwn25']")));
    Assert.assertTrue(searchBox.isDisplayed());
}

@Then("I should be able to search for {string}")
public void i_should_be_able_to_search_for(String product) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class= 'nw1UBF v1zwn25']")));
    searchBox.sendKeys(product);
    searchBox.submit();
}
}