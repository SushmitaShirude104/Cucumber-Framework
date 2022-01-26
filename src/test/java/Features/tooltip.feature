Feature: Verification of tooltips of sharekhan menu

In order to verify the My Portfolio menu in Sharekhan Account
As a User
I want to login into Sharekhan Account

@SmokeTest
Scenario: I want to verify tooltips of sharekhan menu
Given I am on Sharekhan login page for Verifying tooltips
When I am click on Login button for Verifying tooltips
Then I navigating to login page for verifying tooltips
Then I enter username as "SUSMITAM96"
Then I enter passwor as "Jas@1041996P"
Then I click on login button for verifying tooltips
Then I verifying all tooltips of all menus
Then I logout to sharekhan account