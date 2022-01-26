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
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TC_07_TradeNowTest extends Sharekhan_WebConnector {
 
	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	
	@Given("^I enter the sharekhan URL after opening the browser$")
    public void i_enter_the_sharekhan_url_after_opening_the_browser() throws Throwable {
        System.out.println("I enter the sharekhan URL after opening the browser");
        
        report.startTest("TC_07_TradeNowTest");
        
        app_logs.debug("User  verifies TC_07_TradeNowTest");
        skw.open_browser();
    }

    @When("^Sharekhan Homepage is opened$")
    public void sharekhan_homepage_is_opened() throws Throwable {
        System.out.println("Sharekhan Homepage is opened");
    }

    @Then("^I click login button to login into my account$")
    public void i_click_login_button_to_login_into_my_account() throws Throwable {
        System.out.println("I click login button to login into my account");
        
        driver.findElement(By.xpath(OR.getProperty("Login_button"))).click();
        
        Thread.sleep(2000);
    }

    @Then("^new portfolio window is opened$")
    public void new_portfolio_window_is_opened() throws Throwable {
        System.out.println("new portfolio window is opened");
        
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
    }

    @Then("^I entering my details for login$")
    public void i_entering_my_details_for_login() throws Throwable {
        System.out.println("I entering my details for login");
                        
        driver.findElement(By.name(OR.getProperty("username"))).sendKeys("SUSMITAM96");
        driver.findElement(By.xpath(OR.getProperty("next"))).click();
        driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("Jas@1041996P");
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
    }

    @Then("^I click on login tab$")
    public void i_click_on_login_tab() throws Throwable {
        System.out.println("I click on login tab");
        
        driver.findElement(By.xpath(OR.getProperty("login"))).click();
        
        Thread.sleep(5000);
    }

    @Then("^My sharekhan profile page is opened$")
    public void my_sharekhan_profile_page_is_opened() throws Throwable {
        System.out.println("My sharekhan profile page is opened");
    }

    @Then("^I click on Tradenow button$")
    public void i_click_on_tradenow_button() throws Throwable {
        System.out.println("I click on Tradenow button");
        
        driver.findElement(By.xpath(OR.getProperty("now_trade"))).click();
        
        Thread.sleep(5000);
    }

    @Then("^I verify all menus of trade now$")
    public void i_verify_all_menus_of_trade_now() throws Throwable {
        System.out.println("I verify all menus of trade now");
        List<WebElement> trade=driver.findElements(By.xpath(OR.getProperty("trade_now_all_menu")));
	      System.out.println("no. of menus : "+trade.size());
	        String menu_start="/html/body/nav-menu/div/div/ul/li[";
	        String menu_end="]";
	        
	        for(int i=1;i<=trade.size();i++)
	        {
	        	WebElement menu1=driver.findElement(By.xpath(menu_start+i+menu_end));
	        	System.out.println("Text of menu :"+menu1.getText());
	        	js=(JavascriptExecutor)driver;
	        	 js.executeScript("arguments[0].setAttribute('style', arguments[1]);",menu1 , "color: red; border: 2px solid red;");
	 	        Thread.sleep(1000);
	        }
    }

    @Then("^I click on Normal order menu$")
    public void i_click_on_normal_order_menu() throws Throwable {
        System.out.println("I click on Normal order menu");
        
        driver.findElement(By.xpath(OR.getProperty("normal_order"))).click();
        
        Thread.sleep(1000);
    }

    @Then("^I verify enter script Name$")
    public void i_verify_enter_script_name() throws Throwable {
        System.out.println("I verify enter script Name");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("scrip"))) , "color: red; border: 2px solid red;");
        
        Thread.sleep(1000);
    }

    @Then("^I verify buy or sell menu$")
    public void i_verify_buy_or_sell_menu() throws Throwable {
        System.out.println("I verify buy or sell menu");
        
        Select select=new Select(driver.findElement(By.xpath(OR.getProperty("buy"))));
        select.selectByValue("B");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("buy"))) , "color: red; border: 2px solid red;");
    }

    @Then("^I verify Quantity$")
    public void i_verify_quantity() throws Throwable {
        System.out.println("I verify Quantity");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("quantity"))) , "color: red; border: 2px solid red;");
        
        Thread.sleep(1000);
    }

    @Then("^I verify price$")
    public void i_verify_price() throws Throwable {
       System.out.println("I verify price");
       
       js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("price"))) , "color: red; border: 2px solid red;");
       
       Thread.sleep(1000);;
    }

    @Then("^I verify Trigger price$")
    public void i_verify_trigger_price() throws Throwable {
        System.out.println("I verify Trigger price");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("trigger"))) , "color: red; border: 2px solid red;");
        
        Thread.sleep(1000);
    }

    @Then("^I verify disc quantity$")
    public void i_verify_disc_quantity() throws Throwable {
        System.out.println("I verify disc quantity");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("disc_qty"))) , "color: red; border: 2px solid red;");
        
        Thread.sleep(1000);
    }

    @Then("^I verify product type$")
    public void i_verify_product_type() throws Throwable {
        System.out.println("I verify product type");
        
        
        Select select1=new Select(driver.findElement(By.xpath(OR.getProperty("product_type"))));
        select1.selectByValue("normal");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("product_type"))) , "color: red; border: 2px solid red;");
        
        Thread.sleep(1000);
    }

    @Then("^I verify validity$")
    public void i_verify_validity() throws Throwable {
        System.out.println("I verify validity");
        
        Select select2=new Select(driver.findElement(By.xpath(OR.getProperty("validity"))));
        select2.selectByValue("GFD");
        
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("validity"))) , "color: red; border: 2px solid red;");
        
        Thread.sleep(1000);
    }

    @Then("^I verify place order button is disabled or not$")
    public void i_verify_place_order_button_is_disabled_or_not() throws Throwable {
        System.out.println("I verify place order button is disabled or not");
            
        report.log(LogStatus.INFO, "I verify place order button is disabled or not");
        
        app_logs.debug("I verify place order button is disabled or not");
        
        try{
        String actual_attri_value1=driver.findElement(By.xpath(OR.getProperty("place_order"))).getAttribute("disabled");
        Boolean expected_attri_value1=true;
        System.out.println("Actual attribute value :"+actual_attri_value1);
        Assert.assertEquals("true", actual_attri_value1);
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("place_order"))) , "color: red; border: 2px solid red;");
        Thread.sleep(2000);
        report.log(LogStatus.PASS, "I verify place order button is disabled or not");
        }catch(Throwable T)
        {
        	Assert.fail();
        	
        	report.log(LogStatus.FAIL, "I do not verify place order button is disabled or not");
        }
    }

    @Then("^I verify reset button is disbled or not$")
    public void i_verify_reset_button_is_disbled_or_not() throws Throwable {
        System.out.println("I verify reset button is disbled or not");
          
        report.log(LogStatus.INFO, "I verify reset button is disbled or not");
        
        app_logs.debug("I verify reset button is disbled or not");
        
        try{
	        String actual_attri_value1=driver.findElement(By.xpath(OR.getProperty("reset"))).getAttribute("disabled");
	        Boolean expected_attri_value1=true;
	        System.out.println("Actual attribute value :"+actual_attri_value1);
	        Assert.assertEquals("true", actual_attri_value1);
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("reset"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        report.log(LogStatus.PASS, "I verify reset button is disbled or not");
        }catch(Throwable t)
        {
        	Assert.fail();
        	
        	report.log(LogStatus.FAIL, "I do not verify reset button is disbled or not");
        }
        
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
