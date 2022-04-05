package pages;

import driver.Driver;
import org.openqa.selenium.WebElement;
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


}
