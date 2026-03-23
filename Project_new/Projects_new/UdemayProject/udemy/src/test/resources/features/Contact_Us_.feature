@contact_us @regression
Feature: WebDriver University Contact Us Page

Background:
  Given I access the WebDriver University Contact Us Page

Scenario Outline: Validate Successful Submission 
    When I enter a firstname <first_name>
    And I enter a lastname <last_name>
    And I enter an email address <email_address>
    And I enter a comment <comment>
    And I click on the submit button
    Then I should be presented with a submission message <submission_message>

Examples:
| first_name | last_name | email_address | comment | submission_message |
| anonymous  | user01 | "anonymoususer01@email.com" | "anonymous user 01 commented" | "Thank You for your Message!" |
| anonymous  | user02 | "anonymoususer02@email.com" | "anonymous user 02 commented" | "Thank You for your Message!" |
| anonymous  | user03 | "anonymoususer03@email.com" | "anonymous user 03 commented" | "Thank You for your Message!" |