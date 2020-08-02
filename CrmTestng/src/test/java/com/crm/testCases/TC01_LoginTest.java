package com.crm.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.pageObjects.LoginPage;



public class TC01_LoginTest extends BaseClass{
	
	@Test
	public void loginTest() throws IOException  {
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName("er.anandsingh7@gmail.com");
		logger.info("Username is entered");
		
		lp.setPassword("Crmtest123");
		logger.info("Password is entered");
		
		
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		
		System.out.println(driver.getTitle());
		//String pageTitle=driver.getTitle();
		boolean T=lp.failedLoginMessage();
		
		if(T==false) {
			logger.info("Login is successful");
			Assert.assertTrue(true);
			
		}else {
			
			captureScreen(driver, "loginTest");
			logger.info("Login failed");
			Assert.assertTrue(false);
			
		}
		
		
		
	}
	
	@Test
	public void loginTestmenthod1()   {
		System.out.println("Logintestmethod 1");
	}
}
