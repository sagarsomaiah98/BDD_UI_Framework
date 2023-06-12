package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class RegisterPage extends TestBase {
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	public WebElement fname;
	@FindBy(xpath="//input[@id='input-lastname']")
	public WebElement lname;
	@FindBy(xpath="//input[@id='input-email']")
	public WebElement email;
	@FindBy(xpath="//input[@id='input-telephone']")
	public WebElement telephone;
	@FindBy(xpath="//input[@id='input-password']")
	public WebElement password;
	@FindBy(xpath="//input[@id='input-confirm']")
	public WebElement confirmPassword;
	@FindBy(xpath="//input[@name='agree']")
	public WebElement privacyPolicy;
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement continu;
	
	@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	public WebElement fnameWarning;
	
	@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	public WebElement lnameWarning;
	
	@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	public WebElement emailWarning;
	
	@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	public WebElement telephoneWarning;
	
	@FindBy(xpath="//div[contains(text(),'Password must be between 4 and 20 characters!')]")
	public WebElement passwordWarning;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	public WebElement privacypolicyWarning;
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	public WebElement myAccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	public WebElement register;
	
	
	@FindBy(xpath="//div[@id='content']/h1")
	public WebElement accountCreationMessage;
	
	

}
