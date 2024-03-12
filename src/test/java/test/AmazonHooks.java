package test;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AmazonHooks {
WebDriver driver;
DriverFactory df = new DriverFactory();
@Before
public void launchBrowser() {
	driver =df.initBrowser();
	driver.manage().window().maximize();
}
@After
public void tearDown() {
	driver.quit();
}


}
