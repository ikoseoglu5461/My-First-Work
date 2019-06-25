Feature: SauceDemoLogin

Scenario: Seacrh by typing

Given I navigate to the Sauce Demo Page
When I type username
When I type password
When I click on login button
Then I see homepage of is displayed
 

