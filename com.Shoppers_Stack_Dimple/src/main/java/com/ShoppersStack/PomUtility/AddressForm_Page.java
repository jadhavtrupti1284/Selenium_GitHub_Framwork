package com.ShoppersStack.PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_Page {
	public AddressForm_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Office")
	private WebElement office ;
	
	@FindBy(id ="Name")
	private WebElement name;
	
	@FindBy(id ="House/Office Info")
	private WebElement house;
	
	@FindBy(id ="Street Info")
	private WebElement StreetInfo;
	
	@FindBy(id ="Landmark")
	private WebElement Landmark;
	
	@FindBy(id ="Country")
	private WebElement country;
	
	@FindBy(name  ="State")
	private WebElement State;
	
	@FindBy(id ="City")
	private WebElement City;
	
	@FindBy(id ="Pincode")
	private WebElement Pincode;
	
	@FindBy(id ="Phone Number")
	private WebElement PhoneNumber;
	
	@FindBy(name ="addAdress")
	private WebElement addAdress;

	public WebElement getOffice() {
		return office;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getHouse() {
		return house;
	}

	public WebElement getStreetInfo() {
		return StreetInfo;
	}

	public WebElement getLandmark() {
		return Landmark;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getPincode() {
		return Pincode;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public WebElement getAddAdress() {
		return addAdress;
	}
}
