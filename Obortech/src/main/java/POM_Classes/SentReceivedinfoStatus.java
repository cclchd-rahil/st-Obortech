package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SentReceivedinfoStatus {
	
public WebDriver driver;
    
    public SentReceivedinfoStatus(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "receivedKYCRequest")
    private WebElement ReceivedKYCRequests;
    
    public WebElement getReceivedKYCRequests() {
        return ReceivedKYCRequests;
    }
    
    @FindBy(id = "sentKYCRequests")
    private WebElement SentKYCRequests;
    
    public WebElement getSentKYCRequests() {
        return SentKYCRequests;
    }
    
    @FindBy(id = "receivedPDCRequests")
    private WebElement ReceivedPDCRequests;
    
    public WebElement getReceivedPDCRequests() {
        return ReceivedPDCRequests;
    }
    
    @FindBy(id = "SENT_PDC_REQUESTS")
    private WebElement SentPDCRequests;
    
    public WebElement getSentPDCRequests() {
        return SentPDCRequests;
    }
    
    @FindBy(id = "APPROVED_PDC")
    private WebElement ApprovedPDCs;
    
    public WebElement getApprovedPDCs() {
        return ApprovedPDCs;
    }
    
    @FindBy(id = "INVITATIONS")
    private WebElement Invitations;
    
    public WebElement getInvitations() {
        return Invitations;
    }
}
