Feature: Verification of place a sell order

In order to verify the Place a sell order in Sharekhan Account
As a User
I want to login into Sharekhan Account

@MobileTest
Scenario: I want to verify place a sell order
Given I want to login into sharekhan account for placing a sell order
When I am on homepage of sharekhan account for placing sell order
Then I click on trade now menu for placing sell order
Then I click on enter scrip for placing sell order
And I enter Scrip name for placing sell order 
Then I select sell option
Then I enter Quantity for placing sell order
Then I click on place order button for placing sell order
Then I verify confirm order button for placing sell order