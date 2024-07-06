package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsAndUsersPage {
	
public WebDriver driver;
    
    public OrganizationsAndUsersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "orgAndUserListing")
    private WebElement organizationAndUserListing;
    
    public WebElement getorganizationAndUserListing() {
        return organizationAndUserListing;
    } 
    
    @FindBy(id = "collaborationInvites")
    private WebElement CollaborationInvites;
    
    public WebElement getCollaborationInvites() {
        return CollaborationInvites;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'ADD API USER')]")
    private WebElement ADDAPIUSER;
    
    public WebElement getADDAPIUSER () {
    	return ADDAPIUSER;
    }
    
    @FindBy(xpath = "//button[contains(text(),'ADD PUBLIC USER')]")
    private WebElement ADDPUBLICUSER;
    
    public WebElement getADDPUBLICUSER () {
    	return ADDPUBLICUSER;
    }
    
    @FindBy(xpath = "//button[contains(text(),'INVITE USER')]")
    private WebElement INVITEUSER;
    
    public WebElement getINVITEUSER () {
    	return INVITEUSER;
    }
    
    @FindBy(xpath = "//button[contains(text(),'INVITE ORGANIZATION')]")
    private WebElement INVITEORGANIZATION;
    
    public WebElement getINVITEORGANIZATION () {
    	return INVITEORGANIZATION;
    }

}
