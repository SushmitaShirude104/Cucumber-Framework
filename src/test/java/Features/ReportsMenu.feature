Feature: Verification of Reports button

In order to verify the Reports menu credentials in Sharekhan Account
As a User
I want to login into Sharekhan Account


Scenario: I want to verify reports menu
Given I open the browser and enter the sharekhan URL
When I am on Sharekhan Homepage
Then I am go to login button and click on it
Then New tab is opend for login
Then I login to the account by entering my login details 
Then I come on my sharekhan profile window
Then I click on Reports menu
Then I verify all menus of reports menu
Then I click on quick view menu
Then I verify quick view menu has underlined or not
Then I verify all menus of quick view
Then I logout to my profile