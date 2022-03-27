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



}
