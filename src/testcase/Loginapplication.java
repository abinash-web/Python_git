package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepositary.Resdiffhomepage;
import objectRepositary.Resdifflogin;

public class Loginapplication {
	@Test
	public  void login()
	{
		// Login page class implimented in normal page object pattern style
		// Home page class implimented page object factory 
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Resdifflogin rf = new Resdifflogin(driver);
		rf.Emailid().sendKeys("hello");
		rf.Password().sendKeys("1234");
		rf.Submit().click();
		rf.link().click();
		Resdiffhomepage rh = new Resdiffhomepage(driver);
		rh.Search_box().sendKeys("mobile");
		rh.Search_btn().click();
	}

}
