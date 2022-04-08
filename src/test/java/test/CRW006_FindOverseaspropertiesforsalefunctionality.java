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
        buyPage buypage = new buyPage();
        buypage.clickOverseasForSale();
    }

    @Test
    public void clickCanaryIslands() {
        buyPage buypage = new buyPage();
        buypage.clickCanaryIslands();
    }

    @Test
    public void clickThailand() {
        buyPage buypage = new buyPage();
        buypage.clickThailand();
    }

    @AfterMethod
    public void afterTest() {
        Driver.tearDown();
    }

}

