package pages;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buyPage {

    public buyPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[2]/div/div/div[1]/ul/li[1]/a/div[2]/span")
    public WebElement propertyForSale;
    
    @FindBy(xpath="//a[@class='otm-more-link'][contains(text(),'Show more properties')]")
    public WebElement showMoreProperties;
    
    @FindBy(id="search-location-sale")
    public WebElement searchBox;

        @FindBy(xpath="//span[text()='Buy']")
        public WebElement buyTab;
        
        @FindBy(xpath="//span[text()='Overseas property for sale']")
        public WebElement overseasForSale;
        
        @FindBy(xpath="//h3[text()='Canary Islands']")
        public WebElement CanaryIslands;
        
        @FindBy(xpath="//a[text()='Thailand']")
        public WebElement Thailand;
        
        public void clickOverseasForSale(){
        
            //Instantiate Action Class        
            Actions actions = new Actions(Driver.driver);
            actions.moveToElement(buyTab).perform();
            System.out.println("Done Mouse hover on 'Buy'");
            overseasForSale.click();
            if(Driver.driver.getCurrentUrl().contains("overseas")) {
                System.out.println("user is able to open overseas page");
            }else {
                System.out.println("user not able to open overseas page");
            }
            
        }
        
        public void clickCanaryIslands() {
            Actions actions = new Actions(Driver.driver);
            actions.moveToElement(buyTab).perform();
            System.out.println("Done Mouse hover on 'Buy'");
            overseasForSale.click();
            CanaryIslands.click();
            if(Driver.driver.getCurrentUrl().contains("property")) {
                
                System.out.println("user able to open Canary Islands page");            
            }else {
                
                System.out.println("user not able to open Canary Islands page");
            }
            
        }
        
        public void clickThailand() {
            Actions actions = new Actions(Driver.driver);
            actions.moveToElement(buyTab).perform();
            System.out.println("Done Mouse hover on 'Buy'");
            overseasForSale.click();
            Thailand.click();
            if(Driver.driver.getCurrentUrl().contains("Thailand")){
                
                System.out.println("user able to open Thailand page");
            }else {
                System.out.println("user not able to open Thailand page");
            }
            
        }
    }

        @FindBy(xpath="//span[text()='Buy']")
        public WebElement buyTab;
        
        @FindBy(xpath="//span[text()='Overseas property for sale']")
        public WebElement overseasForSale;
        
        @FindBy(xpath="//h3[text()='Canary Islands']")
        public WebElement CanaryIslands;
        
        @FindBy(xpath="//a[text()='Thailand']")
        public WebElement Thailand;
        
        public void clickOverseasForSale(){
        
            //Instantiate Action Class        
            Actions actions = new Actions(Driver.driver);
            actions.moveToElement(buyTab).perform();
            System.out.println("Done Mouse hover on 'Buy'");
            overseasForSale.click();
            if(Driver.driver.getCurrentUrl().contains("overseas")) {
                System.out.println("user is able to open overseas page");
            }else {
                System.out.println("user not able to open overseas page");
            }
            
        }
        
        public void clickCanaryIslands() {
            Actions actions = new Actions(Driver.driver);
            actions.moveToElement(buyTab).perform();
            System.out.println("Done Mouse hover on 'Buy'");
            overseasForSale.click();
            CanaryIslands.click();
            if(Driver.driver.getCurrentUrl().contains("property")) {
                
                System.out.println("user able to open Canary Islands page");            
            }else {
                
                System.out.println("user not able to open Canary Islands page");
            }
            
        }
        
        public void clickThailand() {
            Actions actions = new Actions(Driver.driver);
            actions.moveToElement(buyTab).perform();
            System.out.println("Done Mouse hover on 'Buy'");
            overseasForSale.click();
            Thailand.click();
            if(Driver.driver.getCurrentUrl().contains("Thailand")){
                
                System.out.println("user able to open Thailand page");
            }else {
                System.out.println("user not able to open Thailand page");
            }
            
        }
    }


