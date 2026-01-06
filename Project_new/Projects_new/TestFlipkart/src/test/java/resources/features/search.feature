Feature: Search Automation of Flipkart

  Scenario: Check search is successful
    Given user is on the Flipkart homepage
    When user clicks on the search bar
    And user searches for "iPhone"
    And user presses the Enter key
    Then search results for "iPhone" should be displayed
