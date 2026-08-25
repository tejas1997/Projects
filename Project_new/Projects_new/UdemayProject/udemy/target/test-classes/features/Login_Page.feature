@login_page @regression 
Feature: WebDriver University Login Page

Background:
  Given I access the WebDriver University login Page

Scenario Outline: Validate Successful login with valid username and password
    When I enter a username "<username>"
    And I enter a password "<password>"
    And I click on the Login button 
    Then I should be presented with validation message "<validation_message>"

Examples:
| username | password | validation_message |
| webdriver | webdriver123 | validation succeeded |
| webdriver | webdriver | validation failed |
| anonymus | webdriver | validation failed |

