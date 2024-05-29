package com.ShoppersStack.PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(@class,'BaseBadge-root')])[1]")
	private WebElement accountSetting;
	
	@FindBy(xpath =  "(//li[contains(@class,'MuiButtonBase-root')])[1]")
	private WebElement myProfile;
	
	@FindBy(xpath = "(//li[contains(@class,'MuiButtonBase')])[7]")
	private WebElement logout;

	public WebElement getAccountSetting() {
		return accountSetting;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
}
