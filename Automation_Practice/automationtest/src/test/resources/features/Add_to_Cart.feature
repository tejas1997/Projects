@Addtocart
Feature: Flipkart Add an item to Cart

  Scenario Outline: Add an item from search results to cart

    Given I access the Flipkart homepage as a non-logged-in user
    And I click on the close button of the popup
    When I search for an <items>
    And I should be able to interact with the serach results
    And I click on the first item from search results
    Then I should be able to add item to cart

    Examples:
    | items |
    | iphone |
    | nothing phone |