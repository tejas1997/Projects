@login_page
Feature: WebDriver University Login Page

Scenario: Validate Successful login with valid username and password
    Given I access the WebDriver University login Page
    When I enter a valid username
    And I enter a valid password
    And I click on the Login button
    Then I should be presented with validation successful message
