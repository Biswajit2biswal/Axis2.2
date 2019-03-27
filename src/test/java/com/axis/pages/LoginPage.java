package com.axis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]") WebElement UserName;
	@FindBy(xpath="/html[1]/body[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]") WebElement Password;
	@FindBy(xpath="/html[1]/body[1]/div[2]/form[1]/div[5]/button[1]") WebElement LoginButton;
	
	
	
	public void login(String uName,String pwd) {
		UserName.sendKeys(uName);
		Password.sendKeys(pwd);
		LoginButton.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
