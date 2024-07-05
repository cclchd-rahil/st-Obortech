package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPage {
    
    public WebDriver driver;
    
    public LoginLogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@id='login-username']")
    private WebElement username;
    
    public WebElement getUsernameTextfield() {
        return username;
    }

    @FindBy(xpath="//input[@id='login-password']")
    private WebElement profilepassword;
    
    public WebElement getProfilePasswordTextfield() {
        return profilepassword;
    }

    @FindBy(xpath="//button[contains(text(),'CONTINUE')]")
    private WebElement continueButton;
    
    public WebElement getContinueButton() {
        return continueButton;
    }

    @FindBy(xpath="//label[contains(text(),'Remember Me')]")
    private WebElement remembermeButton;
    
    public WebElement getRemembermeButton() {
        return remembermeButton;
    }

    @FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
    private WebElement forgotButton;
    
    public WebElement getForgotButton() {
        return forgotButton;
    }

    @FindBy(xpath="//input[@id='transaction-password']")
    private WebElement blockchainPassword;
    
    public WebElement getBlockchainPassword() {
        return blockchainPassword;
    }

    @FindBy(xpath="//button[contains(text(),'CONTINUE')]")
    private WebElement continueofBlockchain;
    
    public WebElement getContinueofBlockchain() {
        return continueofBlockchain;
    }

    @FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
    private WebElement forgotofBlockchainpassword;
    
    public WebElement getForgotofBlockchainPassword() {
        return forgotofBlockchainpassword;
    }

    @FindBy(xpath="//button[contains(text(),'LOGOUT')]")
    private WebElement SubmitLogout;
    
    public WebElement getSubmitLogout() {
        return SubmitLogout;
    }
}
