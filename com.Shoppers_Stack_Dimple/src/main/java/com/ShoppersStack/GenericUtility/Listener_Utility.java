package com.ShoppersStack.GenericUtility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Utility implements ITestListener,ISuiteListener{
	@Override
	public void onTestFailure(ITestResult result) {
		Java_Utility java=new Java_Utility();
		TakesScreenshot ts=(TakesScreenshot) BaseTest.listnerDriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dstn=new File(Framework_Constants.screenshotPath+java.localDateTime()+".png");
		try {
			FileHandler.copy(temp, dstn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}	
