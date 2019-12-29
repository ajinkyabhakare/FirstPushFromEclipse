package com.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Utilities.Reader;

public class BasePractice {
	
	
	Reader r=new Reader();
	public String username=r.setuser();
	public String pass=r.setpass();
	public String url=r.seturl();
	
	
	
	
	
	public WebDriver driver; 	
	@BeforeMethod
	public void starttest()
	{
	   BasePractice bp=new BasePractice();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	    driver.get(url);
	}    
	
	    
	
	
	
	
	    @AfterMethod
	    public void teardown()
	    {
	    	
	    }
	
	
	
}
