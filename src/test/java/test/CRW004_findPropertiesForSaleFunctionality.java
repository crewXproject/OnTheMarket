package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import driver.Driver;
import pages.commonPage;
import utilities.commonMethods;

public class CRW004_findPropertiesForSaleFunctionality extends commonMethods {

	@BeforeMethod
	public void openBrowser() {
		Driver.getDriver();
	}

	@Test
	public void CRW004_testBuyTab() {
		comm.acceptCookieBtn.click();
		Actions action = new Actions(driver);
		action.moveToElement(comm.buyMenu).build().perform();
		buy.propertyForSale.click();
		String expected_Title = "Property for Sale | Flats & Houses for Sale | OnTheMarket";
		String actual_Title = driver.getTitle();
		Assert.assertEquals(expected_Title, actual_Title);
	}

	@Test
	public void CRW004_testPropertyForSale() {
		comm.acceptCookieBtn.click();
		Actions action = new Actions(driver);
		action.moveToElement(comm.buyMenu).build().perform();
		buy.propertyForSale.click();
		scrollDown(1200);
		buy.showMoreProperties.click();
		String expected_Title = "UK Property | OnTheMarket";
		String actual_Title = driver.getTitle();
		Assert.assertEquals(expected_Title, actual_Title);
		
	}
	@Test
	public void CRW004_testSearchFunctionality() {
		comm.acceptCookieBtn.click();
		Actions action = new Actions(driver);
		action.moveToElement(comm.buyMenu).build().perform();
		buy.propertyForSale.click();
		buy.searchBox.sendKeys("London", Keys.ENTER);
		String expected_Title = "Property for Sale | Flats & Houses for Sale | OnTheMarket";
		String actual_Title = driver.getTitle();
		Assert.assertEquals(expected_Title, actual_Title);
	}

	@AfterMethod
	public void afterTest() {
		Driver.tearDown();
	}
}
