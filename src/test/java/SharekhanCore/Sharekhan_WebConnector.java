package SharekhanCore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;

import SharekhanUtil.sharekhan_testUtil;

public class Sharekhan_WebConnector {

	public static WebDriver driver=null;
	public static Properties OR;
	public static Properties Config;
	public static FileInputStream fis;
	public static JavascriptExecutor js;
	public static Logger app_logs=Logger.getLogger("devpinoyLogger");
	public static final ExtentReports report=ExtentReports.get(Sharekhan_WebConnector.class);
	
	public Sharekhan_WebConnector()
	{
		if(driver==null)
		{
			app_logs.debug("Object properties file is loaded");
			OR=new Properties();
			try{
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\SharekhanConfig\\ShareKhanOR.properties");
				
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			
			try{
				OR.load(fis);
				
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			
			app_logs.debug("Config properties file is loaded");
			Config=new Properties();
			try{
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\SharekhanConfig\\ShareKhanConfig.properties");
				
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			
			try{
				Config.load(fis);
				
			}catch(IOException e)
			{
				e.printStackTrace();
			}

		}
		
		js=(JavascriptExecutor) driver;
	}
	
	public void open_browser() throws InterruptedException
	{
		report.init("E:\\Selenium Sushmita\\Assignments_On_Cucumber_Framework\\report.html", true);

		app_logs.debug("Browser is opened");
		 if(Config.getProperty("browser").equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
			 
			 report.startTest("open_browser");
			 
			 ChromeOptions options=new ChromeOptions();
			 options.addArguments("--disable-notifications");
				
			 driver=new ChromeDriver(options);
			 
			 
			 //driver=new ChromeDriver();
			// Thread.sleep(2000);
			
		 }else if(Config.getProperty("browser").equals("mozilla firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
		 }else if(Config.getProperty("browser").equals("ie"))
		 {
			 System.setProperty("webdriver.ie.driver", "E:\\Selenium_Drivers\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		 }
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		 
		 app_logs.debug("Url is opened");
		 driver.get(Config.getProperty("testsiteURL"));
			driver.manage().timeouts().implicitlyWait(25L, TimeUnit.SECONDS);
		
	}

	public void close_Browser_After_Execution() throws AddressException, MessagingException
	{
		app_logs.debug("Browser is closed");
		if(driver!=null)
			driver.close();
		
		app_logs.debug("mail sent Successfully");
		sharekhan_testUtil.zip(System.getProperty("user.dir")+"\\screenshot");
		SharekhanUtil.monitoringMail mail=new SharekhanUtil.monitoringMail();
		mail.sendMail(SharekhanUtil.TestConfig.server, SharekhanUtil.TestConfig.from, SharekhanUtil.TestConfig.to, SharekhanUtil.TestConfig.subject, 
				SharekhanUtil.TestConfig.messageBody, SharekhanUtil.TestConfig.attachmentPath, SharekhanUtil.TestConfig.attachmentName);
		
		report.endTest();

	}

}
