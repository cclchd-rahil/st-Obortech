package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalletAddress {
	
public WebDriver driver;
    
    public WalletAddress(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }    
    
    @FindBy(xpath = "//button[contains(text(),'ADD WALLET ADDRESS')]")
    private WebElement ADDWALLETADDRESS;
    
    public WebElement getADDWALLETADDRESS() {
        return ADDWALLETADDRESS;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/select[1]")
    private WebElement SelectBlockchain;
    
    public WebElement getSelectBlockchain() {
        return SelectBlockchain;
    }   
    
    @FindBy(xpath = "//input[@id='wallet_address']")
    private WebElement WalletAddress;
    
    public WebElement getWalletAddress() {
        return WalletAddress;
    }  
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]")
    private WebElement ADDWALLET;
    
    public WebElement getADDWALLET() {
        return ADDWALLET;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    private WebElement CLOSEWALLET;
    
    public WebElement getCLOSEWALLET() {
        return CLOSEWALLET;
    }    
}
