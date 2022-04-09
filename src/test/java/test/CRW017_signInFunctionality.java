package test;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import driver.Driver;

import utilities.PropertiesReader;
import utilities.commonMethods;

@Test (groups= {"Smoke"})
public class CRW017_signInFunctionality extends commonMethods {

	@BeforeMethod
	public void openBrowser() {
		Driver.getDriver();
	}

	@Test
	public void signinPage() {
		comm.acceptCookieBtn.click();
		comm.signinMenu.click();
		signin.emailInput.sendKeys(PropertiesReader.getProperty("CRW017.email"));
		signin.nextButton.click();
		signin.passwordInput.sendKeys(PropertiesReader.getProperty("CRW017.password"));
		signin.signinButton.click();
	}

	@Test
	public void signinPageWithInvalidPassword() {
		comm.acceptCookieBtn.click();
		comm.signinMenu.click();
		signin.emailInput.sendKeys(PropertiesReader.getProperty("CRW017.email"));
		signin.nextButton.click();
		signin.passwordInput.sendKeys(PropertiesReader.getProperty("CRW017.invalidpassword"));
		signin.signinButton.click();
	}

	@AfterMethod
	public void afterTest() {
		Driver.tearDown();
	}

}
