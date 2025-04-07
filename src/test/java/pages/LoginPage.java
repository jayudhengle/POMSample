package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="user-name")
	WebElement uerID;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void logIntoTheApp(String strUerID, String strPassword)
	{
		uerID.sendKeys(strUerID);
		password.sendKeys(strPassword);
		loginBtn.click();
	}


	
}
