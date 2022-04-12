package test;

import org.testng.annotations.*;
import driver.Driver;
import pages.buyPage;
import utilities.commonMethods;

public class CRW006_FindOverseaspropertiesforsalefunctionality extends commonMethods {

    @BeforeMethod
    public void launchBrowser() {
        Driver.getDriver();
        System.out.println("Browser is opening now");
        comm.acceptCookieBtn.click();
    }

    @Test
    public void clickOverseasForSale(){
        buy.clickOverseasForSale();
    }

    @Test
    public void clickCanaryIslands() {
        buy.clickCanaryIslands();
    }

    @Test
    public void clickThailand() {
        buy.clickThailand();
    }

    @AfterMethod
    public void afterTest() {
        Driver.tearDown();
    }

}

