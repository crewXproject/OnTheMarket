package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Driver;

public class newHomesPage {

	  public newHomesPage() {PageFactory.initElements(Driver.getDriver(),this);}

	    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[5]/a/span")
	    public WebElement newhomesmenu;

	    @FindBy(xpath="//span[contains(text(),'Find developments')]")
	    public WebElement findDevelopments;
	    

	    
	    @FindBy(xpath="//div[@class='browse-developers']/a")
	    public List<WebElement>allDeveloperLogoLinks;
	    
	    @FindBy(xpath="//div[@class='browse-developers']/descendant::a")
	    public List<WebElement> allDeveloperLogoNames;
	    
}
