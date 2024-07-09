package POM_Classes.categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StationCategories {
	
public WebDriver driver;
    
    public StationCategories(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[contains(text(),'SUBMIT STATION CATEGORY')]")
    private WebElement SUBMITSTATIONCATEGORY;
    
    public WebElement getSUBMITSTATIONCATEGORY() {
        return SUBMITSTATIONCATEGORY;
    } 
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    private WebElement SUBITSTATION;
    
    public WebElement getSUBITSTATION() {
        return SUBITSTATION;
    } 
    
    @FindBy(xpath = "//input[@id='name']")
    private WebElement stationcategoryname;
    
    public WebElement getstationcategoryname() {
        return stationcategoryname;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'INSERT')]")
    private WebElement StationInsert;
    
    public WebElement getStationInsert() {
        return StationInsert;
    } 
    
    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    private WebElement closestationcategory;
    
    public WebElement getclosestationcategory() {
        return closestationcategory;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement stationcategoryaddok;
    
    public WebElement getstationcategoryaddok() {
        return stationcategoryaddok;
    } 

}
