package test;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import driver.Driver;

import utilities.ListernersTestNG;
import utilities.PropertiesReader;
import utilities.commonMethods;

@Listeners(ListernersTestNG.class)
public class CRW007_FindRetirementPropertiesforSaleFunctionalitys extends commonMethods {

	@BeforeMethod
	public void launchBrowser() {
		Driver.getDriver();
	}

	@Test(enabled = true)
	public void CRW007_ValidInput() {
		printMsg("CRW007_FindRetirementPropertiesforSaleFunctionalitys");
		click(comm.acceptCookieBtn);

		// 2.Hover over "Buy" menu button on the top of the page.
		Actions action = new Actions(Driver.getDriver());
		action.moveToElement(comm.buyMenu).build().perform();

		// 3. Click on "Retirement property for sale" menu.

		click(comm.Retirement);
		// 4. User should see "Retirement properties" menu which is already selected.
		// 5. User should be able to enter the city in UK in the search bar.
		// 6. Click on the search button.
// 7. It should navigate to the next page which displays the search results for the user selected city

		sendText(retireHome.searchBox, PropertiesReader.getProperty("CRW007_cityName"));

		click(retireHome.searchButton);

		Driver.wait.until(ExpectedConditions.visibilityOf(retireHome.afterClickedLinkCityNameBox));
		String target = retireHome.afterClickedLinkCityNameBox.getAttribute("value");
		// System.out.println(target);
		Assert.assertTrue(target.contains(PropertiesReader.getProperty("CRW007_cityName")));

	}

	@Test(enabled = true)
	public void CRW007_ValidatingCitylink() {
		printMsg("CRW007_FindRetirementPropertiesforSaleFunctionalitys");
		click(comm.acceptCookieBtn);
		// 2.Hover over "Buy" menu button on the top of the page
		Actions action = new Actions(Driver.getDriver());
		action.moveToElement(comm.buyMenu).build().perform();

		// 3.Click on "Retirement property for sale" menu.
		click(comm.Retirement);
		// 4.Scroll down to "Browse by location" which is located almost toward the
		// bottom of the page.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2300)");
		// 5. Click on "Peterborough" which is located on the right column.
		click(retireHome.Peterborough);
		click(retireHome.retirementPropInPeterboroughLink);
		Driver.wait.until(ExpectedConditions.visibilityOf(retireHome.afterClickedLinkCityNameBox));
		String target = retireHome.afterClickedLinkCityNameBox.getAttribute("value");
		// System.out.println(target);
		Assert.assertTrue(target.contains(PropertiesReader.getProperty("CRW007_cityNameCheck")));

	}

	@Test(enabled = true)
	public void CRW007_InvalidInput() {
		printMsg("CRW007_FindRetirementPropertiesforSaleFunctionalitys");
		click(comm.acceptCookieBtn);
		// 2.Hover over "Buy" menu button on the top of the page
		Actions action = new Actions(Driver.getDriver());
		action.moveToElement(comm.buyMenu).build().perform();

		// 3.Click on "Retirement property for sale" menu.
		click(comm.Retirement);
		// 4. Click on "Instant valuation" menu.
		click(retireHome.instantValuationButton);
		// 5. Enter invalid postcode in the search bar.
		retireHome.searchBoxInstantValuation.sendKeys(PropertiesReader.getProperty("CRW007_InvalidPostal"));
		retireHome.searchBoxInstantValuation.sendKeys(Keys.ENTER);
		// 6. Click on the search button.
		click(retireHome.letsGoButton);
		// 7. Web page should be displayed unauthorized message "Please enter a postcode and select a 
		//postcode from the results below" under the search bar and user will not be able to see the 
		//result.
		Driver.wait.until(ExpectedConditions.visibilityOf(retireHome.postalWarning));
		Assert.assertTrue(retireHome.postalWarning.isDisplayed());

	}

	@AfterMethod(enabled=true)
	public void afterTest() {
		Driver.tearDown();
	}

}
