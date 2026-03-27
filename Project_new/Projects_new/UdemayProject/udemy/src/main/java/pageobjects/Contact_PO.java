package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Contact_PO extends Base_PO {

    public Contact_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Us_Page() {
        navigateTo("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }
    
    public void setFirstName(String firstName) {
        sendKeys(By.name("first_name"), firstName);
    }

    public void setLastName(String lastName) {
        sendKeys(By.name("last_name"), lastName);
    }

    public void setEmail(String emailAddress) {
        sendKeys(By.name("email"), emailAddress);
    }

    public void setComment(String comment) {
        sendKeys(By.name("message"), comment);
    }

    public void clickSubmitButton() {
        waitForElementAndClick(By.xpath("//input[@value='SUBMIT']"));
    }

    public String getSubmissionMessage(String expectedMessage) throws Exception {
        WebElement successMessage = waitForElement(By.xpath("//div[@id='contact_reply']/h1"));
        return successMessage.getText();
    }

}
