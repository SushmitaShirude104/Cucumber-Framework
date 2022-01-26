Feature: Verification of place a buy order

In order to verify the Place a buy order in Sharekhan Account
As a User
I want to login into Sharekhan Account


Scenario: I want to verify place a buy order
Given I want to login into sharekhan account for placing a buy order
When I am on homepage of sharekhan account
Then I click on trade now menu for placing buy order
Then I click on enter scrip
And I enter Scrip name
Then I select buy option
Then I enter Quantity
Then I click on place order button
Then I verify confirm order button