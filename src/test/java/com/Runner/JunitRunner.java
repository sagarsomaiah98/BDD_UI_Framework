package com.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Login.feature",glue={"StepDefinition"},

/*"html:Reports\\HTMLReports", 
	"json:Reports\\JsonReports\\Cucumber.json",
	"junit:Reports\\JUnitReport\\Cucumber.xml",*/
dryRun = false,
monochrome = true,
tags = "@Login",//scenarios under @sanity tag will be executed
//plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}



)

public class JunitRunner {

	
	

}
