@contact_us
Feature: WebDriver University Contact Us Page

Background: Given I access the WebDriver University Contact Us Page

Scenario: Validate Successful Submission - Unique Data
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the submit button
    Then I should be presented with a successful submission message

Scenario: Validate Successful Submission - Specific Data
    When I enter a specific first name John
    And I enter a specific last name Doe
    And I enter a specific email address johndoe11@gmail.com
    And I enter a specific comment "This is john doe's comment."
    And I click on the submit button
    Then I should be presented with a successful submission message 