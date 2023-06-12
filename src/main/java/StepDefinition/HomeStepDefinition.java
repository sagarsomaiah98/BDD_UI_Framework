package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Pages.HomePage;
import TestBase.TestBase;
import Util.TestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeStepDefinition extends TestBase {
	
	HomePage homepage = new HomePage();
	
	@Given("I click on addtocart")
	public void i_click_on_addtocart() {
	
		try {
	   homepage.addtoCart.click();
	//	driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
		}
		catch(Exception e) {
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
		}
	}
	@Given("I click on shoppingcart")
	public void i_click_on_shoppingcart() {
		
		try {
		  homepage.shoppingCart.click();
		}
		catch(Exception e) {
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
		}
	   
	}
	
	@Given("I click on PC\\(O) under Desktop menu")
	public void i_click_on_pc_under_desktop_menu() {
	//	WebElement desktop=driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']"));
		try {
		TestUtil.MouseAction(homepage.desktopMenu);
		homepage.PC.click();
		}
		catch(Exception e) {
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//a[normalize-space()='PC (0)']")).click();
	}
	
	
	//a[@class='btn btn-default']
	@Given("I click on Continue Shopping")
	public void i_click_on_continue_shopping() {
		try {
		homepage.continueShopping.click();
		}
		catch(Exception e) {
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
	}
	
	@Given("I click on Continue in PC page")
	public void i_click_on_continue_in_pc_page() {
		try {
		homepage.continuePC.click();
		}
		catch(Exception e) {
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	}

	@Then("I am navigated to homepage")
	public void i_am_navigated_to_homepage() throws IOException {
		String expected="Your Store";
		String actual = null;
	    try {
		
	    actual=driver.getTitle();
	    }
	    catch(Exception e) {
	    	log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
			e.printStackTrace();
	    	System.out.println("Navigation to homepage failed");
	    	log.info("Actual --"+actual);
			log.info("Expected -- Navigation to homepage failed");
	    	
	    }
		assertEquals(actual, expected);
	}
	
	}


