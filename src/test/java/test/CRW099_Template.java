package test;

import driver.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.ListernersTestNG;
import utilities.PropertiesReader;
import utilities.commonMethods;

@Listeners(ListernersTestNG.class)
public class CRW099_Template extends commonMethods{

	@BeforeTest
	public void launchBrowser() {
		Driver.getDriver();
	}

	@Test
	public void test() {
		printMsg("CRW099_Template");
		comm.acceptCookieBtn.click();
		comm.signinMenu.click();
		signin.emailInput.sendKeys(PropertiesReader.getProperty("email"));
		signin.nextButton.click();
	}

	@AfterTest
	public void afterTest() {
		Driver.tearDown();
	}
}
