package Step_Definitions;

import java.util.ArrayList;
import java.util.List;
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

public class TC_11_MyPortFolioTest extends Sharekhan_WebConnector{

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	 @Given("^I am on Sharekhan login page for Verifying My Potrtfolio Menu$")
	    public void i_am_on_sharekhan_login_page_for_verifying_my_potrtfolio_menu() throws Throwable {
	        
		 System.out.println("I am on Sharekhan login page for Verifying My Potrtfolio Menu");
		 
		 report.startTest("TC_11_MyPortFolioTest");
		 
		 app_logs.debug("User  verifies TC_11_MyPortFolioTest");
		 
		 skw.open_browser();
		 
	    }

	    @When("^I am click on Login button for Verifying My Potrtfolio Menu$")
	    public void i_am_click_on_login_button_for_verifying_my_potrtfolio_menu() throws Throwable {
	        System.out.println("I am click on Login button for Verifying My Potrtfolio Menu");
	        
	        driver.findElement(By.xpath(OR.getProperty("Login_button"))).click();
	        
	        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
	        
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        Thread.sleep(5000);
	    }

	    @Then("^I navigato to portfolio window for login$")
	    public void i_navigato_to_portfolio_window_for_login() throws Throwable {
	        System.out.println("I navigato to portfolio window for login");
	        
	        driver.findElement(By.name(OR.getProperty("username"))).sendKeys("SUSMITAM96");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("next"))).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("Jas@1041996P");
	        Thread.sleep(1000);
	        
	    }

	    @Then("^I click on login button for Verifying My Potrtfolio Menu$")
	    public void i_click_on_login_button_for_verifying_my_potrtfolio_menu() throws Throwable {
	        System.out.println("I click on login button for Verifying My Potrtfolio Menu");
	        app_logs.debug("I click on login button for Verifying My Potrtfolio Menu");
	        
	        report.log(LogStatus.INFO, "I click on login button for Verifying My Potrtfolio Menu");
	        driver.findElement(By.xpath(OR.getProperty("login"))).click();
	        Thread.sleep(1000);
	    }

	    @Then("^I click on My portfolio menu$")
	    public void i_click_on_my_portfolio_menu() throws Throwable {
	        System.out.println("I click on My portfolio menu");
	        
	        driver.findElement(By.xpath(OR.getProperty("my_Portfolio_menu"))).click();
	        Thread.sleep(1000);
	    }

	    @Then("^I verify My Portfolio title$")
	    public void i_verify_my_portfolio_title() throws Throwable {
	        System.out.println("I verify My Portfolio title");
	    		
	        app_logs.debug("I verify My Portfolio title");
	        
	        try{
	        	
	        report.log(LogStatus.INFO, "I verify My portfolio Title");
	       
	    	WebElement text_portfolio=driver.findElement(By.xpath(OR.getProperty("my_portfolio_text")));
	    	    	
	    	System.out.println("text is : "+text_portfolio.getText());
	    	Assert.assertEquals(true,text_portfolio.getText().contains("MY PORTFOLIO"));
	    	Thread.sleep(2000);
	    	
	    	js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",text_portfolio , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        report.log(LogStatus.PASS, "I verify portfolio title");
	        }catch(Throwable t)
	        {
	        	Assert.fail();
	        	
	        	report.log(LogStatus.FAIL, "I do not verified portfolio title");
	        }
	    }

	    @Then("^I verify all menus in My portfolio menu$")
	    public void i_verify_all_menus_in_my_portfolio_menu() throws Throwable {
	    	
	    	System.out.println("I verify all menus in My portfolio menu");
	    	
	    	app_logs.debug("I verify all menus in My portfolio menu");
	    	
	    	List<WebElement> all_menus=driver.findElements(By.xpath(OR.getProperty("my_portfolio_allMenus")));
	        System.out.println("Total number of menus in My Portfolio Menus : "+all_menus.size());
	        
	        String menu_start="/html/body/div[1]/div/div/equity-mf-portfolio/div/div/div[2]/div[1]/ul/li[";
	        String menu_end="]";
	        
	        for(int i=1;i<=all_menus.size();i++)
	        {
	        	WebElement menu=driver.findElement(By.xpath(menu_start+i+menu_end));
	        	
	        	System.out.println("Menu is :"+menu.getText());
	        	
	        	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",menu , "color: red; border: 2px solid red;");
	        }
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath(OR.getProperty("close_MyPortfolio"))).click();
	        
	        Thread.sleep(2000);
	    }

	    @Then("^I click on logout button for new test$")
	    public void i_click_on_logout_button_for_new_test() throws Throwable {
	     System.out.println("I click on logout button for new test");
	     
	     	 Actions act=new Actions(driver);
	        act.moveToElement(driver.findElement(By.xpath(OR.getProperty("profile")))).perform();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath(OR.getProperty("logout"))).click();
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath(OR.getProperty("yes"))).click();
	        
	        Thread.sleep(2000);
	        
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(0));
	        
	        skw.close_Browser_After_Execution();
	    }
}
