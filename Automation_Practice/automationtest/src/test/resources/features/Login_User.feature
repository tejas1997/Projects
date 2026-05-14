@Login
Feature: Flipkart Homepage Login dropdown

    Scenario Outline: Login to Flipkart 

        Given I access the Flipkart homepage 
        And a login popup is displayed
        When I click on the close button
        And the popup should be dismissed
        And I should be able to interact with the homepage 
        Then I should be able to tap on Login button