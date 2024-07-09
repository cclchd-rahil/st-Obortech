package POM_Classes.usertittles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserTittlesPage {
	
public WebDriver driver;
    
    public UserTittlesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "userTitles")
    private WebElement UserTitles;
    
    public WebElement getUserTitles() {
        return UserTitles;
    }
    
    @FindBy(xpath = "//button[contains(text(),'SUBMIT TITLE')]")
    private WebElement SubmitTittle;
    
    public WebElement getSubmitTittle() {
        return SubmitTittle;
    } 
    
    @FindBy(xpath = "//input[@id='name']")
    private WebElement TittleName;
    
    public WebElement getTittleName() {
        return TittleName;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'INSERT')]")
    private WebElement InsertTittle;
    
    public WebElement getInsertTittle() {
        return InsertTittle;
    } 
    
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement Tittleok;
    
    public WebElement getTittleok() {
        return Tittleok;
    } 

}
