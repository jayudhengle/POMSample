package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	
	@FindAll(value = @FindBy(css = "inventory_item_name"))
	List<WebElement>  items;
	
	@FindBy(id = "continue-shopping")
	WebElement continueBtn;
	
	@FindBy(id = "checkout")
	WebElement chekoutBtn;
	
	@FindBy(id = "remove-sauce-labs-backpack")
	WebElement removeBtn;
	
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyItems()
	{
		if(!items.isEmpty())
			return true;
		else
			return false;
	}
	
	public void clickCheckoutBtn()
	{
		chekoutBtn.click();
	}
	
	public void clickContinueShoppingBtn()
	{
		continueBtn.click();
	}
	
	
	
	

}
