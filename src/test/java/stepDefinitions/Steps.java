package stepDefinitions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchPage;
import cucumber.api.java.en.*;


public class Steps extends BaseClass{
	
	public WebDriver driver;
	
	
	@Given("^User Launch Chrome Browser$")
	public void user_Launch_Chrome_Browser() {
		logger=Logger.getLogger("Commerce");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Commerce_ProjectV1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		logger.info("Launch Browser");
		lp=new LoginPage(driver);
		
	    
	}

	@When("^User opens url \"([^\"]*)\"$")
	public void user_opens_url(String url) {
		driver.get(url);
		logger.info("url is opened");
	    
	}

	@When("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String email, String password)  {
		lp.setUserName(email);
		lp.setPassword(password);
		logger.info("User details are entered");
	
	}
	    

	@When("^Click on Login$")
	public void click_on_Login()  {
		lp.clickLogin();
		logger.info("clicked on Login");
	    
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title)  {
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title,driver.getTitle());
		}
	    
	}

	@When("^user clicks on Logout link$")
	public void user_clicks_on_Logout_link() throws InterruptedException  {
		lp.clickLogout();
		logger.info("User clicks on logout");
		Thread.sleep(3000);
	    
	}
	
	
	   
	@Then("User can view Dashboad")
	public void user_can_view_Dashboad() {
		ac= new AddCustomerPage(driver);
		
	
	    
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_Menu() {
	   ac.clickCustomers();
	}

	@When("click on customers Menu Item")
	public void click_on_customers_Menu_Item() {
	    ac.clickcustomersItem();
	}

	@When("click on Add new button")
	public void click_on_Add_new_button() {
	   ac.clickaddNew();
	   logger.info("Clicked on add new button");
	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() {
		logger.info("User can view customer page");
	    
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		String email=randomString()+"@gmail.com";
		ac.setEmail(email);
		ac.setPassword("ac123");
		ac.setfirstName("vvvvv");
		ac.lastName("uuuuu");
		ac.clickGender("Male");
		ac.setcustomerRoles("Guest");
	   
	}

	@When("click on Save button")
	public void click_on_Save_button() throws InterruptedException {
		Thread.sleep(2000);
		ac.clickSave();
		
		logger.info("Clicked on save");
	   
	}
	
	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("The new customer has been added successfully"));
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	    logger.info("browser closed");
	}

	

	@Then("Close browser")
	public void closebrowser() {
	   driver.quit();
	}

	@When("Enter customer EMail")
	public void enter_customer_EMail() {
		sp=new SearchPage(driver);
		logger.info("Searching customer details by Email ");
		sp.searchEmail("victoria_victoria@nopCommerce.com");
	}

	@When("Click on search button")
	public void click_on_search_button() throws InterruptedException {
		sp.clickSearch();
		Thread.sleep(3000);
	}


	


}
