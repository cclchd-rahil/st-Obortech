package POM_Classes.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentSubmission {
		
public WebDriver driver;
    
    public DocumentSubmission(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
 
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/select[1]")
    private WebElement Selectdoc;
    
    public WebElement getselectdoc() {
        return Selectdoc;
    } 
    
    @FindBy(xpath = "//input[@id='customFileLangHTML']")
    private WebElement attachfile;
    
    public WebElement getattachfile() {
        return attachfile;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'SAVE')]")
    private WebElement savefile;
    
    public WebElement getsavefile() {
        return savefile;
    } 


}
