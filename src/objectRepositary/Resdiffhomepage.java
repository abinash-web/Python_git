package objectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resdiffhomepage {
WebDriver driver;
public  Resdiffhomepage(WebDriver driver)
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//input[@id='srchword']")
WebElement search;
@FindBy(xpath="//body/div[3]/div[2]/div[1]/form[1]/input[1]")
WebElement search_btn;

 
public WebElement Search_box() {
	return search;
}
public WebElement Search_btn() {
	return search_btn;
}



}




New code added 


public WebElement Search bar() {
	return search;
}
public WebElement Search_index() {
	return search_btn;
}



afternew branch creation




public WebElement Search bar1() {
	return search;
}
public WebElement Search_index1() {
	return search_btn;
}





public WebElement Search bar2() {
	return search;
}
public WebElement Search_index2() {
	return search_btn;
}

 new code added by some one so code is ready to merage with master branch for regresion testring 

public WebElement Search bar1() {
	return search;
}
public WebElement Search_index1() {
	return search_btn;
}





public WebElement Search bar2() {
	return search;
}
public WebElement Search_index2() {
	return search_btn;
}

}