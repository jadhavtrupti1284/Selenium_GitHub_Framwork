package com.ShoppersStack.PomUtility;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page {
	public MyAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement addAddress;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
		private WebElement deleteAddress;
		
	@FindBy (xpath = "(//button[text()='Yes'])[1]")
	 private WebElement yesBtn;
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[1]")
	private WebElement editBtn;
	
	public WebElement getEditBtn() {
		return editBtn;
	}
	public WebElement getAddAddress() {
		return addAddress;
		
	}
	public WebElement getDeleteAddress() {
		return deleteAddress;
	}
	public WebElement getYesBtn() {
		return yesBtn;
	}
}
