package com.ShoppersStack.PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Address_Page {
	public Edit_Address_Page(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}
	@FindBy(id="Office")
	private WebElement office;
	
	@FindBy(id="Name")
	private WebElement name;
	
	@FindBy(id="House/Office Info")
	private WebElement house;
	
	@FindBy(id="Street Info")
	private WebElement streetInfo;
	
	@FindBy(id="Landmark")
	private WebElement landmark;
	
	@FindBy(xpath = "//label[text()='Country']/../div")
	private WebElement countryDD;
	
	@FindBy(xpath = "//label[text()='State']/../div")
	private WebElement stateDD;
	
	@FindBy(xpath = "//label[text()='City']/../div")
	private WebElement cityDD;
	
	@FindBy(id = "Pincode")
	private WebElement pincode;
	
	@FindBy(id= "Phone Number")
	private WebElement phoneNumber;
	
	@FindBy(id= "Update Address")
	private WebElement updateAddress;

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
		return streetInfo;
	}

	public WebElement getLandmark() {
		return landmark;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getStateDD() {
		return stateDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getUpdateAddress() {
		return updateAddress;
	}
}
