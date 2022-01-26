Feature: User verifies all menu_bar items individually

Scenario: User verifies market Button
Given User is on Sharekhans's HomePage
When User is on Market menu
Then User verifies market Summary
Then User verifies market stats
Then User verifies Derivatives
Then User verifies News
Then User verifies IPO
Then User verifies NFO
Then User verifies Bonds
Then User verifies Indices
Then User verifies Events
Then User verifies Commodity

Scenario: User Verifies new_to_market Button
Given User is on New_To_Market menu
When User is on New_To_Market menu of Homepage
Then User Verifies Overview
Then User Verifies Must_have_stocks
Then User Verifies offerings
Then User Verifies knowledge centre
Then User Verifies OIT
Then User Verifies Sharekhan Classroom
Then User Verifies IHM

Scenario: User Verifies Super_Investor Button
Given User is on Super_Investor menu
When User is on Super_Investor menu of Homepage
Then User Verifies Overview of SuperInvestors
Then User Verifies research_and_Investors
Then User Verifies market_Update
Then User Verifies Must_have_Stocks of SuperInvestors 
Then User Verifies Offering_Forinvestors
Then User Verifies Sharekhan Classroom of SuperInvestors
Then User Verifies Join Sharekhan of SuperInvestors 
Then User Verifies Loans
Then User Verifies LTCGTax

Scenario: User Verifies Active_trader Button
Given User is on Active_Trader menu
When User is on Active_Trader menu of Homepage
Then User Verifies Overview of Active trader
Then User Verifies Research_for_Traders
Then User Verifies market_Updates
Then User Verifies must_do_trades
Then User Verifies Portfolio Management of active traders
Then User Verifies Offerings for traders of active trader
Then User Verifies Learn
Then User Verifies other imp for active
Then User Verifies Join Sharekhan
Then User Verifies SharekhabClassroom of active traders
Then User Verifies ExchangeMargingFunding

