Feature: Verification of PortFolio Menu

In order to verify the Portfolio menu credentials in Sharekhan Account
As a User
I want to login into Sharekhan Account

@AutomationTest
Scenario: I want to verify Portfolio menu
When Browser is opened I enterd the Sharekhan URL
Then Sharekhan Homepage is opened for login
And I click on Login button of sharekhan home page
Then I enter My username and password 
And I press the login button
Then My Sharekhan homePage is opened
Then I click on Portfolio tab
Then I click on detailed view menu
Then I click on add virtual menu
Then One Dialogue box is opened
Then I enter folder name as a test
Then I click on add folder button
Then again dialogue box is opened for showing successfully added folder
Then I verify success message 
Then I click on close button
Then I verify added portfolio foder
Then I click on add scrip
Then I enter scrip name in dialogue box
Then I enter transaction date 
Then I enter price and quantity
Then I click on add scrip button
Then I verify Succeffully added stock message
Then I click on add scrip button for second company
Then I verify both compnies are added succefully not
Then I delete the one script and verify it
Then I rename the virtual portfolio folder
Then I delete the virtual portfolio folder

