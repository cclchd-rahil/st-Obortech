package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsPage {
	
public WebDriver driver;
    
    public ProjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "projectListing")
    private WebElement projectListing;
    
    public WebElement getprojectListing() {
        return projectListing;
    } 
    
    @FindBy(id = "templateListing")
    private WebElement templateListing;
    
    public WebElement gettemplateListing() {
        return templateListing;
    } 
    
    @FindBy(id = "archiveListing")
    private WebElement archiveListing;
    
    public WebElement getarchiveListing() {
        return archiveListing;
    } 

}
