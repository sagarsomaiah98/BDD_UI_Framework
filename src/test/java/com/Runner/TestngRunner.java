package com.Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features="src\\test\\resources\\features",glue={"StepDefinition"},
tags="@NinjaRegression",

plugin= {"html:Reports\\HTMLReports", 
		"json:Reports\\JsonReports\\Cucumber.json",
		"junit:Reports\\JUnitReport\\Cucumber.xml",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}



)
public class TestngRunner extends AbstractTestNGCucumberTests {

}
