package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Pages.RegisterPage;
import TestBase.TestBase;
import Util.TestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterStepDefinition extends TestBase {
	RegisterPage registerpage = new RegisterPage();
	
	@Given("I click on MyAccount")
	public void i_click_on_my_account() throws IOException {
	    try {
	    registerpage.myAccount.click();
	    	
		//driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	    }
	    catch( Exception e) {
	    	System.out.println("unable to click on myAccount");
	    	log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
	    	
	    }
	}

	@Given("I click Register")
	public void i_click_register() throws IOException {
		 try {
			 
			 registerpage.register.click();
			// driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();
			  
		 }
			    catch( Exception e) {
			    	System.out.println("unable to click on myAccount");
			    	log.info("############### Exception ###############" );
					log.warn(e);
					log.info("###############");
					e.printStackTrace();
			    	
			    }
		
		
	}

	@Given("I enter new account details for mandatory fields {string} {string} {string} {string} {string}")
	public void i_enter_new_account_details_for_mandatory_fields(String fname, String lname, String telephone, String password, String confirmpassword) throws IOException {
		try {
		
		registerpage.fname.sendKeys(fname);
		registerpage.lname.sendKeys(lname);
		registerpage.email.sendKeys(TestUtil.randomEmail());
		registerpage.telephone.sendKeys(telephone);
		registerpage.password.sendKeys(password);
		registerpage.confirmPassword.sendKeys(confirmpassword);
		}
		catch(Exception e) {
			System.out.println("unable to fill mandatory fields");
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
			
		}
	}
	@Then("I verify Account is created")
	public void i_verify_account_is_created() throws IOException {
		String expected="Your Account Has Been Created!";
		String actual = null;
		
	    try {
	    	
	   // actual=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
	    actual=registerpage.accountCreationMessage.getText();
	    }
	    catch(Exception e) {
	    	System.out.println("Register with new account failed");
	    	log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
	    	
	    }
		assertEquals(actual, expected);
	}
		


	@Given("I click Privacy Policy")
	public void i_click_privacy_policy() {
		try {
			registerpage.privacyPolicy.click();
		}
		catch(Exception e)
		{
			System.out.println("unable to click on privacy policy");
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
			}
		}

	@Given("I click on Continue")
	public void i_click_on_continue() {
		try {
			registerpage= new RegisterPage();
			registerpage.continu.click();
			}
			catch(Exception e)
			{
				System.out.println("unable to click on continue");
				log.info("############### Exception ###############" );
				log.warn(e);
				log.info("###############");
				e.printStackTrace();
				}
		
		
	    
	}
	
	@Then("I verify Warning message for mandatory fields {string} {string} {string} {string}  {string} {string}")
	public void i_verify_warning_message_for_mandatory_fields_warning_f_name_l_name_warning_f_name_password(String privacypolicyWarning ,String fnameWarning, String lnameWarning, String emailWarning,String telephoneWarning,String passwordWarning) {
		try {
		assertEquals(registerpage.privacypolicyWarning.getText(), privacypolicyWarning);
		assertEquals(registerpage.fnameWarning.getText(), fnameWarning);
		assertEquals(registerpage.lnameWarning.getText(), lnameWarning);
		assertEquals(registerpage.emailWarning.getText(), emailWarning);
		assertEquals(registerpage.telephoneWarning.getText(), telephoneWarning);
		assertEquals(registerpage.passwordWarning.getText(), passwordWarning);
		}
		catch(Exception e) {
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
		}
		
	}


}
