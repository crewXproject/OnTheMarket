package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Driver;

public class retirementProperties {
	public retirementProperties() {PageFactory.initElements(Driver.getDriver(),this);}
	
	@FindBy(xpath="//*[@class='landing-search-input landing-search-input--with-btn']")
    public WebElement searchBox;
	
	@FindBy(xpath="//*[@class='landing-search-input-inner flex-grow']/input")
	public WebElement searchBoxInstantValuation;
	
	@FindBy(xpath="//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/button")
	public WebElement searchButton;
	
	@FindBy(xpath="//span[contains(.,'Peterborough')]")
	 public WebElement Peterborough;
	
	@FindBy(xpath="//a[contains(.,'Peterborough')]")
	public WebElement retirementPropInPeterboroughLink;
	
	@FindBy(xpath="//*[@class='relative flex-grow']/input")
	public WebElement afterClickedLinkCityNameBox;
	
	@FindBy(xpath="//*[@id='headlessui-tabs-tab-3']")
	public WebElement instantValuationButton;
	
	@FindBy(xpath="//span[contains(.,'Please enter a postcode and select a postcode from the results below')]")
	public WebElement postalWarning;
	
	@FindBy(xpath="//*[@class='md:flex md:items-center']/button")
	public WebElement letsGoButton;
}
