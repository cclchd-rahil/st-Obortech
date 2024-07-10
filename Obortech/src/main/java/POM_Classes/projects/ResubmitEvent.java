package POM_Classes.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResubmitEvent {
	
public WebDriver driver;
    
    public ResubmitEvent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/i[1]")
    private WebElement ResubmitEvent;
    
    public WebElement getresubmitevent() {
        return ResubmitEvent;
    } 
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/i[1]")
    private WebElement comment;
    
    public WebElement getcomment() {
        return comment;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]/div[1]/button[1]/img[1]")
    private WebElement Print;
    
    public WebElement getprint() {
        return Print;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]/div[1]/button[2]")
    private WebElement Update;
    
    public WebElement getupdate() {
        return Update;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]")
    private WebElement updatesubmit;
    
    public WebElement getupdatesubmit() {
        return updatesubmit;
    } 
    

}
