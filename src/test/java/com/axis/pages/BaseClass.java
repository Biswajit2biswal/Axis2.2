package com.axis.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.axis.utilityMethod.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	
	
 @BeforeClass
	public void login() {
		driver=BrowserFactory.openBrowser(driver, "http://192.168.64.123:8282/axis2.2/");
		
		
		
	}
 
 @AfterClass
 public void tearDown()
 {
	 driver.quit();
 }

}
