package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import driver.Driver;
import utilities.PropertiesReader;
import utilities.commonMethods;

public class CRW005_SearchForRent extends commonMethods {

    @BeforeMethod
    public void launchBrowser() {
        Driver.getDriver();

    }

    @Test
    public static void CRW005_SearchRentByLocationFunctionality() {
		comm.acceptCookieBtn.click();
        comm.rentMenu.click();
        rent.searchBox.sendKeys(PropertiesReader.getProperty("CRW005_City"), Keys.ENTER);

        String ActualText = rent.propertyInfo.getText();

        Assert.assertEquals(ActualText, PropertiesReader.getProperty("CRW005_ExpectedText"));
        System.out.println("You are on the page contains Houses for rent in London");

    }

    @Test
    public static void CRW005_RadiusDropDownFunctianlityTest() {
		comm.acceptCookieBtn.click();
        comm.rentMenu.click();
        rent.searchBox.sendKeys(PropertiesReader.getProperty("CRW005_City"), Keys.ENTER);

        Assert.assertTrue(rent.TaskBar.isDisplayed());
        System.out.println("Task bar is  displaying.");

        rent.RadiusButton.click();

        if (rent.RadiusSelector.isDisplayed() && rent.RadiusSelector.isEnabled()) {
            System.out.println("Radius Dropdown is visible. ");
            Select select = new Select(rent.RadiusSelector);
            select.selectByValue(PropertiesReader.getProperty("CRW005_Radius"));

            System.out.println("Radius 3 miles is selected.");
        } else {
            System.out.println("Radius Dropdown is not visible.");
        }
    }

    @Test
    public void CRW005_PropertyTypeButtonValidation() {
		comm.acceptCookieBtn.click();
        comm.rentMenu.click();
        rent.searchBox.sendKeys(PropertiesReader.getProperty("CRW005_City"), Keys.ENTER);

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
    }

}
