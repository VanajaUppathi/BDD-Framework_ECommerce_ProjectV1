package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BaseClass;

public class SearchPage extends BaseClass {
	
	public WebDriver ldriver;
	
	public SearchPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='SearchEmail']")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//button[@id='search-customers']")
	@CacheLookup
	WebElement search;
	
	public void searchEmail(String mail) {
		email.sendKeys(mail);
		
	}
	
	public void clickSearch() throws InterruptedException {
	search.click();
	Thread.sleep(3000);
	}
	
	

}
