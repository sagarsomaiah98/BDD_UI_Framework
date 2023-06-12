package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class LogoutPage extends TestBase{
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
	public WebElement logout;
	
	
	@FindBy(xpath="//h1[normalize-space()='Account Logout']")
	public WebElement accountLogout;

	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
}
