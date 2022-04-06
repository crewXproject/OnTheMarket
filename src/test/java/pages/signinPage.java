package pages;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class signinPage {

    public signinPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id="login-email-modal")
    public WebElement emailInput;

    @FindBy(xpath="//*[@id=\"login\"]/button")
    public WebElement nextButton;
    
    @FindBy(xpath="/html/body/div[10]/div/div/div/div/div[2]/div[2]/div/div[1]/form/div[1]/div/input")
    public WebElement passwordInput;

    @FindBy(xpath="/html/body/div[10]/div/div/div/div/div[2]/div[2]/div/div[1]/form/button")
    public WebElement signinButton;
    
    

}
