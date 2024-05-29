package com.ShoppersStack.GenericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack.PomUtility.Home_Page;
import com.ShoppersStack.PomUtility.Login_Page;
import com.ShoppersStack.PomUtility.Welcome_Page;

public class BaseTest {
	public WebDriver driver;
	public static TakesScreenshot listnerDriver;
	public File_Utility utility=new File_Utility();
	public Java_Utility javaUtility=new Java_Utility();
	public WebDriver_Utility webDriverUtility=new WebDriver_Utility();
	public Welcome_Page welcomePage;
	public Login_Page loginPage;
	public Home_Page homePage;	

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}
	
	@BeforeClass
	public void beforeClass() throws IOException {
		
		System.out.println("before class");
		
//		String browser = System.getProperty("browser");   //whenever working on command CMD we can use 
//		String url= System.getProperty("url");
		
		String browser=utility.readDataFromPropertyFile("browser");   //whenever working on eclipse we can use 
		String url=utility.readDataFromPropertyFile("url");
		
		if (browser.contains("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.contains("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("enter vali browser");
		}
		
		listnerDriver=(TakesScreenshot) driver;
		welcomePage=new Welcome_Page(driver);
		homePage=new Home_Page(driver);
		loginPage=new Login_Page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.out.println("before method");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",welcomePage.getLoginBtn());
		
		loginPage.getEmail().sendKeys(utility.readDataFromPropertyFile("username"));
		loginPage.getPassword().sendKeys(utility.readDataFromPropertyFile("password"));
		loginPage.getLoginBtn().click();
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException{
		homePage.getAccountSetting().click();
		Thread.sleep(2000);
		homePage.getLogout().click();
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After test");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After suite");
	}
}
