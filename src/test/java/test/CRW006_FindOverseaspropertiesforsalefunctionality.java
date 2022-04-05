package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.Driver;
import pages.buyPage;

public class CRW006_FindOverseaspropertiesforsalefunctionality {


    @BeforeTest
    public void launchBrowser() {
        Driver.getDriver();

        System.out.println("Browser is opening now");


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







    @AfterTest
    public void afterTest() {
        Driver.tearDown();



    }







}
