package com.projectssanitypacks.automation.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	
	public WebDriver driver;
	String url = "https://www.hays.co.uk";
	String browser = "chrome";
	

	
	public void init(){
		
		SelectBrowser(browser);
		getUrl(url);
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		
	}

	private void SelectBrowser(String browser) {
		// TODO Auto-generated method stub
		
		if(browser.equalsIgnoreCase("chrome"));
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver");
		log.info("Creating object of "+browser);
		driver = new ChromeDriver();
		
		//For Firefox Mac  
			//System.setProperty("webdriver.firefox.marionette",System.getProperty("user.dir") +"/drivers/geckodriver 3");
			//driver = new FirefoxDriver();	
	
		driver.get ("https://www.hays.co.uk");
	 
		//For window
	
			//System.setProperty("webdriver.driver.geckodriver",System.getProperty("user.dir") +"/drivers/geckodriver.exe");
   	
			//	driver = new FirefoxDriver();
	}
		
	public void getUrl(String url){
		
		log.info("navigating to "+url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
