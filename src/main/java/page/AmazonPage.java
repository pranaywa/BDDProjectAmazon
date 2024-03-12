package page;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPage {
 
	WebDriver driver;
	WebDriverWait wait;
@FindBy(xpath = "(//*[@class='nav-line-2'])[3]")
WebElement cartIcon;
@FindBy(xpath = "//*[text()='Hello, sign in']")
WebElement helloSignButton;
@FindBy(xpath = "(//*[text()='Sign in'])[1]")
WebElement signInbutton;
@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
WebElement searchField;
@FindBy(xpath = "//*[@class='nav-right']/descendant::input")
WebElement searchIcon;
@FindBy(xpath = "//*[contains(text(),'Redmi 13C 5G (Starlight Black, 8GB RAM')]")
WebElement redmiMobile;

public AmazonPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));
}

public boolean validateCartIcon() {
	boolean isPresent=cartIcon.isDisplayed();
	return isPresent;
}
public void clickOnsearchField() {
	searchField.click();
}
public void typeMobileInSearch() {
	searchField.sendKeys("mobile");
}
public void clickOnsearch() {
	searchIcon.click();
}
public String ValidateMobilePage() {
	wait.until(ExpectedConditions.titleContains("mobile"));
	String title =driver.getTitle();
	return title;
}
public void clickOnRedmi() {
	redmiMobile.click();
}
public String validateRedmiPage() {
String parentId=driver.getWindowHandle();
Set<String> winIds =driver.getWindowHandles();
String title ="";
for(String id:winIds) {
	if(!(parentId.equals(id))) {
		driver.switchTo().window(id);
		title=driver.getTitle();
	}
	}
	return title;
}
public void hoverOnSignIn() {
	Actions act = new Actions(driver);
	act.moveToElement(helloSignButton).perform();
}
public boolean validateSignInButton() {
	boolean isPresent = signInbutton.isDisplayed();
	return isPresent;
}
public void clickOnsignbutton() {
	signInbutton.click();
}
public String validateSignInpage() {
	String title = driver.getTitle();
	return title;
}




}
