Feature: Verification of Accounts Menu

In order to verify the Accounts menu credentials in Sharekhan Account
As a User
I want to login into Sharekhan Account


Scenario: I want to verify Account menu
Given I am on sharekhan login page after entering url in chrome browser
When I enter Username and password as below
|username 	 | Password 	 |
|SUSMITAM96	 | Jas@1041996P	 |
Then I click on login 
Then I am on sharekhan portfolio tab
When I am on my profile page of Sharekhan Account
Then I click on accounts menu
Then I verify cash transfer menu
Then I verify withdraw cash menu
Then I verify bank account
Then I verify select segment
Then I verify availble balances
Then I verify bank details


Scenario: I want to verify bank to IPO menu
When I am on sharekhan login page for account menu
Then I click on accounts for verifying ipo
Then I click on bank to IPO menu
Then I verify select segment of IPO


Scenario: I want to verify bank to MF menu
When I am on sharekhan login page for account menu
Then I click on accounts for verifying MF
Then I click on bank to MF menu
Then I verify select segment of MutualFund



Scenario: I want to verify all menus of selct segment for Cash Transfer
When I click on dropdawn menu of select segment for Cash Transfer
Then I verify dropdawn has all values for Cash Transfer
Then I logout to my account