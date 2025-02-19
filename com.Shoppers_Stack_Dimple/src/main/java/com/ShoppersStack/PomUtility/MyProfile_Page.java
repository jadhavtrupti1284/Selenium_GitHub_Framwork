package com.ShoppersStack.PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile_Page {
	public MyProfile_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myAddress;

	public WebElement getMyAddress() {
		return myAddress;
	}

}
