package com.projectssanitypacks.automation.HomePage;

import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.projectssanitypacks.automation.testBase.TestBase;
import com.projectssanitypacks.automation.uiAction.HomePage;


public class Tc001_VerifyLoginWithInvalidCredential extends TestBase  {
	
	public static final Logger log = Logger.getLogger(Tc001_VerifyLoginWithInvalidCredential.class.getName());
	
	//Now it is inheriting from parent class TestBase so no need to declare Webdriver driver"
	//WebDriver driver;
	
	HomePage homepage;
	
	@BeforeTest
	public void setUp(){
	
		init();
		
		
		//=====Below steps calling from TestBase====
		
		//For Mac
	
		//System.setProperty("webdriver.firefox.marionette",System.getProperty("user.dir") +"/drivers/geckodriver 3");
		//driver = new FirefoxDriver();	
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver");
			
		//driver = new ChromeDriver();
	
		//driver.get ("https://www.hays.co.uk");
	 
		//For window
	
		//System.setProperty("webdriver.driver.geckodriver",System.getProperty("user.dir") +"/drivers/geckodriver.exe");
   	
		//	driver = new FirefoxDriver();
	}


	@Test
	public void verifyLoginWithInvalidCredential(){
		log.info("=============Starting verifyLoginWithInvalidCredential Test=============");
		
		homepage= new HomePage(driver);
		homepage.LoginToApplication("3anandmonia@gmail.com", "Hays@100");
		Assert.assertEquals(homepage.getInvalidLoginText(), "Sorry, your username or password were incorrect");
		
		log.info("=============Finised verifyLoginWithInvalidCredential Test=============");
		
	//Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='page']/div/div/div/div[1]/div/section/form/ul/li[1]/div[1]/p")).getText(), "Sorry, your username or password were incorrect.");	
		
	//driver.findElement(By.xpath(".//*[@id='un-login']/a")).click();
	//driver.findElement(By.className("loginuser")).sendKeys("");;
	//driver.findElement(By.className("loginpass")).sendKeys("");
	//driver.findElement(By.id("loginApp")).click();	

	
	}
	
	@AfterClass
	public void endTest(){
		driver.close();
		
	}

}
