package pages;

import driver.Driver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rentPage  {

    public rentPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[3]/div/div/div[1]/ul/li[1]/a/div[2]/span")
    public WebElement propertyForRent;
    
    @FindBy(xpath="//*[@id=\"headlessui-tabs-tab-2\"]/span")
    public WebElement rentButton;
    
    @FindBy(xpath="//input[@class=\"landing-search-input landing-search-input--with-btn\"]")
    public WebElement searchBox;
    
    @FindBy(xpath="//*[@class=\"md:text-sm lg:text-base lg:pl-4 font-body text-xs font-normal\"]")
    public WebElement propertyInfo;
    
    @FindBy(xpath="//*[@id=\"container\"]/div[3]/div/div/ul")
    public WebElement TaskBar;
   
    @FindBy(xpath="//*[@id=\"headlessui-popover-button-1\"]")
    public WebElement RadiusButton;
    
    @FindBy(id="radius-selector")
    public WebElement RadiusSelector;
    
    @FindBy(id="headlessui-popover-button-7")
    public WebElement PropertyTypeButton;
   
    @FindBy(xpath="//*[@name=\"detached\"]")
    public WebElement detachedHouse;

}
