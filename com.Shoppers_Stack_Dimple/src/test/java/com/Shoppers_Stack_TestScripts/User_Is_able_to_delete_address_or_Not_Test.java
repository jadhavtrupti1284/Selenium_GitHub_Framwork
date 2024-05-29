package com.Shoppers_Stack_TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.GenericUtility.BaseTest;
import com.ShoppersStack.PomUtility.Home_Page;
import com.ShoppersStack.PomUtility.MyAddress_Page;
import com.ShoppersStack.PomUtility.MyProfile_Page;

public class User_Is_able_to_delete_address_or_Not_Test extends BaseTest {
	@Test
	public void deleteAddress() throws IOException, InterruptedException {
		homePage.getAccountSetting().click();
		Thread.sleep(2000);
		homePage.getMyProfile().click();
		
		MyProfile_Page myProfilePage=new MyProfile_Page(driver);
		Thread.sleep(2000);
		myProfilePage.getMyAddress().click();
		
		MyAddress_Page myAddressPage=new MyAddress_Page(driver);
		Thread.sleep(2000);
		myAddressPage.getDeleteAddress().click();
		Thread.sleep(2000);
		
		myAddressPage.getYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}
		
}

