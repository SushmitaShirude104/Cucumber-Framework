package Step_Definitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



import SharekhanCore.Sharekhan_WebConnector;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TC_01_URLLaunchingTest extends Sharekhan_WebConnector{

	Sharekhan_WebConnector sk=new Sharekhan_WebConnector();
	
	//public static final ExtentReports report=ExtentReports;
			//.get(TC_01_URLLaunchingTest.class);
	
	 @When("^User opens browser$")
	    public void user_opens_browser() throws Throwable {
	        System.out.println("User opens browser");
	        
	        sk.open_browser();
	        
	        driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
	    }

	    @Then("^User enters the Sharekahn Url$")
	    public void user_enters_the_sharekahn_url() throws Throwable {
	    	app_logs.debug("password is entered");
	        System.out.println("User enters the Sharekahn Url");
	        
	        
	    }

	    @Then("^User verifies tab title$")
	    public void user_verifies_tab_title() throws Throwable {
	        System.out.println("User verifies tab title");
	        app_logs.debug("User verifies tab title");
	        try{
	        System.out.println("tab title is :" +driver.getTitle());
	        String str=driver.getTitle();	        
	        Assert.assertEquals(true,str.contains("Sharekhan"));
	        System.out.println("Title is Verified");
	        }
	        catch(Throwable t)
	        {
	        	System.out.println("TabTitle is not verified");
	        	
	        }
	    }

	    @Then("^User verifies all Menu items$")
	    public void user_verifies_all_menu_items() throws Throwable {
	        System.out.println("User verifies all Menu items");
	        //driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
	        
	        app_logs.debug("User verifies all menus");
	        
	        List<WebElement> menu=driver.findElements(By.className(OR.getProperty("menu_Bar")));
	        System.out.println("No. Of Menus :"+menu.size());
	        
	        Thread.sleep(2000);
	        
	        String title_1=driver.findElement(By.xpath(OR.getProperty("market_Menu"))).getText();
	        
	        String title_2=driver.findElement(By.xpath(OR.getProperty("new_To_market"))).getText();
	        String title_3=driver.findElement(By.xpath(OR.getProperty("super_investor"))).getText();
	        String title_4=driver.findElement(By.xpath(OR.getProperty("active_Trader"))).getText();
	        String title_5=driver.findElement(By.xpath(OR.getProperty("mutual_Funds"))).getText();
	        String title_6=driver.findElement(By.xpath(OR.getProperty("research"))).getText();
	        String title_7=driver.findElement(By.xpath(OR.getProperty("education_First"))).getText();
	        String title_8=driver.findElement(By.xpath(OR.getProperty("insta_Mf"))).getText();
	        String title_9=driver.findElement(By.xpath(OR.getProperty("product_And_Services"))).getText();
	       
	        Assert.assertEquals(true,title_1.equalsIgnoreCase("market"));
	        js=(JavascriptExecutor) driver;
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("market_Menu"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        System.out.println(title_2);
	       
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("new_To_market"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("new_To_market"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("super_investor"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("super_investor"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("active_Trader"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("active_Trader"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("mutual_Funds"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("mutual_Funds"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("research"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("research"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("education_First"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("education_First"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("insta_Mf"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("insta_Mf"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);	        
	       
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("product_And_Services"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("product_And_Services"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("budget"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("budget"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        	        	        
	    }

	    @Then("^User verifies Login or Trade button$")
	    public void user_verifies_login_or_trade_button() throws Throwable {
	        System.out.println("User verifies Login or Trade button");
	        
	        app_logs.debug("user verifies login button");
	        Assert.assertEquals(true,driver.findElement(By.xpath(OR.getProperty("Login_button"))).isDisplayed());
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("Login_button"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	        sk.close_Browser_After_Execution();
	    }

}
