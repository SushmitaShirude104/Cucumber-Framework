package Step_Definitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SharekhanCore.Sharekhan_WebConnector;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_04_SharekhanLoginTest extends Sharekhan_WebConnector {

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	 @When("^I open Sharekhan Url in browser$")
	    public void i_open_sharekhan_url_in_browser() throws Throwable {
		 
		 skw.open_browser();		 
		 
	     System.out.println("I open Sharekhan Url in browser");
	     app_logs.debug("User  verifies TC_04_SharekhanLoginTest");
	    }

	    @When("^Sharekhan homepage is opened$")
	    public void sharekhan_homepage_is_opened() throws Throwable {
	        System.out.println("Sharekhan homepage is opened");
	    }

	    @Then("^I click on login or trade button$")
	    public void i_click_on_login_or_trade_button() throws Throwable {
	        System.out.println("I click on login or trade button");
	        
	        driver.findElement(By.xpath(OR.getProperty("Login_button"))).click();
	        
	        Thread.sleep(5000);
	        
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        Thread.sleep(5000);
	        
	    }

	    @Then("^I enter Username as \"([^\"]*)\"$")
	    public void i_enter_username_as_something(String user_name) throws Throwable {
	        System.out.println("I enter Username as : "+user_name);
	        
	        
	        driver.findElement(By.name(OR.getProperty("username"))).sendKeys(user_name);
	    }

	    @Then("^I click on next$")
	    public void i_click_on_next() throws Throwable {
	        System.out.println("I click on next");
	        
	        driver.findElement(By.xpath(OR.getProperty("next"))).click();
	    }

	    @Then("^I enter password as \"([^\"]*)\"$")
	    public void i_enter_password_as_something(String pass) throws Throwable {
	        System.out.println("I enter password as :"+pass);
	        
	        driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys(pass);
	    }

	    @Then("^I click on login button$")
	    public void i_click_on_login_button() throws Throwable {
	       System.out.println("I click on login button");
	       
	       driver.findElement(By.xpath(OR.getProperty("login"))).click();
	    }

	    @Then("^I navigate to portfolio page$")
	    public void i_navigate_to_portfolio_page() throws Throwable {
	       System.out.println("I navigate to portfolio page");
	    }

	    @Then("^I verify all button$")
	    public void i_verify_all_button() throws Throwable {
	        System.out.println("I verify all button");
	        
	        js=(JavascriptExecutor)driver;
       	 js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("all"))) , "color: red; border: 2px solid red;");
	    }

	    @Then("^I verify sharekhan car$")
	    public void i_verify_sharekhan_car() throws Throwable {
	        System.out.println("I verify sharekhan car");
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("sharekhan_car"))) , "color: red; border: 2px solid red;");
	    }

	    @Then("^I verify menu bar items$")
	    public void i_verify_menu_bar_items() throws Throwable {
	        System.out.println("I verify menu bar items");
	        
	        List<WebElement> ele=driver.findElements(By.xpath("/html/body/nav-menu/div/div/div/div/nav/ul/li"));
		      System.out.println("no. of menus : "+ele.size());
		        String menu_start="/html/body/nav-menu/div/div/div/div/nav/ul/li[";
		        String menu_end="]";
		        
		        for(int i=1;i<=ele.size();i++)
		        {
		        	WebElement menu1=driver.findElement(By.xpath(menu_start+i+menu_end));
		        	js=(JavascriptExecutor)driver;
		        	 js.executeScript("arguments[0].setAttribute('style', arguments[1]);",menu1 , "color: red; border: 2px solid red;");
		 	        Thread.sleep(2000);
		        }
		        
	    }

	    @Then("^I verify profile$")
	    public void i_verify_profile() throws Throwable {
	        System.out.println("I verify profile");
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("profile"))) , "color: red; border: 2px solid red;");
	    }

	    @Then("^I verify trading button$")
	    public void i_verify_trading_button() throws Throwable {
	        System.out.println("I verify trading button");
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("trading_menu"))) , "color: red; border: 2px solid red;");
	    }

	    @Then("^I verify add funds button$")
	    public void i_verify_add_funds_button() throws Throwable {
	        System.out.println("I verify add funds button");
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("add_funds"))) , "color: red; border: 2px solid red;");
	    }

	    @Then("^I click on derivatives button$")
	    public void i_click_on_derivatives_button() throws Throwable {
	        System.out.println("I click on derivatives button");
	        
	        driver.findElement(By.xpath(OR.getProperty("drivatives_menu"))).click();
	        Thread.sleep(2000);
	    }

	    @Then("^I verify pie diagram$")
	    public void i_verify_pie_diagram() throws Throwable {
	        System.out.println("I verify pie diagram");
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("pie_diagram"))) , "color: red; border: 2px solid red;");
	    }

	    @Then("^I verify no stocks$")
	    public void i_verify_no_stocks() throws Throwable {
	        System.out.println("I verify no stocks");
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("no_stocks"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	    }

	    @Then("^I click on profile button$")
	    public void i_click_on_profile_button() throws Throwable {
	        System.out.println("I click on profile button");
	        
	        Actions act=new Actions(driver);
	        act.moveToElement(driver.findElement(By.xpath(OR.getProperty("profile")))).perform();
	        
	        Thread.sleep(1000);
	    }

	    @Then("^I click on logout button$")
	    public void i_click_on_logout_button() throws Throwable {
	        System.out.println("I click on logout button");
	        driver.findElement(By.xpath(OR.getProperty("logout"))).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("yes"))).click();
	        Thread.sleep(1000);
	    }

	    @Then("^I succefully logged out to the sharekhan account$")
	    public void i_succefully_logged_out_to_the_sharekhan_account() throws Throwable {
	        System.out.println("I succefully logged out to the sharekhan account");
	        
	        driver.quit();
	    }
}
