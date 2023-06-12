package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class LoginPage extends TestBase {
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='input-email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='input-password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement login;
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	public WebElement myAccount;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	public WebElement warningNoMatch;
	
	
	@FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	public WebElement forgotPassword;
	


	public void login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	}
}
