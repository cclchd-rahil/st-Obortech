package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParticipantCategories {
	
    public WebDriver driver;
	
	public ParticipantCategories(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[contains(text(),'SUBMIT CATEGORY')]")
    private WebElement submitpartcategory;
    
    public WebElement getsubmitpartcategory() {
        return submitpartcategory;
    } 
    
    @FindBy(xpath = "//input[@id='name']")
    private WebElement partcategoryname;
    
    public WebElement getpartcategoryname() {
        return partcategoryname;
    } 
    @FindBy(id = "orgId")
    private WebElement orgid;
    
    public WebElement getorgid() {
        return orgid;        
    }
       
    @FindBy(id = "orgName")
    private WebElement orgname;
    
    public WebElement getorgname() {
        return orgname;
    }
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
    private WebElement Addorg;
    
    public WebElement getAddorg() {
        return Addorg;
    }
     
    @FindBy(xpath = "//button[contains(text(),'INSERT')]")
    private WebElement PartInsert;
    
    public WebElement getPartInsert() {
        return PartInsert;
    }  
    
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    private WebElement closepartcategory;
    
    public WebElement getclosepartcategory() {
        return closepartcategory;
    } 

}
