package Step_Definitions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import SharekhanCore.Sharekhan_WebConnector;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TC_06_MarketWatchTest extends Sharekhan_WebConnector{

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	static String company_name1="TATACOMM";
	static String company_name2="INFY";
	
	@Given("^I open browser and enter Sharekhan URL$")
    public void i_open_browser_and_enter_sharekhan_url() throws Throwable {
        System.out.println("I open browser and enter Sharekhan URL");        

        
        
        app_logs.debug("User  verifies TC_06_MarketWatchTest");
        
		 skw.open_browser();
		 
		 report.startTest("TC_06_MarketWatchTest");
	        System.out.println("I am on sharekhan login page");
	        
	        driver.findElement(By.xpath(OR.getProperty("Login_button"))).click();
	        Thread.sleep(2000);
	        
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        Thread.sleep(5000);
    }

    @When("^Shrekhan home page is opened$")
    public void shrekhan_home_page_is_opened() throws Throwable {
        System.out.println("Shrekhan home page is opened");
    }

    @Then("^I login into my account by entering below details$")
    public void i_login_into_my_account_by_entering_below_details(DataTable data) throws Throwable {
        System.out.println("I login into my account by entering below details");
        
        List<List<String>> obj=data.raw();
        System.out.println("user enters username as :"+obj.get(0).get(0));
        driver.findElement(By.name(OR.getProperty("username"))).sendKeys(obj.get(1).get(0));
        driver.findElement(By.xpath(OR.getProperty("next"))).click();
        System.out.println("user enters password as :"+obj.get(1).get(1));
        driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys(obj.get(1).get(1));
        
        driver.findElement(By.xpath(OR.getProperty("login"))).click();
        
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
    }

    @Then("^I navigate to sharekhan portfolio window$")
    public void i_navigate_to_sharekhan_portfolio_window() throws Throwable {
        System.out.println("I navigate to sharekhan portfolio window");
    }

    @Then("^My profile page is opened$")
    public void my_profile_page_is_opened() throws Throwable {
        System.out.println("My profile page is opened");
    }

    @Then("^I click on market watch menu$")
    public void i_click_on_market_watch_menu() throws Throwable {
        System.out.println("I click on market watch menu");
        
        WebElement watch=driver.findElement(By.xpath(OR.getProperty("market_wath")));        
        
        Thread.sleep(2000);
        
        watch.click();
        
        Thread.sleep(2000);
    }

    @Then("^I verify all menus of market watch menu bar$")
    public void i_verify_all_menus_of_market_watch_menu_bar() throws Throwable {
       System.out.println("I verify all menus of market watch menu bar");
       
       report.log(LogStatus.INFO, "I verify all menus of market watch menu bar");
       
       app_logs.debug("I verify all menus of market watch menu bar");
       
       List<WebElement> watch_1=driver.findElements(By.xpath(OR.getProperty("market_watch_menu")));
	      System.out.println("no. of menus : "+watch_1.size());
	        String menu_start="/html/body/nav-menu/div/div/ul/li[";
	        String menu_end="]";
	        
	        for(int i=1;i<=watch_1.size();i++)
	        {
	        	WebElement menu1=driver.findElement(By.xpath(menu_start+i+menu_end));
	        	System.out.println("Text of menu :"+menu1.getText());
	        	js=(JavascriptExecutor)driver;
	        	 js.executeScript("arguments[0].setAttribute('style', arguments[1]);",menu1 , "color: red; border: 2px solid red;");
	 	        Thread.sleep(1000);
	        }
    }

    @Then("^I verify my watchlist is underlined or  not$")
    public void i_verify_my_watchlist_is_underlined_or_not() throws Throwable {
        System.out.println("I verify my watchlist is underlined or  not");
        
        report.log(LogStatus.INFO, "I verify my watchlist is underlined or  not");
        
        app_logs.debug("I verify my watchlist is underlined or  not");
        
        try{        
        WebElement x=driver.findElement(By.xpath(OR.getProperty("My_watchlist")));
        String actual_class_value=x.getAttribute("class");
        String expected_class_value="ng-scope subActive";
        
        System.out.println("value:"+actual_class_value);
        Assert.assertEquals(actual_class_value,expected_class_value);
        report.log(LogStatus.PASS, "I verify my watchlist is underlined or  not");
        }catch(Throwable t)
        {
        	Assert.fail();
        	report.log(LogStatus.FAIL, "I do not verify my watchlist is underlined or  not");
        }
        
    }

    @Then("^I verify create watchlist menu$")
    public void i_verify_create_watchlist_menu() throws Throwable {
        System.out.println("I verify create watchlist menu");
        
        app_logs.debug("I verify create watchlist menu");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("create_watch"))) , "color: red; border: 2px solid red;");
        Thread.sleep(2000);
        
    }

    @Then("^I verify add multiples menu is disabled$")
    public void i_verify_add_multiples_menu_is_disabled() throws Throwable {
        System.out.println("I verify add multiples menu is disabled");
        
        report.log(LogStatus.INFO, "I verify add multiples menu is disabled");
        
        app_logs.debug("I verify add multiples menu is disabled");
        
        try{
        String actual_attri_value1=driver.findElement(By.xpath(OR.getProperty("add_multiples"))).getAttribute("disabled");
        Boolean expected_attri_value1=true;
        System.out.println("Actual attribute value :"+actual_attri_value1);
        //System.out.println(driver.findElement(By.xpath(OR.getProperty("add_multiples"))).getAttribute("disabled"));
        Assert.assertEquals("true", actual_attri_value1);
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("add_multiples"))) , "color: red; border: 2px solid red;");
        Thread.sleep(2000);
        report.log(LogStatus.PASS, "I verify add multiples menu is disabled");
        }catch(Throwable t)
        {
        	Assert.fail();
        	
        	report.log(LogStatus.FAIL, "I do not verify add multiples menu is disabled");
        }
        
    }

    @Then("^I verify heat map menu$")
    public void i_verify_heat_map_menu() throws Throwable {
        System.out.println("I verify heat map menu");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("heat_map"))) , "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^I verify option chain menu is disabled$")
    public void i_verify_option_chain_menu_is_disabled() throws Throwable {
        System.out.println("I verify option chain menu is disabled");
        
        String actual_attri_value=driver.findElement(By.xpath(OR.getProperty("option_chain"))).getAttribute("disabled");
        //String expected_attri_value="disabled";
        
        Assert.assertEquals("true", actual_attri_value);
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("option_chain"))) , "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^I verify columnchooser menu$")
    public void i_verify_columnchooser_menu() throws Throwable {
        System.out.println("I verify columnchooser menu");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("chooser"))) , "color: red; border: 2px solid red;");
        Thread.sleep(2000);
    }

    @Then("^I click on create watchlist menu$")
    public void I_click_on_create_watchlist_menu() throws Throwable {
    
    	System.out.println("I click on create watchlist menu");
    	
    	driver.findElement(By.xpath(OR.getProperty("create_watch"))).click();
    	
    	Thread.sleep(1000);
    }
    
    @Then("^I create watchlist$")
    public void i_create_watchlist() throws Throwable {
    	
    	System.out.println("I create watchlist");
    	
    	//create watchlist
    	driver.findElement(By.xpath(OR.getProperty("watchlist_name"))).sendKeys("Watchlist");
    	
    	Thread.sleep(1000);
    	
    	System.out.println("I click on ok button for watchlist button");
    	
    	driver.findElement(By.xpath(OR.getProperty("watchlist_name_ok"))).click();
    	
    	Thread.sleep(1000);
    	
    	System.out.println("Template msg is : "+driver.findElement(By.xpath(OR.getProperty("template_created"))).getText());
    	
    	Assert.assertEquals("Template has been successfully created.", driver.findElement(By.xpath(OR.getProperty("template_created"))).getText());
    	
    	Thread.sleep(1000);
    	
    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("template_created"))) , "color: red; border: 2px solid red;");
    	
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath(OR.getProperty("close_create"))).click();
    	
    	Thread.sleep(1000);
    	
    	//Template has been successfully created.
    	//Watchlist Verification
    	Select select=new Select(driver.findElement(By.xpath(OR.getProperty("watchlist_dropdawn"))));
        select.selectByValue("WATCHLIST");
        Thread.sleep(1000);
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("watchlist_dropdawn"))) , "color: red; border: 2px solid red;");
        
        Thread.sleep(1000);
        
        String actual_attri_value=driver.findElement(By.xpath(OR.getProperty("add_watchlist_button"))).getAttribute("disabled");
        //String expected_attri_value="disabled";
        
        Assert.assertEquals("true", actual_attri_value);
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("add_watchlist_button"))) , "color: red; border: 2px solid red;");
        Thread.sleep(2000);
        
        //Adding company_1 in market watchlist
        driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[2]/md-input/span/input")).sendKeys("TA");
        
        List<WebElement> scrips_li=driver.findElements(By.xpath(OR.getProperty("enter_scrip_name")));
        System.out.println("total no of scrips : "+scrips_li.size());
        
        String scripe_start="/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[2]/md-input/ul/li[";
        String scrip_end="]/a/div/span[1]";
        
        for(int j=1;j<=scrips_li.size();j++)
        {
        	WebElement scrip_name=driver.findElement(By.xpath(scripe_start+j+scrip_end));
        	
        	if(scrip_name.getText().equalsIgnoreCase(company_name1))
        	{
        		scrip_name.click();
        		break;
        	}
        	
        }
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath(OR.getProperty("add_watchlist_button"))).click();
        
        Thread.sleep(3000);
        
        List<WebElement> added_scrips_li=driver.findElements(By.xpath(OR.getProperty("added_scrip_table")));
        System.out.println("Number of added scrips :"+added_scrips_li.size());
        
        Thread.sleep(3000);
        
        String added_scrips_strt="/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[3]/div/table/tbody/tr[";
        String added_scrips_end="]/td[2]/span/span";
        boolean company_1_found=false;
        
        for(int k=2;k<=added_scrips_li.size();k++)
        {
        	WebElement added_scrip=driver.findElement(By.xpath(added_scrips_strt+k+added_scrips_end));
        	
        	if(added_scrip.getText().equalsIgnoreCase(company_name1))
        	{
        		System.out.println("Added scrip is :"+added_scrip.getText());
        		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",added_scrip , "color: red; border: 2px solid red;");
        		company_1_found=true;
        	}
        }
        
        
        Thread.sleep(2000);  
        
        Assert.assertEquals(true, company_1_found);
        
        System.out.println("First company found");
        
      //Adding company_2 in market watchlist
        
        System.out.println("Agin enter the second scrip");
        
      
        driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[2]/md-input/span/input")).sendKeys(company_name2);
        
        List<WebElement> scrips1_li=driver.findElements(By.xpath(OR.getProperty("enter_scrip_name")));
        System.out.println("total no of scrips : "+scrips1_li.size());
        
        /*String scripe_start="/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[2]/md-input/ul/li[";
        String scrip_end="]/a/div/span[1]";*/
        
        for(int j=1;j<=scrips1_li.size();j++)
        {
        	WebElement scrip2_name=driver.findElement(By.xpath(scripe_start+j+scrip_end));
        	
        	if(scrip2_name.getText().equalsIgnoreCase(company_name2))
        	{
        		scrip2_name.click();
        		break;
        	}
        	
        }
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath(OR.getProperty("add_watchlist_button"))).click();
        
        Thread.sleep(3000);
        
        List<WebElement> added_scrips2_li=driver.findElements(By.xpath(OR.getProperty("added_scrip_table")));
        System.out.println("Number of added scrips :"+added_scrips_li.size());
        
        Thread.sleep(3000);
        
        /*String added_scrips_strt="/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[3]/div/table/tbody/tr[";
        String added_scrips_end="]/td[2]/span/span";*/
        boolean company_2_found=false;
        
        for(int k=2;k<=added_scrips2_li.size();k++)
        {
        	WebElement added_scrip=driver.findElement(By.xpath(added_scrips_strt+k+added_scrips_end));
        	
        	if(added_scrip.getText().equalsIgnoreCase(company_name2))
        	{
        		System.out.println("Added scrip is :"+added_scrip.getText());
        		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",added_scrip , "color: red; border: 2px solid red;");
        		company_2_found=true;
        	}
        }
        
        Thread.sleep(2000);
        
        Assert.assertEquals(true, company_2_found);
        
        System.out.println("Second company found");
        
        //Delete script
        
        String deleted_script=driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[3]/div/table/tbody/tr[2]/td[2]/span/span")).getText();
        
        System.out.println("Script deleted code");
        
        driver.findElement(By.xpath(OR.getProperty("marketwatch_script_delete"))).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath(OR.getProperty("marketwatch_deleteScript_button"))).click();
        
        Thread.sleep(2000);
        
        System.out.println("Deleted scrp title is :"+driver.findElement(By.xpath(OR.getProperty("mw_delete_script_message"))).getText());
        Assert.assertEquals(true, driver.findElement(By.xpath(OR.getProperty("mw_delete_script_message"))).getText().contains("Are you sure you want to Delete"));
        Thread.sleep(2000);
        
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("mw_delete_script_message"))) , "color: red; border: 2px solid red;");
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR.getProperty("mw_delete_scriptfromMW_button"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR.getProperty("mw_delete_script_button"))).click();
        Thread.sleep(2000);
        
        List<WebElement> added_scrips3_li=driver.findElements(By.xpath(OR.getProperty("added_scrip_table")));
        System.out.println("Number of added scrips :"+added_scrips3_li.size());
        
        Thread.sleep(3000);
        
        /*String added_scrips_strt="/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[3]/div/table/tbody/tr[";
        String added_scrips_end="]/td[2]/span/span";*/
        boolean deleted_company_found=false;
        
        for(int k=2;k<=added_scrips3_li.size();k++)
        {
        	WebElement added_scrip=driver.findElement(By.xpath(added_scrips_strt+k+added_scrips_end));
        	
        	if(added_scrip.getText().equalsIgnoreCase(deleted_script))
        	{
        		System.out.println("Added scrip is :"+added_scrip.getText());
        		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",added_scrip , "color: red; border: 2px solid red;");
        		deleted_company_found=true;
        	}
        }
        
        Thread.sleep(2000);
        
        Assert.assertEquals(false, deleted_company_found);
        
        System.out.println("deleted company not found");
        
        //rename Watchlist
        
        //Select select1=new Select(driver.findElement(By.xpath(OR.getProperty("watchlist_dropdawn"))));
        select.selectByValue("WATCHLIST");
        Thread.sleep(2000);
        String selected_watchlist=driver.findElement(By.xpath(OR.getProperty("watchlist_dropdawn"))).getText();
        System.out.println("select list is :"+driver.findElement(By.xpath(OR.getProperty("watchlist_dropdawn"))).getText());
        if(selected_watchlist.trim().equalsIgnoreCase("watchlist"))
        {
        	driver.findElement(By.xpath(OR.getProperty("settings"))).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath(OR.getProperty("rename_watchlist"))).click();
        	Thread.sleep(2000);
        	driver.findElement(By.xpath(OR.getProperty("enter_watchlist"))).sendKeys("WatchNew");
        	Thread.sleep(4000);
        	driver.findElement(By.xpath(OR.getProperty("watchlist_ok_button"))).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath(OR.getProperty("close_rename"))).click();
        	Thread.sleep(3000);
        }
        
        
    }
    
        
    @Then("^I logout the account$")
    public void i_logout_the_account() throws Throwable {
        System.out.println("I logout the account");
        
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(OR.getProperty("profile")))).perform();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath(OR.getProperty("logout"))).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath(OR.getProperty("yes"))).click();
        Thread.sleep(1000);
        
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        
        skw.close_Browser_After_Execution();
        
        driver.quit();
    }
}
