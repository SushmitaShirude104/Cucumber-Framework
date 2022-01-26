Feature: Verification of TradeNoe button

In order to verify the TradeNow menu credentials in Sharekhan Account
As a User
I want to login into Sharekhan Account


Scenario: I want verify Trade now menu
Given I enter the sharekhan URL after opening the browser
When Sharekhan Homepage is opened
Then I click login button to login into my account
Then new portfolio window is opened
Then I entering my details for login
Then I click on login tab
Then My sharekhan profile page is opened
Then I click on Tradenow button
Then I verify all menus of trade now
Then I click on Normal order menu
Then I verify enter script Name
Then I verify buy or sell menu
Then I verify Quantity
Then I verify price
Then I verify Trigger price
Then I verify disc quantity
Then I verify product type
Then I verify validity
Then I verify place order button is disabled or not
Then I verify reset button is disbled or not