package POM_Classes.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Documents {
	
public WebDriver driver;
    
    public Documents(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement SAevents;
    
    public WebElement getsaevents() {
        return SAevents;
    } 
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement SAOrganizations;
    
    public WebElement getshowallorganizations() {
        return SAOrganizations;
    } 
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement SAitems;
    
    public WebElement getSAitems() {
    	return SAitems;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement SAgroup1;
    
    public WebElement getsagroup1() {
    	return SAgroup1;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement SAgroup2;
    
    public WebElement getsagroup2() {
    	return SAgroup2;
    }


}
