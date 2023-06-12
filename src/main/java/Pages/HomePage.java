package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	public WebElement addtoCart ;
	
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	public WebElement shoppingCart ;
	
	@FindBy(xpath="//a[@class='dropdown-toggle'][normalize-space()='Desktops']")
	public WebElement desktopMenu;
	
	@FindBy(xpath="//a[normalize-space()='PC (0)']")
	public WebElement PC ;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	public WebElement continueShopping ;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement continuePC ;
	


}
