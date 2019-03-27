package com.axis.testcases;

import org.testng.annotations.Test;

import com.axis.pages.BaseClass;



import static org.testng.Assert.assertEquals;



public class PageTitle extends BaseClass{
	
	
  @Test
  public void verifyPageTitle() {
	  String actualTitle=driver.getTitle();
	  assertEquals(actualTitle, "axis2.2");
	  
  }
  

}
