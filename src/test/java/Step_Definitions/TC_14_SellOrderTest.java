package Step_Definitions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import SharekhanCore.Sharekhan_WebConnector;
import SharekhanUtil.sharekhan_testUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_14_SellOrderTest extends Sharekhan_WebConnector {

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	static String company_name="HCL-INSYS";
	
	@Given("^I want to login into sharekhan account for placing a sell order$")
    public void i_want_to_login_into_sharekhan_account_for_placing_a_sell_order() throws Throwable {
       System.out.println("I want to login into sharekhan account for placing a sell order");
       
       skw.open_browser();
       
       report.startTest("TC_14_SellOrderTest");
       
       report.log(LogStatus.INFO, "navigate to url");
       
       //LogStatus.INFO, "navigate to google.com"
       
       app_logs.debug("User  verifies TC_14_SellOrderTest");
       
       System.out.println("I am on sharekhan login page");
       
       driver.findElement(By.xpath(OR.getProperty("Login_button"))).click();
       Thread.sleep(2000);
       
       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(1));
       Thread.sleep(5000);
       
       System.out.println("I login into my account by entering below details");
       
       driver.findElement(By.name(OR.getProperty("username"))).sendKeys("SUSMITAM96");
       driver.findElement(By.xpath(OR.getProperty("next"))).click();
       
       driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("Jas@1041996P");
       
       driver.findElement(By.xpath(OR.getProperty("login"))).click();
       
       driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
       
       sharekhan_testUtil.captureScreenshot("i_want_to_login_into_sharekhan_account_for_placing_a_sell_order");
    }

    @When("^I am on homepage of sharekhan account for placing sell order$")
    public void i_am_on_homepage_of_sharekhan_account_for_placing_sell_order() throws Throwable {
       System.out.println("I am on homepage of sharekhan account for placing sell order");
    }

    @Then("^I click on trade now menu for placing sell order$")
    public void i_click_on_trade_now_menu_for_placing_sell_order() throws Throwable {
       System.out.println("I click on trade now menu for placing sell order");
       
       System.out.println("I click on trade now menu for placing buy order");
       
       report.log(LogStatus.INFO, "Click on trade menu");
       
   		driver.findElement(By.xpath(OR.getProperty("now_trade"))).click();
   		
   		sharekhan_testUtil.captureScreenshot("i_click_on_trade_now_menu_for_placing_sell_order");
    }

    @Then("^I click on enter scrip for placing sell order$")
    public void i_click_on_enter_scrip_for_placing_sell_order() throws Throwable {
       System.out.println("I click on enter scrip for placing sell order");
       
       report.log(LogStatus.INFO, "Click on enter scrip");
       
       driver.findElement(By.xpath(OR.getProperty("scrip"))).sendKeys("HC");;
       
       Thread.sleep(1000);
       
       report.log(LogStatus.PASS, "Clicked on enter scrip");
       
       sharekhan_testUtil.captureScreenshot("i_click_on_enter_scrip_for_placing_sell_order");
    }

    @Then("^I select sell option$")
    public void i_select_sell_option() throws Throwable {
    	System.out.println("I select sell option");
    	

	       WebElement dropdown_buy = driver.findElement(By.xpath(OR.getProperty("buy"))); 
	       
	       Select select = new Select(dropdown_buy);
	       
	       select.selectByValue("S");
	       
	       Thread.sleep(2000);
       
    }

    @Then("^I enter Quantity for placing sell order$")
    public void i_enter_quantity_for_placing_sell_order() throws Throwable {
       System.out.println("I enter Quantity for placing sell order");
       
       report.log(LogStatus.INFO, "Enter Quantity for placing sell order");
       
       driver.findElement(By.xpath(OR.getProperty("quantity"))).clear();
       driver.findElement(By.xpath(OR.getProperty("quantity"))).sendKeys("1");
       
       report.log(LogStatus.PASS, "I have enter Quantity");
       
       Thread.sleep(2000);
    }

    @Then("^I click on place order button for placing sell order$")
    public void i_click_on_place_order_button_for_placing_sell_order() throws Throwable {
       System.out.println("I click on place order button for placing sell order");
       
       report.log(LogStatus.INFO, "I click on place order button");
       
       driver.findElement(By.xpath(OR.getProperty("place_order"))).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div/trading-password/div/div[1]/form[1]/md-input/span[1]/input")).sendKeys("Jas@1041996t");
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div/trading-password/div/div[1]/form[1]/button")).click();
       Thread.sleep(2000);
    }

    @Then("^I verify confirm order button for placing sell order$")
    public void i_verify_confirm_order_button_for_placing_sell_order() throws Throwable {
       System.out.println("I verify confirm order button for placing sell order");
       
       System.out.println("I logout to my account");
   	
   	Actions act=new Actions(driver);
       act.moveToElement(driver.findElement(By.xpath(OR.getProperty("profile")))).perform();
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath(OR.getProperty("logout"))).click();
       Thread.sleep(1000);
       
       driver.findElement(By.xpath(OR.getProperty("yes"))).click();
       
       Thread.sleep(2000);
       
       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(0));
       driver.switchTo().window(tabs.get(0));
       skw.close_Browser_After_Execution();
    }

    @And("^I enter Scrip name for placing sell order$")
    public void i_enter_scrip_name_for_placing_sell_order() throws Throwable {
       System.out.println("I enter Scrip name for placing sell order");
       
       List<WebElement> buy_sccrip=driver.findElements(By.xpath("/html/body/ul/li"));
       System.out.println("No of scrips are :"+buy_sccrip.size());
       
       String scrip_start="/html/body/ul/li[";
       String scrip_end="]/a/div/span[1]";
       System.out.println("Company found process");
       for(int i=1;i<=buy_sccrip.size();i++)
       {
    	   WebElement scrip=driver.findElement(By.xpath(scrip_start+i+scrip_end));
    	   if(scrip.getText().equalsIgnoreCase(company_name))
    	   {
    		   System.out.println("company name is :"+scrip.getText());
    		   scrip.click();
    		   break;
    	   }
       }     
       
    }
}
