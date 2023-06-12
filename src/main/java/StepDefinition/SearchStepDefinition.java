package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Pages.SearchPage;
import TestBase.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchStepDefinition extends TestBase{
	
	SearchPage searchpage = new SearchPage();
	
	@Given("I search the product {string}")
	public void i_search_the_item(String product) throws IOException {
	
		try {
	//	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(product);
	//	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		searchpage.searchProduct.sendKeys(product);
		searchpage.search.click();
		}
		catch(Exception e) {
			System.out.println("Unable to perform search");
			
		}
	}

	@Then("search result should be displayed")
	public void search_result_should_be_displayed() throws IOException {
		
		
		
		String expected="iMac";
		String actual = null;
	    try {
	   
	  	    actual=searchpage.iMac.getText();
	    }
	    catch(Exception e) {
	    	System.out.println("Search Failed");
	    	
	    }
		assertEquals(actual, expected);
		log.info("Actual --"+actual);
		log.info("Expected -- iMac");
	}
	
	}



