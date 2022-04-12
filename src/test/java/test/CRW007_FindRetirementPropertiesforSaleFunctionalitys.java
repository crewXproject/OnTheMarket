package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import driver.Driver;
import utilities.ListernersTestNG;
import utilities.commonMethods;
@Listeners(ListernersTestNG.class)
public class CRW007_FindRetirementPropertiesforSaleFunctionalitys extends commonMethods{
		
	@BeforeMethod 
	public void launchBrowser() {
		Driver.getDriver();
	}
	@Test
	public void CRW007_ValidInput() {
		printMsg("CRW007_FindRetirementPropertiesforSaleFunctionalitys");
		comm.acceptCookieBtn.click();
		comm.buyMenu.click();
		comm.Retirement.click();
		comm.Searchbox.click();
		comm.Searchbox.sendKeys("Liverpool");
		comm.Search.click();
		String expected_Title = "Search Retirement Properties For Sale In Liverpool | OnTheMarket";
		String actual_Title = driver.getTitle();

		Assert.assertEquals(expected_Title, actual_Title);
	}

	@Test
	public void CRW007_ValidatingCitylink(){
		printMsg("CRW007_FindRetirementPropertiesforSaleFunctionalitys");
		comm.acceptCookieBtn.click();
		comm.buyMenu.click();
		comm.Retirement.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2300)");
		comm.Peterborough.click();
		comm.Link.click();
		String expected_Title = "Search Retirement Properties For Sale In Peterborough | OnTheMarket";
		String actual_Title = driver.getTitle();

		Assert.assertEquals(expected_Title, actual_Title);
	}

	
	@Test
	public void CRW007_Invalidnput() {
		printMsg("CRW007_FindRetirementPropertiesforSaleFunctionalitys");
		comm.acceptCookieBtn.click();
		comm.buyMenu.click();
		comm.Retirement.click();
		comm.Instantvaluation.click();
		comm.Searchbox2.sendKeys("lm56Jk//@;");
		comm.Search2.click();
		
	}
	
	@AfterMethod
	public void afterTest() {
		Driver.tearDown();
	}
	
	}

