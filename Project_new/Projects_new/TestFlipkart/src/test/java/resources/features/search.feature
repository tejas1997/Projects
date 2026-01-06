Feature: Search Automation of Flipkart
Scenario: Check search is successful
Given User is on Homepage
And User clicks on searchbar
When User seach for iPhone in searchbar
And User hits enter key
Then User is redirected to search result displaying results for iPhone
