package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import driver.Driver;
import utilities.ListernersTestNG;
import utilities.commonMethods;
@Listeners(ListernersTestNG.class)
public class CRW007_FindRetirementPropertiesforSaleFunctionalitys extends commonMethods{
		
	@BeforeTest
	public void launchBrowser() {
		Driver.getDriver();
	}
	@Test
	public void CRW007_Validnput() {
		printMsg("CRW007_FindRetirementPropertiesforSaleFunctionalitys");
		comm.acceptCookieBtn.click();
		comm.buyMenu.click();
		comm.Retirement.click();
		comm.Searchbox.click();
		comm.Searchbox.sendKeys("Liverpool");
		comm.Search.click();
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
	
	@AfterTest
	public void afterTest() {
		Driver.tearDown();
	}
	}

