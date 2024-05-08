package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchPage;

public class BaseClass {
	
	WebDriver driver;
	LoginPage lp;
	AddCustomerPage ac;
	SearchPage sp;
	public static Logger logger;
	
	public static String randomString() {
		String generated=RandomStringUtils.randomAlphabetic(5);
		return (generated);
	}

}
