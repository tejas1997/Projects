package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;  

public class Contact_PO extends Base_PO {

    private @FindBy(name = "first_name")
    WebElement firstNameField;

    private @FindBy(name = "last_name")
    WebElement lastNameField;

    private @FindBy(name = "email")
    WebElement emailField;

    private @FindBy(name = "message")
    WebElement commentField;

    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submitButton;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement submissionMessage;

    public Contact_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Us_Page() {
        navigateTo("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }
    
    public void setFirstName(String firstName) {
        sendKeys(firstNameField, firstName);
    }

    public void setLastName(String lastName) {
        sendKeys(lastNameField, lastName);
    }

    public void setEmail(String emailAddress) {
        sendKeys(emailField, emailAddress);
    }

    public void setComment(String comment) {
        sendKeys(commentField, comment);
    }

    public void clickSubmitButton() {
        waitForElementAndClick(submitButton);
    }

    public String getSubmissionMessage(String expectedMessage) throws Exception {
        WebElement successMessage = waitForElement(submissionMessage);
        return successMessage.getText();
    }

}
