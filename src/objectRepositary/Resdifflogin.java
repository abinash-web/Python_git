package objectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resdifflogin {
WebDriver driver;
public  Resdifflogin(WebDriver driver)
{
	this.driver= driver;
}
By username= By.xpath("//input[@id='login1']");
By password= By.xpath("//input[@id='password']");
By go = By.xpath("//input[@type='submit']");
By link_home=By.xpath("//a[contains(text(),'rediff.com')]");
public WebElement Emailid()
{
	return driver.findElement(username);
}
public WebElement Password()
{
	return driver.findElement(password);
}
public WebElement Submit()
{
	return driver.findElement(go);
}
public WebElement link()
{
	return driver.findElement(link_home);
}


}
