package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import driver.Driver;
 import utilities.commonMethods;

public class CRW005_SearchForRent extends commonMethods {

	@BeforeMethod
	public void launchBrowser() {

		Driver.getDriver();
		comm.acceptCookieBtn.click();
		
	}

	@Test
	public static void CRW005_SearchRentByLocationFunctionality() {
		 
		rent.rentButton.click();
        rent.searchBox.sendKeys("London", Keys.ENTER);

		String ActualText=rent.propertyInfo.getText();
		String ExpectedText = "Property & houses to rent in London";
		
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("You are on the page contains Houses for rent in London");
		 
	}
	
	@Test
	public static void CRW005_RadiusDropDownFunctianlityTest() {
		
		 
		rent.rentButton.click();
        rent.searchBox.sendKeys("London", Keys.ENTER);
 
	 	
	Assert.assertTrue(rent.TaskBar.isDisplayed());
	System.out.println("Task bar is  displaying.");
	
 
	rent.RadiusButton.click();
 	
	if(rent.RadiusSelector.isDisplayed()&&rent.RadiusSelector.isEnabled()) {
		System.out.println("Radius Dropdown is visible. ");
         Select select= new Select(rent.RadiusSelector);
		select.selectByValue("3");
		 
		System.out.println("Radius 3 miles is selected.");
	}else {
		System.out.println("Radius Dropdown is not visible.");
		}
		
		
		 
	}
	
	@Test
	public void CRW005_PropertyTypeButtonValidation() {
		 
		rent.rentButton.click();
        rent.searchBox.sendKeys("London", Keys.ENTER);
		 	
	 Assert.assertTrue(rent.TaskBar.isDisplayed());
	System.out.println("Task bar is  displaying.");
	
	 
	rent.PropertyTypeButton.click();
	 
	 rent.detachedHouse.click();
	 
	 Assert.assertTrue(rent.detachedHouse.isEnabled());
	 System.out.println("Detached House is selected.");
	 
	
		 
	}
		
	@AfterMethod
	public void afterTest() {
		Driver.tearDown();	
		
		//
	}
	
}
