package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductListPage;

public class PlaceOrderTest {
	LoginPage loginPage;
	WebDriver driver;
	ProductListPage productList;
	CartPage cartPage;
	CheckoutPage checkoutPage;

	public PlaceOrderTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		productList = new ProductListPage(driver);
		cartPage = new CartPage(driver);
		checkoutPage = new CheckoutPage(driver);
	}

	@BeforeTest
	public void setUp() {
		TestBase.openURL("https://www.saucedemo.com/");
		loginPage.logIntoTheApp("standard_user", "secret_sauce");
	}

	@Test(priority = 1)
	public void porductTest() {
		productList.addToCart();
		productList.viewCart();
	}

	@Test(priority = 2)
	public void verfyItemsTest() {
		cartPage.verifyItems();
	}

	@Test(priority = 3)
	public void checkoutItemsTest() {
		cartPage.clickCheckoutBtn();
	}

	@Test(priority = 4)
	public void checkoutFormTest() {
		checkoutPage.enterCustomerDetails("abc", "pqr", "11011");
	}

	@AfterTest
	public void tearDown() {
		TestBase.tearDown();
	}
}
