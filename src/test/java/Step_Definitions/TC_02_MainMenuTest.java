package Step_Definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import SharekhanCore.Sharekhan_WebConnector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_02_MainMenuTest extends Sharekhan_WebConnector {

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	 @Given("^User is on Sharekhan's HomePage$")
	    public void user_is_on_sharekhans_homepage() throws Throwable {
		 
		 skw.open_browser();
		 app_logs.debug("User is on TC_02_MainMenuTest");
	     System.out.println("User is on Sharekhan's HomePage");
	     
	    }

	  @When("^User Verifies on MainMenu Button$")
	    public void user_verifies_on_mainmenu_button() throws Throwable {
	        System.out.println("User Verifies on MainMenu Button");
	        
	        app_logs.debug("Verifies main menu button");
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("main_menu"))).isDisplayed());
	        
	        js=(JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("main_menu"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        
	        
	    }

	    @Then("^User clicks on MainMenu Button$")
	    public void user_clicks_on_mainmenu_button() throws Throwable {
	        System.out.println("User clicks on MainMenu Button");
	        
	        app_logs.debug("User click on main menu button");
	        
	        driver.findElement(By.xpath(OR.getProperty("main_menu"))).click();
	        Thread.sleep(2000);
	    }

	    @Then("^User verifies trade now Button$")
	    public void user_verifies_trade_now_button() throws Throwable {
	        System.out.println("User verifies trade now Button");
	        
	        app_logs.debug("User verifies trade now button");
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("trade_now"))).isDisplayed());
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("trade_now"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	    }

	    @Then("^User verifies Sharekhan Platforms$")
	    public void user_verifies_sharekhan_platforms() throws Throwable {
	        System.out.println("User verifies Sharekhan Platforms");
	                
	    }

	    @Then("^User verifies Sharekhan products$")
	    public void user_verifies_sharekhan_products() throws Throwable {
	        System.out.println("User verifies Sharekhan products");
	        
	        app_logs.debug("User verifies Sharekhan products");
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("sharekhan_products"))).isDisplayed());
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("sharekhan_products"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	    }

	    @Then("^User verifies 	PMS$")
	    public void user_verifies_pms() throws Throwable {
	       System.out.println("User verifies 	PMS");
	       
	       app_logs.debug("User verifies PMS");
	       
	       //Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("portfolio"))).isDisplayed());
	       
	       js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("portfolio"))) , "color: red; border: 2px solid red;");
	       Thread.sleep(2000);
	    }

	    @Then("^User verifies Sharekhan classroom$")
	    public void user_verifies_sharekhan_classroom() throws Throwable {
	       System.out.println("User verifies Sharekhan classroom");
	       
	       app_logs.debug("User verifies Sharekhan Classroom");
	       
	       Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("classroom"))).isDisplayed());
	       
	       js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("classroom"))) , "color: red; border: 2px solid red;");
	       Thread.sleep(2000);
	    }

	    @Then("^User verifies our other products$")
	    public void user_verifies_our_other_products() throws Throwable {
	       System.out.println("User verifies our other products");
	       
	       app_logs.debug("User verifies our other products");
	       
	       Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("our_other_products"))).isDisplayed());
	       
	       js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("our_other_products"))) , "color: red; border: 2px solid red;");
	       Thread.sleep(2000);
	    }

	    @Then("^User verifies Associate with us$")
	    public void user_verifies_associate_with_us() throws Throwable {
	        System.out.println("User verifies Associate with us");
	        
	        app_logs.debug("User Verifies Associate with us");
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("associate"))).isDisplayed());

		    js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("associate"))) , "color: red; border: 2px solid red;");
		    Thread.sleep(2000);
	    }

	    @Then("^User closes the browser$")
	    public void user_closes_the_browser() throws Throwable {
	       System.out.println("User closes the browser");
	       app_logs.debug("User closes the browser");
	       skw.close_Browser_After_Execution();
	    }

}
