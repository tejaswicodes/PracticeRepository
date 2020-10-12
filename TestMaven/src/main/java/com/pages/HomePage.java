package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(id = "nav-link-accountList")
	WebElement signInHover;
	
	
	
	public HomePage(){
	PageFactory.initElements(driver, this);	
	}
	
	
	public String validateTitle(){
		return driver.getTitle();
	}
	
	public void signInButton(){
		signInHover.click();
	}
}
