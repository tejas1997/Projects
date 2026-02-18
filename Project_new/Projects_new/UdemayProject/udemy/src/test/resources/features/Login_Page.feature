@login_page
Feature: WebDriver University Login Page

Scenario: Validate Successful login with valid username and password
    Given I access the WebDriver University login Page
    When I enter a valid username "webdriver"
    And I enter a valid password "webdriver123"
    And I click on the Login button 
    Then I should be presented with validation successful message

Scenario: Validate unsuccessful login with invalid username and password
    Given I access the WebDriver University login Page
    When I enter an invalid username "webdriverabc"
    And I enter an invalid password "webdriver12345"
    And I click on the Login button 
    Then I should be presented with validation failed message
