package com.Shoppers_Stack_TestScripts;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import com.ShoppersStack.GenericUtility.BaseTest;
import com.ShoppersStack.PomUtility.Edit_Address_Page;
import com.ShoppersStack.PomUtility.MyAddress_Page;
import com.ShoppersStack.PomUtility.MyProfile_Page;

public class User_is_able_to_update_address_or_not extends BaseTest{
	@Test
	public void updateAddress() throws InterruptedException, IOException, AWTException {
		
		homePage.getAccountSetting().click();
		homePage.getMyProfile().click();
		
		MyProfile_Page myprofile=new MyProfile_Page(driver);
		myprofile.getMyAddress().click();
		
		MyAddress_Page myAddPage=new MyAddress_Page(driver);
		myAddPage.getEditBtn().click();
		
		
		Edit_Address_Page editAddress=new Edit_Address_Page(driver);
		
		Robot rorbot=new Robot();
		
		editAddress.getName().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getName().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 0));
	
		Thread.sleep(2000);
		
		editAddress.getHouse().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getHouse().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 1));
		
		Thread.sleep(2000);
		
		editAddress.getStreetInfo().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getStreetInfo().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 2));
		
		Thread.sleep(2000);
		
		editAddress.getLandmark().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getLandmark().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 3));
		
		Thread.sleep(2000);
		
		editAddress.getPincode().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getPincode().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 4));
	
		Thread.sleep(2000);
	
		editAddress.getPhoneNumber().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getPhoneNumber().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 5));
		Thread.sleep(2000);
		
		editAddress.getUpdateAddress().click();
		Thread.sleep(6000);
		
	}
}

