package test;

import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.Driver;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.PropertiesReader;
import utilities.commonMethods;

public class CRW008_FindDevelopmentsFunctionality extends commonMethods {

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		// 1. Open the browser and navigate to https://www.onthemarket.com/
		Driver.getDriver();

	}

	@Test(priority =1,enabled = true)
	public void CRW008_FindAllDevelopersLogo() {

		// 2.Click "Accept All" to accept all cookies on the pop-up box.
		comm.acceptCookieBtn.click();

		// 3.Hover the pointer to "New Homes" tab on top of the page.
		Actions action = new Actions(driver);
		action.moveToElement(newHomes.newhomesmenu).build().perform();

		// 4.The "New Homes" menu should appears.
		// 5.Click on "Find Developments" menu.
		newHomes.findDevelopments.click();

		// 6.User should see developers' name and logos under New homes by developer section.
		int sizeLinks = newHomes.allDeveloperLogoLinks.size();
		int sizeLogoNames = newHomes.allDeveloperLogoNames.size();
		Assert.assertEquals(sizeLinks, sizeLogoNames);

	}

	@Test(enabled = true)
	public void CRW008_FindAllDevelopersLogoClickable() {
		// 2.Click "Accept All" to accept all cookies on the pop-up box.
		comm.acceptCookieBtn.click();

		// 3.Hover the pointer to "New Homes" tab on top of the page.
		Actions action = new Actions(driver);
		action.moveToElement(newHomes.newhomesmenu).build().perform();

		// 4.The "New Homes" menu should appears.
		// 5.Click on "Find Developments" menu.
		newHomes.findDevelopments.click();

		// 6.User should see developers' name and logos under "New homes" by developer
		// section.
		int sizeLinks = newHomes.allDeveloperLogoLinks.size();
		int sizeLogoNames = newHomes.allDeveloperLogoNames.size();
		Assert.assertEquals(sizeLinks, sizeLogoNames);


		// 7.All logos should be clickable.
		int sizeLogos = newHomes.allDeveloperLogoLinks.size();
		for (WebElement logo : newHomes.allDeveloperLogoLinks) {
			RequestSpecification httpRequest = RestAssured.given();
			Response myResponse = httpRequest.get(logo.getAttribute("href"));

			int statusCode = myResponse.getStatusCode();
			System.out.println(logo.getAttribute("href"));
			System.out.println(statusCode);
			Assert.assertEquals(statusCode, 200);
		}
	}

	@Test(enabled = true) //bugs
	public void CRW008_VerifyFieldboxIsWorking() {
				// 2.Click "Accept All" to accept all cookies on the pop-up box.
				comm.acceptCookieBtn.click();
				
				// 3.Hover the pointer to "New Homes" tab on top of the page.
				Actions action = new Actions(driver);
				action.moveToElement(newHomes.newhomesmenu).build().perform();
				
				// 4.The "New Homes" menu should appears.
				// 5.Click on "Find Developments" menu.
				newHomes.findDevelopments.click();
				
				// 6.Put in text field in the first text field box by valid data info provided.
				newHomes.searchBar.sendKeys(PropertiesReader.getProperty("CRW008_CityName"));
				
				// 7.User should see and select the correct choice.

				// 8.Click on magnify logo in red blackground on the right of that field box.
				Actions actions = new Actions(driver);
				WebElement elementLocator = newHomes.searchBarButton;
				actions.doubleClick(elementLocator).perform();
				

				// 9.User should see developers' information listing that located in specific
				// entered city.
				String expectedTitle = PropertiesReader.getProperty("CRW008_BristolTitle");
				String actaulTitle = driver.getTitle();
				Assert.assertEquals(actaulTitle, expectedTitle);
			}

	@AfterMethod(alwaysRun = true)
	public void afterTest() {
		Driver.tearDown();
	}
}
