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

    @FindBy(xpath="//input[@id='login-password']")
    public WebElement passwordInput;

    @FindBy(xpath="//button[text()='Sign in']")
    public WebElement signinButton;
    
    

}
