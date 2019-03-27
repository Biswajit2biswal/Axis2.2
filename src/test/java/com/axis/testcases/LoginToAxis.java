package com.axis.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.axis.pages.BaseClass;
import com.axis.pages.LoginPage;

public class LoginToAxis extends BaseClass {
	
	
  @Test
  public void verifyToLogin() {
	  LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
	  loginPage.login("su-admin", "admin@su");
//	  driver=
//	  assertEquals(actual, expected);
//	  
	  
	  
  }
}
