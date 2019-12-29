package com.Testcases;

import org.testng.annotations.Test;

import com.Pageobject.SearchPage;

public class Logintest_01 extends BasePractice{
	
	
	@Test
	public void loginpage()
	{
		SearchPage sp=new SearchPage(driver);
		
		sp.setuser();
		sp.setpass();
		sp.clicklogin();
	}

}
