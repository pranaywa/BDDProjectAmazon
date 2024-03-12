package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AmazonPage;
import qa.DriverFactory;

public class AmazonSteps {
	WebDriver driver;
	AmazonPage a = new AmazonPage(DriverFactory.getDriver());
	
	@Given("User is at home page")
	public void user_is_at_home_page() {
		driver = DriverFactory.getDriver();
		driver.get("https://www.amazon.in");
		
	}

	@Then("User should able to see the cart icon")
	public void user_should_able_to_see_the_cart_icon() {
		boolean isPresent =a.validateCartIcon();
		assertEquals(isPresent,true);
	}

	@Given("User is at homepage")
	public void user_is_at_homepage() {
		driver = DriverFactory.getDriver();
		driver.get("https://www.amazon.in");
	}

	@When("User click on search field")
	public void user_click_on_search_field() {
		a.clickOnsearchField();
	}

	@When("User type mobile in search field")
	public void user_type_mobile_in_search_field() {
		a.typeMobileInSearch();
	}

	@When("User click on search icon")
	public void user_click_on_search_icon() {
		a.clickOnsearch();
	}

	@Then("User is on mobile page")
	public void user_is_on_mobile_page() {
		String title =a.ValidateMobilePage();
		boolean isContain = title.contains("mobile");
		assertEquals(isContain,true);
	}

	@When("User click on one of the mobile")
	public void user_click_on_one_of_the_mobile() {
		a.clickOnRedmi();
	}

	@Then("User is on redmi mobile page")
	public void user_is_on_redmi_mobile_page() throws InterruptedException {
		String title =a.validateRedmiPage();
            boolean isContain=title.contains("Redmi 13C");
            assertEquals(isContain,true);
	}

	@When("User hover on the helloSignIn button")
	public void user_hover_on_the_hello_sign_in_button() {
		a.hoverOnSignIn();
	}

	@Then("User should able to see the signIn button on popup")
	public void user_should_able_to_see_the_sign_in_button_on_popup() {
		boolean isPresent =a.validateSignInButton();
		assertEquals(isPresent,true);
	}

	@When("User click on the signIn button")
	public void user_click_on_the_sign_in_button() {
		a.clickOnsignbutton();
	}

	@Then("User navigate to the signIn page")
	public void user_navigate_to_the_sign_in_page() {
		String title =a.validateSignInpage();
		boolean isContain=title.contains("Amazon Sign In");
		assertEquals(isContain,true);
	}
}
