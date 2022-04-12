package pages;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class commonPage {

    public commonPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[2]/a/span")
    public WebElement buyMenu;

    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[3]/a/span")
    public WebElement rentMenu;

    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[4]/a/span")
    public WebElement agentsMenu;

    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[5]/a/span")
    public WebElement newhomesMenu;

    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/div[2]/a/span[2]")
    public WebElement signinMenu;

    @FindBy(xpath="//*[@id=\"cookie-notification\"]/div/div[2]/button")
    public WebElement acceptCookieBtn;

    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[2]/div/div/div[1]/ul/li[7]/a/div[2]/span")
    public WebElement Retirement;
    
    @FindBy(xpath="//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/input")
    public WebElement Searchbox; 

    @FindBy(xpath="//*[@id=\"headlessui-tabs-panel-4\"]/div[1]/div/div/button")
    public WebElement Search; 
    
    @FindBy(xpath="//*[@id=\"dropdown\"]/ul/li[20]/span")
    public WebElement Peterborough;

    @FindBy(xpath="//*[@id=\"dropdown\"]/ul/li[20]/div/ul/li/a")
    public WebElement Link;
    
    @FindBy(xpath="//*[@id=\"headlessui-tabs-tab-3\"]/span")
    public WebElement Instantvaluation;
    
    @FindBy(xpath="//*[@id=\"headlessui-tabs-panel-6\"]/div[1]/div/div[1]/input")
    public WebElement Searchbox2;
    
    @FindBy(xpath="//*[@id=\"headlessui-tabs-panel-6\"]/div[1]/div/button")
    public WebElement Search2;   
}
