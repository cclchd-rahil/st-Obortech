package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDropdown {
	
public WebDriver driver;
    
    public UserDropdown(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "userDropdown")
    private WebElement userdropdown;
    
    public WebElement getuserdropdown() {
        return userdropdown;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'My Profile')]")
    private WebElement myprofile;
    
    public WebElement getmyprofile() {
    	return myprofile;
    }
    
    @FindBy(linkText = "projects" )
    private WebElement projects;
    
    public WebElement getprojects() {
        return projects;
    } 
    
    @FindBy(linkText = "Manage NFT")
    private WebElement managenft;
    
    public WebElement getmanagenft() {
    	return managenft;
    }
    
    @FindBy(linkText = "Categories")
    private WebElement categories;
    
    public WebElement getcategories() {
    	return categories;
    }
    
    @FindBy(linkText = "Inventory Manager")
    private WebElement InventoryManager;
    
    public WebElement getInventoryManager() {
    	return InventoryManager;
    }
    
    @FindBy(linkText = "Devices")
    private WebElement Devices;
    
    public WebElement getDevices() {
    	return Devices;
    }
    
    
    @FindBy(linkText = "User Titles")
    private WebElement UserTitles;
    
    public WebElement getUserTitles() {
    	return UserTitles;
    }
    
    @FindBy(linkText = "Organizations & Users")
    private WebElement OrganizationsUsers;
    
    public WebElement getOrganizationsUsers() {
    	return OrganizationsUsers;
    }
    
    @FindBy(linkText = "Form Builder")
    private WebElement FormBuilder;
    
    public WebElement getFormBuilder() {
    	return FormBuilder;
    }
    
    @FindBy(xpath = "//button[contains(text(),'User Agreement')]")
    private WebElement UserAgreement;
    
    public WebElement getUserAgreement() {
    	return UserAgreement;
    }
    
    @FindBy(linkText = "Subscription")
    private WebElement Subscription;
    
    public WebElement getSubscription() {
    	return Subscription;
    }
    
    @FindBy(linkText = "User Data Requests")
    private WebElement UserDataRequests;
    
    public WebElement getUserDataRequests() {
    	return UserDataRequests;
    }
    
    @FindBy(linkText = "Wallet Address")
    private WebElement WalletAddress;
    
    public WebElement getWalletAddress() {
    	return WalletAddress;
    }
    
    @FindBy(linkText = "Sent/Received info status")
    private WebElement SentReceivedinfostatus;
    
    public WebElement getSentReceivedinfostatus() {
    	return SentReceivedinfostatus;
    }
    
    @FindBy(xpath = "//button[contains(text(),'Notification Settings')]")
    private WebElement NotificationSettings;
    
    public WebElement getNotificationSettings() {
    	return NotificationSettings;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/nav[1]/ul[1]/li[4]/div[1]/a[14]")
    private WebElement logout;
    
    public WebElement getlogout() {
    	return logout;
    }   

}
