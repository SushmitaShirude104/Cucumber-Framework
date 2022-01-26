package Step_Definitions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import SharekhanCore.Sharekhan_WebConnector;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TC_05_AccountDetailsTest extends Sharekhan_WebConnector {

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	 @Given("^I am on sharekhan login page after entering url in chrome browser$")
	    public void i_am_on_sharekhan_login_page_after_entering_url_in_chrome_browser() throws Throwable {
		 
		 skw.open_browser();
	        System.out.println("I am on sharekhan login page after entering url in chrome browser");
	        
	        app_logs.debug("User  verifies TC_05_AccountDetailsTest");
	        
	        driver.findElement(By.xpath(OR.getProperty("Login_button"))).click();
	        Thread.sleep(2000);
	        
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        Thread.sleep(5000);
	    }

	    @When("^I am on my profile page of Sharekhan Account$")
	    public void i_am_on_my_profile_page_of_sharekhan_account() throws Throwable {
	        System.out.println("I am on my profile page of Sharekhan Account");
	    }

	    @Then("^I enter Username and password as below$")
	    public void i_enter_username_and_password_as_below(DataTable data) throws Throwable {
	        System.out.println("I enter Username and password as below");
	        	        
	        List<List<String>> obj=data.raw();
	        System.out.println("user enters username as :"+obj.get(0).get(0));
	        driver.findElement(By.name(OR.getProperty("username"))).sendKeys(obj.get(1).get(0));
	        driver.findElement(By.xpath(OR.getProperty("next"))).click();
	        System.out.println("user enters password as :"+obj.get(1).get(1));
	        driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys(obj.get(1).get(1));
	    }

	    @Then("^I click on login$")
	    public void i_click_on_login() throws Throwable {
	        System.out.println("I click on login");
	        
	        driver.findElement(By.xpath(OR.getProperty("login"))).click();
	        
	        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	    }

	    @Then("^I am on sharekhan portfolio tab$")
	    public void i_am_on_sharekhan_portfolio_tab() throws Throwable {
	        System.out.println("I am on sharekhan portfolio tab");
	        Thread.sleep(1000);
	    }

	    @Then("^I click on accounts menu$")
	    public void i_click_on_accounts_menu() throws Throwable {
	        System.out.println("I click on accounts menu");
	        
	        driver.findElement(By.xpath(OR.getProperty("accounts"))).click();
	        Thread.sleep(1000);
	    }

	    @Then("^I verify cash transfer menu$")
	    public void i_verify_cash_transfer_menu() throws Throwable {
	        System.out.println("I verify cash transfer menu");
	        
	        js=(JavascriptExecutor)driver;
	       	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("cash_transfer"))) , "color: red; border: 2px solid red;");
	       	Thread.sleep(1000);
	    }

	    @Then("^I verify withdraw cash menu$")
	    public void i_verify_withdraw_cash_menu() throws Throwable {
	       System.out.println("I verify withdraw cash menu");
	       
	       js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("cash_withdraw"))) , "color: red; border: 2px solid red;");
	       Thread.sleep(1000);
	    }

	    @Then("^I verify bank account$")
	    public void i_verify_bank_account() throws Throwable {
	        System.out.println("I verify bank account");
	        
	        driver.findElement(By.xpath(OR.getProperty("bank")));
	        Select select=new Select(driver.findElement(By.xpath(OR.getProperty("bank"))));
	        select.selectByValue("192| 2968765239");
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("bank"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	    }

	    @Then("^I verify select segment$")
	    public void i_verify_select_segment() throws Throwable {
	        System.out.println("I verify select segment");
	        
	        driver.findElement(By.xpath(OR.getProperty("segment")));
	        Select select=new Select(driver.findElement(By.xpath(OR.getProperty("segment"))));
	        select.selectByValue("CASH");
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("segment"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	    }

	    @Then("^I verify availble balances$")
	    public void i_verify_availble_balances() throws Throwable {
	        System.out.println("I verify availble balances");
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("available_balance"))) , "color: red; border: 2px solid red;");
	    }

	    @Then("^I verify bank details$")
	    public void i_verify_bank_details() throws Throwable {
	        System.out.println("I verify bank details");
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("bank_details"))) , "color: red; border: 2px solid red;");
	        
	        Thread.sleep(1000);
	    }
	
	///new
	    @When("^I am on sharekhan login page for account menu$")
	    public void i_am_on_sharekhan_login_page_for_account_menu() throws Throwable {
	        System.out.println("I am on sharekhan login page for account menu");
	    }

	    @Then("^I click on accounts for verifying ipo$")
	    public void i_click_on_accounts_for_verifying_ipo() throws Throwable {
	        System.out.println("I click on accounts for verifying ipo");
	        
	       driver.findElement(By.xpath(OR.getProperty("accounts"))).click();
	        Thread.sleep(2000);
	    }

	    @Then("^I click on bank to IPO menu$")
	    public void i_click_on_bank_to_ipo_menu() throws Throwable {
	        System.out.println("I click on bank to IPO menu");
	        
	        driver.findElement(By.xpath(OR.getProperty("bank_to_ipo"))).click();
	        Thread.sleep(2000);
	    }

	    @Then("^I verify select segment of IPO$")
	    public void i_verify_select_segment_of_ipo() throws Throwable {
	        System.out.println("I verify select segment of IPO");
	        
	        driver.findElement(By.xpath(OR.getProperty("segment")));
	        Select select=new Select(driver.findElement(By.xpath(OR.getProperty("segment"))));
	       
	        WebElement option=select.getFirstSelectedOption();
	       
	        System.out.println("Selected option:" +option.getText());
	        Assert.assertEquals("IPO A/C", option.getText());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("segment"))) , "color: red; border: 2px solid red;");
	    }

	    @Then("^I click on accounts for verifying MF$")
	    public void i_click_on_accounts_for_verifying_MF() throws Throwable {
	        System.out.println("I click on accounts for verifying MF");
	        driver.findElement(By.xpath(OR.getProperty("accounts"))).click();
	        Thread.sleep(2000);
	    }

	    @Then("^I click on bank to MF menu$")
	    public void i_click_on_bank_to_mf_menu() throws Throwable {
	        System.out.println("I click on bank to MF menu");
	        
	        driver.findElement(By.xpath(OR.getProperty("bank_to_mf"))).click();
	        Thread.sleep(2000);
	    }

	    @Then("^I verify select segment of MutualFund$")
	    public void i_verify_select_segment_of_mutualfund() throws Throwable {
	        System.out.println("I verify select segment of MutualFund");
	        
	        driver.findElement(By.xpath(OR.getProperty("segment")));
	        Select select=new Select(driver.findElement(By.xpath(OR.getProperty("segment"))));
	        
	        WebElement option=select.getFirstSelectedOption();
	        System.out.println("Selected option:" +option.getText());
	        Assert.assertEquals("Mutual Fund A/C", option.getText());
	        //select.selectByValue("MF");
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("segment"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	    }

	   
	    ////new all select segment
	    
	    @When("^I click on dropdawn menu of select segment for Cash Transfer$")
	    public void i_click_on_dropdawn_menu_of_select_segment_for_Cash_Transfer() throws Throwable {
	       System.out.println("I click on dropdawn menu of select segment for Cash Transfer");
	       
	       WebElement dropdown = driver.findElement(By.xpath(OR.getProperty("segment"))); 
	       
	       Select select = new Select(dropdown);
	       
	       List<String> expectedSelection=new ArrayList<String>();
	       
	       List<WebElement> segment_list=select.getOptions();
	       
	       System.out.println("Total Segment : "+segment_list.size());
	       
	       for(int i=0;i<segment_list.size();i++)
	       {
	    	   expectedSelection.add(segment_list.get(i).getText());
	    	   
	    	   System.out.println("Segment element "+i+" is: "+expectedSelection.get(i));
	       }
	       
	       Assert.assertEquals(true, expectedSelection.contains("Equity Trading(A/C)"));
	       System.out.println("Results are :");
	       System.out.println("Equity trading found");
	       
	       Assert.assertEquals(true, expectedSelection.contains("IPO A/C"));
	       System.out.println("IPO A/C is found");
	       
	       Assert.assertEquals(true, expectedSelection.contains("Mutual Fund A/C"));
	       System.out.println("Mutual Fund A/C is found");
	       
	       Assert.assertEquals(true, expectedSelection.contains("EMF A/C"));
	       System.out.println("EMF A/C is found");
	    }

	    @Then("^I verify dropdawn has all values for Cash Transfer$")
	    public void i_verify_dropdawn_has_all_valuesfor_Cash_Transfer() throws Throwable {
	       
	    	System.out.println("I verify dropdawn has all values for Cash Transfer");
	    }

	    @Then("^I logout to my account$")
	    public void i_logout_to_my_account() throws Throwable {
	       
	    	System.out.println("I logout to my account");
	    	
	    	Actions act=new Actions(driver);
	        act.moveToElement(driver.findElement(By.xpath(OR.getProperty("profile")))).perform();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath(OR.getProperty("logout"))).click();
	        Thread.sleep(2000);
	        
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(0));
	        Thread.sleep(1000);
	        
	        skw.close_Browser_After_Execution();
	    }

	
}
