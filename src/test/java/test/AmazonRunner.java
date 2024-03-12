package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"resource\\amazonfeature"},
		glue = {"test"},
		plugin = {"pretty","html:@target\\amazon.html","rerun:@target\\amazonfalied.txt"}
		
		
		)
public class AmazonRunner extends AbstractTestNGCucumberTests
{

}
