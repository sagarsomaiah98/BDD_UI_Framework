package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class SearchPage extends TestBase {
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement searchProduct;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	public WebElement search ;
	
	@FindBy(xpath="//a[normalize-space()='iMac']")
	public WebElement iMac ;
	
	

}
