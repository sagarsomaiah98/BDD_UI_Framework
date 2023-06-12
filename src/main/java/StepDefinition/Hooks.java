package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;

import Pages.LoginPage;
import TestBase.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends TestBase {
	
	@Before
	public void intial() {
		try {
			intialize();
		} catch (IOException e) {
			log.info("############### Exception ###############" );
			log.warn(e);
			log.info("###############");
		}
	}
	
	
	@After
	public void teardown() {
		try {
	driver.quit();
		}
		catch(Exception e) {
			log.info("Unable to quit browser");
			log.warn(e);
			
		}
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {

//	if(scenario.isFailed())
//	{
	final byte[] screenshot = ((TakesScreenshot)driver) .getScreenshotAs (OutputType. BYTES) ;

	//attach image file report(data, media type, name of the attachment)
	scenario.attach(screenshot, "image/png", scenario.getName());

	
//}
}
}