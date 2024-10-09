package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(
		features = "Feature", 
		glue = { "stepDefinition" })

public class TestRunner extends AbstractTestNGCucumberTests{

}
