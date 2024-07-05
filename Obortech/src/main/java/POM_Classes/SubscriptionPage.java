package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage {
	
public WebDriver driver;
    
    public SubscriptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]")
    private WebElement ShowAllUser;
    
    public WebElement getShowAllUser() {
        return ShowAllUser;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]")
    private WebElement ShowAllRole;
    
    public WebElement getShowAllRole() {
        return ShowAllRole;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]")
    private WebElement ShowAllStatus;
    
    public WebElement getShowAllStatus() {
        return ShowAllStatus;
    }
    
    @FindBy(xpath = "//tbody/tr[1]/td[5]/i[2]")
    private WebElement Addsubscription;
 
    public WebElement getAddsubscription() {
        return Addsubscription;
    }
    
    @FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
    private WebElement Add;
  
    public WebElement getAdd() {
        return Add;
    }
  
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement subscriptionaddedok;
  
    public WebElement getsubscriptionaddedok() {
        return subscriptionaddedok;
    }
}
