package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventCategories {
	
    public WebDriver driver;
	
	public EventCategories(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[contains(text(),'SUBMIT CATEGORY')]")
    private WebElement submiteventcategory;
    
    public WebElement getsubmiteventcategory() {
        return submiteventcategory;
    } 
    
    @FindBy(xpath = "//input[@id='name']")
    private WebElement eventcategoryname;
    
    public WebElement geteventcategoryname() {
        return eventcategoryname;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'INSERT')]")
    private WebElement EventInsert;
    
    public WebElement getEventInsert() {
        return EventInsert;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement eventcategoryaddok;
    
    public WebElement geteventcategoryaddok() {
        return eventcategoryaddok;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    private WebElement closeeventcategory;
    
    public WebElement getcloseeventcategory() {
        return closeeventcategory;
    } 

}
