Feature: Flipkart Homepage Login Popup

  Scenario Outline: Dismiss login popup on the homepage

    Given I access the Flipkart homepage as a non-logged-in user
    And a login popup is displayed
    When I click on the close button of the popup
    And the login popup should be dismissed
    And I should be able to interact with the homepage without any obstruction
    Then I should be able to search for "<search items>"

    Examples:
    | search items |
    | iphone |
    | nothing phone |