package objectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resdiffloginpage_object_factory {
	WebDriver driver;

	public Resdiffloginpage_object_factory(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(Tc element, local argument);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;
	@FindBy(xpath = "////input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//a[contains(text(),'rediff.com')]")
	WebElement link_home;

	public WebElement Emailid() {
		return username;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement link() {
		return link_home;
	}

}
