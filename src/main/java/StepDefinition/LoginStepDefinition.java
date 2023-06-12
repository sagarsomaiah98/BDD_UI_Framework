package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Pages.LoginPage;
import TestBase.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends TestBase {
	public  LoginPage loginpage ;
	

	@Given("I launch browser")
	public void i_launch_chrome_browser() throws IOException {
		try {
		//intialize();
	 loginpage =new LoginPage();
				
		log.info( prop.getProperty("Browser")+" Browser Launched");
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("unable to launch chrome browser");
			log.info("Unable to launch"+ prop.getProperty("Browser")+" browser");
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
		}
	}

	@Given("I Navigate to the url {string}")
	public void i_navigate_to_the_url(String url) {
		try {
			
		driver.get(url);
		log.info("Navigated to "+ prop.getProperty("url"));
		}
		catch(Exception e) {
			log.info("Unable to access "+ prop.getProperty("url"));
			System.out.println("Unable to access "+url);
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
		}
	}

	@When("Enter the username {string}")
	public void enter_the_username(String username) {
		
		
			
	try {
		
		loginpage.username.sendKeys(username);
			log.info("Entered username --  "+username);
	}

		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Failed to enter username");
			log.info("Unable to enter  username --  "+username);
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
		}
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
		try {
			loginpage.password.sendKeys(password);
			log.info("Entered password --  "+password);
				}
				catch(Exception e) {
					log.info(" Unable to enter - - "+password);
					System.out.println("Failed to enter password");
					log.info("############### Exception ###############" );
					log.warn(e);
					log.info("###############");
				}
		
	}

	@When("I click on login button")
	public void i_click_on_login_button() throws IOException {
		try {
			loginpage.login.click();
			log.info("Login clicked");
			
				}
				catch(Exception e) {
					log.info("Unable to click on login");
					System.out.println("Unable to click on login");
					log.info("############### Exception ###############" );
					log.warn(e);
					log.info("###############");
					
					
				}
		
	
	}

	@Then("I validate the login successfully")
	public void i_validate_the_login_successfully() throws IOException {
		
		String actual = null;
	    try {
		
	    actual=loginpage.myAccount.getText();
	    }
	    catch(Exception e) {
	    	System.out.println("Login failed");
	    	log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
	    	
	    }
		assertEquals(actual, "My Account");
		log.info("Actual --"+actual);
		log.info("Expected -- My Account");
	}
		
	@Then("I see no match warninng message")
	public void i_see_warninng_message() throws IOException {
		
		String actual = null;
	    try {
		
	    actual=loginpage.warningNoMatch.getText();
	    log.info("Warning message -- "+loginpage.warningNoMatch.getText());
	    }
	    catch(Exception e) {
	    	log.info("No Error Message Found");
	    	log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
	    	System.out.println("No Error Message Found");
			log.info("Actual --"+actual);
			log.info("Expected -- No Error Message Found\"");
	    	
	    }
	//	assertEquals(actual, "Warning: No match for E-Mail Address and/or Password.");
		assertEquals(actual, "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.");
		log.info("Actual --"+actual);
		log.info("Expected -- Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.");
		
	}
		
	
	@Given("I click forgot password")
	public void i_click_forgot_password() {
		try {
			loginpage.forgotPassword.click();
		}
		catch(Exception e) {
			log.info("Unable to click forgot password");
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
		}
	  
	}
	@Then("I validate email field to reset password")
	public void i_validate_email_field_to_reset_password() throws IOException {
		String actual = null;
	    try {
		
	    actual=loginpage.username.getAttribute("placeholder");
	    }
	    catch(Exception e) {
	    	System.out.println("No Error Message Found");
	    	log.info("No Error Found --");
	    	log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
	    	
	    }
		assertEquals(actual, "E-Mail Address");
		log.info("Actual --"+actual);
		log.info("Expected -- E-Mail Address");
	}
	}

	




