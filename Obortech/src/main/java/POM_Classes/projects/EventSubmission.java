package POM_Classes.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventSubmission {
	
public WebDriver driver;
    
    public EventSubmission(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/select[1]")
    private WebElement Selectpdc;
    
    public WebElement getselectpdc() {
        return Selectpdc;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/select[1]")
    private WebElement Selectevent;
    
    public WebElement getselectevent() {
        return Selectevent;
    } 
    
    @FindBy(xpath = "//input[@id='customFileLangHTML']")
    private WebElement Addpicture;
    
    public WebElement getAddpicture() {
        return Addpicture;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement Eventdate;
    
    public WebElement geteventdate() {
        return Eventdate;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement whocansee;
    
    public WebElement getwhocansee() {
        return whocansee;
    } 
    
    @FindBy(xpath = "//div[contains(text(),'Type and search here')]")
    private WebElement whocanaccept;
    
    public WebElement getwhocanaccept() {
        return whocanaccept;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")
    private WebElement Location;
    
    public WebElement getlocation() {
        return Location;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/input[1]")
    private WebElement Deadline;
    
    public WebElement getdeadline() {
        return Deadline;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
    private WebElement Eventinfo;
    
    public WebElement geteventinfo() {
        return Eventinfo;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/textarea[1]")
    private WebElement Eventdes;
    
    public WebElement geteventdes() {
        return Eventdes;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/input[1]")
    private WebElement Typeevent;
    
    public WebElement gettypeevent() {
        return Typeevent;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'SEARCH')]")
    private WebElement SearchEvent;
    
    public WebElement getsearchevent() {
        return SearchEvent;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
    private WebElement Eventsubmission;
    
    public WebElement geteventsubmission() {
        return Eventsubmission;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'SAVE')]")
    private WebElement SaveEvent;
    
    public WebElement getsaveevent() {
        return SaveEvent;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")
    private WebElement back;
    
    public WebElement getback() {
        return back;
    } 
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/i[1]")
    private WebElement DeleteEvent;
    
    public WebElement getdeleteevent() {
        return DeleteEvent;
    } 
    

}
