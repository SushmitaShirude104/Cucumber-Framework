package Step_Definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SharekhanCore.Sharekhan_WebConnector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_03_MouseMovementOfMenuBarItemsTest extends Sharekhan_WebConnector {

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();	
	
	//Market_Menu_Start	
    @Given("^User is on Sharekhans's HomePage$")
    public void user_is_on_sharekhanss_homepage() throws Throwable {
        
    	skw.open_browser();
    	
    	app_logs.debug("User  verifies TC_03_MouseMovementOfMenubarItemTest");
    	
    	System.out.println("User is on Sharekhans's HomePage");  	
    	
    }

   
    @When("^User is on Market menu$")
    public void user_is_on_market_menu() throws Throwable {
        System.out.println("User is on Market menu");
        Thread.sleep(2000);
        WebElement menu_1=driver.findElement(By.xpath(OR.getProperty("market_Menu")));
        Thread.sleep(2000);
        Assert.assertEquals(true,menu_1.isDisplayed());
        Thread.sleep(2000);
        
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",menu_1, "color: red; border: 2px solid red;");
        
        Actions act=new Actions(driver);
        act.moveToElement(menu_1).perform();     
        Thread.sleep(2000);
    }

    @Then("^User verifies market Summary$")
    public void user_verifies_market_summary() throws Throwable {
        System.out.println("User verifies market Summary");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("Market_Summary"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User verifies market stats$")
    public void user_verifies_market_stats() throws Throwable {
        System.out.println("User verifies market stats");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("Markets_stats"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User verifies Derivatives$")
    public void user_verifies_derivatives() throws Throwable {
       System.out.println("User verifies Derivatives");
       js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("Derivatives"))), "color: red; border: 2px solid red;");
       Thread.sleep(2000);
    }

    @Then("^User verifies News$")
    public void user_verifies_news() throws Throwable {
        System.out.println("User verifies News");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("news"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User verifies IPO$")
    public void user_verifies_ipo() throws Throwable {
        System.out.println("User verifies IPO");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("ipo"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User verifies NFO$")
    public void user_verifies_nfo() throws Throwable {
        System.out.println("User verifies NFO");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("nfo"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User verifies Bonds$")
    public void user_verifies_bonds() throws Throwable {
        System.out.println("User verifies Bonds");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("bonds"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User verifies Indices$")
    public void user_verifies_indices() throws Throwable {
        System.out.println("User verifies Indices");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("indices"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User verifies Events$")
    public void user_verifies_events() throws Throwable {
        System.out.println("User verifies Events");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("events_Calenender"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User verifies Commodity$")
    public void user_verifies_commodity() throws Throwable {
        System.out.println("User verifies Commodity");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("commodity"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
        
    }

  //New_To_Market_Menu_Start
    @Given("^User is on New_To_Market menu$")
    public void user_is_on_newtomarket_menu() throws Throwable {
        System.out.println("User is on New_To_Market menu");
    }

    @When("^User is on New_To_Market menu of Homepage$")
    public void user_is_on_newtomarket_menu_of_homepage() throws Throwable {
        System.out.println("User is on New_To_Market menu of Homepage");
    	Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(OR.getProperty("new_To_market")))).perform();     
        Thread.sleep(2000);
    }

    @Then("^User Verifies Overview$")
    public void user_verifies_overview() throws Throwable {
        System.out.println("User Verifies Overview");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("new_Overview"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Must_have_stocks$")
    public void user_verifies_musthavestocks() throws Throwable {
        System.out.println("User Verifies Must_have_stocks");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("must_have_Stocks"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies offerings$")
    public void user_verifies_offerings() throws Throwable {
        System.out.println("User Verifies offerings");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("offerings"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies knowledge centre$")
    public void user_verifies_knowledge_centre() throws Throwable {
        System.out.println("User Verifies knowledge centre");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("knowledge"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies OIT$")
    public void user_verifies_oit() throws Throwable {
        System.out.println("User Verifies OIT");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("Other_Things"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Sharekhan Classroom$")
    public void user_verifies_sharekhan_classroom() throws Throwable {
        System.out.println("User Verifies Sharekhan Classroom");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("sharekhan_Classroom"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies IHM$")
    public void user_verifies_ihm() throws Throwable {
        System.out.println("User Verifies IHM");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("I_Have_Money"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }
    
    //Super_Investor_Menu
    @Given("^User is on Super_Investor menu$")
    public void user_is_on_superinvestor_menu() throws Throwable {
        System.out.println("User is on Super_Investor menu");        
    }

    @When("^User is on Super_Investor menu of Homepage$")
    public void user_is_on_superinvestor_menu_of_homepage() throws Throwable {
        System.out.println("User is on Super_Investor menu of Homepage");
        
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(OR.getProperty("super_investor")))).perform();     
        Thread.sleep(2000);
    }

    @Then("^User Verifies Overview of SuperInvestors$")
    public void user_verifies_overview_of_superinvestors() throws Throwable {
        System.out.println("User Verifies Overview of SuperInvestors");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("super_Overview"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies research_and_Investors$")
    public void user_verifies_researchandinvestors() throws Throwable {
        System.out.println("User Verifies research_and_Investors");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("research_Investors"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies market_Update$")
    public void user_verifies_marketupdate() throws Throwable {
        System.out.println("User Verifies market_Update");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("market_Update"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Must_have_Stocks of SuperInvestors$")
    public void user_verifies_musthavestocks_of_superinvestors() throws Throwable {
        System.out.println("User Verifies Must_have_Stocks of SuperInvestors");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("must_Have_stocks_Super"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Offering_Forinvestors$")
    public void user_verifies_offeringforinvestors() throws Throwable {
        System.out.println("User Verifies Offering_Forinvestors");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("offerings_for_Investors"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Sharekhan Classroom of SuperInvestors$")
    public void user_verifies_sharekhan_classroom_of_superinvestors() throws Throwable {
        System.out.println("User Verifies Sharekhan Classroom of SuperInvestors");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("classroom_Investors"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Join Sharekhan of SuperInvestors$")
    public void user_verifies_join_sharekhan_of_superinvestors() throws Throwable {
        System.out.println("User Verifies Join Sharekhan of SuperInvestors");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("join_Sharekhan"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Loans$")
    public void user_verifies_loans() throws Throwable {
        System.out.println("User Verifies Loans");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("loans"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies LTCGTax$")
    public void user_verifies_ltcgtax() throws Throwable {
        System.out.println("User Verifies LTCGTax");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("ltcgx"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }
    
    //Active_trader_Menu
    @Given("^User is on Active_Trader menu$")
    public void user_is_on_activetrader_menu() throws Throwable {
        System.out.println("User is on Active_Trader menu");
        
        
    }

    @When("^User is on Active_Trader menu of Homepage$")
    public void user_is_on_activetrader_menu_of_homepage() throws Throwable {
        System.out.println("User is on Active_Trader menu of Homepage");
        
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(OR.getProperty("active_Trader")))).perform();     
        Thread.sleep(2000);
    }

    @Then("^User Verifies Overview of Active trader$")
    public void user_verifies_overview_of_active_trader() throws Throwable {
        System.out.println("User Verifies Overview of Active trader");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("overview_active"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Research_for_Traders$")
    public void user_verifies_researchfortraders() throws Throwable {
        System.out.println("User Verifies Research_for_Traders");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("research_active"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies market_Updates$")
    public void user_verifies_marketupdates() throws Throwable {
       System.out.println("User Verifies market_Updates");
       
       js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("market_active"))), "color: red; border: 2px solid red;");
       Thread.sleep(2000);
    }

    @Then("^User Verifies must_do_trades$")
    public void user_verifies_mustdotrades() throws Throwable {
        System.out.println("User Verifies must_do_trades");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("must_do_trades"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Portfolio Management of active traders$")
    public void user_verifies_portfolio_management_of_active_traders() throws Throwable {
        System.out.println("User Verifies Portfolio Management of active traders");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("portfolio_active"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Offerings for traders of active trader$")
    public void user_verifies_offerings_for_traders_of_active_trader() throws Throwable {
        System.out.println("User Verifies Offerings for traders of active trader");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("offerings_active"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Learn$")
    public void user_verifies_learn() throws Throwable {
        System.out.println("User Verifies Learn");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("learn_active"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies other imp for active$")
    public void user_verifies_other_imp_for_active() throws Throwable {
        System.out.println("User Verifies other imp for active");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("oit_active"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies Join Sharekhan$")
    public void user_verifies_join_sharekhan() throws Throwable {
        System.out.println("User Verifies Join Sharekhan");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("join_Sharekhan_active"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies SharekhabClassroom of active traders$")
    public void user_verifies_sharekhabclassroom_of_active_traders() throws Throwable {
        System.out.println("User Verifies SharekhabClassroom of active traders");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("classroom_active"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^User Verifies ExchangeMargingFunding$")
    public void user_verifies_exchangemargingfunding() throws Throwable {
        System.out.println("User Verifies ExchangeMargingFunding");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("exchange_margin_active"))), "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }
    
    
}
