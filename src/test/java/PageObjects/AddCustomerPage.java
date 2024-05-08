package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BaseClass;

public class AddCustomerPage extends BaseClass {
	
	public WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	@CacheLookup
	WebElement customers;
	
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	@CacheLookup
	WebElement customersItem;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	@CacheLookup
	WebElement Addnew;
	
	@FindBy(xpath = "//input[@id='Email']")
	@CacheLookup
	WebElement txtEmail;
	

	@FindBy(xpath = "//input[@id='Password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='LastName']")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='Gender_Male']")
	@CacheLookup
	WebElement genderMale;
	
	@FindBy(xpath = "//input[@id='Gender_Female']")
	@CacheLookup
	WebElement genderFemale;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]")
	@CacheLookup
	WebElement txtcustomerRoles;
	
	@FindBy(xpath = "//li[@id='select2-SelectedCustomerRoleIds-result-vnvw-1']")
	@CacheLookup
	WebElement itemAdmin;
	
	@FindBy(xpath = "//li[@id='select2-SelectedCustomerRoleIds-result-puia-2']")
	@CacheLookup
	WebElement itemForum;
	
	@FindBy(xpath = "//li[@id='select2-SelectedCustomerRoleIds-result-nrst-3']")
	@CacheLookup
	WebElement itemRegister;
	
	@FindBy(xpath = "//li[contains(text(),'Guests')]")
	@CacheLookup
	WebElement itemGuests;
	
	@FindBy(xpath = "//li[@id='select2-SelectedCustomerRoleIds-result-28g3-5']")
	@CacheLookup
	WebElement itemVendors;
	

	@FindBy(xpath = "//button[@name='save']")
	@CacheLookup
	WebElement save;
	
	public void clickCustomers() {
		customers.click();
		
	}
	
	public void clickcustomersItem() {
		customersItem.click();
		
	}
	
	public void clickaddNew() {
		Addnew.click();
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
		
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setfirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void lastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void clickGender(String gender) {
		if(gender.equals("Male")) {
			genderMale.click();
		}
		else {
			genderFemale.click();
		}
		
	}
	public void setcustomerRoles(String role) throws InterruptedException {
		
		
		
		Thread.sleep(3000);
		
		//txtcustomerRoles.click();
		

	}
	
	public void clickSave() {
		save.click();
	}
	
	}
	
	
	
	


