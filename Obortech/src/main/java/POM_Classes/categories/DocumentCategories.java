package POM_Classes.categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentCategories {
	
public WebDriver driver;
    
    public DocumentCategories(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[contains(text(),'SUBMIT CATEGORY')]")
    private WebElement submitdocumenttcategory;
    
    public WebElement getssubmitdocumenttcategory() {
        return submitdocumenttcategory;
    } 
    
    @FindBy(xpath = "//input[@id='name']")
    private WebElement documentcategoryname;
    
    public WebElement getdocumentcategoryname() {
        return documentcategoryname;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'INSERT')]")
    private WebElement DocumentInsert;
    
    public WebElement getDocumentInsert() {
        return DocumentInsert;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement documentcategoryaddok;
    
    public WebElement getdocumentcategoryaddok() {
        return documentcategoryaddok;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    private WebElement closedocumentcategory;
    
    public WebElement getclosedocumentcategory() {
        return closedocumentcategory;
    } 
    

}
