package POM_Classes.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Events {
	
public WebDriver driver;
    
    public Events(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/nav[1]/ul[1]/li[1]/a[1]/span[1]")
    private WebElement Events;
    
    public WebElement getevents() {
        return Events;
    } 
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[1]/ul[1]/li[1]/form[1]/div[1]/div[1]/input[1]")
    private WebElement searchprojects;
    
    public WebElement getsearchprojects() {
        return searchprojects;
    } 
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[1]/ul[1]/li[2]/input[1]")
    private WebElement watchall;
    
    public WebElement getwatchall() {
        return watchall;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'SUBMIT EVENT')]")
    private WebElement SUBMITEVENT;
    
    public WebElement getsubmitevent() {
    	return SUBMITEVENT;
    }
    
    @FindBy(xpath = "//button[contains(text(),'SUBMIT DOCUMENT')]")
    private WebElement SUBMITDOCUMENT;
    
    public WebElement getsubmitdocument() {
    	return SUBMITDOCUMENT;
    }
    
    @FindBy(xpath = "//button[contains(text(),'CREATE Item')]")
    private WebElement CREATEITEM;
    
    public WebElement getcreateitem() {
    	return CREATEITEM;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement AllItem;
    
    public WebElement getallitem() {
    	return AllItem;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/i[1]")
    private WebElement AllItemkebabmenu;
    
    public WebElement getallitemkebabmenu() {
    	return AllItemkebabmenu;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/i[1]")    
    private WebElement ManageItemCode;
    
    public WebElement getmanageitemcode() {
    	return ManageItemCode;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement AllGroup1;
    
    public WebElement getallgroup1() {
    	return AllGroup1;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/i[1]")
    private WebElement Managegroupitem;
    
    public WebElement getmanagegroupitem() {
    	return Managegroupitem;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/i[1]")
    private WebElement AllGroup1kebabmenu;
    
    public WebElement getallgroup1kebabmenu() {
    	return AllGroup1kebabmenu;
    }
    
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='page-top']/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private WebElement AllGroup2;
    
    public WebElement getallgroup2() {
    	return AllGroup2;
    }
    
    
 
}
