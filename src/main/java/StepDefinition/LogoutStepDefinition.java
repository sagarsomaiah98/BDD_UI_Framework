package StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import Pages.LogoutPage;
import TestBase.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition extends TestBase{

	LogoutPage logoutpage= new LogoutPage();
	
	@When("I click on LogOut")
	public void i_click_on_log_out() {
		try {
	
	logoutpage.logout.click();
		}
		catch(Exception e) {
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
		}
	}

	@Then("I verify user is logged out")
	public void i_verify_user_is_logged_out() {
		
		
		String expected="Account Logout";
		String actual = null;
	    try {
		
	    actual=logoutpage.accountLogout.getText();
	   
	    }
	    catch(Exception e) {
	    	System.out.println("Logout failed");
	    	log.info("Logout  Failed");
	    	log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
	    }
		assertEquals(actual, expected);
		log.info("Expected -- "+expected);
		log.info("Actual -- "+actual);
	}
	}

