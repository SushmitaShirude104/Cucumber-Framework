package Step_Definitions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import SharekhanCore.Sharekhan_WebConnector;
import SharekhanUtil.sharekhan_testUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TC_10_PortfolioMenuTest extends Sharekhan_WebConnector {

	Sharekhan_WebConnector skw=new Sharekhan_WebConnector();
	
	static int currentDay=0,
			currentMonth=0,
			currentYear=0;
	
	static int jumpMonthBy=0;
	
	static String foldername="Test";
	static String rename="Test1";
	static String company1_name="TCS";
	static String company2_name="HCLTECH";
	
	static int company1_qty=5;
	static int company2_qty=10;
	
	
	 @When("^Browser is opened I enterd the Sharekhan URL$")
	    public void browser_is_opened_i_enterd_the_sharekhan_url() throws Throwable {
	        System.out.println("Browser is opened I enterd the Sharekhan URL");
	        

	        
	        app_logs.debug("User  verifies TC_10_PortfolioMenuTest");
	        skw.open_browser();
	        report.startTest("TC_10_PortfolioMenuTest");
	    }

	    @Then("^Sharekhan Homepage is opened for login$")
	    public void sharekhan_homepage_is_opened_for_login() throws Throwable {
	        System.out.println("Sharekhan Homepage is opened for login");
	        
	        
	    }

	    @Then("^I enter My username and password$")
	    public void i_enter_my_username_and_password() throws Throwable {
	        
	    	System.out.println("I enter My username and password");
	    	
	    	System.out.println("user enters username");
	        driver.findElement(By.name(OR.getProperty("username"))).sendKeys("SUSMITAM96");
	        driver.findElement(By.xpath(OR.getProperty("next"))).click();
	        System.out.println("user enters password");
	        driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("Jas@1041996P");
	        
	        
	    }

	    @Then("^My Sharekhan homePage is opened$")
	    public void my_sharekhan_homepage_is_opened() throws Throwable {
	        System.out.println("My Sharekhan homePage is opened");
	        
	    }

	    @Then("^I click on Portfolio tab$")
	    public void i_click_on_portfolio_tab() throws Throwable {
	        System.out.println("I click on Portfolio tab");
	        
	        driver.findElement(By.xpath(OR.getProperty("portfolio"))).click();
	        Thread.sleep(1000);
	    }

	    @Then("^I click on detailed view menu$")
	    public void i_click_on_detailed_view_menu() throws Throwable {
	        System.out.println("I click on detailed view menu");
	         	      
	        report.log(LogStatus.INFO, "I click on detailed view menu");
	        
	        app_logs.debug("I click on detailed view menu");
	        
	        js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("detailed_view"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath(OR.getProperty("detailed_view"))).click();
	        Thread.sleep(1000);
	    }

	    @Then("^I click on add virtual menu$")
	    public void i_click_on_add_virtual_menu() throws Throwable {
	        System.out.println("I click on add virtual menu");
	        
	        driver.findElement(By.xpath(OR.getProperty("add_virtual"))).click();
	        Thread.sleep(1000);
	        
	        sharekhan_testUtil.captureScreenshot("i_click_on_add_virtual_menu");
	    }

	    @Then("^One Dialogue box is opened$")
	    public void one_dialogue_box_is_opened() throws Throwable {
	        System.out.println("One Dialogue box is opened");
	    }

	    @Then("^I enter folder name as a test$")
	    public void i_enter_folder_name_as_a_test() throws Throwable {
	        System.out.println("I enter folder name as a test");
	        
	        driver.findElement(By.xpath(OR.getProperty("add_your_Portfolio"))).sendKeys(foldername);
	        Thread.sleep(1000);
	        
	    }

	    @Then("^I click on add folder button$")
	    public void i_click_on_add_folder_button() throws Throwable {
	        System.out.println("I click on add folder button");
	        
	        driver.findElement(By.xpath(OR.getProperty("add_folder"))).click();
	        Thread.sleep(4000);
	    }

	    @Then("^again dialogue box is opened for showing successfully added folder$")
	    public void again_dialogue_box_is_opened_for_showing_successfully_added_folder() throws Throwable {
	        System.out.println("again dialogue box is opened for showing successfully added folder");
	    }

	    @Then("^I verify success message$")
	    public void i_verify_success_message() throws Throwable {
	    	System.out.println("I verify success message");
	    	
	    	/*Alert alert = driver.switchTo().alert(); // sw
	    	String alertMessage= driver.switchTo().alert().getText();
	    	System.out.println("alertMessage");*/
	    	WebElement success_1=driver.findElement(By.xpath(OR.getProperty("success")));
	    	System.out.println(success_1.getText());
	    	Assert.assertEquals("Success",success_1.getText());
	    	Thread.sleep(1000);
	    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",success_1 , "color: red; border: 2px solid red;");
	    	Thread.sleep(1000);
	    }

	    @Then("^I click on close button$")
	    public void i_click_on_close_button() throws Throwable {
	        System.out.println("I click on close button");
	        
	        driver.findElement(By.xpath(OR.getProperty("close_success"))).click();
	    }

	    @Then("^I verify added portfolio foder$")
	    public void i_verify_added_portfolio_foder() throws Throwable {
	    	
	    	System.out.println("I verify added portfolio foder");
	    	
	    	report.log(LogStatus.INFO, "I verify added portfolio foder");
	    	
	    	List<WebElement> allFolder_list=driver.findElements(By.xpath(OR.getProperty("folder_list")));
	    	System.out.println("Total No of folder :"+allFolder_list.size());
	    	
	    	String folder_start="/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[";
	    	String folder_end="]";
	    	boolean added_Folder_found=true;
	    	
	    	for(int k=1;k<=allFolder_list.size();k++)
	    	{
	    		WebElement folder=driver.findElement(By.xpath(folder_start+k+folder_end));
	    		
	    		if(folder.getText().equalsIgnoreCase(foldername))
	    		{
	    			System.out.println("Added Folder is found");
	    			
	    			js.executeScript("arguments[0].setAttribute('style',arguments[1]);", folder,"color: red; border: 2px solid red;");
	    		}else
	    		{
	    			added_Folder_found=false;
	    		}
	    	}
	    		    	
	    	Thread.sleep(1000); 	
	    	
	    }

	    @Then("^I click on add scrip$")
	    public void i_click_on_add_scrip() throws Throwable {
	    	
	    	System.out.println("I click on add scrip");
	    	
	    	driver.findElement(By.xpath(OR.getProperty("add_scrip"))).click();
	    	
	    	Thread.sleep(1000);
	        
	    }

	    @Then("^I enter scrip name in dialogue box$")
	    public void i_enter_scrip_name_in_dialogue_box() throws Throwable {
	    	
	    	System.out.println("I enter scrip name in dialogue box");
	    	
	    	driver.findElement(By.xpath(OR.getProperty("scrip_name"))).sendKeys(company1_name);
	    	
	    	List<WebElement> option=driver.findElements(By.xpath("/html/body/ul/li"));
	    	System.out.println("Total Elements : "+option.size());
	    	
	    	String x_start="/html/body/ul/li[";
	    	String x_end="]/a/div/span[1]";
	    	
	    	for(int i=1;i<=option.size();i++)
			{
	    		WebElement x=driver.findElement(By.xpath(x_start+i+x_end));
				
	    		//System.out.println(x.getText());
	    		
	    		if(x.getText().equalsIgnoreCase(company1_name))
	    		{
	    			x.click();
	    			break;
	    		}
			}
			
	    	
	    	//driver.findElement(By.xpath(OR.getProperty("scrip_name"))).sendKeys(Keys.ENTER);;
	    	Thread.sleep(1000);
	        
	    }

	    @Then("^I enter transaction date$")
	    public void i_enter_transaction_date() throws Throwable {
	    	
	    	System.out.println("I enter transaction date");
	    	
	    	Calendar cal=Calendar.getInstance();
			
			currentDay=cal.get(Calendar.DAY_OF_MONTH);
			
			String day=Integer.toString(currentDay);
			
			System.out.println("day is :"+day);
			
			currentMonth=cal.get(Calendar.MONTH)+1;
			
			currentYear=cal.get(Calendar.YEAR);
			
			System.out.println(currentDay+" "+currentMonth+" "+currentYear);
			
			driver.findElement(By.xpath(OR.getProperty("datepicker"))).click();
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[1]/md-input/div[1]/ul/li[2]/span/button[1]")).click();
						
	    }      
	    

	    @Then("^I enter price and quantity$")
	    public void i_enter_price_and_quantity() throws Throwable {
	        System.out.println("I enter price and quantity");
	        
	        Select select=new Select(driver.findElement(By.xpath(OR.getProperty("transaction"))));
	        select.selectByValue("Buy");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath(OR.getProperty("quantity_port"))).sendKeys(Integer.toString(company1_qty));
	        
	        Thread.sleep(1000);
	    }

	    @Then("^I click on add scrip button$")
	    public void i_click_on_add_scrip_button() throws Throwable {
	        
	    	System.out.println("I click on add scrip button");
	    	
	    	driver.findElement(By.xpath(OR.getProperty("add_scrip_button"))).click();
	    }

	    @And("^I click on Login button of sharekhan home page$")
	    public void i_click_on_login_button_of_sharekhan_home_page() throws Throwable {
	        System.out.println("I click on Login button of sharekhan home page");
	        
	        driver.findElement(By.xpath(OR.getProperty("Login_button"))).click();
	        Thread.sleep(2000);
	        
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        Thread.sleep(5000);
	    }

	    @And("^I press the login button$")
	    public void i_press_the_login_button() throws Throwable {
	        	    	
	    	System.out.println("I press the login button");	        
	        driver.findElement(By.xpath(OR.getProperty("login"))).click();	        
	        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

	    }

	    @Then("^I verify Succeffully added stock message$")
	    public void i_verify_succeffully_added_stock_message() throws Throwable {
	    	
	    	System.out.println("I verify Succeffully added stock message");
	    	
	    	WebElement check=driver.findElement(By.xpath(OR.getProperty("stock_added")));
	    	
	    	System.out.println("Message is : "+check.getText());
	    	
	    	Assert.assertEquals("stock added successfully.", check.getText());
	    	
	    	driver.findElement(By.xpath(OR.getProperty("CLOSE_2"))).click();
	    	
	    	Thread.sleep(1000);
	    	
	    	/*Assert.assertEquals(company1_name, driver.findElement(By.xpath(OR.getProperty("company_1"))).getText());
	    	
	    	js.executeScript("arguments[0].setAttribute('style',arguments[1]);", driver.findElement(By.xpath(OR.getProperty("company_1"))),"color: red; border: 2px solid red;");
	    	
	    	Thread.sleep(1000);*/
	        
	    }
	    
	    @Then("^I click on add scrip button for second company$")
	    public void i_click_on_add_scrip_button_for_second_company() throws Throwable {
	        
	    	System.out.println("I click on add scrip button for second company");
	    	
	    	driver.findElement(By.xpath(OR.getProperty("added_folder"))).click();
	    	
	    	Thread.sleep(1000);
	    	
	    		    	
	    	driver.findElement(By.xpath(OR.getProperty("add_scrip_2"))).click();
	    	
	    	Thread.sleep(1000);
	    	
	    	System.out.println("I enter scrip name in dialogue box for second company");
	    	
	    	driver.findElement(By.xpath(OR.getProperty("scrip_name"))).sendKeys(company2_name);
	    	
	    	List<WebElement> option=driver.findElements(By.xpath("/html/body/ul/li"));
	    	System.out.println("Total Elements : "+option.size());
	    	
	    	String x_start="/html/body/ul/li[";
	    	String x_end="]/a/div/span[1]";
	    	
	    	for(int i=1;i<=option.size();i++)
			{
	    		WebElement x=driver.findElement(By.xpath(x_start+i+x_end));
				
	    		//System.out.println(x.getText());
	    		
	    		if(x.getText().equalsIgnoreCase(company2_name))
	    		{
	    			x.click();
	    			break;
	    		}
			}
			
	    	System.out.println("I enter transaction date for company second");
	    	
	    	Calendar cal=Calendar.getInstance();
			
			currentDay=cal.get(Calendar.DAY_OF_MONTH);
			
			String day=Integer.toString(currentDay);
			
			System.out.println("day is :"+day);
			
			currentMonth=cal.get(Calendar.MONTH)+1;
			
			currentYear=cal.get(Calendar.YEAR);
			
			System.out.println(currentDay+" "+currentMonth+" "+currentYear);
			
			driver.findElement(By.xpath(OR.getProperty("datepicker"))).click();
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[1]/md-input/div[1]/ul/li[2]/span/button[1]")).click();
		
			System.out.println("I enter price and quantity for second company");
	        
	        Select select=new Select(driver.findElement(By.xpath(OR.getProperty("transaction"))));
	        select.selectByValue("Buy");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath(OR.getProperty("quantity_port"))).sendKeys(Integer.toString(company2_qty));
	        
	        Thread.sleep(1000);
			
	        System.out.println("I click on add scrip button for second company");
	    	
	    	driver.findElement(By.xpath(OR.getProperty("add_scrip_button"))).click();
	    	
	    	System.out.println("I verify Succeffully added stock message for second company");
	    	
	    	WebElement check=driver.findElement(By.xpath(OR.getProperty("stock_added")));
	    	
	    	System.out.println("Message is : "+check.getText());
	    	
	    	Assert.assertEquals("stock added successfully.", check.getText());
	    	
	    	driver.findElement(By.xpath(OR.getProperty("CLOSE_2"))).click();
	    	
	    	Thread.sleep(3000);
	    	
	    	/*Assert.assertEquals(company2_name, driver.findElement(By.xpath(OR.getProperty("company_1"))).getText());
	    	
	    	js.executeScript("arguments[0].setAttribute('style',arguments[1]);", driver.findElement(By.xpath(OR.getProperty("company_1"))),"color: red; border: 2px solid red;");
	    	
	    	Thread.sleep(1000);*/
	     
	    	
	    }
	    
	    @Then("^I verify both compnies are added succefully not$")
	    public void i_verify_both_compnies_are_added_succefully_not() throws InterruptedException{
	    	System.out.println("I verify both compnies are added succefully");
	    	
	    	List<WebElement> table_2=driver.findElements(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[6]/table/tbody/tr"));
	    	
	    	System.out.println("No of rows in table are :"+table_2.size());
	    	
	    	String companyName_start="/html/body/div[3]/ui-view/div/div/div/div/div[6]/table/tbody/tr[";
	    	String companyName_end="]/td[1]/span";
	    	
	    	String companyQty_start="/html/body/div[3]/ui-view/div/div/div/div/div[6]/table/tbody/tr[";
	    	String companyQty_end="]/td[2]";
	    	
	    	boolean company_1_found=false;
	    	boolean company_2_found=false;
	    	
	    	for(int i=1;i<=table_2.size();i++)
	    	{
	    		
	    		WebElement companyName=driver.findElement(By.xpath(companyName_start+i+companyName_end));
	    		WebElement companyQty=driver.findElement(By.xpath(companyQty_start+i+companyQty_end));
	    		
	    		if(companyName.getText().equalsIgnoreCase(company1_name))
	    		{
	    			if(companyQty.getText().equalsIgnoreCase(Integer.toString(company1_qty)))
	    			{
	    				js.executeScript("arguments[0].setAttribute('style',arguments[1]);", companyName,"color: red; border: 2px solid red;");
	    				js.executeScript("arguments[0].setAttribute('style',arguments[1]);", companyQty,"color: red; border: 2px solid red;");
	    				
	    				company_1_found=true;
	    			}
	    		}else if(companyName.getText().equalsIgnoreCase(company2_name))
	    		{
	    			if(companyQty.getText().equalsIgnoreCase(Integer.toString(company2_qty)))
	    			{
	    				js.executeScript("arguments[0].setAttribute('style',arguments[1]);", companyName,"color: red; border: 2px solid red;");
	    				js.executeScript("arguments[0].setAttribute('style',arguments[1]);", companyQty,"color: red; border: 2px solid red;");
	    				
	    				company_2_found=true;
	    			}
	    		}
	    	}
	    	
	    	Assert.assertEquals(true, company_1_found);
	    	
	    	System.out.println("First company is found");
	    	
	    	Assert.assertEquals(true, company_2_found);
	    	
	    	System.out.println("Second company is found");
	    	
	    	
	    	
	    }
	    
	    @Then("^I delete the one script and verify it$")
	    public void i_delete_the_one_script_and_verify_it() throws InterruptedException
	    {
	    	System.out.println("I delete the one script and verify it");
	    	
	    	String deleted_companyName=driver.findElement(By.xpath(OR.getProperty("cross_sign"))).getText();
	    	
	    	driver.findElement(By.xpath(OR.getProperty("cross_sign"))).click();
	    	WebElement aler=driver.findElement(By.xpath(OR.getProperty("aler_text")));
	    	System.out.println("Alert text is: "+aler.getText());
	 		Assert.assertEquals("Are you sure, you want to Delete Stock from portfolio", aler.getText());
	 		Thread.sleep(1000);
	 		driver.findElement(By.xpath(OR.getProperty("ok_scrip"))).click();
	 		Thread.sleep(2000);
	 		
	 		
	    	WebElement aler2=driver.findElement(By.xpath(OR.getProperty("deleted_stock")));
	    	System.out.println("Second Alert text is: "+aler2.getText());
	 		Assert.assertEquals("stock deleted successfully.", aler2.getText());
	 		Thread.sleep(1000);
	 		driver.findElement(By.xpath(OR.getProperty("deleted_ok"))).click();
	 		Thread.sleep(1000);
	 		
	 		List<WebElement> table_2=driver.findElements(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[6]/table/tbody/tr"));
	    	
	    	System.out.println("No of rows in table are :"+table_2.size());
	    	
	    	String companyName_start="/html/body/div[3]/ui-view/div/div/div/div/div[6]/table/tbody/tr[";
	    	String companyName_end="]/td[1]/span";
	    		    	
	    	boolean deleted_company_found=false;
	    		    	
	    	for(int i=1;i<=table_2.size();i++)
	    	{
	    		
	    		WebElement companyName=driver.findElement(By.xpath(companyName_start+i+companyName_end));
	    			    		
	    		if(companyName.getText().equalsIgnoreCase(deleted_companyName))
	    		{
	    			deleted_company_found=true;
	    		}
	    		
	    	}
	    	
	    	Assert.assertEquals(false, deleted_company_found);
	    	
	    	System.out.println("Deleted company is :"+deleted_companyName);
	    	
	    	System.out.println("Deleted company is not found");
	    	
	 		
	 		
	    }
	   //Portfolio deleted successfully.
	    //disabled="disabled"
	    
	    @Then("^I rename the virtual portfolio folder$")
	    public void i_rename_the_virtual_portfolio_folder() throws InterruptedException{
	    	System.out.println("I rename the virtual portfolio folder");
	    	
	    	driver.findElement(By.xpath(OR.getProperty("rename_portfolio_button"))).click();
	    	
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath(OR.getProperty("rename_added_folder"))).sendKeys(rename);
	    	
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath(OR.getProperty("rename_folder"))).click();
	    	
	    	Thread.sleep(5000);
	    	
	    	driver.findElement(By.xpath(OR.getProperty("rename_ok"))).click();
	    	
	    	Thread.sleep(2000);
	    }
	    
	    @Then("^I delete the virtual portfolio folder$")
	    public void I_delete_the_virtual_portfolio_folder() throws InterruptedException, AddressException, MessagingException
	    {
	    	System.out.println("I delete the virtual portfolio folder");
	    	
	    	driver.findElement(By.xpath(OR.getProperty("added_folder"))).click();
	    	
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath(OR.getProperty("deleteportfolio"))).click();
	    	
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath(OR.getProperty("delet_folder_button"))).click();
	    	
	    	Thread.sleep(2000);
	    		    		    	
	    	System.out.println("Deleted alert: "+driver.findElement(By.xpath(OR.getProperty("deleted_portfolio_message"))).getText());
	    	
	    	Assert.assertEquals("Portfolio deleted successfully.", driver.findElement(By.xpath(OR.getProperty("deleted_portfolio_message"))).getText());
	    	
	    	Thread.sleep(2000);
	    	
	    	String actual_attri_value=driver.findElement(By.xpath(OR.getProperty("delete_folder_dis"))).getAttribute("disabled");
	       
	        
	        Assert.assertEquals("true", actual_attri_value);
	        
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.findElement(By.xpath(OR.getProperty("delete_folder_dis"))) , "color: red; border: 2px solid red;");
	        Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath(OR.getProperty("delete_portfolio_close"))).click();
	    	
	    	List<WebElement> folder=driver.findElements(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li"));
	    	System.out.println("No of folders : "+folder.size());
	    	
	    	String folder_start="/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[";
	    	String folder_end="]";
	    	
	    	boolean folderFound=false;
	    	
	    	for(int i=1;i<=folder.size();i++)
	    	{
	    		WebElement newfolder=driver.findElement(By.xpath(folder_start+i+folder_end));
	    		
	    		if(newfolder.getText().equalsIgnoreCase(rename))
	    		{
	    			folderFound=true;
	    		}
	    	}
	    	
	    	Assert.assertEquals(false, folderFound);
	    	
	    	System.out.println("Virtual folder not found");
	    	
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
	        
	        skw.close_Browser_After_Execution();
	    }
	   
}
