Feature: Verification of MarketWatch Menu

In order to verify the MarketWatch menu credentials in Sharekhan Account
As a User
I want to login into Sharekhan Account


Scenario: I want to verify marketwatch menu
Given I open browser and enter Sharekhan URL
When Shrekhan home page is opened
Then I login into my account by entering below details
|username 	 | Password 	 |
|SUSMITAM96	 | Jas@1041996P	 |
Then I navigate to sharekhan portfolio window
Then My profile page is opened
Then I click on market watch menu
Then I verify all menus of market watch menu bar
Then I verify my watchlist is underlined or  not
Then I verify create watchlist menu
Then I verify add multiples menu is disabled
Then I verify heat map menu
Then I verify option chain menu is disabled
Then I verify columnchooser menu
Then I click on create watchlist menu
Then I create watchlist
Then I logout the account

