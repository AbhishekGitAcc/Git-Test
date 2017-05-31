package com.projectssanitypacks.automation.uiAction;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.projectssanitypacks.automation.HomePage.Tc001_VerifyLoginWithInvalidCredential;

public class HomePage {
	
	public static final Logger log = Logger.getLogger(HomePage.class.getName());

	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='un-login']/a")
	WebElement signin;
	
	@FindBy(id="loginuser")
	WebElement typeLoginEmailAddress;
	
	@FindBy(id="loginpass")
	WebElement typeloginPassword;
	
	@FindBy(id="loginApp")
	WebElement submitSigninButton;
	
	@FindBy(xpath=".//*[@id='page']/div/div/div/div[1]/div/section/form/ul/li[1]/div[1]/p")
	WebElement LoginFailedMessage;
	
	
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void LoginToApplication(String emailAddress, String password){
		
		signin.click();
		log.info(" Click on Signin link from home page and object is "+signin.toString());
		
		typeLoginEmailAddress.sendKeys(emailAddress);
		log.info(" Entered Email Address:-"+emailAddress+" and object is "+typeLoginEmailAddress.toString());
		
		typeloginPassword.sendKeys(password);
		log.info(" Entered Password:-"+password+" and object is "+typeloginPassword.toString());
		
		submitSigninButton.click();	
		log.info(" Clicked on signin Button and object is "+submitSigninButton.toString());
		
	}
	
	public String getInvalidLoginText(){
		
		return LoginFailedMessage.getText();
	}
	
}
