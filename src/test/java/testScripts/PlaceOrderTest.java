package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class PlaceOrderTest 
{
	LoginPage loginPage;
	WebDriver driver;
	
	public PlaceOrderTest()
	{
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);		
	}
	
	@BeforeTest
	public void setUp()
	{
		TestBase.openURL("https://www.saucedemo.com/");
	}
	
	@Test
	public void validLoginPage()
	{
		loginPage.logIntoTheApp("standard_user", "secret_sauce");
	}
	
	@AfterTest
	public void tearDown()
	{
		TestBase.tearDown();
	}
}
