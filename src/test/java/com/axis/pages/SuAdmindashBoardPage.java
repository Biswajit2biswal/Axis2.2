package com.axis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sun.jna.platform.win32.Netapi32Util.User;

public class SuAdmindashBoardPage {
	
//WebDriver driver;
//	
//	
//	public SuAdmindashBoardPage(WebDriver ldriver)
//	{
//		this.driver=ldriver;
//	}

	@FindBy(xpath="//i[@title='Hi , su-admin']") WebElement user;
	
	
	public String suAdminPage(String s)
	
	{
		String s1=user.getAttribute(s);
		
		return s1;
		
	}
	
	
	

}
