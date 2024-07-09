package POM_Classes.categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class projectCategories {


    public WebDriver driver;
    
    public projectCategories(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    
        
        }
    
    @FindBy(xpath="//button[contains(text(),'SUBMIT CATEGORY')]")
    private WebElement Submitprojectcategory;
    
    public WebElement getSubmitprojectcategory() {
        return Submitprojectcategory;
    
    }
    
    @FindBy(xpath="//input[@id='name']")
    private WebElement projectcategoryname;
    
    public WebElement getprojectcategoryname() {
        return projectcategoryname;
    
    }
    
    @FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement Governance;
    
    public WebElement getGovernance() {
        return Governance;
    
    }
    
    @FindBy(xpath="//button[contains(text(),'INSERT')]")
    private WebElement InsertProject;
    
    public WebElement getInsertProject() {
        return InsertProject;
    
    }
    
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement projectcategoryaddok;
    
    public WebElement getprojectcategoryaddok() {
        return projectcategoryaddok;
    } 
    
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    private WebElement closeprojectcategory;
    
    public WebElement getcloseprojectcategory() {
        return closeprojectcategory;
    
    }
}




