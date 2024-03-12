package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"@target\\amazonfalied.txt"}
		
		)
public class FailedRunner extends AbstractTestNGCucumberTests
{

}
