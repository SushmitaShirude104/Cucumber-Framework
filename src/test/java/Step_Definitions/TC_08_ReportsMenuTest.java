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

public class TC_08_ReportsMenuTest extends Sharekhan_WebConnector {

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	 @Given("^I open the browser and enter the sharekhan URL$")
	    public void i_open_the_browser_and_enter_the_sharekhan_url() throws Throwable {
	        System.out.println("I open the browser and enter the sharekhan URL");
	        
	        report.startTest("TC_08_ReportsMenuTest");
	        
	        app_logs.debug("User  verifies TC_08_ReportsMenuTest");
	        
	        skw.open_browser();
	    }

	    @When("^I am on Sharekhan Homepage$")
	    public void i_am_on_sharekhan_homepage() throws Throwable {
	        System.out.println("I am on Sharekhan Homepage");
	    }

	    @Then("^I am go to login button and click on it$")
	    public void i_am_go_to_login_button_and_click_on_it() throws Throwable {
	        System.out.println("I am go to login button and click on it");
	        
	        driver.findElement(By.xpath(OR.getProperty("Login_button"))).click();
	        
	        Thread.sleep(2000);
	    }

	    @Then("^New tab is opend for login$")
	    public void new_tab_is_opend_for_login() throws Throwable {
	        System.out.println("New tab is opend for login");
	        
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        Thread.sleep(2000);
	    }

	    @Then("^I login to the account by entering my login details$")
	    public void i_login_to_the_account_by_entering_my_login_details() throws Throwable {
	        System.out.println("I login to the account by entering my login details");
	        
	        driver.findElement(By.name(OR.getProperty("username"))).sendKeys("SUSMITAM96");
	        driver.findElement(By.xpath(OR.getProperty("next"))).click();
	        driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("Jas@1041996P");
	        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
	        
	        driver.findElement(By.xpath(OR.getProperty("login"))).click();
	        
	        Thread.sleep(5000);
	    }

	    @Then("^I come on my sharekhan profile window$")
	    public void i_come_on_my_sharekhan_profile_window() throws Throwable {
	        System.out.println("I come on my sharekhan profile window");
	    }

	    @Then("^I click on Reports menu$")
	    public void i_click_on_reports_menu() throws Throwable {
	        System.out.println("I click on Reports menu");
	        
	        report.log(LogStatus.INFO, "I click on Reports menu");
	        
	        app_logs.debug("I click on Reports menu");
	        
	        driver.findElement(By.xpath(OR.getProperty("reports"))).click();
	        
	        Thread.sleep(5000);
	    }

	    @Then("^I verify all menus of reports menu$")
	    public void i_verify_all_menus_of_reports_menu() throws Throwable {
	        System.out.println("I verify all menus of reports menu");
	        
	        report.log(LogStatus.INFO, "I verify all menus of reports menu");
	        
	        app_logs.debug("I verify all menus of reports menu");
	        
	        List<WebElement> report=driver.findElements(By.xpath(OR.getProperty("reprts_all_menu")));
		      System.out.println("no. of menus : "+report.size());
		        String menu_start="/html/body/nav-menu/div/div/ul/li[";
		        String menu_end="]";
		        
		        for(int i=1;i<=report.size();i++)
		        {
		        	WebElement menu1=driver.findElement(By.xpath(menu_start+i+menu_end));
		        	System.out.println("Text of menu :"+menu1.getText());
		        	js=(JavascriptExecutor)driver;
		        	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",menu1 , "color: red; border: 2px solid red;");
		 	        Thread.sleep(1000);
		        }

	    }

	    @Then("^I click on quick view menu$")
	    public void i_click_on_quick_view_menu() throws Throwable {
	        System.out.println("I click on quick view menu");
	        
	        driver.findElement(By.xpath(OR.getProperty("quick_view"))).click();
	        
	        Thread.sleep(2000);
	    }

	    @Then("^I verify quick view menu has underlined or not$")
	    public void i_verify_quick_view_menu_has_underlined_or_not() throws Throwable {
	        System.out.println("I verify quick view menu has underlined or not");
	        
	        report.log(LogStatus.INFO, "I verify quick view menu has underlined or not");
	        
	        app_logs.debug("I verify quick view menu has underlined or not");
	        
	        WebElement x=driver.findElement(By.xpath(OR.getProperty("quick_view")));
	        String actual_class_value=x.getAttribute("class");
	        String expected_class_value="ng-scope subActive";
	        
	        try{
	        System.out.println("value:"+actual_class_value);
	        Assert.assertEquals(actual_class_value,expected_class_value);
	        report.log(LogStatus.PASS, "I verify quick view menu has underlined or not");
	        }catch(Throwable T)
	        {
	        	Assert.fail();
	        	
	        	report.log(LogStatus.FAIL, "I do not verify quick view menu has underlined or not");
	        }
	    }

	    @Then("^I verify all menus of quick view$")
	    public void i_verify_all_menus_of_quick_view() throws Throwable {
	        System.out.println("I verify all menus of quick view");
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("equity_reports"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("equity_box"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("derivatives_reports"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("derivatives_box"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("currency_reports"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("currency_box"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("commodity_reports"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("commodity_box"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("mutual_fund_rports"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("mutual_fund_box"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("portfolio_report"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("portfolio_box"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("transaction_report"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("transaction_box"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        
	    }

	    @Then("^I logout to my profile$")
	    public void i_logout_to_my_profile() throws Throwable {
	        System.out.println("I logout to my profile");
	        
	        Actions act=new Actions(driver);
	        act.moveToElement(driver.findElement(By.xpath(OR.getProperty("profile")))).perform();
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath(OR.getProperty("logout"))).click();
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath(OR.getProperty("yes"))).click();
	        Thread.sleep(1000);
	        
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(0));
	        
	        skw.close_Browser_After_Execution();
	        
	        driver.quit();
	    }
}
