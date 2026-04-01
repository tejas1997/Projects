Feature: Flipkart Homepage Login Popup

  Scenario: Dismiss login popup on the homepage

    Given I access the Flipkart homepage as a non-logged-in user
    And a login popup is displayed
    When I click on the close button of the popup
    Then the login popup should be dismissed