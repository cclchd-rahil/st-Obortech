package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {
	
	
	//Hellow Meow Meow
	
public WebDriver driver;
    
    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "projectCategory")
    private WebElement projectcategory;
    
    public WebElement getprojectcategory() {
        return projectcategory;
    } 
    
    @FindBy(id = "eventCategory")
    private WebElement eventCategory;
    
    public WebElement geteventCategory() {
        return eventCategory;
    } 
    
    @FindBy(id = "documentCategory")
    private WebElement documentCategory;
    
    public WebElement getdocumentCategory() {
        return documentCategory;
    } 
    
    @FindBy(id = "participantCategory")
    private WebElement participantCategory;
    
    public WebElement getparticipantCategory() {
        return participantCategory;
    } 
    
    @FindBy(id = "stationCategory")
    private WebElement stationCategory;
    
    public WebElement getstationCategory() {
        return stationCategory;
    } 

    @FindBy(id = "stationCategory1")
    private WebElement stationCategory1;
    
    public WebElement getstationCategory1() {
        return stationCategory1;
    } 
}
