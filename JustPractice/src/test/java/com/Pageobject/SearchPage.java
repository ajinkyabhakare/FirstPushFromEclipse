package com.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Testcases.BasePractice;

public class SearchPage {
	
public WebDriver driver;
public BasePractice bp=new BasePractice();

public SearchPage(WebDriver driver)	
{
	this.driver=driver;
	PageFactory.initElements(driver,driver);
}


@FindBy(id="email")
@CacheLookup
WebElement username;

@FindBy(id="pass")
@CacheLookup
WebElement password;


@FindBy(name="login")
@CacheLookup
WebElement clicklog;


public void setuser()
{
	username.sendKeys(bp.username);
}

public void setpass()
{
	password.sendKeys(bp.pass);
}

public void clicklogin()
{
	clicklog.click();
}

}
