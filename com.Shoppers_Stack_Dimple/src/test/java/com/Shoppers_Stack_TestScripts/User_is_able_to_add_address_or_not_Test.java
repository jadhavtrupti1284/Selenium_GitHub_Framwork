package com.Shoppers_Stack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.GenericUtility.BaseTest;
import com.ShoppersStack.PomUtility.AddressForm_Page;
import com.ShoppersStack.PomUtility.MyAddress_Page;
import com.ShoppersStack.PomUtility.MyProfile_Page;

public class User_is_able_to_add_address_or_not_Test extends BaseTest{
	@Test
	public void addAddress() throws IOException, InterruptedException {
		homePage.getAccountSetting().click();
		Thread.sleep(2000);
		homePage.getMyProfile().click();
		
		MyProfile_Page myProfilePage=new MyProfile_Page(driver);
		Thread.sleep(2000);
		myProfilePage.getMyAddress().click();
		
		MyAddress_Page myAdressPage=new MyAddress_Page(driver);
		Thread.sleep(2000);
		myAdressPage.getAddAddress().click();
		
		AddressForm_Page addressForm=new AddressForm_Page(driver);
		Thread.sleep(2000);
		addressForm.getOffice().click();
		addressForm.getName().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 0));
		addressForm.getHouse().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 1));
		addressForm.getStreetInfo().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 2));
		addressForm.getLandmark().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 3));
		
		
		webDriverUtility.selectByValue(addressForm.getCountry(),utility.readDataFromPropertyFile("Country"));
		webDriverUtility.selectByValue(addressForm.getState(), utility.readDataFromPropertyFile("State"));
		webDriverUtility.selectByValue(addressForm.getCity(), utility.readDataFromPropertyFile("City"));	
		
		addressForm.getPincode().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 4));
		addressForm.getPhoneNumber().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 5));
		addressForm.getAddAdress().click();

	}
	
	
}
