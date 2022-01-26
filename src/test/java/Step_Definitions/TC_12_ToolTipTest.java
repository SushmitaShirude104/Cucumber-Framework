package Step_Definitions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import SharekhanCore.Sharekhan_WebConnector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TC_12_ToolTipTest extends Sharekhan_WebConnector{

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	@Given("^I am on Sharekhan login page for Verifying tooltips$")
    public void i_am_on_sharekhan_login_page_for_verifying_tooltips() throws Throwable {
       System.out.println("I am on Sharekhan login page for Verifying tooltips");
       
       skw.open_browser();
       
       report.startTest("TC_12_ToolTipTest");
       
       app_logs.debug("User  verifies TC_12_ToolTipTest");
    }

    @When("^I am click on Login button for Verifying tooltips$")
    public void i_am_click_on_login_button_for_verifying_tooltips() throws Throwable {
       System.out.println("I am click on Login button for Verifying tooltips");
       
       driver.findElement(By.xpath(OR.getProperty("Login_button"))).click();
       
       Thread.sleep(2000);
    }

    @Then("^I navigating to login page for verifying tooltips$")
    public void i_navigating_to_login_page_for_verifying_tooltips() throws Throwable {
       System.out.println("I navigating to login page for verifying tooltips");
                     
       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(1));
       Thread.sleep(5000);
    }

    @Then("^I enter username as \"([^\"]*)\"$")
    public void i_enter_username_as_something(String username) throws Throwable {
    	
    	System.out.println("I enter username as :"+username);
    	
    	driver.findElement(By.name(OR.getProperty("username"))).sendKeys(username);
    	
    	System.out.println("I click on next");
        
        driver.findElement(By.xpath(OR.getProperty("next"))).click();
       
    }

    @Then("^I enter passwor as \"([^\"]*)\"$")
    public void i_enter_passwor_as_something(String pass) throws Throwable {
       
    	System.out.println("I enter passwor as : "+pass);
        
        
        driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys(pass);
    }

    @Then("^I click on login button for verifying tooltips$")
    public void i_click_on_login_button_for_verifying_tooltips() throws Throwable {
       
    	System.out.println("I click on login button for verifying tooltips");
    	
    	report.log(LogStatus.INFO, "Click on login button for verifying tooltips");
    	
    	driver.findElement(By.xpath(OR.getProperty("login"))).click();
    	
    	Thread.sleep(1000);
    }

    @Then("^I verifying all tooltips of all menus$")
    public void i_verifying_all_tooltips_of_all_menus() throws Throwable {
    	
    	System.out.println("I verifying all tooltips of all menus");
    	
    	WebElement tooltipMenu_1=driver.findElement(By.xpath(OR.getProperty("My_portfolio_tooltip")));
    	WebElement tooltipMenu_2=driver.findElement(By.xpath(OR.getProperty("my_watchlist_tooltip")));
    	WebElement tooltipMenu_3=driver.findElement(By.xpath(OR.getProperty("investment_cart_tooltip")));
    	WebElement tooltipMenu_4=driver.findElement(By.xpath(OR.getProperty("alert_tooltip")));
    	
    	String title_1="MyPortfolio";
    	String title_2="MyWatchlist";
    	String title_3="Investment Cart";
    	String title_4="Alert";
    	
    	Actions act=new Actions(driver);
    	
    	try{
    	//my portfolio
    	act.moveToElement(tooltipMenu_1).perform();
    	
    	Thread.sleep(2000);
    	
    	System.out.println("TooTipMenu1 :"+tooltipMenu_1.getAttribute("title"));
    	
    	report.log(LogStatus.INFO, "Verification of tooltip_Menu_1-My watchlist");
    	
    	Assert.assertEquals(title_1, tooltipMenu_1.getAttribute("title"));
    	
    	Thread.sleep(2000);
    	
    	js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",tooltipMenu_1 , "color: red; border: 2px solid red;");
        
        report.log(LogStatus.PASS, "Tooltipmenu_1 Is Verified");
    	}catch(Throwable T)
    	{
    		Assert.fail();
    		
    		report.log(LogStatus.FAIL, "TooltipMenu not verified");
    	}
        //my watchlist
        act.moveToElement(tooltipMenu_2).perform();
    	
    	Thread.sleep(2000);
    	
    	System.out.println("TooTipMenu2 :"+tooltipMenu_2.getAttribute("title"));
    	
    	Assert.assertEquals(title_2, tooltipMenu_2.getAttribute("title"));
    	
    	Thread.sleep(2000);
    	
    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",tooltipMenu_2 , "color: red; border: 2px solid red;");
        
        //investmentcart
    	act.moveToElement(tooltipMenu_2).perform();
    	
    	Thread.sleep(2000);
    	
    	System.out.println("TooTipMenu3 :"+tooltipMenu_3.getAttribute("title"));
    	
    	Assert.assertEquals(title_3, tooltipMenu_3.getAttribute("title"));
    	
    	Thread.sleep(2000);
    	
    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",tooltipMenu_3 , "color: red; border: 2px solid red;");
    	
    	//Aleert
    	act.moveToElement(tooltipMenu_4).perform();
    	
    	Thread.sleep(2000);
    	
    	System.out.println("TooTipMenu4 :"+tooltipMenu_4.getAttribute("title"));
    	
    	Assert.assertEquals(title_4, tooltipMenu_4.getAttribute("title"));
    	
    	Thread.sleep(2000);
    	
    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",tooltipMenu_4 , "color: red; border: 2px solid red;");
    }

    @Then("^I logout to sharekhan account$")
    public void i_logout_to_sharekhan_account() throws Throwable {
       System.out.println("I logout to sharekhan account");
       
       Actions act=new Actions(driver);
       act.moveToElement(driver.findElement(By.xpath(OR.getProperty("profile")))).perform();
       
       Thread.sleep(1000);
       
       driver.findElement(By.xpath(OR.getProperty("logout"))).click();
       Thread.sleep(1000);
       
       driver.findElement(By.xpath(OR.getProperty("yes"))).click();
       
       Thread.sleep(2000);
       
       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(0));
       
       skw.close_Browser_After_Execution();
    }
}
