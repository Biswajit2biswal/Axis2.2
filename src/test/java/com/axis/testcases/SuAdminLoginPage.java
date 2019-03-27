package com.axis.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.axis.pages.BaseClass;
import com.axis.pages.SuAdmindashBoardPage;
import com.axis.testcases.LoginToAxis;;

public class SuAdminLoginPage extends LoginToAxis {
	
	
	
  @Test(description="Verify that super-admin can sucessfully login to application")
  public void VerifySuAdminPage() {
	 SuAdmindashBoardPage suadmindashBoardPage=PageFactory.initElements(driver, SuAdmindashBoardPage.class);
	 
	 String actualtoolTip=suadmindashBoardPage.suAdminPage("title");
	 String expectedToolTip="Hi , su-admin" ;
	 
	 assertEquals(actualtoolTip, expectedToolTip);
	 
	 
	 
  }
}
